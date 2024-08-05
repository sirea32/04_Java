package dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import dto.Todo;

public class TodoListDaoImpl implements TodoListDao {
	private final String FILE_PATH = "TodoList.dat";
	
	private List<Todo> todoList = null;
	
	private ObjectOutputStream oos = null;
	private ObjectInputStream  ois = null;
	
	public TodoListDaoImpl() throws FileNotFoundException, IOException, ClassNotFoundException {
		File file = new File(FILE_PATH);
		
		if(!file.exists()) {
			todoList = new ArrayList<Todo>();
		}else {
			try {
				ois = new ObjectInputStream(new FileInputStream(FILE_PATH));
				todoList = (ArrayList<Todo>)ois.readObject();
			}finally {
				if(ois != null)ois.close();
			}
		}
	}
	
	
	@Override
	public void saveFile() throws FileNotFoundException, IOException {
		try {
			oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
			oos.writeObject(todoList);
		}finally {
			oos.close();
		}
	}
	
	
	@Override
	public List<Todo> todoListFullView() {
		return todoList;
	}
		
	
	@Override
	public Todo todoDetailView(int index) {
		
		if(index < 0 || index >= todoList.size()) return null;
		
		return todoList.get(index);
	}
	
	
	@Override
	public int todoAdd(Todo todo) throws FileNotFoundException, IOException {
		
		if(todoList.add(todo)) {
			saveFile();
			return todoList.size() - 1;
		}
		
		return -1;
	}
	
	
	@Override
	public boolean todoComplete(int index) throws FileNotFoundException, IOException {
		// TodoList 범위 초과 시 false 반환
		if(index < 0 || index >= todoList.size()) return false;
		
		boolean complete = todoList.get(index).isComplete();
		todoList.get(index).setComplete(!complete);
		
		saveFile();
		
		return true;
	}
	
	
	@Override
	public boolean todoUpdate(int index, String title, String detail) throws FileNotFoundException, IOException {
		
		Todo newTodo = new Todo();
		
		newTodo.setTitle(title);
		newTodo.setDetail(detail);
		newTodo.setComplete(todoList.get(index).isComplete());
		newTodo.setRegDate(todoList.get(index).getRegDate());

		if( todoList.set(index, newTodo) != null ) {
			
			saveFile();
			
			return true;
		}
		return false;
	}
	
	
	@Override
	public Todo todoDelete(int index) throws FileNotFoundException, IOException{
		
		if(index < 0 || index >= todoList.size()) return null;
		
		Todo deletedTarget = todoList.remove(index);
		
		saveFile();
		
		return deletedTarget;
	}


	
}
