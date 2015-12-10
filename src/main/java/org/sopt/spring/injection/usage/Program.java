package org.sopt.spring.injection.usage;

import org.sopt.spring.injection.phone.base.Phone;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Program {

    public static void main(String[] args) {

        // 01. Basic usage
        //  Phone phone = new Phone();

        // 02. Injection with Constructor
        // Phone phone = new Phone(new A9X());

        // 03. Injection with Setter
        // Phone phone = new Phone();
        // phone.setCpu(new A9X());

        // 04. Injection with Spring Framework via XML [Maintenance]
        ApplicationContext context = new FileSystemXmlApplicationContext("dependencies.xml");
        Phone phone;

        phone = context.getBean("galaxy", Phone.class);
        display(phone);

        phone = context.getBean("iPhone", Phone.class);
        display(phone);

        // 05. Injection with Spring Framework via @AutoWired
        //     Strategy : Type -> Name
        phone = context.getBean("mi", Phone.class);
        display(phone);

        // 06. Injection with Javax via @Resource [Java Standard]
        //     Strategy : Name -> Type
        phone = context.getBean("prototype", Phone.class);
        display(phone);


        System.out.println("======================================================================");
    }

    private static void display(Phone phone) {

        System.out.println("======================================================================");
        System.out.println("Phone Manufacturer : " + phone.manufacturer());
        System.out.println("CPU : " + phone.getCpu().architecture() + " by " + phone.getCpu().manufacturer());
    }
}