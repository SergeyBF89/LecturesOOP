package org.Lecture1.Example4;

import org.Lecture1.Example4.model.Robot1;
import org.Lecture1.Example4.model.Robot2;
import org.Lecture1.Example4.model.Robot3;

public class Example4 {
    public static void main(String[] args) {
//        Robot1 robot1 = new Robot1("name_1", 1);
//
//        System.out.printf("%s %d\n", robot1.name, robot1.level);
//        robot1.startBios();
//        robot1.startOS();
//        robot1.sayHi();
//
//        robot1.work();
//        robot1.work();
//        robot1.work();
//
//        robot1.sayBye();
//        robot1.stopOS();
//        robot1.stopBIOS();
//
//        robot1.level = 100500;
//        System.out.printf("%s %d\n", robot1.name, robot1.level);

        Robot3 robot3 = new Robot3("name_3");
        System.out.println("-----------");
        System.out.println(robot3);
        robot3.power();
        robot3.work();
        robot3.power();
        robot3.work();

    }
}
