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
		if (!(obj instanceof Course))
			return false;
		Course other = (Course) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
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
