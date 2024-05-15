package com.virtualthreads.calculator;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class TimeCalculator implements Serializable, Runnable {
    @Serial
    private static final long serialVersionUID = -2310208295849755740L;

    private Instant createTime = Instant.now();

    private Instant givenTime = Instant.parse("2016-12-31T00:00:00Z");

    public TimeCalculator() {
    }


    @Override
    public void run() {
        System.out.println(String.format("%s  # Is virtual: [ %s ] # Thread: [ %s ]\n", getTimeDifference(), Thread.currentThread().isVirtual(), Thread.currentThread()));
        System.out.println(String.format("Thread: [ %s ] # Is virtual: [ %s ]\n", Thread.currentThread(), Thread.currentThread().isVirtual()));
    }

    public String getTimeDifference() {
        Long seconds = ChronoUnit.SECONDS.between(givenTime, createTime);
        return String.format("Time difference is %d Seconds", seconds);
    }
}
