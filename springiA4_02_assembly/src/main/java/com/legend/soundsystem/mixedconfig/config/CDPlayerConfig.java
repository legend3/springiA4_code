package com.legend.soundsystem.mixedconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.legend.soundsystem.mixedconfig.CompactDisc;
import com.legend.soundsystem.mixedconfig.impl.CDPlayer;

@Configuration
public class CDPlayerConfig {

	@Bean
	public CDPlayer cdPlayer(CompactDisc compactDisc) {
		return new CDPlayer(compactDisc);
	}

}
