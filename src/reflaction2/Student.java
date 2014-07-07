package reflaction2;

import java.lang.reflect.Method;

public class Student {
	int a;;
	int b;
	int c;
int d;
	public Student(){}
	   public Student(int a, int b)
	      {
	         System.out.println(
	           "a = " + a + " b = " + b);
	      }
	public int add(int a,int b){
		c=a+b;
		return c;		
	}
	
	public static void main(String args[]){
		try{
			Class cls=Class.forName("reflaction2.Student");
			Class parameterlist[]=new Class[2];
			parameterlist[0]=Integer.TYPE;
			parameterlist[1]=Integer.TYPE;
			Method meth=cls.getMethod("add", parameterlist);
			Student std=(Student)Student.class.newInstance();
			Object argumentlist[]=new Object[2];
			argumentlist[0]=new Integer(3);
			argumentlist[1]=new Integer(4);
			Object result=meth.invoke(std, argumentlist);
			Integer intvalue=(Integer)result;
			System.out.println(intvalue.intValue());
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
