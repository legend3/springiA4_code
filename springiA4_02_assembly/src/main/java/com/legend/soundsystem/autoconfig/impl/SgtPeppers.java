package com.legend.soundsystem.autoconfig.impl;

import org.springframework.stereotype.Component;

import com.legend.soundsystem.autoconfig.CompactDisc;

@Component
public class SgtPeppers implements CompactDisc {

	private String title = "夜曲";
	private String artist = "周杰伦";

	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

}
