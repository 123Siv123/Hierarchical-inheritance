class Tncolleges{  
void clg(){
    System.out.println( "-------under Anna university-----");
    }  
}  
class vtmt extends Tncolleges{  
void vm(){
    System.out.println("-->veltech multi tech");
    }  
}  
class vtht extends Tncolleges{  
void vh(){
    System.out.println("---->veltech high tech");
    }  
}
class pec extends Tncolleges{  
void pm(){
    System.out.println("------->panimalar");
    }  
}  
public class Main{  
public static void main(String args[]){
    System.out.println("*********Tamilnadu colleges*********");
    vtmt v1=new vtmt();
    v1.clg();
    v1.vm();
    vtht v2=new vtht();
    v2.vh();
    pec p=new pec();
    p.pm(); 
}}  