
 /**
 * FileName:     AspectJTest.java
 * Copyright (c) 2019 legend.All Rights Reserved.
 */

package com.legend.aspectj;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Description:   
 * @author:     legend
 * @version:    1.0  
 * @date:       2019-02-20 22:03:07  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-02-20   legend         1.0         1.0 Version
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:performance.xml")
public class AspectJTest {

	@Autowired
	private Performance performance;
	
	@Test
	public void test() {
		performance.perform();
	}

}
