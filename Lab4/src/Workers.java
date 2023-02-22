import java.time.LocalDate;

public class Workers extends Visitants{
    private String pip;
    private String position;
    private LocalDate dateOfBirth;
    public Workers(int id, String pip,String position, LocalDate dateOfBirth){
        super(id);
        this.pip = pip;
        this.position= position;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Workers{" +
                "id='" + getId() + '\'' +
                "ПІП='" + pip + '\'' +
                ", Посада='" + position + '\'' +
                ", Дата народження=" + dateOfBirth +
                '}';
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

}
