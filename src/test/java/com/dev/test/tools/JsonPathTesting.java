package com.dev.test.tools;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class JsonPathTesting {

	@Test
	public void Learning(){
		String ListData = "["+
				"{\"idItem\":8,\"nameItem\":\"TEST\",\"priceItem\":20,\"quantiyItem\":80},"+
				"{\"idItem\":10,\"nameItem\":\"TEST01\",\"priceItem\":20,\"quantiyItem\":80},"+
				"{\"idItem\":20,\"nameItem\":\"TEST02\",\"priceItem\":20,\"quantiyItem\":80}"+
				"]";
		DocumentContext context = JsonPath.parse(ListData);
		int size = context.read("$.length()");
		assertThat(size).isEqualTo(3);
		
		System.out.println(context.read("$..idItem").toString());
		System.out.println(context.read("$.[1]").toString());
		System.out.println(context.read("$.[0:1]").toString());
	}
}
