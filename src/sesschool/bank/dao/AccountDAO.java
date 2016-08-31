package sesschool.bank.dao;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.jasper.tagplugins.jstl.core.ForEach;

import sesschool.bank.vo.Account;

public class AccountDAO {
	private SqlSessionFactory sqlSessFac = MybatisConfig.getSqlSessionFactory();
	private SqlSession ss; 
	
	
	public AccountDAO() {
		
		
	}
	
	
	public void insertAccount(Account account) {
		System.out.println("AccountDAO.insertAccount(Account account)");
		ss = sqlSessFac.openSession(); 
		try{
			System.out.println(account);
		ss.insert("acc.insertAccount", account); 
		ss.commit();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(ss!=null)ss.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		}

	public Account searchAccount(String str) {
		System.out.println("DAO.searchAccount 들어옴");
		Account result = null;
		
		return result;
	}
	
	
	public List<Account> getAccountList(String str){
		System.out.println("DAO.getAccountList 들어옴");
		List<Account> result = null; 
		ss = sqlSessFac.openSession(); 
		try{
		result = (List) ss.selectList("acc.selectAccount2", str); 
//		ss.commit();//셀렉트는 필요없음
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(ss!=null)ss.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		return result;
		
	}
	
/*	
 	public Account selectAccount2(Account account) {
		System.out.println("DAO.selectAccount2 들어옴" + account);
		Account result = null;
		
		return result;

	}
*/	
	
	public int updateAccount(Account account) {
		System.out.println("AccountDAO.updateAccount() : "+ account );
		int result = 0;
		ss = sqlSessFac.openSession(); 
		try{
		result = ss.update("acc.updateAccount", account); 
		ss.commit();//셀렉트는 필요없음
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(ss!=null)ss.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		
		
		return result;

	}

	
}
