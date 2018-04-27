package observer;

import java.util.ArrayList;
import java.util.List;

public class WechatServer implements Observerable {

    private List<Observer> observers;//订阅者
    private String message;//信息
    public WechatServer() {
        observers = new ArrayList<Observer>();
    }
    /**
     *增加订阅者
     * @param o
     */
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    /**
     * 减少订阅者
     * @param o
     */
    @Override
    public void removeObserver(Observer o) {
        if (!observers.isEmpty()){
            observers.remove(o);
        }
    }

    /**
     * 遍历订阅者（通知观察者）
     */
    @Override
    public void notifyObserver() {
        for(int i = 0; i < observers.size(); i++) {
            Observer oserver = observers.get(i);
            oserver.update(message);
        }
    }

    /**
     * 有更新的消息通知观察者
     * @param s
     */
    public void setInfomation(String s) {
        this.message = s;
        System.out.println("更新消息： " + s);
        //消息更新，通知所有观察者
        notifyObserver();
    }

}
