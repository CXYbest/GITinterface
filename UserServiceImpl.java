package GITinterface;

// 用户管理接口的实现类
public class UserServiceImpl implements UserService {
    @Override
    public void registerUser(String username) {
        System.out.println("用户 " + username + " 注册成功");
    }

    @Override
    public void deleteUser(int userId) {
        System.out.println("删除用户 ID：" + userId);
    }
}
