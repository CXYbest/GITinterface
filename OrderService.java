package GITinterface;

// 订单处理接口
public interface OrderService {
    void createOrder(String product);
    void updateOrderStatus(int orderId, String status);
}
