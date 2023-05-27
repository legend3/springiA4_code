
 /**
 * FileName:     EncoreableConfigTest.java
 * Createdate:   2019-02-18 17:47:34   
 */

package com.legend.aop.annotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.legend.aop.Performance;
import com.legend.aop.annotation.Encoreable;
import com.legend.aop.annotation.config.EncoreableConfig;

/**
 * Description:   
 * Copyright:   Copyright (c)2019    
 * @author:     legend
 * @version:    1.0  
 * @date:   	2019-02-18 17:47:34   
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-02-18   legend         1.0         1.0 Version
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=EncoreableConfig.class)
public class EncoreableTest {

	@Autowired
	private Performance performance;
	
	@Test
	public void test() {
		performance.perform();
		//由于performance引入了Encoreable接口（指定了实现类），所以能强转为该接口
		Encoreable encoreable = (Encoreable) performance;
		encoreable.performEncore();
	}

}
