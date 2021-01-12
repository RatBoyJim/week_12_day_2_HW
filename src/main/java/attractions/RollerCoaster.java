package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class RollerCoaster extends Attraction implements ISecurity {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if(visitor.getHeight() > 200){
            return defaultPrice() * 2;
        }else{
            return defaultPrice();
        }
    }

    @Override
    public boolean isAllowedTo(Visitor visitor){
        if(visitor.getHeight() < 145){
            return false;
        }
        if(visitor.getAge() < 12){
            return false;
        }
        return true;
    }
}
