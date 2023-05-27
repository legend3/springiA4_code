package com.legend.knights.impl2;

import java.io.PrintStream;

import com.legend.knights.Quest;

public class SlayDragonQuest implements Quest {

	private PrintStream stream;

	public SlayDragonQuest(PrintStream stream) {
		this.stream = stream;
	}

	public void embark() {
		stream.println("Embarking on quest to slay the dragon!");
	}

}
