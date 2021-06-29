package com.example.demo.entities.devices;

import javax.persistence.Entity;

@Entity
public class Ecran extends Device {
private String qualite;
private int resolution;
public String getQualite() {
	return qualite;
}
public void setQualite(String qualite) {
	this.qualite = qualite;
}
public int getResolution() {
	return resolution;
}
public void setResolution(int resolution) {
	this.resolution = resolution;
}





}
