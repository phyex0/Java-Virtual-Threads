# Java-Virtual-Threads
A short demo of Virtual Threads and a brief presentation.


I built 2 different applications. One of them is a basic implementation of a console application. Implementing Runnable interface and calling overridden run method. Executing some instant operations.
During that operation, I used both platform and virtual threads to show implementations.

For the next, I built a basic Spring web application with Java 22 and Spring Boot 3.2.0. I showed how to enable virtual threads on the application Yaml. I also created a rest controller that returns thread details.

In my presentation, I tried to explain what are the operating system, process, thread, and JVM (Java Virtual Machine). My goal is to explain virtual threads giving brief pre-requirements. 

In short, Java Virtual Threads are here to save the costs of creating threads, having system calls, and memory management. 
