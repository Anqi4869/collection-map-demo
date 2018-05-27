package com.leon.collection;

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
		Integer k;
		for(int i = 0;i < 10;i++){
//			if(integerList.contains(k)){
//				k = random.nextInt(100);
//			}
			do{
				k = random.nextInt(100);
			}while(integerList.contains(k));
			integerList.add(k);
			System.out.println("�ɹ����������" + k);
		}
		System.out.println("-----------����ǰ------------");
//		for (Integer integer : integerList) {
			System.out.println(integerList);
//		}
		Collections.sort(integerList);
		System.out.println("-----------�����------------");
		System.out.println(integerList);
	}
	
	public static void main(String[] args) {
		CollectionsTest ct = new CollectionsTest();
		ct.testSort1();

	}

}
