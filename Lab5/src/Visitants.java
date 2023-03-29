public class Visitants extends People{
    public Visitants(int id) {
        super(id);
    }
    @Override
    public int getId() {
        return super.getId();
    }
    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + getId() +
                '}';
    }
}
