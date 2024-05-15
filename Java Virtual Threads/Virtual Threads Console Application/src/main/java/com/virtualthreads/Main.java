package com.virtualthreads;

import com.virtualthreads.manager.*;

public class Main {
    public static void main(String[] args) {

        ThreadInitializer virtualThread = new VirtualThread();
        virtualThread.initializeThread(10);
        virtualThread.threadDetails();

        ThreadInitializer kernelThread = new KernelThread();
        kernelThread.initializeThread(10);
        kernelThread.threadDetails();
    }
}