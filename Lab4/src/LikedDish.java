import java.util.List;

public class LikedDish {
    private int idVisitant;
    private int idDish;
    private List<Dishes> dishes;
    LikedDish(int idVisitant, int idDish, List<Dishes> dishes){
        this.idVisitant = idVisitant;
        this.idDish = idDish;
        this.dishes = dishes;
    }

    public List<Dishes> getDishes() {
        return dishes;
    }

    public void toString(List<Dishes> dishes, List<Visitants> visitants ) {
        System.out.println(visitants.get(idVisitant-1).toString());
        System.out.println(dishes.get(idDish-1).toString());
    }
    public void setIdVisitant(int idVisitant) {
        this.idVisitant = idVisitant;
    }

    public int getIdVisitant() {
        return idVisitant;
    }

    public void setIdDish(int idDish) {
        this.idDish = idDish;
    }

    public int getIdDish() {
        return idDish;
    }

}
