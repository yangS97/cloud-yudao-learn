package cn.iocoder.yudao.module.system.learn.design.observer.again;

/**
 * @author YS
 * @date 2022/12/16 15:00
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        test01();
    }

    private static void test01() {
        //创建目标
        AllyControlCenter acc = new ActualAllyControlCenter("金庸群侠");
        //创建观察者
        Observer player1 = new Player("杨过");
        Observer player2 = new Player("令狐冲");
        Observer player3 = new Player("张无忌");
        Observer player4 = new Player("段誉");
        //注册观察者
        acc.join(player1);
        acc.join(player2);
        acc.join(player3);
        acc.join(player4);
        //目标发布消息
        player1.beAttacked(acc);
    }
}
