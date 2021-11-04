package proxy;

import java.lang.reflect.Proxy;

public class UserService {

    public static void main(String[] args) {
        System.out.println(Proxy.isProxyClass(UserService.class));
    }

    public void run() {
        System.out.println("her");
    }

}
