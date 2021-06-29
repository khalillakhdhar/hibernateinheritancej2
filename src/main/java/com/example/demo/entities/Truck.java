package com.example.demo.entities;

import javax.persistence.Entity;

@Entity
public class Truck extends TransportationVehicule{
private int noofcontainers;

public int getNoofcontainers() {
	return noofcontainers;
}

public void setNoofcontainers(int noofcontainers) {
	this.noofcontainers = noofcontainers;
}


}
