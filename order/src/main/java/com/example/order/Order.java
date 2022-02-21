package com.example.order;
// public class Order{
//     private final int id;
//     private final String name;
//     public Order(final int id, final String name){
//     {
//         this.id=id;
//         this.name=name;
//     }
//     public int getId(){
//         return id;
//     }
//     public String getName(){
//         return name;
//     }
// }
public class Order
{
    private final int orderId;
    private final String name;
    public Order(final int orderId, final String name){
        this.orderId=orderId;
        this.name=name;
    }
        public int getID(){
            return orderId;
        }
        public String getName(){
            return name;
        }
}