package com.legend.soundsystem.javaconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.legend.soundsystem.javaconfig.CompactDisc;
import com.legend.soundsystem.javaconfig.impl.CDPlayer;
import com.legend.soundsystem.javaconfig.impl.SgtPeppers;

@Configuration
public class CDPlayerConfig {

	@Bean
	public CompactDisc compactDisc() {
		return new SgtPeppers();
	}

	@Bean
	public CDPlayer cdPlayer(CompactDisc compactDisc) {
		return new CDPlayer(compactDisc);
	}

}
