package com.legend.soundsystem.javaconfig.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.legend.soundsystem.javaconfig.CompactDisc;
import com.legend.soundsystem.javaconfig.MediaPlayer;

public class CDPlayer implements MediaPlayer {

	private CompactDisc cd;

	//构造器注入，可以不用@Autowired
	@Autowired
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}

	public void play() {
		cd.play();
	}

}
