//public long getId()
//It returns the identifier of the thread. The thread ID is a number generated when the thread was created. 
//This ID cannot be changed during its lifetime. But when the threa d is terminated, the ID can be reused.

package Thread_Prac;
public class GetIdExample extends Thread  
{    
    public void run()  
    {    
        System.out.println("running...");    
    }    
    public static void main(String args[])  
    {    
        GetIdExample thread1=new GetIdExample();    
        System.out.println("Name of thread1: "+thread1.getName());  
        System.out.println("Id of thread1: "+thread1.getId());   
        thread1.start();  
    }    
}
