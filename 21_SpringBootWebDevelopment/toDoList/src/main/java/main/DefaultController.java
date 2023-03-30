package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class DefaultController {

    @Autowired
    private ToDoListRepository toDoListRepository;

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @RequestMapping("/")
    public String index(Model model){
        Iterable<ToDoList> toDoLists = toDoListRepository.findAll();
        ArrayList<ToDoList> taskList = new ArrayList<>();
        for(ToDoList list : toDoLists){
            taskList.add(list);
        }
        model.addAttribute("taskList", taskList);
        model.addAttribute("taskCount", taskList.size());
        String urlValue = url.split("\\?")[0];
        model.addAttribute("url", "База данных: " + urlValue);
        model.addAttribute("username", "Имя пользователя: " + username);
        model.addAttribute("password", "Пароль: " + password);
        return "index";
    }
}
