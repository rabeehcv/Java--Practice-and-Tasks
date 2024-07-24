
class A implements Runnable{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10); // pause the execution of the current thread for 10 milliseconds.
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class B implements Runnable{
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class practice {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        Thread t1 = new Thread(obj1);//Thread class constructor to create a thread object t1, that takes a Runnable object obj1 as an argument.
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
