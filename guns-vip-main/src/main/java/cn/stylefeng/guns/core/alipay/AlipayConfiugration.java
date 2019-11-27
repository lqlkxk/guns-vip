package cn.stylefeng.guns.core.alipay;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.CertAlipayRequest;
import com.alipay.api.DefaultAlipayClient;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Configuration
@EnableConfigurationProperties(AlipayProperties.class)
public class AlipayConfiugration {
	private final AlipayProperties properties;
	
	@Bean
	public AlipayClient alipayClient() throws AlipayApiException {
		CertAlipayRequest certAlipayRequest = new CertAlipayRequest();
		certAlipayRequest.setServerUrl(properties.getGateway());
		certAlipayRequest.setAppId(properties.getAppID());
		certAlipayRequest.setPrivateKey(properties.getPrivateKey());
		certAlipayRequest.setFormat(properties.getFormat());
		certAlipayRequest.setCharset(properties.getCharset());
		certAlipayRequest.setSignType(properties.getSignType());
		certAlipayRequest.setCertPath(properties.getAlipayCertPath());
		certAlipayRequest.setAlipayPublicCertPath(properties.getAlipayCertPath());
		certAlipayRequest.setRootCertPath(properties.getAlipayRootCertPath());
		return new DefaultAlipayClient(certAlipayRequest);
	}
}