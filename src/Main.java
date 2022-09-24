import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Vanya", "Ivanov", 2));
        list.add(new Person("Jonh", "Stack", 3));
        list.add(new Person("Liu", "Chang", 1));
        list.add(new Person("Katya", "Mirovay", 5));
        list.add(new Person("Ellie", "Gold", 3));
        list.add(new Person("Piu", "Vo", 4));

        Deque<Person> queue = generateClients(list);

        Person client;

        while (!queue.isEmpty()) {
            client = queue.pollFirst();
            client.changeNumberOfTickets();
            System.out.println(String.format("%s %s ride on the attaction! His numbers of tickets are %d",
                    client.getName(), client.getSurname(), client.getNumberOfTickets()));
            if (client.getNumberOfTickets() == 0) continue;
            queue.offerLast(client);
        }
    }

    public static Deque<Person> generateClients(List<Person> list) {
        int i = 0;
        Random random = new Random();
        Deque<Person> queue = new LinkedList<>();
        while (i < 5) {
            int randomInt = random.nextInt(list.size());
            Person newPerson = list.get(randomInt);
            list.remove(randomInt);
            queue.offer(newPerson);
            i++;
        }
        return queue;
    }
}