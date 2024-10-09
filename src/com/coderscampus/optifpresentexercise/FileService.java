package com.coderscampus.optifpresentexercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FileService {
	public List<SuspectLocation> readWatchReport(String fileName) throws FileNotFoundException, IOException {
		List<SuspectLocation> suspectLocations = new ArrayList<>();
		String line;

		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			br.readLine();
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				if (data.length == 2) {
					String countryOpt = data[0].trim();
					String nameOpt = data[1].trim();
					suspectLocations.add(new SuspectLocation(countryOpt, nameOpt));
				}
			}

		}
		return suspectLocations;
	}
	public void findCarmenSanDiego (List<SuspectLocation> suspectLocations) {
		Optional<SuspectLocation> carmenLocation = suspectLocations.stream()
																   .filter(location -> location.getNameOpt().orElse("")
																   .equalsIgnoreCase("Carmen SanDiego")).findAny();
		
		carmenLocation.ifPresentOrElse(location -> System.out.println("Carmen SanDiego is in..." + location.getCountryOpt().orElse("Unkown")),
																	 () -> System.out.println("Galdang, just missed her!"));
	}
}