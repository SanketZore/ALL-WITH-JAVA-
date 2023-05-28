

/*
LIFE CYCLE OF A THREAD

1) |New|
      |                 
2) |Runnable|  <--------\    
      |              4) Non Runnable(Blocked)
3) |Running|   --------/>
      |
5) |Terminated|



1) New --> Instance of threadd Created Which is not yet started by invokiing start().

2) Runnable --> AFTER Invocation of start() & before it is selected to be run by the Schedular.

3) Running --> After Thread Schedular has selected it.

4) Non-Runnable --> Thread alive, not eligible to run.


 */




public class _29_Java_Thread_Life_Cycle {
    
}
