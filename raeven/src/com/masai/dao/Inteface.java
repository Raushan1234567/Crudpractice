package com.masai.dao;

import com.dto.Student;
import com.exception.Somethingwenrwrong;

public interface Inteface {
	
    public void Add(Student s) throws Somethingwenrwrong;
    
    public void Update(Student s ) throws Somethingwenrwrong;

	public void Dlete(String id) throws Somethingwenrwrong;
}
