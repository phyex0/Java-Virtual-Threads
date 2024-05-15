package com.virtualthreads.manager;

import java.util.ArrayList;
import java.util.List;

public abstract class ThreadInitializer {

    private List<Thread> threads = new ArrayList<>();

    public List<Thread> getThreads() {
        return threads;
    }

    public abstract void initializeThread(Integer amount);

    public void threadDetails() {
        threads.forEach(t -> {
            System.out.println("Thread Details Line:18. Thread name is :" + t);
            System.out.println("Thread Details Line:19. Is alive :" + t.isAlive());
            System.out.println("Thread Details Line:20. Is virtual :" + t.isVirtual());
            System.out.println("\n");
        });
    }
}
