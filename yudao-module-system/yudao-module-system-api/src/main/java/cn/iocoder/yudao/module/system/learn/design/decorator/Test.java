package cn.iocoder.yudao.module.system.learn.design.decorator;

/**
 * @author YS
 * @date 2022/12/15 20:00
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        //test();
        test02();
    }

    private static void test02() {
        Component component,componentSB;  //使用抽象构件定义
        component = new Window(); //定义具体构件
        componentSB = new  ScrollBarDecorator(component); //定义装饰后的构件
        componentSB = new BlackBorderDecorator(componentSB);
        componentSB.display();
    }

    private static void test() {
        Component component,componentSB;  //使用抽象构件定义
        component = new Window(); //定义具体构件
        componentSB = new  ScrollBarDecorator(component); //定义装饰后的构件
        componentSB.display();

        new BlackBorderDecorator(new TextBox()).display();
    }
}
