package com.coderscampus.optifpresentexercise;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class SuspectLocationApp {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		FileService fileService = new FileService();

		List<SuspectLocation> week1 = fileService.readWatchReport("InterpolWatchReport-Week1.csv");
		List<SuspectLocation> week2 = fileService.readWatchReport("InterpolWatchReport-Week2.csv");
		List<SuspectLocation> week3 = fileService.readWatchReport("InterpolWatchReport-Week3.csv");

		System.out.println("Week 1:");
		fileService.findCarmenSanDiego(week1);
		System.out.println("Week 2:");
		fileService.findCarmenSanDiego(week2);
		System.out.println("Week 3:");
		fileService.findCarmenSanDiego(week3);
	}

}
