package ru.mtuci.labwork1;

import ru.mtuci.labwork1.model.Student;

import org.junit.Test;
import ru.mtuci.labwork1.repository.StudentsRepository;


import java.util.List;

public class TestStudentsRepository {

    StudentsRepository repository = new StudentsRepository();

    @Test
    public void testCreate() throws Exception {

        Student student = new Student(null, "Petrova", "Irina",
               "Vasilevna");
        Student created = repository.save(student);

        System.out.println(created);
    }
    /*
    @Test
    public void testDelete() throws Exception
    {
        Client clients = new Client(null, "Irina", "200-300-3-4", 876538, "Moscow, st.aviamotornaya,1");
        Client created = repository.save(clients);
        repository.delete(created.getId());
    }

    @Test
    public void testUpdate(){
        Client clients = new Client(null, "Irina", "200-300-3-4", 876538, "Moscow, st.aviamotornaya,1");
        Client created = repository.save(clients);
        created.setName("Svetlana");
        Client updated = repository.save(created);
        System.out.println(updated);
    }

    @Test
    public void testGet() throws Exception{
        Client clients = new Client(null, "Irina", "200-300-3-4", 876538, "Moscow, st.aviamotornaya,1");
        Client created = repository.save(clients);
        Client clientsFromDB = repository.get(created.getId());
        System.out.println(clientsFromDB);
    }
    @Test
    public void testGetAll() throws Exception {
        Client clients1 = new Client(null, "Irina", "200-300-3-4", 876538, "Moscow, st.aviamotornaya,1");
        Client clients2 = new Client(null, "Irina", "200-300-3-4", 876538, "Moscow, st.aviamotornaya,1");
        Client clients3 = new Client(null, "Irina", "200-300-3-4", 876538, "Moscow, st.aviamotornaya,1");
        repository.save(clients1);
        repository.save(clients2);
        repository.save(clients3);
        repository.getAll();
        List<Client> cli = repository.getAll();
        for (Client r : cli) {
            System.out.println(r);
        }
    }
    */
}
