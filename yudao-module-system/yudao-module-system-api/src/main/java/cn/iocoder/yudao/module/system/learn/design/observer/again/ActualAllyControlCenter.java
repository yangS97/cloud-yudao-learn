package cn.iocoder.yudao.module.system.learn.design.observer.again;

/**
 * @author YS
 * @date 2022/12/16 14:59
 * @Description
 */
public class ActualAllyControlCenter extends AllyControlCenter {

    public ActualAllyControlCenter(String allyName) {
        System.out.println(allyName + "战队组建成功！");
        System.out.println("----------------------------");
        this.allyName = allyName;
    }

    @Override
    public void notifyObserver(String name) {
        System.out.println(this.allyName + "战队紧急通知，盟友" + name + "遭受敌人攻击！");
        //遍历观察者集合，调用每一个盟友（除了自己）的支援方法
        for (Observer obs : players) {
            if (!obs.getName().equalsIgnoreCase(name)) {
                obs.help();
            }
        }
    }
}
