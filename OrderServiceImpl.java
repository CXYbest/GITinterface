package GITinterface;

// 订单处理接口的实现类
public class OrderServiceImpl implements OrderService {
    @Override
    public void createOrder(String product) {
        System.out.println("创建订单：" + product);
    }

    @Override
    public void updateOrderStatus(int orderId, String status) {
        System.out.println("订单 " + orderId + " 状态更新为：" + status);
    }
}
