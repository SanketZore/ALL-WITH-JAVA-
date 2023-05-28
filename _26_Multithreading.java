

/*
MULTITHREADING 

* Multithreading and Multithreading both are used to achieve multitasking.
------------------------------------------------------------
* Threads are part of Process and share a memory a process.
* Threads are Light Weight and Processes are Heavy Weight.
------------------------------------------------------------
Prosess1    process2    process3
       \       |        /
        \      |       /
              O S

In a Nut Shell ...
--> Threads use shared memory area.
--> Threads --> Faster Content Switching.
--> A Thread is Light-Weigth whereas a process is heavyweight. 

--------------
|Thread1     |
|            |
|    Thread2 |
|            |
--------------
    PROCESS


For Example --> A word processor can have one thread running 
                in foreground as an editor and another in the
                background auto saving the document !

FLOW OF CONTROL IN JAVA

1) Without Threading: 

       |main()|  ->  |Func()|  ->  |Func2()|  -> |END|

2) With Threading:

        |main()| -------------\
            |Func1()| ---------  |END|
                |Func2()| ----/

Creating a Thread 
There are two ways to create a thread in java.
1) By Extending Thread Class.
2) By implementing Runnable Interface.








 */

 




public class _26_Multithreading {
    
}
