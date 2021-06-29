package com.example.demo.entities.devices;

import javax.persistence.Entity;

@Entity
public class Clavier extends Device {
private int capacite;
private String mode;
public int getCapacite() {
	return capacite;
}
public void setCapacite(int capacite) {
	this.capacite = capacite;
}
public String getMode() {
	return mode;
}
public void setMode(String mode) {
	this.mode = mode;
}

}
