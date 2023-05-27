
 /**
 * FileName:     PerformanceConfig.java
 * Createdate:   2019-02-18 15:38:06   
 */

package com.legend.aop.annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.legend.aop.Performance;

/**
 * Description:   
 * Copyright:   Copyright (c)2019    
 * @author:     legend  
 * @version:    1.0  
 * @date:   	2019-02-18 15:38:06   
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-02-18   legend         1.0         1.0 Version  
 */

@Configuration
@ComponentScan(basePackageClasses=Performance.class)
@EnableAspectJAutoProxy	//启用AspectJ自动代理，切面才不会只是普通的bean
public class PerformanceConfig {
	
}
