import java.rml.*;
public class Server{
    public static void main(String[] args){
        try{
            ServerImpl serverImpl = new ServerImpl();
            Naming.rebind("Server", serverImpl);

            System.out.println("Server Started....");
        }catch(Exception e){
            System.out.println("Exception Occured at server!" + e.getMessage());
        }
    }
}
/*
javac *.java
rmiregistry
java Server
java Client 
*/