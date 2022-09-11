import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    static List<Person> generateClients() {
        List<Person> clients = new LinkedList<>();
        clients.add(new Person("Максим", "Горький", 3));
        clients.add(new Person("Николай", "Гоголь", 4));
        clients.add(new Person("Лев", "Толстой", 2));
        clients.add(new Person("Антон", "Чехов", 6));
        clients.add(new Person("Фёдор", "Достоевский", 3));
        return clients;
    }

    public static void main(String[] args) {

        Queue<Person> queue = new LinkedList<>();
        queue.addAll(generateClients());


        while (!queue.isEmpty()) {
            Person s = queue.peek();
            if (s.tickets > 0) {
                System.out.println(s.firstName + " " + s.lastName + " прокатился на аттракционе");
                s.tickets --;
                if (s.tickets > 0) {
                    queue.offer(s);
                } else {
                    queue.remove(s);
                }
            }
            queue.remove(s);
        }
    }
}