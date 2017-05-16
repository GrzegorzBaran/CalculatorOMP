package calc;

import java.util.LinkedList;

public class Stack <T>{
	
	LinkedList<T> col = new LinkedList<T>();
	
	public  void push(T t){
		col.addFirst(t);
	}
	
	public T pop(){
		if(col.size() > 0){
			return col.removeFirst();
		}else
			return null;
	}
	public T get(){
		if(col.size() > 0){
			return col.getFirst();
		}else
			return null;
	}
	
	public void remove(){
		try{
			if(col.size() == 0){				
			//throw new Error();
			throw new NullPointerException();
			}else
				col.removeFirst();
		}catch(Exception e){
			System.out.println(e);
		}
	}

	public void sort(){
		//Collections.sort(col);
	}
	
	public boolean pusta(){
		 if (col.size() > 0)
			 return false;
		 else 
			 return true;
	 }
		
	public int licz() {
		return col.size();
	}

	public boolean empty() {
		if(col.size() > 0){
		return false;
		}else{
			return true;
		}
	}

}
