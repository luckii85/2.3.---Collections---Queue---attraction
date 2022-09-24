import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Person vanya = new Person("Vanya", "Ivanov", 2);
        Person john = new Person("Jonh", "Stack", 3);
        Person liu = new Person("Liu", "Chang", 1);
        Person katya = new Person("Katya", "Mirovay", 5);
        Person ellie = new Person("Ellie", "Gold", 3);
        Person piu = new Person("Piu", "Vo", 4);
        list.add(vanya);
        list.add(john);
        list.add(liu);
        list.add(katya);
        list.add(ellie);
        list.add(piu);

        Deque<Person> queue = new LinkedList<>();

        queue = generateClients(list);

        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(Arrays.toString(queue.toArray()));

        while(!queue.isEmpty()){
            Person client;
            client = queue.pollFirst();
            System.out.println(client.getName() + " " + client.getSurname() + " ride on the attraction!");
            client.changeNumberOfTickets();
            if (client.getNumberOfTickets()==0) continue;
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