package com.doubt.hashcode;
import java.util.*;
class Emp {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Emp(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Emp() {}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Emp [id=").append(id).append(", name=").append(name).append("]");
		return builder.toString();
	}
	//used to tell which bucket
	@Override
	public int hashCode() {
		return name.length();
	}

	//method tell to compare data from the same bucket
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	

}

public class Demo {

	public static void main(String[] args) {
		
	
		Map<Emp, Double> empMap=new HashMap<Emp, Double>();
		
		
		empMap.put(new Emp(1, "rajesh"), 600000.00);
		empMap.put(new Emp(44, "ekta"), 630000.00);
		
		System.out.println(empMap.get(new Emp(1, "rajesh")));
		
	}
}
