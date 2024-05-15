package com.virtualthreads.manager;

import com.virtualthreads.calculator.TimeCalculator;

import java.util.concurrent.ThreadFactory;

public class VirtualThread extends ThreadInitializer {

    @Override
    public void initializeThread(Integer amount) {
        ThreadFactory virtualThreadFactory = Thread.ofVirtual().factory();

        for (int i = 0; i < amount; i++) {
            Thread thread = virtualThreadFactory.newThread(new TimeCalculator());
            thread.start();
            super.getThreads().add(thread);
        }
    }
}
