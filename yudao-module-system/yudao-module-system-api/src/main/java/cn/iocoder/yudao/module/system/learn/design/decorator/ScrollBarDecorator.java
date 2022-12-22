package cn.iocoder.yudao.module.system.learn.design.decorator;

/**
 * @author YS
 * @date 2022/12/15 19:58
 * @Description 滚动条装饰类
 */
public class ScrollBarDecorator extends ComponentDecorator {

    public ScrollBarDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        this.setScrollBar();
        super.display();
    }

    public void setScrollBar() {
        System.out.println("为构件增加滚动条");
    }
}
