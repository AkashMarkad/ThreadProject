package Threading.Project;

//defining thread
class ThreadDemo1 extends Thread{
  
//    job of thread
    public void run() {

        System.out.println("Hello Thread .");
    }
}

//defining thread
class ThreadDemo2 extends Thread{

    //    job of thread
    public void run() {

        System.out.println("Thread welcome .");
    }
}


public class MyThread {
    public static void main(String[] args) {

        System.out.println("Thread is running "+ Thread.currentThread().getName() );

        ThreadDemo1 firstThread = new ThreadDemo1();
        System.out.println("Second thread name :"+ firstThread.getName() );
        firstThread.start();

        // firstThread.run();    //normal call

        ThreadDemo2 secondThread = new ThreadDemo2();
        System.out.println("Second thread name :"+ secondThread.getName() );
        secondThread.start();
    }
}
