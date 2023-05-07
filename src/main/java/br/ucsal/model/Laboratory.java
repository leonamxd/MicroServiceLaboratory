package br.ucsal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbLaboratory")
public class Laboratory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String description;
	public StatusLaboratory status;
	private Integer machines;
	private String location;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public StatusLaboratory getStatus() {
		return status;
	}
	public void setStatus(StatusLaboratory status) {
		this.status = status;
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
