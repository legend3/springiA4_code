package com.legend.knights.impl1;

import com.legend.knights.Knight;
/**
 * Description: 与依赖对象高度耦合  
 * Copyright:   Copyright (c)2019    
 * @author:     legend  
 * @version:    1.0  
 * @date:   	2019-02-13 10:45:00   
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-02-13   legend         1.0         1.0 Version
 */
public class DamselRescuingKnight implements Knight {

	private RescueDamselQuest quest;

	public DamselRescuingKnight() {
		this.quest = new RescueDamselQuest();
	}

	public void embarkOnQuest() {
		quest.embark();
	}

}
