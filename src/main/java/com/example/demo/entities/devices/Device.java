package com.example.demo.entities.devices;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;import org.hibernate.cfg.annotations.Nullability;

import com.sun.istack.Nullable;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "type")
public class Device {
@Id
long id;
@Column(nullable = false)
String device_name;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getDevice_name() {
	return device_name;
}
public void setDevice_name(String device_name) {
	this.device_name = device_name;
}

}
