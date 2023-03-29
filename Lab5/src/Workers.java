import java.time.LocalDate;

public class Workers extends People{
    private String pip;
    private String position;
    private LocalDate dateOfBirth;
    public Workers(int id, String pip,String position, LocalDate dateOfBirth){
        super(id);
        this.pip = pip;
        this.position= position;
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPip() {
        return pip;
    }

    public String getPosition() {
        return position;
    }

    public void setPip(String pip) {
        this.pip = pip;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPosition(String position) {
        this.position = position;
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
