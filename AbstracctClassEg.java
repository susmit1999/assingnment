abstract class parentabs{
parentabs(){
System.out.println("No-args cons");
}
abstract void show();
void run(){
System.out.println("Non abstacr method");
}
}
class childabs extends parentabs{
void show(){
System.out.println("parent class abstacrt method");
}
}
public class AbstracctClassEg{
public static void mian(String[] args){
parentabs object=new childabs();
object.show();
object.run();
}
}