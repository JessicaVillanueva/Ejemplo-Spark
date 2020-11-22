/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.todo.services;

import com.todo.dao.TaskDao;
import com.todo.models.Task;
import java.util.List;

/**
 *
 * @author jessi
 */
public class TaskService {
    private TaskDao dao;

    public TaskService(TaskDao dao) {
        this.dao = dao;
    }
    
    public List<Task> getAll(){
        return this.dao.getAll();
    }
}
