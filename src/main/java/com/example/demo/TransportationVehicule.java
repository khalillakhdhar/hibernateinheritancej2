package com.example.demo;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class TransportationVehicule extends Vehicule {
private int loadCapacity;

public int getLoadCapacity() {
	return loadCapacity;
}

public void setLoadCapacity(int loadCapacity) {
	this.loadCapacity = loadCapacity;
}


}
