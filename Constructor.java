package com.sample.Employee;

class Constructor{  
    int id;  
    String name;  
    int age;  
    String address;
    
   
    //creating two arg constructor  
    Constructor(int i,String n){  
    id = i;  
    name = n;  
    }  
    //creating three arg constructor  
    Constructor(int i,String n,int a){  
    id = i;  
    name = n;  
    age=a;  
    }  
    Constructor(int i,String n,int a,String add)
    		{
    	id=i;
    	name=n;
    	age=a;
    	address=add;
    		}
    void display(){
    	System.out.println(id+" "+name+" "+age+" "+address);
    	}  
    
   
    public static void main(String args[]){  
    Constructor s1 = new Constructor(111,"Karan");  
    Constructor s2 = new Constructor(222,"Aryan",25);  
    Constructor s3=new Constructor(333,"Arun",22,"chennai");
    s1.address="cbe";
    s1.display();  
    s2.display();  
    s3.display();
   }  
} 
