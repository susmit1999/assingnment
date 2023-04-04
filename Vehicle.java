class Vehicle{
void running(){
System.out.println("running mode on");
}
}
class car extends vehicle{
void run(){
System.out.println("car run mode on");
}
}
class I10 extends car{
void speed(){
System.out.println("speed is very high");
}}
public class Multilevel{
public static void main(String[] args){
I10 d=newI10();
d.running();
d.run();
d.speed();
}}