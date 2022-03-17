package ch07;

public abstract class Animal {

    public String kind;

    public void breathe(){
        System.out.println("숨 쉬기");
    }

    //추상 메소드
    public abstract void sound();
}
