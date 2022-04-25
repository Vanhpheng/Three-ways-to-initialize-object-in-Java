public class MainClass {
    public static void main(String[] args){
        ReferenceVariable obj = new ReferenceVariable();
        obj.display();
        Constructor Con = new Constructor(4,5);
        Con.ShowDetails();
        Method method = new Method();
        System.out.println("Id : "+method.id+"\n"+"Name : "+method.name+"\n"+"Lastname : "+method.lastname);
    }
}