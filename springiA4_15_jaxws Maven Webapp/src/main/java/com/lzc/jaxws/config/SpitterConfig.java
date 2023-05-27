package com.legend.jaxws.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;

import com.legend.jaxws.service.SpitterService;
import com.legend.jaxws.service.SpitterServiceImpl;

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
	public SpitterService spitterService() {
		return new SpitterServiceImpl();
	}
	
	@Bean
	public SimpleJaxWsServiceExporter simpleJaxWsServiceExporter() {
		SimpleJaxWsServiceExporter exporter = new SimpleJaxWsServiceExporter();
		//不能与当前服务器端口重复
		exporter.setBaseAddress("http://localhost:9999/services/");
		return exporter;
	}
}
