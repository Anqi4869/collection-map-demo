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
		
	
	public Set courses;
	
	public Student(String id,String name){
		this.id = id;
		this.name = name;
		this.courses = new HashSet();
	}
	
	// ѧ��id��get����
	public String getId(){
		return id;
	}
	// ѧ��id��set����
	public void setId(String id){
		this.id = id;
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
