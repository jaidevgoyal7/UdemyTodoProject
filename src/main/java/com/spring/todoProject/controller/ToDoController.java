package com.spring.todoProject.controller;

import com.spring.todoProject.Entity.ToDo;
import com.spring.todoProject.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ToDoController {

    public ToDoController(ToDoService toDoService) {
        super();
        this.toDoService = toDoService;
    }

    @Autowired
    private ToDoService toDoService;

    @RequestMapping("list-todos")
    public String todoView(ModelMap model) {
        List<ToDo> todos = toDoService.findByUsername("Jaidev");
        model.addAttribute("todos", todos);
        return "listTodos";
    }
}
