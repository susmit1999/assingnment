interface shape{
void shape_name();
}
class User_circle implements shape{
public void shape_name(){
System.out.println("Draw a circle");
}
}
class User_Traingle implements shape{
public void shape_name(){
System.out.println("Drae a traingle");
}
}
public class Interfaceeg2{
public static void amin(string[] args){
shape object=new User Traingle();
object.shape_name();
}
}