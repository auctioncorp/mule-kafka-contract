package com.auction.sfdc.contract.transform;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.avro.file.DataFileStream;
import org.apache.avro.io.DatumReader;
import org.apache.avro.specific.SpecificDatumReader;
import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;
import org.mule.transformer.AbstractTransformer;

import com.auction.sfdc.contract.avro.ContractPayload;

public class ContractDeserialization  extends AbstractMessageTransformer{


	public Object transformMessage(MuleMessage message, String outputEncoding)
            throws TransformerException {
        FileInputStream stream = (FileInputStream) message.getPayload();

        DatumReader<ContractPayload> dwDatumReader = new SpecificDatumReader<ContractPayload>(
        		ContractPayload.class);

        List<ContractPayload> allUsers = new ArrayList<ContractPayload>();
        try {
            final DataFileStream<ContractPayload> dataFileReader = new DataFileStream<ContractPayload>(
                    stream, dwDatumReader);

            while (dataFileReader.hasNext()) {
            	ContractPayload record = new ContractPayload();
                record = dataFileReader.next(record);
                allUsers.add(record);
            }
            stream.close();

            dataFileReader.close();
        } catch (Exception e) {
            throw new RuntimeException("Failed to serialize records",e);
        }

        message.setPayload(allUsers);

        return message;
    }

}
