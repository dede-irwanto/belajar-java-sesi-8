package dede.irwanto.lambda.app;

import dede.irwanto.lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {
//        SimpleAction simpleAction1 = new SimpleAction() {
//            @Override
//            public String action(String name) {
//                return "Dede";
//            }
//        };
//
//        System.out.println(simpleAction1.action("Dede"));
//
//        SimpleAction simpleAction2 = (String name) -> {
//            return "Dede lamdba";
//        };
//
//        System.out.println(simpleAction2.action("Dede"));

        SimpleAction simpleAction1 = (String value) -> {
            return "Hello " + value;
        };

        SimpleAction simpleAction2 = (name) -> {
            return  "Hello " + name;
        };

        SimpleAction simpleAction3 = (String value) -> "Hello " + value;

        SimpleAction simpleAction4 = (value) -> "Hello " + value;

        SimpleAction simpleAction5 = name -> "Hello " + name;
    }
}
