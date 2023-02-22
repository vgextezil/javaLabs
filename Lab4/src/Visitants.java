public class Visitants {
    private int id;

    public Visitants(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Гість{" +
                "id=" + id +
                '}';
    }
}
