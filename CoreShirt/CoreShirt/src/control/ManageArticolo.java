package control;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

import model.Articolo;

import java.sql.*;
public class ManageArticolo{
	
	private static final String TABLE_NAME = "articolo";

	private ArrayList<Articolo> articoli;

	public ManageArticolo(){}

	
	public ArrayList<Articolo> getArticolo(){
		DbConnect.connect();
		articoli=new ArrayList<Articolo>();
		try{
			PreparedStatement ps=DbConnect.con.prepareStatement("select * from articolo");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Articolo a=new Articolo(rs.getInt("idArticolo"),rs.getString("nome"),rs.getDouble("prezzo"),rs.getInt("quantita"),rs.getString("categoria"));
				articoli.add(a);
			}
			ps.close();
			DbConnect.close();
		}catch(SQLException e){
			System.out.println("Connessione Fallita");
			e.printStackTrace();
		}
		return articoli;
	}
	
	
	public boolean insertArticolo(Articolo a){
		DbConnect.connect();
		boolean flag=false;
		try{
			PreparedStatement ps=DbConnect.con.prepareStatement("insert into articolo values(?,?,?,?,?)");
			ps.setInt(1,a.getidArticolo());
			ps.setString(2,a.getnome());
			ps.setString(3,a.getcategoria());
			ps.setDouble(4,a.getprezzo());
			ps.setInt(5,a.getquantita());
			if(ps.executeUpdate()>0) flag=true;
			ps.close();
		}catch(SQLException e){
			System.out.println("Connessione Fallita");
			e.printStackTrace();
		}
		DbConnect.close();
		return flag;
	}
	
	public boolean deleteArticolo(String idArticolo){
		DbConnect.connect();
		boolean flag=false;
		try{
			PreparedStatement ps=DbConnect.con.prepareStatement("delete from articolo where id=?");
			ps.setString(1,idArticolo);
			if(ps.executeUpdate()>0) flag=true;
			ps.close();
			DbConnect.close();
		}catch(SQLException e){
			System.out.println("Connessione fallita");
			e.printStackTrace();
		}
		return flag;
	}
	
	public boolean updateNome(String idArticolo,String nome){
		DbConnect.connect();
		boolean flag=false;
		try{
			PreparedStatement ps=DbConnect.con.prepareStatement("update articolo set nome=? where id=?");
			ps.setString(1,nome);
			ps.setString(2,idArticolo);
			if(ps.executeUpdate()>0) flag=true;
			ps.close();
			DbConnect.close();
		}catch(SQLException e){
			System.out.println("Connesione fallita");
			e.printStackTrace();
		}
		return flag;
	}
	
	public boolean updateCategoria(String idArticolo,String categoria){
		DbConnect.connect();
		boolean flag=false;
		try{
			PreparedStatement ps=DbConnect.con.prepareStatement("update articolo set categoria=? where id=?");
			ps.setString(1,categoria);
			ps.setString(2,idArticolo);
			if(ps.executeUpdate()>0) flag=true;
			ps.close();
			DbConnect.close();
		}catch(SQLException e){
			System.out.println("Connesione fallita");
			e.printStackTrace();
		}
		return flag;
	}
	
	public boolean updatePrezzo(String idArticolo,double prezzo){
		DbConnect.connect();
		boolean flag=false;
		try{
			PreparedStatement ps=DbConnect.con.prepareStatement("update articolo set prezzo=? where id=?");
			ps.setDouble(1,prezzo);
			ps.setString(2,idArticolo);
			if(ps.executeUpdate()>0) flag=true;
			ps.close();
			DbConnect.close();
		}catch(SQLException e){
			System.out.println("Connesione fallita");
			e.printStackTrace();
		}
		return flag;
	}
	
	public boolean updateQuantita(String idArticolo,int quantita){
		DbConnect.connect();
		boolean flag=false;
		try{
			PreparedStatement ps=DbConnect.con.prepareStatement("update articolo set quantita=? where id=?");
			ps.setInt(1,quantita);
			ps.setString(2,idArticolo);
			if(ps.executeUpdate()>0) flag=true;
			ps.close();
			DbConnect.close();
		}catch(SQLException e){
			System.out.println("Connesione fallita");
			e.printStackTrace();
		}
		return flag;
	}
	
	public synchronized Articolo doRetrieveByKey(int code,String sesso) throws SQLException {
		DbConnect.connect();

		PreparedStatement preparedStatement = null;

		Articolo bean = new Articolo();

		String selectSQL = "SELECT * FROM " + ManageArticolo.TABLE_NAME + " WHERE idarticolo = ?";

		try {
			preparedStatement = DbConnect.con.prepareStatement(selectSQL);
			preparedStatement.setInt(1,code);
			//preparedStatement.setString(2,sesso);

			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				bean.setidArticolo(rs.getInt("idarticolo"));
				bean.setSesso(sesso);
				bean.setnome(rs.getString("Nome"));
				bean.setquantita(0);
			}
			DbConnect.close();
		} finally {
			try {
				if (preparedStatement != null)
					preparedStatement.close();
			} finally {
				
			}
		}
		return bean;
	}

	public synchronized Collection<Articolo> doRetrieveMen() throws SQLException {
		DbConnect.connect();
		PreparedStatement preparedStatement = null;

		LinkedList<Articolo> products = new LinkedList<Articolo>();

		String selectSQL = "SELECT * FROM " + TABLE_NAME;

		try {
			
			preparedStatement = DbConnect.con.prepareStatement(selectSQL);

			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				Articolo bean = new Articolo();
				bean.setidArticolo(rs.getInt("idarticolo"));
				bean.setSesso("M");
				bean.setnome(rs.getString("Nome"));
				//bean.setQuantity(rs.getInt("PzVenduti"));
				bean.setcategoria(rs.getString("Categoria"));
				products.add(bean);
			}
			DbConnect.close();
		} finally {
			try {
				if (preparedStatement != null)
					preparedStatement.close();
			} finally {
				
			}
		}
		return products;
	}
	public synchronized Collection<Articolo> doRetrieveWomen() throws SQLException {
		DbConnect.connect();
		PreparedStatement preparedStatement = null;

		LinkedList<Articolo> products = new LinkedList<Articolo>();

		String selectSQL = "SELECT * FROM " + TABLE_NAME+" order by idarticolo desc";

		try {
			
			preparedStatement = DbConnect.con.prepareStatement(selectSQL);

			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				Articolo bean = new Articolo();
				bean.setidArticolo(rs.getInt("idarticolo"));
				bean.setSesso("F");
				bean.setnome(rs.getString("Nome"));
				//bean.setQuantity(rs.getInt("PzVenduti"));
				bean.setcategoria(rs.getString("Categoria"));
				products.add(bean);
			}
			DbConnect.close();
		} finally {
			try {
				if (preparedStatement != null)
					preparedStatement.close();
			} finally {
				
			}
		}
		return products;
	}
	public synchronized Collection<Articolo> getCategory(String sex,String category) throws SQLException{
		DbConnect.connect();
		PreparedStatement preparedStatement = null;
		LinkedList<Articolo> products = new LinkedList<Articolo>();
		String selectSQL = "SELECT * FROM " + TABLE_NAME + " where categoria='"+category+"' ;";
        
		try {
			
			preparedStatement = DbConnect.con.prepareStatement(selectSQL);

			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				Articolo bean = new Articolo();
				bean.setidArticolo(rs.getInt("idarticolo"));
				bean.setSesso(sex);
				bean.setnome(rs.getString("Nome"));
				//bean.setQuantity(rs.getInt("PzVenduti"));
				bean.setcategoria(rs.getString("Categoria"));
				products.add(bean);
			}
			DbConnect.close();
		} finally {
			try {
				if (preparedStatement != null)
					preparedStatement.close();
			} finally {
				
			}
		}
		return products;
	}

}