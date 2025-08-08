package com.example;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        while(true){
            System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("E, yyyy-MM-dd -- HH:mm:ss")));
            Point mousePos = MouseInfo.getPointerInfo().getLocation();
            robot.mouseMove(mousePos.x + 1, mousePos.y + 1);
            Thread.sleep(10000);
        }
    }

}
