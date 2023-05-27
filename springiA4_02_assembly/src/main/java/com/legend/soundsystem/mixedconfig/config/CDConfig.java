package com.legend.soundsystem.mixedconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.legend.soundsystem.mixedconfig.CompactDisc;
import com.legend.soundsystem.mixedconfig.impl.SgtPeppers;

@Configuration
public class CDConfig {

	@Bean
	public CompactDisc compactDisc() {
		return new SgtPeppers();
	}
}