package stack_implementation;

public class StackImplementation {
	static final int MAX = 100;
	int top;
	int a[] = new int[MAX];

	Stack() {
		top = -1;
	}

	boolean isEmpty() {
		return (top < 0);
	}

	public boolean push(int x) {
		if (top >= (MAX - 1)) {
			System.out.println("Stack Overflow");
			return false;
		}else {
			a[++top] = x;
			System.out.println("pushed into stack : ");
			System.out.println(x);
			return true;
		}
	}

	public int pop() {
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}else {
			int x = a[top--];
			return x;
		}
	}

	public int peek() {
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			int x = a[top];
			return x;
		}
	}
	
	public void display ()  
	{  
		System.out.println("Printing stack elements .....");  
		for(int i = top; i>=0;i--)  
		{  
			System.out.println(a[i]);  
		}  
	}  

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(70);
		s.push(30);
		s.push(50);

		s.peek();
		s.display();

		s.pop();
		s.display();
		
		s.pop();
		s.display();		
	}

}
