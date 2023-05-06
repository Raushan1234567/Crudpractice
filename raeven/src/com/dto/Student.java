package com.dto;


import java.sql.Date;
import java.time.LocalDate;

public class Student {

	private String book_code;
	private String name ;
	private double pricel;
	private LocalDate publish_date;
	private int numberofpages;
	private String writer_name;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String book_code, String name, double pricel, LocalDate pdate, int numberofpages,
			String writer_name) {
		super();
		this.book_code = book_code;
		this.name = name;
		this.pricel = pricel;
		this.publish_date = pdate;
		this.numberofpages = numberofpages;
		this.writer_name = writer_name;
	}
	public String getBook_code() {
		return book_code;
	}
	public void setBook_code(String book_code) {
		this.book_code = book_code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPricel() {
		return pricel;
	}
	public void setPricel(double pricel) {
		this.pricel = pricel;
	}
	public LocalDate getPublish_date() {
		return publish_date;
	}
	public void setPublish_date(LocalDate publish_date) {
		this.publish_date = publish_date;
	}
	public int getNumberofpages() {
		return numberofpages;
	}
	public void setNumberofpages(int numberofpages) {
		this.numberofpages = numberofpages;
	}
	public String getWriter_name() {
		return writer_name;
	}
	public void setWriter_name(String writer_name) {
		this.writer_name = writer_name;
	}
	@Override
	public String toString() {
		return "Student [book_code=" + book_code + ", name=" + name + ", pricel=" + pricel + ", publish_date="
				+ publish_date + ", numberofpages=" + numberofpages + ", writer_name=" + writer_name + "]";
	}
	
	
	
}
