package com.mohan.javaBasics;

public class Day2 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        person.setAge(25);
        person.setAddress("123 Main st");
        person.display();

        System.out.println();
        Employee employee = new Employee();
        employee.setId(123);
        employee.setSalary(2000);
        employee.setName("John");
        employee.setDepartment("Engineering");
        employee.display();


    }
}

class  Person {

    String name;
    int age;
    String address;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }

    public String getAddress(){
        return address ;
    }
    public void setAddress(String address){
        this.address=address;
    }

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Address: "+address);
    }

}
