package cn.iocoder.yudao.module.system.learn.design.appearance;

/**
 * @author YS
 * @date 2022/12/18 16:33
 * @Description
 */
public class Facade {
    private TV tv;
    private HouseLight houseLight;

    public Facade() {
        tv = TV.getInstance();
        houseLight = HouseLight.getInstance();
    }





    public void on() {
        tv.on();
        houseLight.on();
    }

    public void off(){
        tv.off();
        houseLight.off();
    }

}
