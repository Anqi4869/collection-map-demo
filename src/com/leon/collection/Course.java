package com.leon.collection;
/**
 * �γ���
 * @author LeonChen
 *
 */
public class Course {
	// �γ�id
	private String id;
	// �γ�����
	private String name;
	
	public Course(String id,String name){
		this.id = id;
		this.name = name;
	}
	
	//�γ�id��get����
	public String getId(){
		return id;
	}
	//�γ�id��set����
	public void setId(String id){
		this.id = id;
	}
	
	// �γ�name��get����
	public String getName(){
		return name;
	}
	// �γ�name��set����
	public void setName(String name){
		this.name = name;
	}
}
