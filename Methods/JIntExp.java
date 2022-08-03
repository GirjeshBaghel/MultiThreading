/*public static boolean interrupted()
This thread method is used to check if the current thread is interrupted or not. 
If this threading method is to be called twice in succession, then the second call will return as false.
If the interrupt status of the thread is true, then this thread method will set it to false. */

package Thread_Prac;
public class JIntExp extends Thread   
{   
    public void run()   
    {   
        for(int i=1;i<=3;i++)   
        {   
            System.out.println("doing task....: "+i);   
        }   
    }   
    public static void main(String args[])throws InterruptedException   
    {   
        JIntExp thread1=new JIntExp ();   
        JIntExp thread2=new JIntExp();   
        thread1.start();   
        thread2.start();  
        System.out.println("is thread thread1 interrupted..:"+thread1.interrupted()); 
        thread1.interrupt();   
        System.out.println("is thread thread1 interrupted..:"+thread1.interrupted());   
        System.out.println("is thread thread2 interrupted..:"+thread2.interrupted());   
    }  
}
