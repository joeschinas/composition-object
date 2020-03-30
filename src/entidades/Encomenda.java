
package entidades;

import Enum.StatusEncomenda;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import entidades.ReservaPedido;
import entidades.Produtos;
   

public class Encomenda {
     private SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/YYYY");
    private static SimpleDateFormat sdfh = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private StatusEncomenda status;
    private List<ReservaPedido> listPedidos = new ArrayList <>();
    private Clientes cliente;
   private 
    public Encomenda() {
    }

    public Encomenda(Date moment, StatusEncomenda status, Clientes cliente) {
        this.moment = moment;
        this.status = status;
        this.cliente = cliente;
    }
     
    public Encomenda(Date moment, StatusEncomenda status) {
        this.moment = moment;
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public StatusEncomenda getStatus() {
        return status;
    }

    public void setStatus(StatusEncomenda status) {
        this.status = status;
    }

    public List<ReservaPedido> getListPedidos() {
        return listPedidos;
    }
    /* public List<Clientes> getListClientes() {
        return listClientes;*/
    
    public void addItem (ReservaPedido pedido){
    listPedidos.add(pedido);
    }
    public void removeItem (ReservaPedido pedido){
    
    listPedidos.remove(pedido);
    }
    public Double total(){
       double soma =0.0;
        for (ReservaPedido pedd : listPedidos){
          
            soma+=pedd.subTotal();
            
        }
        return soma;
    
    
    
}


    
    public StringBuilder ToString(){
            StringBuilder sb = new StringBuilder();
            sb.append(sdfh.format(moment));
            sb.append(status);
            sb.append(cliente.getNome());
            sb.append(cliente.getEmail());
            sb.append(cliente.getDtnasc());
          
            for(ReservaPedido rsv : listPedidos){
               
                sb.append(rsv.getPreco());
                 sb.append(rsv.getQuantidade());
              
            }
            sb.append(String.format("%.2f",total()));
            
            return sb;
            
                    }

}
