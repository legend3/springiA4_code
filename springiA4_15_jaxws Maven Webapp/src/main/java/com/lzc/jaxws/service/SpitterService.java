package com.legend.jaxws.service;

import com.legend.jaxws.bean.Spitter;

/**
 * Description:   
 * @author:     legend  
 * @version:    1.0  
 * @date:       2019-04-20 15:29:47  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-04-20   legend         1.0         1.0 Version  
 */

public interface SpitterService {

	Spitter getById(Long id);
}
