package com.leon.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {
	
	public List<Course> coursesToSelect;
	
	public SetTest(){
		coursesToSelect = new ArrayList<Course>();
	}
	
	public void courseAdd(){
		//����һ���γ̶��󣬲�ͨ������add��������ӵ���ѡ�γ�List��
		Course cr1 = new Course("1","���ݽṹ");
		coursesToSelect.add(cr1);
		Course temp = (Course) coursesToSelect.get(0);
//		System.out.println("����˿γ̣�"+ temp.getId() +":"+ temp.getName());
		
		Course cr2 = new Course("2","�㷨���");
		coursesToSelect.add(0,cr2);
		Course temp2 = (Course) coursesToSelect.get(0);
//		System.out.println("����˿γ̣�"+ temp2.getId() +":"+ temp2.getName());
		
//		coursesToSelect.add(cr1);
//		Course temp0 = (Course) coursesToSelect.get(2);
//		System.out.println("����˿γ̣�"+ temp0.getId() +":"+ temp0.getName());
		
		//���·������׳������±�Խ���쳣
//		Course cr3 = new Course("3","test");
//		coursesToSelect.add(4,cr3);
		
		Course[] course = {new Course("3","��ɢ��ѧ"),new Course("4","�������")};
		coursesToSelect.addAll(Arrays.asList(course));
		Course temp3 = (Course) coursesToSelect.get(2);
		Course temp4 = (Course) coursesToSelect.get(3);
		
//		System.out.println("��������ſγ̣�" + temp3.getId() + ":" +
//				temp3.getName() + ";" + temp4.getId() + ":" + temp4.getName());
		
		Course[] course2 = {new Course("5","��ѧ����"),new Course("6","�ߵȴ���")};
		coursesToSelect.addAll(2,Arrays.asList(course2));
		Course temp5 = (Course) coursesToSelect.get(2);
		Course temp6 = (Course) coursesToSelect.get(3);
		
//		System.out.println("��������ſγ̣�" + temp5.getId() + ":" +
//				temp5.getName() + ";" + temp6.getId() + ":" + temp6.getName());
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
	 * ����List��contains����
	 */
	public void testListContains(){
		//ȡ�ñ�ѡ�γ����еĵ�0��Ԫ��
		Course course = coursesToSelect.get(0);
		//��ӡ���coursesToSelectd�Ƿ����course����
		System.out.println("ȡ�ÿγ̣�" + course.getName());
		System.out.println("��ѡ�γ����Ƿ�����γ̣�" + course.getName() + "," +
			coursesToSelect.contains(course));
		//����һ���µĿγ̶���ID�����ƣ���course������ȥһ��
		Course course2 = new Course(course.getId(),course.getName());
		System.out.println("�´����γ̣�" + course2.getName());
		System.out.println("��ѡ�γ��Ƿ�����γ̣�" + course2.getName() + "," + 
			coursesToSelect.contains(course2));
	}

	public static void main(String[] args) {
		SetTest st = new SetTest();
		st.courseAdd();
		st.testForEach();
		//����һ��ѧ������
		Student student = new Student("1","С��");
		System.out.println("��ӭѧ����" + student.getName() + "ѡ�Σ�");
		//����һ��Scanner�����������մӼ�������Ŀγ�ID
		Scanner console = new Scanner(System.in);
		
		for(int i = 0;i < 3;i++){
			System.out.println("������γ�ID");
			String courseId = console.next();
			for (Course cr : st.coursesToSelect) {
				if(cr.getId().equals(courseId)){
					student.courses.add(cr);
					/**
					 * Set�У������������������Ӷ��ٴΣ�����ֻ�ᱣ��һ���Ķ���
					 * ����ֻ�ᱣ��һ���ö��󣨵����ã�
					 * ���ң��������ǵ�һ����ӵ���һ��
					 */
//					student.courses.add(cr);
				}
			}
		}
		
		st.testForEachForSet(student);
		st.testListContains();
	}
	
	public void testForEachForSet(Student student){
		//��ӡ���ѧ����ѡ�Ŀγ̣�
		System.out.println("��ѡ���ˣ�" + student.courses.size() + "�ſγ̣�");
		for (Course cr : student.courses) {
			System.out.println("ѡ���˿γ̣�" + cr.getId() + cr.getName());
		}
	}

}
