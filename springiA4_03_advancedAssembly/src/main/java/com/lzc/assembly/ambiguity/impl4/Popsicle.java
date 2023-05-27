
 /**
 * FileName:     Popsicle.java
 * Createdate:   2019-02-16 22:14:55   
 */

package com.legend.assembly.ambiguity.impl4;

import org.springframework.stereotype.Component;

import com.legend.assembly.ambiguity.Dessert;

/**
 * Description: 冰棒  
 * Copyright:   Copyright (c)2019    
 * @author:     legend  
 * @version:    1.0  
 * @date:   	2019-02-16 22:14:55   
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-02-16   legend         1.0         1.0 Version  
 */
@Component
@Cold
@Fruity
public class Popsicle implements Dessert {

	@Override
	public void desc() {
		System.out.println("popsicle");
	}

}
