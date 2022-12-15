package cn.iocoder.yudao.module.system.learn.design.chainOfResponsibility.again;

/**
 * @author YS
 * @date 2022/12/15 16:54
 * @Description
 */
public class Director extends Approve{
    public Director(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if(request.getAmount()<5000) {
            System.out.println("主任" + this.name + "审批采购单：" + request.getNumber() + "，金额：" + request.getAmount() + "元，采购目的：" + request.getPurpose() + "。");  //处理请求
        }else{
            approve.processRequest(request);
        }
    }
}
