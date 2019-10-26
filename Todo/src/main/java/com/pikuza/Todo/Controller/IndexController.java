package com.pikuza.Todo.Controller;

import com.pikuza.Todo.Dom.Task;
import com.pikuza.Todo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class IndexController {

    @Autowired
    TaskRepository taskRepository;

    @GetMapping("/")
    public ModelAndView index()
    {
        return new ModelAndView("m");
    }
    @PostMapping
    public String add(@RequestParam String text, Map<String, Object> model) {
        Task message = new Task(text);

        taskRepository.save(message);

        Iterable<Task> messages = taskRepository.findAll();

        model.put("messages", messages);

        return "m";
    }
}
