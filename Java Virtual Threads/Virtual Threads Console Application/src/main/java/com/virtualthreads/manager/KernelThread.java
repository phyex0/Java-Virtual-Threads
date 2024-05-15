package com.virtualthreads.manager;

import com.virtualthreads.calculator.TimeCalculator;

import java.util.concurrent.ThreadFactory;

public class KernelThread extends ThreadInitializer {

    @Override
    public void initializeThread(Integer amount) {
        ThreadFactory platformThread = Thread.ofPlatform().factory();

        for (int i = 0; i < amount; i++) {
            Thread thread = platformThread.newThread(new TimeCalculator());
            thread.start();
            super.getThreads().add(thread);
        }
    }
}
