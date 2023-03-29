public class People {
    private int id;

    public People(int id) {
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                '}';
    }
}
