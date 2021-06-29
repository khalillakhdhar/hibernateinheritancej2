package com.example.demo.entities;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class PassagerVehicle extends Vehicule {
private int numberofpassager;

public int getNumberofpassager() {
	return numberofpassager;
}

public void setNumberofpassager(int numberofpassager) {
	this.numberofpassager = numberofpassager;
}

}
