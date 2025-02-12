package com.spring.todoProject.service;

import com.spring.todoProject.Entity.ToDo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoService {

    private static List<ToDo> todos = new ArrayList<>();

    static {
        todos.add(new ToDo(1, "Jaidev", "Learn whatever",
                LocalDate.now().plusMonths(3), false));
        todos.add(new ToDo(2, "Jaidev", "Learn whatever2",
                LocalDate.now().plusMonths(4), false));
        todos.add(new ToDo(3, "Jaidev", "Learn whatever3",
                LocalDate.now().plusMonths(5), false));
    }

    public List<ToDo> findByUsername(String username){
        return todos;
    }
}
