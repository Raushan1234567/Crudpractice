package com.masai.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.dto.Student;
import com.exception.Somethingwenrwrong;


public class Implement implements Inteface {

	@Override
	public void Add(Student s) throws Somethingwenrwrong {
		Connection c=null;
		
		try {
			
			c=Connection1.getco();
			


			String q="Insert into student Values(?,?,?,?,?,?)";
			PreparedStatement ps=c.prepareStatement(q);
			
			ps.setString(1, s.getBook_code());
			ps.setString(2, s.getName());
			ps.setDouble(3, s.getPricel());
			ps.setDate(4,Date.valueOf(s.getPublish_date()));
			ps.setInt(5, s.getNumberofpages());
			ps.setString(6, s.getWriter_name());
			
			if(ps.executeUpdate()>0) {
				System.out.println("Added Successfully");
			}
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			 throw new Somethingwenrwrong("Some thng went wrong");
		}
		
		}

	@Override
	public void Update(Student s) throws Somethingwenrwrong {
Connection c=null;
System.out.println("raushan234");
		try {
			
			c=Connection1.getco();
			 System.out.println("raushan234");


			String q="update student set name=?,price=?,publish_date=?,number_of_pages=?, writer_name=? where  book_code=?";
			PreparedStatement ps=c.prepareStatement(q);
			
			ps.setString(6, s.getBook_code());
			ps.setString(1, s.getName());
			ps.setDouble(2, s.getPricel());
			ps.setDate(3,Date.valueOf(s.getPublish_date()));
			ps.setInt(4, s.getNumberofpages());
			ps.setString(5, s.getWriter_name());
			
			if(ps.executeUpdate()>0) {
				System.out.println("Updated Successfully");
			}
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			 throw new Somethingwenrwrong("Not updated");
		}
		
	}

	@Override
	public void Dlete(String id) throws Somethingwenrwrong {
		Connection c=null;
		
		try {
			c=Connection1.getco();
			
		String q="delete from student where book_code=?";
		PreparedStatement ps=c.prepareStatement(q);
		
		ps.setString(1,id);
		System.out.println(id);
		ps.executeUpdate();
		System.out.println("Deleted successfully");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			throw new Somethingwenrwrong("No record found");
			
		}
		finally {
			try {
				Connection1.closeco(c);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
		
		
	}


