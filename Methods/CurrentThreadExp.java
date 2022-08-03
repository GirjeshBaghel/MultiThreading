//public static Thread currentThread()
//It returns a reference to the currently running thread.
package Thread_Prac;

public class CurrentThreadExp extends Thread  
{    
    public void run()  
    {    
        System.out.println(Thread.currentThread().getName());    
    }    
    public static void main(String args[])  
    {    
        CurrentThreadExp thread1=new CurrentThreadExp();    
        CurrentThreadExp thread2=new CurrentThreadExp();    
        thread1.start();    
        thread2.start();    
    }    
}