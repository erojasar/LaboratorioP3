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
public class Grade {
    private int mark;
    private Module module;
    private Student student;
    
    public Grade(int mark, Module module, Student student){
        this.mark = mark;
        this.module = module;
        this.student = student;
    }
    
    public int getMark(){
        return mark;
    }
    
    public void setMark(int mark){
        this.mark = mark;
    }
    
    public Module getModule(){
        return module;
    }
    
    public void setModule(Module module){
        this.module = module;
    }
    
    public Student getStudent(){
        return student;
    }
    
    public void setStudent(Student student){
        this.student = student;
    }
}
