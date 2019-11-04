import java.util.Scanner;

class Area{
int lgth;
int brdth;
public Area(int lgth, int brdth){
this.lgth=lgth;
this.brdth=brdth;
}

public int returnArea(){
int area=lgth*brdth;

return area;
}
public static void main(String[] args){
Scanner ob=new Scanner(System.in);
System.out.println("Enter  length of Rectangle :- ");
int length=ob.nextInt();

System.out.println("Enter  breadth of Rectangle :- ");
int breadth=ob.nextInt();


Area ar=new Area(length,breadth);


System.out.println("Area  of rectangle is: "+ar.returnArea());
}

}