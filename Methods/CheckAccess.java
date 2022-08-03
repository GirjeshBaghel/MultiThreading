/*public final void checkAccess()
This thread method identifies if the current thread has permission to modify the thread.*/

package Thread_Prac;
public class CheckAccess extends Thread     
{    
    public void run()  
    {  
        System.out.println(Thread.currentThread().getName()+" finished executing");  
    }  
    public static void main(String arg[]) throws InterruptedException, SecurityException    
    {   CheckAccess thread1 = new CheckAccess();    
    CheckAccess thread2 = new  CheckAccess();    
        thread1.start();  
        thread2.start();  
        thread1.checkAccess();    
        System.out.println(thread1.getName() + " has access");    
        thread2.checkAccess();    
        System.out.println(thread2.getName() + " has access");    
    }    
} 
