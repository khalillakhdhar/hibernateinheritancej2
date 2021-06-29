package com.example.demo.entities;

import javax.persistence.Entity;

@Entity
public class Car extends PassagerVehicle {
private int noofdoors;

public int getNoofdoors() {
	return noofdoors;
}

public void setNoofdoors(int noofdoors) {
	this.noofdoors = noofdoors;
}

	
}
