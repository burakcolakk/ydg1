package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.net.HttpURLConnection;
import java.net.URL;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JenkinsDemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testExampleComReachable() throws Exception {
		URL url = new URL("https://example.com");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setConnectTimeout(5000);
		connection.setReadTimeout(5000);
		connection.setRequestMethod("GET");
		int responseCode = connection.getResponseCode();
		assertEquals(200, responseCode, "https://example.com erişilemiyor!");
	}
}
