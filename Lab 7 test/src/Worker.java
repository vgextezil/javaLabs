import java.io.*;
import java.util.List;

public class Worker extends People implements Serializable {
    private String type;

    public Worker(Integer id, String fName, String lName, String type) {
        super(id, fName, lName);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + getId() +
                ", fName='" + getfName() + '\'' +
                ", lName='" + getlName() + '\'' +
                "type='" + type + '\'' +
                '}';
    }
    public static void writeWorkers(List<Worker> workers){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Workers.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(workers);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Worker> readWorkers() throws IOException, ClassNotFoundException {
        FileInputStream fileOutputStream = new FileInputStream("Workers.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileOutputStream);
        return (List<Worker>)objectInputStream.readObject();
    }
}
