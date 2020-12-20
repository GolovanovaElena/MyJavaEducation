package com.mycompany;

import com.mycompany.task1.MyPoint;
import com.mycompany.task1.Book;
import com.mycompany.task1.MyTriangle;
import com.mycompany.task2.Ball;
import com.mycompany.task2.Container;
import com.mycompany.task2.MyPolynomial;

public class Main {
        public static void main(String[] args) {
          /*  Employee employee1= new Employee(1, "Lena", "Golovanova", 10000);
            System.out.println(employee1.getID());
            System.out.println(employee1.getFirstName());
            System.out.println(employee1.getLastName());
            System.out.println(employee1.getName());
            System.out.println(employee1.toString());
            employee1.setSalary(12000);
            System.out.println(employee1.getSalary());
            System.out.println(employee1.getAnnualSalary());
            System.out.println(employee1.raiseSalary(10));

                MyPoint one = new MyPoint(1,2);
                System.out.println(one.getX());
                System.out.println(one.getY());
                System.out.println(one.getXY());
                one.setX(2);
                one.setY(3);
                System.out.println(one.getX());
                System.out.println(one.getY());
                one.setXY(4,4);
                System.out.println(one.getXY());
                System.out.println(one.toString());
                System.out.println(one.distance());
                System.out.println(one.distance(1,1));
                MyPoint two = new MyPoint(1,2);
                System.out.println(one.distance(two));

           */
/*
                double c[] = {0, 1, 2};
                MyPolynomial ex1 = new MyPolynomial(c);
               // System.out.println(ex1.getDegree());
                System.out.println(ex1.toString());
              //  System.out.println(ex1.evaluate(1));
                double a[] = {0, 2, 3};
                MyPolynomial ex2 = new MyPolynomial(a);
                System.out.println(ex2.toString());
                //System.out.println(ex1.add(ex2));
                System.out.println(ex1.multiply(ex2));
        }

 */

//                Ball news = new Ball(0, 0, 1, 10, 30);
//                System.out.println(news.toString());
//                Container one = new Container(0,0, 10,10);
//                System.out.println(one.collides(news));
////        }
//                Author one = new Author("name1", "email1", 'c');
//                Author two = new Author("name2", "email2", 'k');
//                Author  three = new Author("name3", "email3", 'c');
//               // System.out.println(one.toString());
//                Author [] block= {one,two, three};
//                Book book1 = new Book("Love", block, 12, 1);
//                System.out.println(book1.toString());
//                System.out.println(book1.getAuthorNames());
                MyPoint onep = new MyPoint(0,0);
                MyPoint twop = new MyPoint(0,3);
                MyPoint threep = new MyPoint(4,0);

                MyTriangle one = new MyTriangle(onep,twop,threep);
                System.out.println(one.toString());
                System.out.println(one.getPerimetr());
                System.out.println(one.getType());
        }
}
