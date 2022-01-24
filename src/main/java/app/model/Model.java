package app.model;

import app.entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Model {
    private static Model instance = new Model();
    private List<User> model;

    private Model() {
        model = new ArrayList<>();
    }
    public static Model getInstance(){
        return instance;
    }
    public void deleteAllUser(String str){
        if (str.equals("all")){
        model.clear();}
    }

    public void deleteUser(String name){
        for (User users: model) {
            if (users.getName().equals(name)){
                model.remove(users);
            }
        }
    }

    public void addUser(User user){
        model.add(user);
    }

    public List<String> list(){
        return model.stream().map(User::getName).collect(Collectors.toList());
    }
}
