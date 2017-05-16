package calc;


public class ConvertToOnp {
	
	private Stack<Character> stk = new Stack<Character>();
	
	public String convert(String we){		
		String wy = "";
		for(int j=0;j<we.length();j++){
			switch(we.charAt(j)){
			case '(':
				stk.push('(');
				break;
			case '^':
				while(!stk.empty()&&stk.get()=='^'||stk.get()=='p'||stk.get()=='%'||stk.get()=='!'){
					wy += stk.pop();					
				}
				stk.push('^');
				break;
			case 'p':
				while(!stk.empty()&&stk.get()=='^'||stk.get()=='p'||stk.get()=='%'||stk.get()=='!'){
					wy += stk.pop();					
				}
				stk.push('p');
				break;
			case '%':
				System.out.println("jestem");
				while(!stk.empty()&&stk.get()=='^'||stk.get()=='p'||stk.get()=='%'||stk.get()=='!'){
					wy += stk.pop();					
				}
				stk.push('%');
				break;
			case 'x':
				while(!stk.empty()&&(stk.get()=='^'||stk.get()=='x'||stk.get()=='/'||stk.get()=='p'||stk.get()=='%'||stk.get()=='!')){
					wy += stk.pop();
				}
				stk.push('x');
				break;
			case '/':
				while(!stk.empty()&&(stk.get()=='^'||stk.get()=='x'||stk.get()=='/'||stk.get()=='p'||stk.get()=='%'||stk.get()=='!')){
					wy += stk.pop();
				}
				stk.push('/');
				break;
			case '+':
				while(!stk.empty()&&(stk.get()=='^'||stk.get()=='x'||stk.get()=='/'||stk.get()=='+'||stk.get()=='-'||stk.get()=='p'||stk.get()=='%'||stk.get()=='!')){
					wy += stk.pop();
				}
				stk.push('+');
				break;
			case '-':
				while(!stk.empty()&&(stk.get()=='^'||stk.get()=='x'||stk.get()=='/'||stk.get()=='+'||stk.get()=='-'||stk.get()=='p'||stk.get()=='%'||stk.get()=='!')){
					wy += stk.pop();
				}
				stk.push('-');
				break;
			case ')':
				while(!stk.empty()&&stk.get()!='('){
					wy += stk.pop();
				}
				stk.pop();
				break;
			case '=':
				while(!stk.empty()){
					wy += stk.pop();
				}
				wy += '=';				
				break;
			default:
				while(we.charAt(j)>45&&we.charAt(j)<58){					
					wy += we.charAt(j);
					j++;
				}				
				j--;
				break;	
			}
		}		
		return wy;
	}	
	
}