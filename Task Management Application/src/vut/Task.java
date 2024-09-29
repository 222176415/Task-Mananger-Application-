/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author T R U S T
 */
public class Task {
     private String Task;
 
    public Task(String Task) {
        this.Task = Task;
    }
    //Setter and Getter Methods
       public String getTask() {
        return Task;
    }

    public void setTask(String Task) {
        this.Task = Task;
    }

    
      @Override
    public String toString() {
        return "Task{" + "Task=" + Task + '}';
    }
}
