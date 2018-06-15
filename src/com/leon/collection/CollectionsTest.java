package com.leon.collection;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * ��Ҫ��ɣ�
 * 1.ͨ��Collections.sort()��������Integer���͵�List��������
 * 2.��String���͵�List��������
 * 3.���������ͷ��͵�List����������StudentΪ����
 *
 */
public class CollectionsTest {

	/**
	 * 1.ͨ��Collections.sort()��������Integer���͵�List��������
	 * ����һ��Integer���͵�List������ʮ��100���ڵĲ��ظ������
	 * ����Collections.sort()����������� ����
	 */
	public void testSort1(){
		List<Integer> integerList = new ArrayList<Integer>();
//		����ʮ��100���ڵĲ��ظ������
		Random random = new Random();
		while(true){
			if(integerList.size()<=10){
				Integer k = random.nextInt(100);
				if(!integerList.contains(k)){
					//k = random.nextInt(100);
					integerList.add(k);
					System.out.println("�ɹ����������" + k);
				}
				/*			do{
				k = random.nextInt(100);
			}while(integerList.contains(k));*/
			}else{
				System.out.println("-----------����ǰ------------");
				System.out.println(integerList);
				Collections.sort(integerList);
				System.out.println("-----------�����------------");
				System.out.println(integerList);
				break;
			}
		}
//		for (Integer integer : integerList) {
//		}
	}
	
	/**
	 * 2.��String���͵�List��������
	 * ����String���͵�List���������������StingԪ�أ�
	 * ����sort�������ٴ�����������˳��
	 */
	public void testSort2(){
		List<String> stringList = new ArrayList<String>();
		stringList.add("Java");
		stringList.add("JavaScript");
		stringList.add("Python");
		System.out.println("-----------����ǰ------------");
		for (String string : stringList) {
			System.out.println("Ԫ��" + string);
		}
		Collections.sort(stringList);
		/**
		 * ����˳��
		 * ���֣�0-9
		 * ��д��ĸ��A-Z
		 * Сд��ĸ��a-z
		 */
		System.out.println("-----------�����------------");
		for (String string : stringList) {
			System.out.println("Ԫ��" + string);
		}
	}
	/**
	 * ����Collections.sort()�����Է���ΪString��List��������汾2��
	 * 1.������List<String>֮�����������ʮ������ַ���
	 * 2.ÿ���ַ����ĳ���Ϊ10���ڵ��������
	 * 3.ÿ���ַ�����ÿ���ַ���Ϊ������ɵ��ַ����ַ������ظ�
	 * 4.ÿ������ַ��������ظ�
	 * @throws UnsupportedEncodingException 
	 */
	public void testStringSort() throws UnsupportedEncodingException{
		List<String> stringList = new ArrayList<String>();
		String str = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
/*		do{
			int random = new Random().nextInt(51);
			int i = 0;
			System.out.println("���ɵ������Ϊ"+random);
			String subStr = str.substring(random, random+10);
			System.out.println("��ȡ���ַ���Ϊ"+subStr);
			if(!stringList.contains(subStr)){
				stringList.add(subStr);
				System.out.println("��"+(i+1)+"�����Ԫ��"+subStr);
			}
		}while(stringList.size()<10);
		System.out.println("�ַ�������Ϊ"+stringList.toString());*/
		String[] by = str.split("");
		System.out.println("ת���ɵ�String����Ϊ"+by.toString());
		do{
			int len = new Random().nextInt(10);
			String ss = "";
			for (int i = 0; i < len; i++) {
				int index = new Random().nextInt(62);
				ss = ss + by[index];
			}
			System.out.println("���ɵ��ַ���Ϊ"+ss);
			stringList.add(ss);
		}while(stringList.size()<10);
		System.out.println("�����ַ�������Ϊ"+stringList.toString());
		Collections.sort(stringList);
		System.out.println("�ַ����������"+stringList);
	}
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		CollectionsTest ct = new CollectionsTest();
		//ct.testSort1();
		//ct.testSort2();
		ct.testStringSort();
	}

}
