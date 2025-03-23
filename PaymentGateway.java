package GITinterface;

// 支付接口
public interface PaymentGateway {
    boolean processPayment(double amount);
    void refund(double amount);
}
