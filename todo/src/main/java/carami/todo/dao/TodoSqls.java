package carami.todo.dao;

public class TodoSqls {
    final static String SELECT_BY_ID = "select * from todo where id = :id";
    final static String UPDATE_BY_ID = "update todo set todo = :todo , completed = :completed where id = :id";
    final static String DELETE_BY_ID = "delete from todo where id = :id";
    final static String SELECT = "select * from todo order by id desc limit :start, :count";
}
