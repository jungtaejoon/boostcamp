package carami.todo.domain;

import java.sql.*;

public class Todo {
	private Integer id;
	private String todo;
	private boolean completed;
	private Timestamp date;
	
	public Todo() {
		super();
	}

	public Todo(String todo) {
		super();
		this.todo = todo;
		this.date = new Timestamp(System.currentTimeMillis());
		this.completed = false;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTodo() {
		return todo;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", todo=" + todo + ", completed=" + completed + ", date=" + date + "]";
	}

}
