package model;
import java.util.ArrayList;
import java.util.Date;
public class Ordine {
	
	String idOrdine,stato,idCliente,indirizzoConsegna,metodoPagamento;
	ArrayList<Articolo> listaArticoli;
	double totale;
	Date data;
	
	public Ordine(String idOrdine,double totale,String stato,String idCliente,String indirizzoConsegna,String metodoPagamento,Date data){
		this.idOrdine=idOrdine;
		//this.listaArticoli=listaArticoli;
		this.totale=totale;
		this.stato=stato;
		this.idCliente=idCliente;
		this.indirizzoConsegna=indirizzoConsegna;
		this.metodoPagamento=metodoPagamento;
		this.data=data;
	}
	
	public String getIdOrdine(){
		return idOrdine;
	}
	
	public void setIdOrdine(String idOrdine){
		this.idOrdine=idOrdine;
	}
	
	public ArrayList<Articolo> getListaArticoli(){
		return listaArticoli;
	}
	
	public double getTotale(){
		return totale;
	}
	
	public void setTotale(double totale){
		this.totale=totale;
	}
	
	public String getStato(){
		return stato;
	}
	
	public void setStato(String stato){
		this.stato=stato;
	}
	
	public String getIdCliente(){
		return idCliente;
	}
	
	public void setIdCliente(String idCliente){
		this.idCliente=idCliente;
	}
	
	public String getMetodoPagamento(){
		return metodoPagamento;
	}
	
	public String setMetodoPagamento(String metodoPagamento){
		return metodoPagamento;
	}
	
	public Date getData(){
		return data;
	}
	
	public void setData(Date data){
		this.data=data;
	}

}
