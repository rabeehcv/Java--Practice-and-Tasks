
class A extends Thread{
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
class B extends Thread{
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
        obj1.start();//creates new thread of execution for the object obj1 and invokes run() method in class A.
        obj2.start();
    }
}
