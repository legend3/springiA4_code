
 /**
 * FileName:     IceCream.java
 * Createdate:   2019-02-16 21:51:45   
 */

package com.legend.assembly.ambiguity.impl4;

import org.springframework.stereotype.Component;

import com.legend.assembly.ambiguity.Dessert;

/**
 * Description: 冰淇淋  
 * Copyright:   Copyright (c)2019    
 * @author:     legend
 * @version:    1.0  
 * @date:   	2019-02-16 21:51:45   
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-02-16   legend         1.0         1.0 Version
 */
@Component
@Cold
@Creamy
public class IceCream implements Dessert {

	@Override
	public void desc() {
		System.out.println("iceCream");
	}

}
