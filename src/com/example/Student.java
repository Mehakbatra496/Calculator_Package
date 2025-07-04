package com.example;
import java.util.Arrays;

class StudentData {
    String name;
    int age;

    public StudentData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getData() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Student
{
	int i;

	public static void main(String args[]) {
		
		StudentData s1= new  StudentData("Kavish", 23); // initialize the value of object via constructor
		StudentData s2= new  StudentData("Riya", 25);
		StudentData s3= new  StudentData("Anuj", 30);
		
		StudentData sarr[]= new StudentData[5];
		sarr[0]=s1;
		sarr[1]=s2;
		sarr[2]=s3;
		
		
		for(int i=0; i<=2; i++)
		{
//			System.out.println(sarr[i]);  // object of student type
			sarr[i].getData(); // will call a method by object, and the values of the object will be printed
		}
		
		int[] arr= {23, 56, 2, 34, 78, 25};
		
		
		Arrays.sort(arr);
		
		int i= Arrays.binarySearch(arr, 78);
		
		System.out.println("index  " +i);
		
		
		String st="Kavita"; //obj 1
		
		System.out.println(st);
		
		String st2=st.concat(" Sharma");	 //obj 2	
		System.out.println(st2);
		
//		---------------------------------------------------------------------------
		StringBuffer st3=new StringBuffer("Arun");
			
		st3.append(" Rana");
		
		System.out.println(st3);
		
		StringBuilder st4=new StringBuilder("Kamal");
		
		st4.append(" Verma");
		
		System.out.println(st4);
		
	}
	
}








