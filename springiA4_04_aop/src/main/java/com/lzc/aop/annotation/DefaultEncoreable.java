
 /**
 * FileName:     DefaultEncoreable.java
 * Createdate:   2019-02-18 17:09:52   
 */

package com.legend.aop.annotation;


/**
 * Description:   
 * Copyright:   Copyright (c)2019    
 * @author:     legend  
 * @version:    1.0  
 * @date:   	2019-02-18 17:09:52   
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-02-18   legend         1.0         1.0 Version  
 */

public class DefaultEncoreable implements Encoreable {

	@Override
	public void performEncore() {
		System.out.println("表演中植入广告");
	}

}
