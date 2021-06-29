package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Bike extends PassagerVehicle {
@Column(length = 11,nullable = true)
private int saddleheight;

public int getSaddleheight() {
	return saddleheight;
}

public void setSaddleheight(int saddleheight) {
	this.saddleheight = saddleheight;
}

}
