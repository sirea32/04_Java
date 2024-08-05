package service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dao.TodoListDao;
import dao.TodoListDaoImpl;
import dto.Todo;

public class TodoListServiceImpl implements TodoListService{
	private TodoListDao dao = null;
	
	public TodoListServiceImpl() throws FileNotFoundException, IOException, ClassNotFoundException {
		dao = new TodoListDaoImpl();
	}

	@Override
	public Map<String, Object> todoListFullView() {
		List<Todo> todoList = dao.todoListFullView();
		
		int completeCount = 0;
		
		for(Todo todo : todoList) {
			if(todo.isComplete()) {
				completeCount++;
			}
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("todoList", todoList);
		map.put("completeCount", completeCount);
		
		return map;
	}

	@Override
	public String dateFormat(LocalDateTime regDate) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedDateTime = regDate.format(formatter);
		
		return formattedDateTime;
	}

	@Override
	public String todoDetailView(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int todoAdd(String title, String detail) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean todoComplete(int index) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean todoUpdate(int index, String title, String detail) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String todoDelete(int index) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
