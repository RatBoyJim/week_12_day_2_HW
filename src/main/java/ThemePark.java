import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;

import java.util.ArrayList;

public class ThemePark {
    private ArrayList<IReviewed> allReviewed;

    public ThemePark(){
        this.allReviewed = new ArrayList<IReviewed>();
    }

    public ArrayList<IReviewed> getAllReviewed(){
        return this.allReviewed;
    }

    public void addToAllReviewed(IReviewed attraction){
        this.allReviewed.add(attraction);
    }

    public int getAmountAllReviewed() {
        return this.allReviewed.size();
    }

//    public void visit(Visitor visitor, Attraction attraction){
//        attraction.getVisitCount() += 1;
//        visitor.addVisitedAttraction(attraction);
//
//    }
}
