public class Single Inheritance{
public static void main(String[] args){
SIchild child=new SIchild();
child.display();
child.show();
}
}
class SIparent{
void show(){
System.out.println("show the details of parent class");
}
}
class SIchild extends SIparent{
void display(){
System.out.println("Dsiplay the result of child class");
}}