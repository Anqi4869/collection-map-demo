package com.leon.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * ѧ����
 * @author LeonChen
 *
 */
public class Student {
	// ѧ��id
	private String id;
	// ѧ��name
	private String name;
		
	
	public Set<Course> courses;
	
	public Student(String id,String name){
		this.id = id;
		this.name = name;
		this.courses = new HashSet<Course>();
	}
	
	// ѧ��id��get����
	public String getId(){
		return id;
	}
	// ѧ��id��set����
	public void setId(String id){
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	// ѧ��name��get����
	public String getName(){
		return name;
	}
	// ѧ��name��set����
	public void setName(String name){
		this.name = name;
	}
}
