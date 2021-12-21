package org.class1;

<<<<<<< HEAD
public class Class {
	private void syso() {
		System.out.println("syso");

	}
=======
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
	
	
>>>>>>> 9371620131015074431397b31e7f9038f474a6b8

