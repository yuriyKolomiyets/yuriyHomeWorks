package patterns.proxy;

public class ServiceFactory {

    public static IService create(){
        return new ServiceProxy(new Service(new VkApi(new Host("Service"))));
    }


}
