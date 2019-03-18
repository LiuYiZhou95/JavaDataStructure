package com.java.weakreference;

public class Apple {

    protected String name;

    public Apple(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 覆盖finalize,再回收的时候执行
     * 继承Objects
     * @throws Throwable
     * */
    @Override
    protected void finalize() throws Throwable{
        super.finalize();
        System.out.print("Apple:   "+name+" finalize\n");

    }
    @Override
    public  String toString(){
        return "Apple{" +
                "name='" + name + '\'' +
                '}' + ", hashCode:" + this.hashCode();
    }

}
