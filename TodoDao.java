package dao;

import java.util.List;

import entity.Todo;

public interface TodoDao {
	boolean save(Todo todo);

	boolean update(Todo todo);

	List<Todo> get();

}
