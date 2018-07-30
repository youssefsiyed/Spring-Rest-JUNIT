package com.dev.test.controller;

import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

public class JsonAssertTest {

	private String responseJson = "{\"idItem\":10,\"nameItem\":\"ADIAS\",\"priceItem\":20,\"quantiyItem\":55}";
	
	@Test
	public void JsonAssertTestTRUE() throws JSONException{
		String expected="{\"idItem\":10,\"nameItem\":\"ADIAS\",\"priceItem\":20,\"quantiyItem\":55}";
		JSONAssert.assertEquals(expected, responseJson, true);
	}
	
	@Test
	public void JsonAssertTestFALSE() throws JSONException{
		String expected="{\"idItem\":10,\"nameItem\":\"ADIAS\"}";
		JSONAssert.assertEquals(expected, responseJson, false);
	}
	
}
