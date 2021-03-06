package control;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import model.Ordine;
public class ManageOrdine {
	
	String idOrdine,stato,idCliente,indirizzoConsegna,metodoPagamento;
	double totale;
	Date data;
	ArrayList<Ordine> ordini;

	public ManageOrdine(){}
	
	public String getIdOrdine(){
		return idOrdine;
	}
	
	public void setIdOrdine(String idOrdine){
		this.idOrdine=idOrdine;
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
	
	public String getIndirizzoConsegna(){
		return indirizzoConsegna;
	}
	
	public void setIndirizzoConsegna(String indirizzoConsegna){
		this.indirizzoConsegna=indirizzoConsegna;
	}
	
	public String getMetodoPagamento(){
		return metodoPagamento;
	}
	
	public void setMetodoPagamento(String metodoPagamento){
		this.metodoPagamento=metodoPagamento;
	}
	
	public Date getDate(){
		return data;
	}
	
	public void setDate(Date data){
		this.data=data;
	}
	
	public ArrayList<Ordine> getOrdini(){
		DbConnect.connect();
		ordini=new ArrayList<Ordine>();
		try{
			PreparedStatement ps=DbConnect.con.prepareStatement("select * from ordine");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Ordine o=new Ordine(rs.getString("idOrdine"),rs.getDouble("totale"),rs.getString("stato"),rs.getString("idCliente"),rs.getString("indirizzoConsegna"),rs.getString("metodoPagamento"),rs.getDate("data"));
				ordini.add(o);
			}
			ps.close();
			DbConnect.close();
		}catch(SQLException e){
			System.out.println("Connessione Fallita");
			e.printStackTrace();
		}
		return ordini;
	}
	
	
	public boolean insertOrdine(){
		DbConnect.connect();
		boolean flag=false;
		try{
			PreparedStatement ps=DbConnect.con.prepareStatement("insert into ordine values(?,?,?,?,?,?,?)");
			ps.setString(1,idOrdine);
			ps.setDouble(2,totale);
			ps.setString(3,stato);
			ps.setString(4,idCliente);
			ps.setString(5,indirizzoConsegna);
			ps.setString(5,metodoPagamento);
			//ps.setDate(7,data);
			if(ps.executeUpdate()>0) flag=true;
			ps.close();
		}catch(SQLException e){
			System.out.println("Connessione Fallita");
			e.printStackTrace();
		}
		DbConnect.close();
		return flag;
	}
	
	public boolean deleteOrdine(){
		DbConnect.connect();
		boolean flag=false;
		try{
			PreparedStatement ps=DbConnect.con.prepareStatement("delete from ordine where id=?");
			ps.setString(1,idOrdine);
			if(ps.executeUpdate()>0) flag=true;
			ps.close();
			DbConnect.close();
		}catch(SQLException e){
			System.out.println("Connessione fallita");
			e.printStackTrace();
		}
		return flag;
	}
	
	public boolean updateIdCliente(){
		DbConnect.connect();
		boolean flag=false;
		try{
			PreparedStatement ps=DbConnect.con.prepareStatement("update ordine set idCliente=? where id=?");
			ps.setString(1,idCliente);
			ps.setString(2,idOrdine);
			if(ps.executeUpdate()>0) flag=true;
			ps.close();
			DbConnect.close();
		}catch(SQLException e){
			System.out.println("Connesione fallita");
			e.printStackTrace();
		}
		return flag;
	}
	
	public boolean updateIndirizzoConsegna(){
		DbConnect.connect();
		boolean flag=false;
		try{
			PreparedStatement ps=DbConnect.con.prepareStatement("update articolo set indirizzoConsegna=? where id=?");
			ps.setString(1,indirizzoConsegna);
			ps.setString(2,idOrdine);
			if(ps.executeUpdate()>0) flag=true;
			ps.close();
			DbConnect.close();
		}catch(SQLException e){
			System.out.println("Connesione fallita");
			e.printStackTrace();
		}
		return flag;
	}
	
	public boolean updateTotale(){
		DbConnect.connect();
		boolean flag=false;
		try{
			PreparedStatement ps=DbConnect.con.prepareStatement("update ordine set totale=? where id=?");
			ps.setDouble(1,totale);
			ps.setString(2,idOrdine);
			if(ps.executeUpdate()>0) flag=true;
			ps.close();
			DbConnect.close();
		}catch(SQLException e){
			System.out.println("Connesione fallita");
			e.printStackTrace();
		}
		return flag;
	}
	
	public boolean updateMetodoPagamento(){
		DbConnect.connect();
		boolean flag=false;
		try{
			PreparedStatement ps=DbConnect.con.prepareStatement("update ordine set metodoPagamento=? where id=?");
			ps.setString(1,metodoPagamento);
			ps.setString(2,idOrdine);
			if(ps.executeUpdate()>0) flag=true;
			ps.close();
			DbConnect.close();
		}catch(SQLException e){
			System.out.println("Connesione fallita");
			e.printStackTrace();
		}
		return flag;
	}
	
	//public boolean updateData(){}
	public synchronized int getI(){
		String query="select max(idordine) from ordine;";
		DbConnect.connect();
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = DbConnect.con.prepareStatement(query);
			ResultSet rs=preparedStatement.executeQuery();
			String x="";
			while(rs.next()){
				x=rs.getString(1);
			}
			DbConnect.close();
			if(x==null)
				return 0;
			else
				return Integer.parseInt(x);
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	
}
