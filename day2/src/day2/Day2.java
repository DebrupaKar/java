/**
 * 
 * @startuml
 * left to right direction
 * skinparam packageStyle rectangle
 * actor Customer
 * actor Admin
 * rectangle OnlineShoppingCart {
 * Customer -- (Select an Item)
 * Customer -- (Add to cart)
 * Customer -- (Submit Cart)
 * Customer -- (Register)
 * Customer -- (Login)
 * 
 * (Submit Cart) "extends" <|- (PayBill)
 * 
 * Admin -- (Login)
 * Admin -- (Logout)
 * Admin -- (Add Segment)
 * Admin -- (Add Brand)
 * Admin -- (Add Product)
 * }
 * 
 * note right of (Register) : Registration is done here
 * 
 * 
 * @enduml
 **/





package day2;

public class Day2 {

}
