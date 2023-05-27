
 /**
 * FileName:     EncoreableConfig.java
 * Createdate:   2019-02-18 17:17:33   
 */

package com.legend.aop.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.legend.aop.Performance;
import com.legend.aop.SingPerformance;
import com.legend.aop.annotation.aspect.EncoreableIntroducer;

/**
 * Description:   
 * Copyright:   Copyright (c)2019    
 * @author:     legend  
 * @version:    1.0  
 * @date:   	2019-02-18 17:17:33   
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-02-18   legend         1.0         1.0 Version  
 */
@Configuration
@EnableAspectJAutoProxy
public class EncoreableConfig {

	@Bean
	public Performance performance() {
		return new SingPerformance();
	}
	
	@Bean
	public EncoreableIntroducer encoreableIntroducer() {
		return new EncoreableIntroducer();
	}
}
