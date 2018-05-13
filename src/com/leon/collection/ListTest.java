package com.leon.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
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
		
		coursesToSelect.add(cr1);
		Course temp0 = (Course) coursesToSelect.get(2);
		System.out.println("����˿γ̣�"+ temp0.getId() +":"+ temp0.getName());
		
		//���·������׳������±�Խ���쳣
//		Course cr3 = new Course("3","test");
//		coursesToSelect.add(4,cr3);
		
		Course[] course = {new Course("3","��ɢ��ѧ"),new Course("4","�������")};
		coursesToSelect.addAll(Arrays.asList(course));
		Course temp3 = (Course) coursesToSelect.get(3);
		Course temp4 = (Course) coursesToSelect.get(4);
		
		System.out.println("��������ſγ̣�" + temp3.getId() + ":" +
				temp3.getName() + ";" + temp4.getId() + ":" + temp4.getName());
		
		Course[] course2 = {new Course("5","��ѧ����"),new Course("6","�ߵȴ���")};
		coursesToSelect.addAll(2,Arrays.asList(course2));
		Course temp5 = (Course) coursesToSelect.get(2);
		Course temp6 = (Course) coursesToSelect.get(3);
		
		System.out.println("��������ſγ̣�" + temp5.getId() + ":" +
				temp5.getName() + ";" + temp6.getId() + ":" + temp6.getName());
	}
	
	/**
	 * ȡ��List�е�Ԫ�صķ���
	 * @param args
	 */
	public void courseGet(){
		int size = coursesToSelect.size();
		System.out.println("�����¿γ̴�ѡ��");
		for(int i = 0;i<size;i++){
			Course cr = (Course) coursesToSelect.get(i);
			System.out.println("�γ̣�" + cr.getId() + ":" + cr.getName());
		}
	}
	
	/**
	 * ͨ��������������List
	 * @param args
	 */
	public void courseIterator(){
		//ͨ�����ϵ�iterator������ȡ�õ�������ʵ��
		Iterator it = coursesToSelect.iterator();
		System.out.println("�����¿γ̴�ѡ(ͨ������������)��");
		while(it.hasNext()){
			Course cr = (Course) it.next();
			System.out.println("�γ̣�" + cr.getId() + ":" + cr.getName());
		}
	}
	
	/**
	 * ͨ��for each�������ʼ���Ԫ��
	 * @param args
	 */
	public void testForEach(){
		System.out.println("�����¿γ̴�ѡ(ͨ��for each����)��");
		for(Object obj:coursesToSelect){
			Course cr = (Course) obj;
			System.out.println("�γ̣�" + cr.getId() + ":" + cr.getName());
		}
	}
	
	/**
	 * �޸�List��Ԫ��
	 * @param args
	 */
	public void courseModify(){
		coursesToSelect.set(4, new Course("7","ʵ�亯��"));
		
	}
	
	/**
	 * ɾ��List��Ԫ��
	 * @param args
	 */
	public void courseRemove(){
		Course cr = (Course) coursesToSelect.get(4);
		System.out.println("���ǿγ̣�" + cr.getId() + ":" + cr.getName() + ",�Ҽ�����ɾ��");
		coursesToSelect.remove(cr);
		System.out.println("�ɹ�ɾ���γ�");
		courseGet();
	}
	
	public static void main(String[] args){
		ListTest lt = new ListTest();
		lt.courseAdd();
		System.out.println("==========�ָ���==========");
		lt.courseGet();
		System.out.println("==========�ָ���==========");
		lt.courseIterator();
		System.out.println("==========�ָ���==========");
		lt.testForEach();
		System.out.println("==========�ָ���==========");
		lt.courseModify();
		lt.courseGet();
		System.out.println("==========�ָ���==========");
		lt.courseRemove();
	}
}
