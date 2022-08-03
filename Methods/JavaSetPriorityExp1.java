//public final void setPriority()
//This method is used to change the priority of the thread. 
//The priority of every thread is represented by the integer number from 1 to 10. The default priority of a thread is 5.
package Thread_Prac;
public class JavaSetPriorityExp1 extends Thread  
{    
    public void run()  
    {    
        System.out.println("Priority of thread is: "+Thread.currentThread().getPriority());    
    }    
    public static void main(String args[])  
    {    
        JavaSetPriorityExp1 t1=new JavaSetPriorityExp1();
        t1.setPriority(Thread.MAX_PRIORITY);    
        t1.start();    
    }    
}

