package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@RestController
public class ToDoLostController {
    @Autowired
    private ToDoListRepository repository;

    //Добавить задачу либо изменить +
    @PostMapping("/todolist/add")
    public int add(ToDoList task) {
        Iterable<ToDoList> lists = repository.findAll();
        for (ToDoList list : lists) {
            if(Objects.equals(list.getNameTask(), task.getNameTask())){
                repository.deleteById(list.getIdTask());
            }
        }
        ToDoList toDoList = repository.save(task);
        return toDoList.getIdTask();
    }

    //Удалить дело по name +
    @PostMapping("/todolist/name")
    public String remove(@RequestParam String nameTask) {
        Iterable<ToDoList> lists = repository.findAll();
        for (ToDoList list : lists) {
            if(list.getNameTask().equals(nameTask)){
                repository.deleteById(list.getIdTask());
                return "true";
            }
        }
        return "false";
    }

    //Показать весь список дел +
    @GetMapping("/todolist")
    public List<ToDoList> list() {
        Iterable<ToDoList> lists = repository.findAll();
        ArrayList<ToDoList> list = new ArrayList<>();
        for (ToDoList toDoList : lists) {
            list.add(toDoList);
        }
        return list;
    }

    //Удалить все дела +
    @DeleteMapping("/todolist")
    public void removeList() {
        repository.deleteAll();
    }
}
