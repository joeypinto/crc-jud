package com.br.sfb.crcjud;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

public class teste {

//	@Bean
//	public RestTemplate restTemplate() throws UnrecoverableKeyException, NoSuchAlgorithmException, KeyStoreException, CertificateException, FileNotFoundException, IOException, KeyManagementException {
//	    KeyStore clientStore = KeyStore.getInstance("PKCS12");
//	    clientStore.load(new FileInputStream("/path/to/certfile"), "certpassword".toCharArray());
//
//	    SSLContextBuilder sslContextBuilder = new SSLContextBuilder();
//	    sslContextBuilder.useProtocol("TLS");
//	    sslContextBuilder.loadKeyMaterial(clientStore, "certpassword".toCharArray());
//	    sslContextBuilder.loadTrustMaterial(null, new TrustSelfSignedStrategy());
//
//	    SSLConnectionSocketFactory sslConnectionSocketFactory = new SSLConnectionSocketFactory(sslContextBuilder.build());
//	    CloseableHttpClient httpClient = HttpClients.custom()
//	            .setSSLSocketFactory(sslConnectionSocketFactory)
//	            .build();
//	    HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory(httpClient);
//	    requestFactory.setConnectTimeout(10000); // 10 seconds
//	    requestFactory.setReadTimeout(10000); // 10 seconds
//	    return new RestTemplate(requestFactory);
//	}
}
