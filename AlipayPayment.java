package GITinterface;

// 支付接口的支付宝实现类
public class AlipayPayment implements PaymentGateway {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("支付宝支付 " + amount + " 元成功");
        return true;
    }

    @Override
    public void refund(double amount) {
        System.out.println("支付宝退款 " + amount + " 元");
    }
}
