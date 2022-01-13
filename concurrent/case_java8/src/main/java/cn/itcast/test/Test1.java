package cn.itcast.test;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

@Slf4j(topic = "c.Test1")
public class Test1 {

    public static void test2() {

        Thread t = new Thread(()->{ log.debug("running"); }, "t2");
        t.start();
    }

     public static void main(String[] args) {
       test1();
    }
    public static void test1() {
        Thread t = new Thread(){
            @Override
            public void run() {
                log.debug("running");
            }
        };
        t.setName("t1");
        t.start();

    }

    public static void test3(){
        FutureTask futureTask = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {
                return null;
            }
        });
    }
}
