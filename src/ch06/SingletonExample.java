package ch06;

public class SingletonExample {

    public static void main(String[] args) {
        Singleton result1 = Singleton.getInstance();
        Singleton result2 = Singleton.getInstance();

        if(result1 == result2){
            System.out.println("같은 객체");
        }else {
            System.out.println("다른 객체");
        }
    }



}
