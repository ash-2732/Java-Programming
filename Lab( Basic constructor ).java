import java.util.*;

class constructor1{

    int num;
    String name;

    constructor1(){
        System.out.println("Hello Constructor");
    }
}

class constructor2{

    String name;
    int id;

    constructor2( String name , int id ){
        this.name = name;
        this.id = id;
    }
}

class constructor3{

    constructor3( String name ){
        System.out.println( name );
    }
    constructor3( String name , int id ){
        System.out.println( name + " " + id );
    }
    constructor3( int id ){
        System.out.println( id );
    }
}
class Lab{

    public static void main( String[] args ){

         //constructor1 obj = new constructor1(); // This object is for constructor
        // System.out.println( obj.name );     // it will output null by default
        // System.out.println( obj.num );      // it will output 0 by default

        // constructor2 obj = new constructor2( "Ashik", 32 );
        // System.out.println( obj.name );
        // System.out.println( obj.id );

        constructor3 obj1 = new constructor3("Hello");
        constructor3 obj2 = new constructor3("Ashik" , 32 );
        constructor3 obj3 = new constructor3(815642);
    }
}
