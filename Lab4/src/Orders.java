import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Orders {
    private int idOrder;
    private int idVisitant;
    private int[] idDish;
    private int idWorker;
    private LocalDate date;
    public Orders(int idOrder, int idVisitant, int[] idDish, int idWorker, LocalDate date){
        this.idOrder = idOrder;
        this.idVisitant = idVisitant;
        this.idDish = idDish;
        this.idWorker = idWorker;
        this.date = date;
    }
    public int priceOrder(ArrayList<Dishes> dishes){
        int sum = 0;
        for(int i = 0; i<idDish.length;i++){
            sum += dishes.get(idDish[i]-1).getPrice();
        }
        return sum;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getIdVisitant() {
        return idVisitant;
    }

    public int getIdWorker() {
        return idWorker;
    }

    public int[] getIdDish() {
        return idDish;
    }

    public void setIdDish(int[] idDish) {
        this.idDish = idDish;
    }

    public void setIdVisitant(int idVisitant) {
        this.idVisitant = idVisitant;
    }

    public void setIdWorker(int idWorker) {
        this.idWorker = idWorker;
    }

    @Override
    public String toString() {
        return "Замовлення{" +
                "id гостя=" + idVisitant +
                ", id страв=" + Arrays.toString(idDish) +
                ", id офіціанта=" + idWorker +
                ", Дата замовлення=" + date +
                '}';
    }
}
