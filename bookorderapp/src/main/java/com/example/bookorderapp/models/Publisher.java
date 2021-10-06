package com.example.bookorderapp.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="publisher")
public class Publisher {
@Id
private String id;
private String name;
private String location;
/**
 * @return the id
 */
public String getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(String id) {
	this.id = id;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the location
 */
public String getLocation() {
	return location;
}
/**
 * @param location the location to set
 */
public void setLocation(String location) {
	this.location = location;
}
@Override
public String toString() {
	return "Publisher [id=" + id + ", name=" + name + ", location=" + location + ", getId()=" + getId() + ", getName()="
			+ getName() + ", getLocation()=" + getLocation() + "]";
}

}
