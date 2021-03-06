package server;

import javafx.scene.image.Image;

import java.awt.image.BufferedImage;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class message implements Serializable {

    private String name;
    private String msg;
    private ArrayList<user> users;
    private ArrayList<user> list;
    private String img;

    public void setImg(String img) {
        this.img = img;
    }

    public String getImg() {
        return img;
    }

    public ArrayList<user> getUsers() {
        return users;
    }

    public void setList(HashMap<String, user> hashMap) {
            this.list = new ArrayList<>(hashMap.values());
    }

    public ArrayList<user> getList() {
        return list;
    }

    public void setUsers(ArrayList<user> users) {
        this.users = users;
    }

    public String getMsg() {
        return msg;
    }


    public String getName() {
        return name;
    }


    public void setMsg(String msg) {
        this.msg = msg;
    }


    public void setName(String name) {
        this.name = name;
    }



}
