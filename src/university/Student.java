/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university;

/**
 *
 * @author emlad
 */
public class Student {
    private String name;
    private Module[] takes;
    private Grade[] grades;
    
    public Student(String name, Module[] takes){
        this.name = name;
        this.takes = takes;
        this.grades = new Grade[10];
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public Module[] getTakes(){
        return takes;
    }
    
    public void setTakes(Module[] takes){
        this.takes = takes;
    }
    
    public Grade[] getGrades(){
        return grades;
    }
    
    public void setGrades(Grade[] grades){
        this.grades = grades;
    }
}
