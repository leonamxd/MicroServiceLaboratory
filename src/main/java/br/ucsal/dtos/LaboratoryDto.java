package br.ucsal.dtos;

import jakarta.validation.constraints.NotBlank;

public class LaboratoryDto {
	

	@NotBlank
	private String description;
	@NotBlank
	private Integer machines;
	@NotBlank
	private String location;
	
	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Integer getMachines() {
		return machines;
	}


	public void setMachines(Integer machines) {
		this.machines = machines;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}
}