package com.auction.sfdc.contract.transform;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.avro.file.DataFileStream;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.Decoder;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.specific.SpecificDatumReader;
import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

import com.tenx.resi.ms.contract.api.message.offer.OfferAuditLogMessage;

public class ContractDeserialization  extends AbstractMessageTransformer{
	
	public ContractDeserialization() {}


	/*public Object transformMessage(MuleMessage message, String outputEncoding)
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
    }*/

	public List<OfferAuditLogMessage> transformMessageCustom(InputStream message, String outputEncoding){

        List<OfferAuditLogMessage> allUsers = new ArrayList<OfferAuditLogMessage>();
        
        //RawMessageDecoder<ContractPayload> bDecoder = new RawMessageDecoder<ContractPayload>(new org.apache.avro.specific.SpecificData(), ContractPayload.SCHEMA$);
        try {
        	/*ByteBuffer byteBuffer = ByteBuffer.allocate(message.available());
        	Channels.newChannel(message).read(byteBuffer);
        	allUsers.add(ContractPayload.fromByteBuffer(byteBuffer));*/
        	byte[] targetArray = new byte[message.available()];
            message.read(targetArray);
            Decoder decoder = DecoderFactory.get().binaryDecoder((byte[]) targetArray, null);
            DatumReader<OfferAuditLogMessage> reader = new SpecificDatumReader<OfferAuditLogMessage>(OfferAuditLogMessage.getClassSchema());
            OfferAuditLogMessage cp = reader.read(null , decoder);
        	allUsers.add(cp);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return allUsers;
    }


	@Override
	public Object transformMessage(MuleMessage arg0, String arg1) throws TransformerException {
		// TODO Auto-generated method stub
		return null;
	}

}
