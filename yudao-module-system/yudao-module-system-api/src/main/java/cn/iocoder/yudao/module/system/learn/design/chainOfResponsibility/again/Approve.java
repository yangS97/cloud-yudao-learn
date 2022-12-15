package cn.iocoder.yudao.module.system.learn.design.chainOfResponsibility.again;

/**
 * @author YS
 * @date 2022/12/15 16:43
 * @Description
 */
public abstract class Approve {
    protected String name;
    protected Approve approve;

    public Approve(String name) {
        this.name = name;
    }

    public void setApprove(Approve approve) {
        this.approve = approve;
    }

    public abstract void processRequest(PurchaseRequest request);

}
