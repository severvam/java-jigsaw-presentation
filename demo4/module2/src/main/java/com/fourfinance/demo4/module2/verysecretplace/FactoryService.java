package com.fourfinance.demo4.module2.verysecretplace;

import com.fourfinance.demo4.module1.Client;
import com.fourfinance.demo4.module1.ClientFactory;

public class FactoryService {

    public static Client getClient() {
        return ClientFactory.getInstance().createClient("Жора Камушкин");
    }

}
