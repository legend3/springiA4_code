package com.legend.jaxws.config;

import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;

import com.legend.jaxws.service.SpitterService;

/**
 * Description:   
 * @author:     legend  
 * @version:    1.0  
 * @date:       2019-04-20 15:37:29  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-20   legend         1.0         1.0 Version  
 */

@Configuration
@ComponentScan("com.legend.jaxws")
public class SpitterConfig {

	@Bean
	public JaxWsPortProxyFactoryBean spitterService() {
		JaxWsPortProxyFactoryBean proxy = new JaxWsPortProxyFactoryBean();
		proxy.setServiceName("SpitterWS");
		proxy.setServiceInterface(SpitterService.class);
		proxy.setPortName("SpitterWSPort");
		proxy.setNamespaceUri("http://config.jaxws.legend.com");
		try {
			URL url = new URL("http://localhost:9999/services/SpitterWS?wsdl");
			proxy.setWsdlDocumentUrl(url);
		} catch (MalformedURLException e) {
			throw new RuntimeException("Wsdl Document URL Created Failure.");
		}
		return proxy;
	}
}
