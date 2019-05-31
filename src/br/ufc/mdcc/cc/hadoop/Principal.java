package br.ufc.mdcc.cc.hadoop;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Principal {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		
		ObjectMapper objectMapper = new ObjectMapper();

		File file = new File("/Users/Juarez/Desktop/eiffel-tower-reviews2.json");
		
		List<ModeloJuarez> asList = Arrays.asList(objectMapper.readValue(file, ModeloJuarez[].class));
		
		/*for (int i = 0; i < asList.size(); i++) {
			System.out.println(asList.get(i).getText());
		}*/
		
		System.out.println(asList.size());
		
	}
}
