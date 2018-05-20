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
	
	@Override
	public boolean equals(Object obj){
		if(this == obj){
			return true;
		}
		if(obj == null)
			return false;
		if(!(obj instanceof Course))
			return false;
		Course course = (Course) obj;
		if(this.name == null){
			if(course.name == null){
				return true;
			}else{
				return false;
			}
		}else{
			if(this.name.equals(course.name)){
				return true;
			}else{
				return false;
			}
		}
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
	public Course(){}
}
