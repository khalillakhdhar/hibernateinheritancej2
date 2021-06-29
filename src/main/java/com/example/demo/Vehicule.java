package com.example.demo;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "type")
public class Vehicule {
@Id
private long idVehicule;
private String manifacturer;
public long getIdVehicule() {
	return idVehicule;
}
public void setIdVehicule(long idVehicule) {
	this.idVehicule = idVehicule;
}
public String getManifacturer() {
	return manifacturer;
}
public void setManifacturer(String manifacturer) {
	this.manifacturer = manifacturer;
}


}
