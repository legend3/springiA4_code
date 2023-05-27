
 /**
 * FileName:     Impl1Config.java
 * Createdate:   2019-02-16 21:58:57   
 */

package com.legend.assembly.ambiguity.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Description: 扫描impl2  
 * Copyright:   Copyright (c)2019    
 * @author:     legend
 * @version:    1.0  
 * @date:   	2019-02-16 21:58:57   
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-02-16   legend         1.0         1.0 Version
 */
@Configuration
@ComponentScan(basePackages="com.legend.assembly.ambiguity.impl2")
public class Impl2Config {

}
