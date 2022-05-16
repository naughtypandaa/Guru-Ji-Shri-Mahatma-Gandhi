  public class Employe{
    String name;
    public void main(){
        Employe obj = new Employe();//new allocatess memory //memory allocation
        System.out.println(obj);//reference of object will be stored 
        obj.name = "Yash";
        System.out.println("name before call:: "+obj.name);
        modifyName(obj,"Gaurav");//obj will go to Employee abc and "Gaurav" will go to String name.
        System.out.println("name after call:: "+obj.name);
    }
    public void modifyName(Employe abc,String name){//reference of obj will be stored in Employe abc and in String name "Gaurav"
        System.out.println(abc);
        System.out.println("Name before Modification::"+abc.name);
        abc.name = name;//Gaurav will be stored in abc.name
        System.out.println("Name after Modification::"+abc.name);
    }
}