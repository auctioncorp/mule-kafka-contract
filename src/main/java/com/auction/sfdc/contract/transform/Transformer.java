package com.auction.sfdc.contract.transform;

import org.mule.transformer.AbstractMessageTransformer;
import io.confluent.kafka.schemaregistry.client.SchemaRegistryClient;
import io.confluent.kafka.serializers.KafkaAvroSerializer;
import io.confluent.kafka.serializers.KafkaAvroDeserializer;
import io.confluent.kafka.schemaregistry.client.CachedSchemaRegistryClient;

public abstract class Transformer  extends AbstractMessageTransformer{
	
	public Transformer() {}
	
	public static String parseIncoming(final byte[] b, final String schemaRegistryURL) {
		System.out.println ( "schemaRegistryURL: " + schemaRegistryURL );
        final SchemaRegistryClient client = (SchemaRegistryClient)new CachedSchemaRegistryClient(schemaRegistryURL, 100);
        final KafkaAvroDeserializer des = new KafkaAvroDeserializer(client);
        Object o = null;
        try {
            o = des.deserialize("transactions", b);
            System.out.println(o.getClass());
            System.out.println(o.toString());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            des.close();
        }
        return o.toString();
    }
	
	public static String createOutbound(final String jsonBody, final String schemaRegistryURL) {
		System.out.println ( "schemaRegistryURL: " + schemaRegistryURL );
        final SchemaRegistryClient client = (SchemaRegistryClient)new CachedSchemaRegistryClient(schemaRegistryURL, 100);
        final KafkaAvroSerializer des = new KafkaAvroSerializer(client);
        Object o = null;
        try {
            o = des.serialize("transactions", jsonBody);
            System.out.println(o.getClass());
            System.out.println(o.toString());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            des.close();
        }
        return o.toString();
    }

}
