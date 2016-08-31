package sesschool.bank.dao;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.jasper.tagplugins.jstl.core.ForEach;

import sesschool.bank.vo.Account;
import sesschool.bank.vo.Board;

public class BoardDAO {
	private SqlSessionFactory sqlSessFac = MybatisConfig.getSqlSessionFactory();
	private SqlSession ss; 
	
	
	public BoardDAO() {
		
		
	}
	
	public void insertBoard(Board board){
		
	}
	public int getTotal(String st, String end){
		return 0;
		
	} 
	public List<Board> listBoard(String st,String ed, int fir,int last){
		return null;
		
	}
	public Board getBoard(int data){
		return null;
		
	}
	public int deleteBoard(int data){
		return data;
		
	}
	public int insertReply(Board board){
		return 0;
		
	}
	
	public int updateBoard(Board board){
		return 0;
		
	}
	
	
	
}
