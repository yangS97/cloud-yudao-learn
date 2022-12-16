package cn.iocoder.yudao.module.system.learn.design.observer.again;

/**
 * @author YS
 * @date 2022/12/16 14:50
 * @Description 具体观察者
 */
public class Player implements Observer{
    private String name;
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void help() {
        System.out.println("坚持住,我"+name+"来救你了!");
    }

    //队友被攻击, 通知其他队友
    @Override
    public void beAttacked(AllyControlCenter acc) {
        System.out.println(name+"被攻击了");
        acc.notifyObserver(name);
    }
}
