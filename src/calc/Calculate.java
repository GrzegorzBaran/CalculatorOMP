package calc;

public class Calculate {
	
	public double calc(String onp){
		
		Stack<String> stack = new Stack<String>();	
		
		double wynik = 0;
		int i = 0;
		String[] tab = new String[20]; 
		int j =0;
		int k =0;		
				
		while(!(onp.substring(i, i+1).equals("="))){
			if (onp.substring(i, i+1).equals(".")){
				tab[j-1] = tab[j-1] + "." + onp.substring(i+1, i+2);
				i = i +2;
				
			}
			tab[j] = onp.substring(i, i+1);
			i++;
			j++;
		}
		tab[j] = "=";		
		
		double temp1= 0, temp2=0;
		while(!(tab[k].equals("="))){
			switch(tab[k]){
			case "+":
				temp1 = Double.parseDouble(stack.pop());
				temp2 = Double.parseDouble(stack.pop());
				temp1 = temp1 + temp2;
				
				stack.push(Double.toString(temp1));
				break;
			case "-":
				temp1 = Double.parseDouble(stack.pop());
				temp2 = Double.parseDouble(stack.pop());
				temp1 = temp2 - temp1;
				
				stack.push(Double.toString(temp1));
				break;
			case "^":
				temp1 = Double.parseDouble(stack.pop());
				temp2 = Double.parseDouble(stack.pop());
				temp1 =  Math.pow(temp2, temp1);				
				stack.push(Double.toString(temp1));
				break;
			case "p":
				temp1 = Double.parseDouble(stack.pop());
				temp2 = Double.parseDouble(stack.pop());
				temp1 =  1/Math.pow(temp2, temp1);				
				stack.push(Double.toString(temp1));
				break;
			case "%":
				temp1 = Double.parseDouble(stack.pop());
				temp2 = Double.parseDouble(stack.pop());
				temp1 =  temp2 % temp1;				
				stack.push(Double.toString(temp1));
				break;
			case "!":
				temp1 = Double.parseDouble(stack.pop());
				temp2 = Double.parseDouble(stack.pop());
				temp1 =  silnia(temp1);				
				stack.push(Double.toString(temp1));
				break;
			case "/":
				temp1 = Double.parseDouble(stack.pop());
				temp2 = Double.parseDouble(stack.pop());				
				temp1 =  temp2 / temp1;				
				
				stack.push(Double.toString(temp1));
				break;
			case "x":
				temp1 = Double.parseDouble(stack.pop());
				temp2 = Double.parseDouble(stack.pop());
				temp1 =  temp2 * temp1;				
				stack.push(Double.toString(temp1));
				break;
				
			default:
				stack.push(tab[k]);
				
			}
			k++;
		}
		wynik = Double.parseDouble(stack.pop());
		System.out.println();
		System.out.println("wynik: " + wynik);
		return wynik;
	}
	
	private static double silnia(double i)
	{
		if (i < 1)
			return 1;
		else
			return i * silnia(i - 1);
	}

}
