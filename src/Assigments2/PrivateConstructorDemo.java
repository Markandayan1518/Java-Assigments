/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigments2;

/**
 *
 * @author mark-4304
 */
class MyClass{
    private static MyClass obj = new MyClass();

    private MyClass(){

    }

    public static MyClass getObject(){
        return obj;
    }

    @Override
    public String toString() {
        return "MyClass{ Private Constuctor Demo }";
    }
    
}
class PrivateConstructorDemo{
    public static void main(String args[]){

        MyClass obj = MyClass.getObject();
        System.out.println(obj);

    }
}