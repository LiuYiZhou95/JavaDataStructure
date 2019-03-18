package com.Synchronized;
/**
 * @author action.zhou
 * @version v1.0
 * @date Created in 2019/3/13
 * @description同步线程
 */
public class Student {
    private String age = "12";
    private String name = "Tome";
    private static Student student = new Student();
    private Object object = new Object();

    public void setName(String string) {
        synchronized (object) {
            System.out.println("i am running");
        }
    }
    synchronized public String getNameAndAge() {
        return name+":"+age;
    }
    synchronized public void setNameAndAge(String name,String age) {
        this.name = name;
        this.age = age;
    }

    private Student()
    {
    }
    public static Student GetInstace() {
        return student;
    }
}