package cn.iocoder.yudao.module.system.learn.design.chainOfResponsibility.again;

/**
 * @author YS
 * @date 2022/12/15 17:02
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        Approve ez,weien,nvjing;
        ez = new Director("ez");
        weien = new Manager("薇恩");
        nvjing = new CEO("女警");

        ez.setApprove(weien);
        weien.setApprove(nvjing);

        //创建采购单
        PurchaseRequest pr1 = new PurchaseRequest(3000,10001,"长剑");
        ez.processRequest(pr1);
        PurchaseRequest pr2 = new PurchaseRequest(6000,10002,"吸血鬼权杖");
        ez.processRequest(pr2);
        PurchaseRequest pr3 = new PurchaseRequest(40000,10003,"三相之力");
        ez.processRequest(pr3);
        PurchaseRequest pr4 = new PurchaseRequest(600000,10003,"商店老版");
        ez.processRequest(pr4);
    }
}
