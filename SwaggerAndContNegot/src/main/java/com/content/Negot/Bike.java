package com.content.Negot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Bike
{
	@Id
	@GeneratedValue
	private int id;
	private String company;
	private String vehiclename;
	private int cost;
	private int weight;
	
	Bike()
	{
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getVehiclename() {
		return vehiclename;
	}
	public void setVehiclename(String vehiclename) {
		this.vehiclename = vehiclename;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Bike(int id, String company, String vehiclename, int cost, int weight) 
	{
		this.id = id;
		this.company = company;
		this.vehiclename = vehiclename;
		this.cost = cost;
		this.weight = weight;
	}

}
