
 /**
 * FileName:     SpitterServiceEndpoint.java
 * Copyright (c) 2019 legend.All Rights Reserved.
 */

package com.legend.jaxws.config;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.legend.jaxws.bean.Spitter;
import com.legend.jaxws.service.SpitterService;

/**
 * Description: 可发布的WS端点  
 * @author:     legend  
 * @version:    1.0  
 * @date:       2019-04-20 17:07:07  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-20   legend         1.0         1.0 Version  
 */

@Component
@WebService(serviceName="SpitterWS",
		portName="SpitterWSPort",	//默认类名加Port（SpitterServiceEndpointPort）
		targetNamespace="http://config.jaxws.legend.com"	//默认值即http://多级域名（当前包名反写）
		)
public class SpitterServiceEndpoint {
	
	@Autowired
	private SpitterService spitterService;
	
	//operationName默认是方法名，如果发布端和客户端的都选择默认值，且方法名不一致，会找不到
	@WebMethod(operationName="getById")
	public Spitter getSpitter(Long spitterId) {
		return spitterService.getById(spitterId);
	}

}
