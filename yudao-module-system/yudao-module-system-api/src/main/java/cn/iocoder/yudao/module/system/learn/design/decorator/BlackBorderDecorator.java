package cn.iocoder.yudao.module.system.learn.design.decorator;

/**
 * @author YS
 * @date 2022/12/15 19:59
 * @Description 黑色边框装饰类
 */
public class BlackBorderDecorator extends ComponentDecorator {

    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        this.setBlackBorder();
        super.display();
    }

    public void setBlackBorder() {
        System.out.println("为构件增加黑色边框");
    }
}
