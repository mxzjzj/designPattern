package com.jxs.mediator;

/**
 * Created by jiangxs on 2018/5/12.
 * <p>
 * ConcreteColleague1类
 * 具体同事类
 */
public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {

        super(mediator);
    }

    public void send(String message) {

        getMediator().send(message, this);
    }

    public void notifyBy(String message) {

        System.out.println("同事1得到信息：" + message);
    }
}
