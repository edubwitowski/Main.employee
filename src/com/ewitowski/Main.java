package com.ewitowski;

public class Main {

    public static void main(String[] args) {

        Employee person1 = new Employee ( " John"," Doe    ", 1, "1234" );

         Employee person2 = new Employee (  " Jane",  " Down    ", 2, "5678" );

         Employee person3 = new Employee (   " Mike", " Lefty    ",3, "9012"  );

        person1.printAll();
        System.out.println("\n");
        person2.printAll();
        System.out.println("\n");
        person3.printAll();
        System.out.println("\n");
    }
}
