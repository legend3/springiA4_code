package com.legend.soundsystem.javaconfig.impl;

import com.legend.soundsystem.javaconfig.CompactDisc;

public class SgtPeppers implements CompactDisc {

	private String title = "夜曲";
	private String artist = "周杰伦";

	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

}
