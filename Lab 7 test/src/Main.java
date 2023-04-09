import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Worker> workers = new ArrayList<>();
        workers.add(new Worker(1,"a","b","c"));
        workers.add(new Worker(3,"a","b","c"));
        workers.add(new Worker(1,"a","b","c"));
        workers.add(new Worker(1,"a","b","c"));
        workers.add(new Worker(1,"a","b","c"));
        workers.add(new Worker(2,"a","b","c"));

        for (Worker worker: workers) {
            System.out.println(worker);
        }

        System.out.print("\n");

        Worker.writeWorkers(workers);
        List<Worker> workerList = Worker.readWorkers();
        for (Worker worker: workerList) {
            System.out.println(worker);
        }
    }
}