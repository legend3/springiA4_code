package com.legend.soundsystem.mixedconfig.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.legend.soundsystem.mixedconfig.CompactDisc;
import com.legend.soundsystem.mixedconfig.MediaPlayer;

public class CDPlayer implements MediaPlayer {

	private CompactDisc cd;

	@Autowired
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}

	public void play() {
		cd.play();
	}

}
