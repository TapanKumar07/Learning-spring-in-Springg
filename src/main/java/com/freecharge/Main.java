package com.freecharge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("com.freecharge");
        MyApp mp = (MyApp) ctx.getBean("myApp");
        mp.greet_me();
    }
}

/*
making loose-ley couple app help in extensiblity
Spring -> brings loose coupling with itself automatically (dont care of factory)
-> DI (dependency injection)
  - during childhood, parents are injecting dependenciees
  - during adulthood, only pain and cry and have to do everything on own
  - design principle
  if a class is dependent on some other class then spring is responsible for creating object of class
  and injecting it whenever needed this is dependency injection
-> IOC (Inversion of conversion)
  - Spring has taken control
  - design pattern
  abc.java -- Java program -> abc.class -> files like this bundelled together -> JAR file
  Dependencies ->
    spring-core -> spring
    spring-context ->  make spring work
    Apache-common-logging
  2 major duties of spring
    1. dependency injection
    2. creation of objects
    //use annotations
    @component -> tell spring that be ready with the obect of this whenever needed
    Spring container(Ioc container) - creates object and store it inside spring container
    the object which spring makes inside container are called ==== Beans ====
    in bean first character becomes smaller
    default id is same as class name
    How to take out bean from springContainer ?
    spring has provided ApplicationContext for the same
    ApplicationContext is a interface
    AnnotationContext ctx = new AnnotationConfigApplicationContext(Packag Name);
    for fetching
    Person p = (Person)ctx.getBean("person")

    Spring Boot -> Auto (Minimal) Configration -> less headache

    How to create spring project ?
     1. Create Maven project
     2. Spring boot cli
     3. IDE
     4. Spring initializer
*/
