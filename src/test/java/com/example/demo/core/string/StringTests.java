package com.example.demo.core.string;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StringTests {
private String expected = "Hello World";
	@Test
	void navigatingThroughString() {
String actual = "";
		for (int i = 0; i < expected.length(); i++) {
			actual+= expected.substring(i,i+1);
					}
		System.out.println(actual);
		Assert.isTrue( expected.equals(actual),"");
	}

	@Test
	void navigatingThroughStringBuild() {
		StringBuilder actual = new StringBuilder();
		for (int i = 0; i < expected.length(); i++) {
			actual.append(expected.charAt(i));
		}
		System.out.println(actual);
		assertEquals(expected,actual.toString() );
	}

	@Test
	void chartToString() {
		char actual = 'H';
		assertEquals(expected, String.valueOf(actual));
		}


}
