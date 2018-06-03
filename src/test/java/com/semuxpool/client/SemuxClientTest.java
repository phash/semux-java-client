package com.semuxpool.client;


import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.semuxpool.client.api.SemuxException;

class SemuxClientTest {

	@Test
	void test() throws IOException, SemuxException {
		SemuxClient client = new SemuxClient("localhost",5171,"user","pass");
		String address = client.createAccount();
		assertTrue( address.length() == 42, "Address not correct");
	}

}
