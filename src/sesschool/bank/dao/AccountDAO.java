package sesschool.bank.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

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

	public Account selectAccount(String str) {
		System.out.println("DAO.selectAccount 들어옴");
		Account result = null;
	
		return result;
	}
	
/*	
 	public Account selectAccount2(Account account) {
		System.out.println("DAO.selectAccount2 들어옴" + account);
		Account result = null;
		
		return result;

	}
*/	
	
	public int updateCustomer(Account account) {
		int result = 0;
		
		
		
		return result;

	}

	
}
