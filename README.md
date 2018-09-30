# SimpleThreadCode

Overview
In this module, we will delve into the details of concurrent systems. In concurrent systems, many actions happen in parallel. This means distributed systems, that comprise many different compute nodes working at the same time, are inherently concurrent. We’ll describe the fundamental characteristics and problems that arise with concurrent systems, focusing on multi-threaded systems written in Java. Several practical exercises will enable you to gain experience with Java threading, and the first assignment will focus on this topic.

We cover a lot of material in this module, but expect that at least some of it will be old ground for some of you. It is essential knowledge for this course, and building scalable distributed systems.

Objectives
Explain why multi-threaded systems are essential for scalability
Articulate the trade-offs between performance and scalability that occur with concurrent, multi-threaded systems
Write multi-threaded programs in Java using various synchronization mechanisms
Write programs in Java that exploit thread pools
Write programs in Java using sockets
What to do this Module
First, watch the Introductory Lecture on concurrent systems in general and Java threads in particular. Read Chapters 1 and 2 .of JCiP to flesh out and reinforce these materials. Chapters 3 and 4 are also well worth a read, especially if Java is fairly new to you.
Next read Chapters 5-8 of JCiP and work on the class exercises (below) for this module. These are not graded but completing them will give you some building blocks for the first assignment, as well as make the quiz easier. The videos listed at the end of this module are also extremely informative and reinforce the book chapters.
Take BSDS Quiz 2 on the course Blackboard site.
Finally, read and start to think about the first assignment on Blackboard that is due in two weeks. Post questions for clarification on piazza.
Readings:

Java Concurrency in Practice (JCiP), Brian Goetz,  http://jcip.net/

Chapter 1 and 2: These chapters reinforce the messages in the lecture in this module. 

Chapter 5: This covers core materials needed for the practical exercises in this module, focusing on concurrent collections.

Chapters 6-8: These chapters cover more advanced materials on features available in the Java class libraries that attempt to simplify multi-threaded systems. Make sure the Executor Framework, thread interruption and thread pools all make sense.

Writing Multi-threaded programs  http://blog.smartbear.com/programming/why-johnny-cant-write-multithreaded-programs/

Coulouris: Chapters 7: This chapter covers important background information on how an operating system manages processes and threads. If you haven’t done an operating systems course, this is something you need to know.

Videos:

These short videos will give you another perspective on explanations of multi-threading in Java. Well worth watching to reinforce the reading.

Threads Basics
https://www.youtube.com/watch?v=YdlnEWC-7Wo

Sharing data with threads
https://www.youtube.com/watch?v=_aNO6x8HXZ0
https://www.youtube.com/watch?v=lotAYC3hLVo
https://www.youtube.com/watch?v=8sgDgXUUJ68

Threads Pools
https://www.youtube.com/watch?v=KUdro0G1BV4

Advanced Synchronization
https://www.youtube.com/watch?v=1H-Vfu1v_2g&spfreload=1 – Latches
https://www.youtube.com/watch?v=Vrt5LqpH2D0 – Producer Consumer
https://www.youtube.com/watch?v=gx_YUORX5vk – Wait and Notify

 Class Exercises
Clone the the repo at:

https://github.com/gortonator/SimpleThreadCode/tree/master/src/threadexamples/ian/edu

First, look at the README and make sure you understand:

ThreadStartOrderExample
ThreadHello
Run them to check your understanding matches JVM-scheduled reality.

Next, look at the BoundedBufferExample in the repo and make sure you understand how it works.

What happens if you start more than producer thread?
More than one consumer thread?
Jersey is a widely used implementation of the JAX-RS specification for building RESTful Web Services. It’s a good candidate for your assignment. Here’s a simple introduction for you to look at and work through. See if you can get  simple Jersey-based server running locally on your machine.
