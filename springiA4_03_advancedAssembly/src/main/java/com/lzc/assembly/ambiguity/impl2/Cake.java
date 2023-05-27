
 /**
 * FileName:     Cake.java
 * Createdate:   2019-02-16 21:49:01   
 */

package com.legend.assembly.ambiguity.impl2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.legend.assembly.ambiguity.Dessert;

/**
 * Description: 蛋糕  
 * Copyright:   Copyright (c)2019    
 * @author:     legend  
 * @version:    1.0  
 * @date:   	2019-02-16 21:49:01   
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-02-16   legend         1.0         1.0 Version  
 */

@Component
//@Primary
public class Cake implements Dessert {

	@Override
	public void desc() {
		System.out.println("cake");
	}

}
