package com.legend.soundsystem.xmlconfig.impl;

import com.legend.soundsystem.xmlconfig.CompactDisc;

public class SgtPeppers implements CompactDisc {

	private String title = "夜曲";
	private String artist = "周杰伦";

	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

}
