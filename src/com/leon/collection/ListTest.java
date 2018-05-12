package com.leon.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ��ѡ�γ���
 * @author LeonChen
 *
 */
public class ListTest {
	
	/**
	 * ���ڴ�ű�ѡ�γ̵�List
	 */
	public List coursesToSelect;
	
	public ListTest(){
		this.coursesToSelect = new ArrayList();
	}
	
	/**
	 * ������coursesToSelect����ӱ�ѡ�γ�
	 */
	public void courseAdd(){
		//����һ���γ̶��󣬲�ͨ������add��������ӵ���ѡ�γ�List��
		Course cr1 = new Course("1","���ݽṹ");
		coursesToSelect.add(cr1);
		Course temp = (Course) coursesToSelect.get(0);
		System.out.println("����˿γ̣�"+ temp.getId() +":"+ temp.getName());
		
		Course cr2 = new Course("2","�㷨���");
		coursesToSelect.add(0,cr2);
		Course temp2 = (Course) coursesToSelect.get(0);
		System.out.println("����˿γ̣�"+ temp2.getId() +":"+ temp2.getName());
		
		//���·������׳������±�Խ���쳣
//		Course cr3 = new Course("3","test");
//		coursesToSelect.add(4,cr3);
		
		Course[] course = {new Course("3","��ɢ��ѧ"),new Course("4","�������")};
		coursesToSelect.addAll(Arrays.asList(course));
		Course temp3 = (Course) coursesToSelect.get(2);
		Course temp4 = (Course) coursesToSelect.get(3);
		
		System.out.println("��������ſγ̣�" + temp3.getId() + ":" +
				temp3.getName() + ";" + temp4.getId() + ":" + temp4.getName());
		
		Course[] course2 = {new Course("5","��ѧ����"),new Course("6","�ߵȴ���")};
		coursesToSelect.addAll(2,Arrays.asList(course2));
		Course temp5 = (Course) coursesToSelect.get(2);
		Course temp6 = (Course) coursesToSelect.get(3);
		
		System.out.println("��������ſγ̣�" + temp5.getId() + ":" +
				temp5.getName() + ";" + temp6.getId() + ":" + temp6.getName());
	}
	
	public static void main(String[] args){
		ListTest lt = new ListTest();
		lt.courseAdd();
	}
}
