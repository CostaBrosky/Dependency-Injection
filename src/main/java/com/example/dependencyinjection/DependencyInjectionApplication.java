package com.example.dependencyinjection;

import com.example.dependencyinjection.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.sayHello());

        MyController myController = (MyController) ctx.getBean("myController");

        System.out.println("------- Primary");
        System.out.println(myController.sayHello());

        System.out.println("------- Proprety");

        PropretyInjectedController propretyInjectedController = (PropretyInjectedController) ctx.getBean("propretyInjectedController");

        System.out.println(propretyInjectedController.getGreeting());

        System.out.println("------- Setter");

        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

        System.out.println(setterInjectedController.getGreeting());

        System.out.println("------- Constructor");

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

        System.out.println(constructorInjectedController.getGreeting());
    }
}
/* -Dependency injection using Junit and not Spring, Spring example comming on the new project.
-Setter, Proprety and Constructor injection, the best and the cleanest is with constructor injection.
-Classes of injection: ConstructorInjectedController, PropretyInjectionController, SetterInjectionController,
-With spring we can inject with the annotation @autowired oe just with constructors
-Using @Qualifier we let spring know witch instance of the service he must use. ex: @Qualifier("name of the service class")Remeber that the name must start with lowercase.
-There is another way of doing this, with Primary @Beans, primary world prioritize witch one is the primary Bean to use
 */