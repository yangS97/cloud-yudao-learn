package cn.iocoder.yudao.module.system.learn.design.observer.again;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.ArrayList;

/**
 * @author YS
 * @date 2022/12/16 14:48
 * @Description 抽象战队
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public  abstract class AllyControlCenter {
    protected String allyName; //战队名称
    protected ArrayList<Observer> players = new ArrayList<>(); //定义一个集合用于存储战队成员

    /**
     * 注册方法
     * @param obs
     */
    public void join(Observer obs) {
        System.out.println(obs.getName() + "加入" + allyName + "战队!");
        players.add(obs);
    }

    /**
     * 离队方法
     * @param obs
     */
    public void quit(Observer obs) {
        System.out.println(obs.getName() + "退出" + this.allyName + "战队！");
        players.remove(obs);
    }

    public abstract void notifyObserver(String name);
}
