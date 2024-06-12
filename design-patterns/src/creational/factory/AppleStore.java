package creational.factory;

import java.util.Objects;

public class AppleStore {

    public static Phone getPhone(String name){
        if(Objects.equals(name,"IPhone14")){
            return new IPhone14();
        } else if (Objects.equals(name,"IPhone15")) {
            return new IPhone15();
        } else if (Objects.equals(name,"IPhone14Pro")) {
            return new IPhone14Pro();
        } else
            return new UnavailablePhone();
    }

}
