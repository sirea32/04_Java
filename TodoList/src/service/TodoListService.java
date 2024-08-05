package service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Map;

public interface TodoListService {

	public abstract Map<String, Object> todoListFullView();
	
	public abstract String dateFormat(LocalDateTime regDate);
	
	public abstract String todoDetailView(int index);

	public abstract int todoAdd(String title, String detail) throws FileNotFoundException, IOException ;

	public abstract boolean todoComplete(int index)  throws FileNotFoundException, IOException ;

	public abstract boolean todoUpdate(int index, String title, String detail)  throws FileNotFoundException, IOException ;

	public abstract String todoDelete(int index)  throws FileNotFoundException, IOException ;
	
}
