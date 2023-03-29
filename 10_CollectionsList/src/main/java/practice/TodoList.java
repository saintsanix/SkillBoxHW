package practice;

import java.util.ArrayList;

public class TodoList {

    ArrayList<String> todoList = new ArrayList<>();
    public void add(String todo) {
        // TODO: добавьте переданное дело в конец списка
        todoList.add(todo);
    }

    public void add(int index, String todo) {
        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления
        if (index >= 0 && index <= todoList.size()) {
            todoList.add(index, todo);
        } else {
            todoList.add(todo);
        }
    }

    public void edit(int index, String todo) {
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
        if (index > 0 && index <= todoList.size()) {
            todoList.set(index, todo);
        }
    }

    public void delete(int index) {
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
        if (index > 0 && index <= (todoList.size() - 1)) {
            todoList.remove(index);
        }
    }

    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел
        return todoList;
    }
}