package attractions;

import people.Visitor;

public interface ITicketed {
    double defaultPrice();
    double priceFor(Visitor visitor);

}
