
package programcompobject;


import Enum.StatusEncomenda;
import entidades.Clientes;
import entidades.Encomenda;
import entidades.Produtos;
import entidades.ReservaPedido;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class ProgramCompObject {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
       Scanner read = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/YYYY");
        SimpleDateFormat sdfh = new SimpleDateFormat ("dd/MM/YYYY HH:mm:ss");
        Date date = new Date();
       
        
        System.out.print("Nome:");
        String nomecliente = read.nextLine();
        System.out.print("E-mail:");
        String email = read.nextLine();
        System.out.print("DATA de nascimento(DD/MM/YYYY):");
        Date dtnasc = sdf.parse(read.next());
        Clientes cliente = new Clientes (nomecliente, email, dtnasc);
        
        System.out.println("entre com Status do pedido:");
        StatusEncomenda status = StatusEncomenda.valueOf(read.next());
        
            Encomenda nPedd = new Encomenda(new Date(),status,cliente);
        
        System.out.println("Quantos Itens será encomendado:");
        int n = read.nextInt();
       
        for(int i=1; i<=n; i++){
        
        System.out.println("Entre com os dados #"+i+" pedido:");
        read.nextLine();
        
        System.out.println("nome:");
        String nomeprod = read.nextLine();
        System.out.println("preco:");
        Double preco = read.nextDouble();
        
        Produtos prod = new Produtos(nomeprod, preco);
        
        System.out.println("quantidade:");
        Integer qnt = read.nextInt();
        
        ReservaPedido itemPedd = new ReservaPedido(qnt, preco , prod);
        nPedd.addItem(itemPedd);
        
          
        }
          System.out.println("Relatorio de Pedido:");
            System.out.println(nPedd.ToString());
  
        
        
        
        read.close();
    
}
}