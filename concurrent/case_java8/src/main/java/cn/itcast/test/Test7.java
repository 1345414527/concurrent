package cn.itcast.test;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CyclicBarrier;

@Slf4j(topic = "c.Test7")
public class Test7 {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread("t1") {
            @Override
            public void run() {
                log.debug("enter sleep...");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    log.debug("wake up...");
                    e.printStackTrace();
                }
            }
        };
        ThreadLocal
       new CyclicBarrier().await()
        t1.start();
        t1.join();
        Thread.sleep(1000);
        log.debug("interrupt...");
        t1.interrupt();
    }
}
