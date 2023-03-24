package dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import dto.ParkinglotDTO;

public class ParkinglotDAO {

	private static ParkinglotDAO dao = new ParkinglotDAO();
	private ParkinglotDAO() {};
	public static ParkinglotDAO getInstance() {
		return dao;
	}
	
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private String sql;
	private int res;
	
	private Connection getConnection() {
		
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			Properties p = new Properties();
			p.load(new BufferedReader(new FileReader("db.properties")));
			
			con = DriverManager.getConnection(p.getProperty("url"), p);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
		
	}
	
	private void close() {
		
		try {
			if(rs != null) rs.close();
			if(ps != null) ps.close();
			if(con != null) con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public int insertCar(ParkinglotDTO car) {
		
		try {
			con = getConnection();
			sql = "INSERT INTO PARKINGLOT_TBL(CAR_NO, MODEL)";
			sql += " VALUES (?, ?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, car.getCarNo());
			ps.setString(2, car.getModel());
			res = ps.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return res;
		
	}
	
	public int deleteCar(String carNo) {
		
		try {
			
			con = getConnection();
			sql = "DELETE FROM PARKINGLOT_TBL WHERE CAR_NO = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, carNo);
			res = ps.executeUpdate();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return res;
		
	}
	
	public List<ParkinglotDTO> selectCarByCarNo(String carNo){
		
		List<ParkinglotDTO> carList = new ArrayList<ParkinglotDTO>();
		
		try {
			con = getConnection();
			sql = "SELECT CAR_NO, MODEL";
			sql += " FROM PARKINGLOT_TBL WHERE CAR_NO = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, carNo);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				ParkinglotDTO car = new ParkinglotDTO();
				car.setCarNo(rs.getString("CAR_NO"));
				car.setModel(rs.getString("MODEL"));
				
				carList.add(car);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return carList;
	}
	
	public List<ParkinglotDTO> selectAllCars(){
		
		List<ParkinglotDTO> carList = new ArrayList<ParkinglotDTO>();
		
		try {
			con = getConnection();
			sql = "SELECT CAR_NO, MODEL";
			sql += " FROM PARKINGLOT_TBL";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				ParkinglotDTO car = new ParkinglotDTO();
				car.setCarNo(rs.getString("CAR_NO"));
				car.setModel(rs.getString("MODEL"));
				carList.add(car);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return carList;
	}
}
