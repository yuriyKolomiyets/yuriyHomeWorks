package aco11_1.week6.exeptions;

import patterns.proxy.IService;
import patterns.proxy.ServiceFactory;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyService {

    private static final IService SERVICE = ServiceFactory.create();

    public static String login(String name, String pass) throws InvalidCredentialException, ServiceDosentWorkException {

        Calendar calendar = new GregorianCalendar();
        if(calendar.get(Calendar.DAY_OF_WEEK) < 6){
            throw new ServiceDosentWorkException("use service in weekdays only");
        }

        if("admin".equals(name) && "1234".equals(pass)){
            return String.valueOf(genRandomKey());
        } else {

            throw new InvalidCredentialException("wrong pass or login");
        }
    }

    private static int genRandomKey() {
        return (int)(System.currentTimeMillis() * Math.random());
    }

}
