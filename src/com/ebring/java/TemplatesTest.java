package com.ebring.java;

import java.util.ArrayList;
import java.util.List;

public class TemplatesTest {

    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");

        int num1 = 10;
        System.out.println("num1 = " + num1);
        int num2 = 20;
        System.out.println("num2 = " + num2);
        System.out.println(num1);

        String[] arr = new String[]{"Tome", "Jerry", "hanheihei", "lilei"};
        for (String s : arr) {
            System.out.println(s);
        }

        List list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);

        for (Object o : list) {
            
        }

        for (int i = 0; i < list.size(); i++) {
            
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            
        }


    }

    public void method() {
        System.out.println("TemplatesTest.method");

        ArrayList<Object> list = new ArrayList<>();
        list.add(123);
        list.add(456);

        if (list == null) {

        }
        if (list != null) {

        }
        if (list != null) {

        }

        if (list == null) {

        }



    }


}

