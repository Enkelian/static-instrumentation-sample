package main;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.matcher.ElementMatchers;

import java.io.File;

public class ByteBuddyExampleMain {

    public static void main(String[] args) {

        System.out.println(new Robot().greetUser("John"));

//        System.out.println(System.getProperty("user.dir"));
//                .load(ClassLoadingStrategy.BOOTSTRAP_LOADER, ClassLoadingStrategy.Default.WRAPPER)
//                .getLoaded();

        // use java reflection to invoke the method
//        String returnVal = (String)type.getDeclaredMethod("greetUser", String.class).invoke(type.getDeclaredConstructor().newInstance(), "John");
//        System.out.println("return value: " + returnVal);

    }



}
