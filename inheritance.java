class A{
	int a,b,c;
	void display(){
		this.a=100;
		System.out.println("this is in method in class A: "+this.a);
		}
	}
class B extends A{
	int e,f;
	void display(){
		this.e=200;
		System.out.println("this is in class B: "+this.e);
		}
	}
class C extends B{
	int g;
	void display(){
		this.g=300;
		System.out.println("this is in class C: "+this.g);
		}
	}
class D extends C{
	int h;
	void display(){
		this.h=400;
		System.out.println("this is in class D: "+this.h);
		}
	}

class inheritance{
	public static void main(String args[]){
		B c1=new B();
		c1.display();	
		C c2=new C();
		c2.display();
		D c3=new D();
		c3.display();
		}
	}