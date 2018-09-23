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
public class University {
    private Student[] students;
    private Module[] modules;
    
    public University(){
        this.students = new Student[10];
        this.modules = new Module[10];
    }
    
    public Student[] getStudents(){
        return students;
    }
    
    public void setStudents(Student[] students){
        this.students = students;
    }
    
    public Module[] getModules(){
        return modules;
    }
    
    public void setModules(Module[] modules){
        this.modules = modules;
    }
}
