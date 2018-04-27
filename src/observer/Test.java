package observer;

public class Test {
    public static void main(String[] args) {
        WechatServer server = new WechatServer();

        Observer userZhang = new User("ZhangSan");
        Observer userLi = new User("LiSi");
        Observer userWang = new User("WangWu");

        server.registerObserver(userZhang);
        server.registerObserver(userLi);
        server.registerObserver(userWang);
        server.setInfomation("我喜欢java");

        System.out.println("----------------------------------------------");
        server.removeObserver(userZhang);
        server.setInfomation("我喜欢python");

    }
}
