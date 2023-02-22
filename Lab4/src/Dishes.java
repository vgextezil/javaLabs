import java.time.LocalDate;

public class Dishes{
    private int id;
    private String type;
    private String title;

    private float price;
    private LocalDate expirationDate;

    public Dishes(int id, String type, String title, float price,LocalDate expirationDate){
        this.id = id;
        this.type = type;
        this.title = title;
        this.price = price;
        this.expirationDate = expirationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return expirationDate;
    }

    public void setDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", Тип='" + type + '\'' +
                ", Назва='" + title + '\'' +
                ", Ціна=" + price +
                ", Вжити До=" + expirationDate;
    }
}
