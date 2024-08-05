package dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import dto.Todo;

public interface TodoListDao {
	void saveFile() throws FileNotFoundException, IOException;
	
	List<Todo> todoListFullView();
		
	int todoAdd(Todo todo) throws FileNotFoundException, IOException;

	boolean todoComplete(int index) throws FileNotFoundException, IOException;

	boolean todoUpdate(int index, String title, String detail) throws FileNotFoundException, IOException;

	Todo todoDelete(int index) throws FileNotFoundException, IOException;

	Todo todoDetailView(int index);
}
