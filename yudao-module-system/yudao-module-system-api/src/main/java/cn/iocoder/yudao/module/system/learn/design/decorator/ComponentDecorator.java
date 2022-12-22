package cn.iocoder.yudao.module.system.learn.design.decorator;

/**
 * @author YS
 * @date 2022/12/15 19:51
 * @Description 构件装饰类
 */
public class ComponentDecorator extends Component {
    private Component component;

    public ComponentDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }
}
