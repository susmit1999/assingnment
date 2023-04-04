class parents_simple_EG_IS_A{
int marks=85;
}
class simple_EG_IS_A extends parents_simple_EG_IS_A{
int Additional_percentage=5;
public static void main(String[] args){
simple_EG_IS_A obj=new simple_EG_IS_A();
System.out.println("Total marks:"+(obj.marks+obj.Additional_percentage));
}
}