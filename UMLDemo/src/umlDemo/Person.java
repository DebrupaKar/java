/**
 * @startuml
 * class Person{
 * -name : String
 * -age : int
 * +hashCode() : int
 * +toString() : String
 * compareto(Person) : int
 * }
 * 
 * note top of Person : person is the general class
 * 
 * class Student{
 * -rollNumber : int
 * +getRollNumber() : int
 * +setRollNumber(int rollNumber) 
 * }
 * 
 *  Person "is a" <|- Student
 *  
 *  class Lecturer{
 *  -salary : double
 *  +getSalary() : double
 *  +setSalary(double salary)
 *  }
 *  
 *  Person "is a" <|- Lecturer
 *  
 *  class Department{
 *  -deptId : int
 *  -deptName : String
 *  +getDeptId() : int
 *  +setDeptId(int deptId)
 *  +getDeptName() : String
 *  +setDeptname(String deptName)
 *  }
 *  
 *  Student "n" o- "1" Department : studies in >
 *  Lecturer "n" o- "1" Department : teaches in >
 *  Student "n" -- "n" Lecturer : studies under >
 *  
 *  
 * 
 * 
 * @enduml
 */








package umlDemo;

public class Person {

}
