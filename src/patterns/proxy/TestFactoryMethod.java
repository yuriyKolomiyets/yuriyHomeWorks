package patterns.proxy;

public class TestFactoryMethod {


    public static void main(String[] args) {
        IService service = ServiceFactory.create();
        service.login("Serhii", "234234");
    }
}

