package org.class1;

import java.util.ArrayList;
import java.util.List;

public class Class {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		l.add(50);
		l.add(60);
		int s= l.lastIndexOf(10);
		System.out.println("Index last value of 10:"+s);
		}
	}
	
	

