package com.kaishengit.entity;

import java.util.jar.Attributes.Name;

public class Dog {

	public String name;
	public int gaiming(int nam) {
		nam++; 
		return nam;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj==null) {
			return false;
		}
		if(!(obj instanceof Dog)) {
			return false;
		}
		Dog dog1 = (Dog)obj;
		if(this.name == null) {
			if(dog1.name == null) {
				return true;
			} else{
				return false;
			}
		} else {
			if(this.name.equals(dog1.name)){
				return true;
			}
			return false;
		}
	}
}
