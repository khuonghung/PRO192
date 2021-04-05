/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Molecules;

/**
 *
 * @author Khuong Hung
 */
public class Dog {
    int id;
          
    String name, voice;
    
    Boolean type;

    public Dog() {
    }

    public Dog(int id, String name, String voice, Boolean type) {
        this.id = id;
        this.name = name;
        this.voice = voice;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getVoice() {
        return voice;
    }

    public Boolean getType() {
        return type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    void display(){
        System.out.println(id + ", " + name + ", " + voice + ", " + type);
    }
    
    
    
    
    
}
