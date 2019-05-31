package br.ufc.mdcc.cc.hadoop;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

public class idSerializer extends JsonDeserializer<String> {
	
	static int cont = 0;

	@Override
	public String deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		ObjectCodec oc = p.getCodec();
	    JsonNode node = oc.readTree(p);
	    System.out.println(cont++);
	    
	    try {
			
	    	return node.get("$oid").toString();
		} catch (Exception e) {
			return "";	
		}
	}

}
