/*public static int activeCount()
This method of the thread is used to return the no. of active threads in the currently executing thread’s thread group.
The number returned by this threading method is only an estimate number as the number of threads dynamically changes while this method traverses internal data structures.
*/

package Thread_Prac;
public class ActiveCount extends Thread   
{  
	ActiveCount(String threadname, ThreadGroup tg)  
    {  
        super(tg, threadname);  
        start();  
    }  
    public void run()  
    {  
       System.out.println("running thread name is:"+Thread.currentThread().getName());    
    }  
    public static void main(String arg[])  
    {  
        ThreadGroup g1 = new ThreadGroup("parent thread group");  
        ActiveCount thread1 = new ActiveCount("Thread-1", g1);  
        ActiveCount thread2 = new ActiveCount("Thread-2", g1);  
          System.out.println("number of active thread: "+ g1.activeCount());  
    }  
}  
