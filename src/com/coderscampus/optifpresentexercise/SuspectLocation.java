package com.coderscampus.optifpresentexercise;

import java.util.Optional;

public class SuspectLocation {
	private Optional<String> countryOpt = Optional.empty();
	private Optional<String> nameOpt = Optional.empty();

	@Override
	public String toString() {
		return "SuspectLocation [countryOpt=" + countryOpt + ", nameOpt=" + nameOpt + "]";
	}

	public SuspectLocation(String countryOpt, String nameOpt) {
		this.countryOpt = Optional.ofNullable(countryOpt);
		this.nameOpt = Optional.ofNullable(nameOpt);
	}

	public Optional<String> getCountryOpt() {
		return countryOpt;
	}

	public void setCountryOpt(String countryOpt) {
		this.countryOpt = Optional.ofNullable(countryOpt);
	}

	public Optional<String> getNameOpt() {
		return nameOpt;
	}

	public void setNameOpt(String nameOpt) {
		this.nameOpt = Optional.ofNullable(nameOpt);
	}

}
