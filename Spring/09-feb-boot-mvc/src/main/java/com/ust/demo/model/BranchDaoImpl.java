package com.ust.demo.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BranchDaoImpl {

	private Connection getConn() throws SQLException {
//		Driver driver=new com.mysql.jdbc.Driver();
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/ust45","root","");
	}
	
	public int create(Branch branch) throws SQLException {
		Connection con = getConn();
		PreparedStatement st = con.prepareStatement("INSERT INTO BRANCH VALUES(?,?,?)");
		st.setString(1, branch.getBid());
		st.setString(2, branch.getBname());
		st.setString(3, branch.getBcity());
		int no=st.executeUpdate();
		return no;
	}
	public List<Branch> read() throws SQLException {
		Connection con = getConn();
		ResultSet rs = con.createStatement().executeQuery("SELECT * FROM BRANCH");
		List<Branch> branches=new ArrayList();
		while(rs.next())
		{
			Branch branch=new Branch(rs.getString(1), rs.getString(2), rs.getString(3));
			branches.add(branch);
		}
		return branches;
	}
	public Branch read(String bid) throws SQLException {
		Connection con = getConn();
		PreparedStatement st = con.prepareStatement("SELECT * FROM BRANCH WHERE BID=?");
		st.setString(1, bid);
		ResultSet rs = st.executeQuery();
		Branch branch=null;
		if(rs.next())
		{
			branch=new Branch(rs.getString(1), rs.getString(2), rs.getString(3));
		}
		return branch;
	}
	public int update(Branch branch) throws SQLException {
		Connection con = getConn();
		PreparedStatement st = con.prepareStatement("UPDATE BRANCH SET bname=?, bcity=? where bid=?");
		st.setString(1, branch.getBname());
		st.setString(2, branch.getBcity());
		st.setString(3, branch.getBid());
		int no=st.executeUpdate();
		return no;
	}
	public int delete(String bid) throws SQLException {
		Connection con = getConn();
		PreparedStatement st = con.prepareStatement("DELETE FROM BRANCH where bid=?");
		st.setString(1, bid);
		int no=st.executeUpdate();
		return no;
	}
	
}
