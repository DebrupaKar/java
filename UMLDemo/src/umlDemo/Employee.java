/**
 * @startuml
 * class Employee{
 * -id : int
 * +{static} course : String
 * +{abstract} get()
 * +put()
 * #set()
 * }
 * note top of Employee : Employee is a general class
 * 
 * Employee "*" -- "1" Department :works in  >
 * Employee "is a" <|- Manager
 * Employee "1" o- "n" Address
 * Person "1" *- "n" Address
 * Company -- Employee
 * @enduml
 */






package umlDemo;

public class Employee {

}
