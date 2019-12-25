package com.baidu.fengchao;

import java.util.List;

public class App {

    public static void app(String[] args) throws Exception {
        BaseZookeeper zookeeper = new BaseZookeeper();
        zookeeper.connectZookeeper("10.94.30.41:8866");
        List<String> children = zookeeper.getChildren("/dev_and_test/profile/ol-libra/1.0.5");
        System.out.println(children);
        zookeeper.deleteNode("/dev_and_test/profile/ol-libra/1.0.5/liyibo");
        children = zookeeper.getChildren("/dev_and_test/profile/ol-libra/1.0.5");
        System.out.println(children);
    }

}
