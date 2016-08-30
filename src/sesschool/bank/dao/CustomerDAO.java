package sesschool.bank.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import sesschool.bank.vo.Customer;

public class CustomerDAO {
	private SqlSessionFactory sqlSessFac = MybatisConfig.getSqlSessionFactory();

	public CustomerDAO() {
	}

	public void insertCustomer(Customer customer) {
		System.out.println("CustomerDAO.insertCustomer(Customer customer)");
		SqlSession sqlSess = sqlSessFac.openSession();
		try {
			sqlSess.insert("cus.insertCus", customer);// insert finnished
			sqlSess.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sqlSess != null)
				sqlSess.close();
		}
	}

	public Customer selectCustomer(String str) {
		System.out.println("DAO.selectCustomer 들어옴");
		Customer result = null;
		SqlSession sqlSess = sqlSessFac.openSession();
		try {
			result = sqlSess.selectOne("cus.selectCus", str); 
//			sqlSess.commit();//셀렉트는 필요없음
		} catch (Exception e) {
			e.printStackTrace(); 
		} finally {
			if (sqlSess != null)
				sqlSess.close();
		}
		return result;
	}
	public Customer selectCustomer2(Customer customer) {
		System.out.println("DAO.selectCustomer2 들어옴" + customer);
		Customer result = null;
		SqlSession sqlSess = sqlSessFac.openSession();
		try {
			result = (Customer)sqlSess.selectOne("cus.selectCus2", customer); 
			System.out.println("mapper결과 : " +result);
//			sqlSess.commit();
		} catch (Exception e) {
			e.printStackTrace(); 
		} finally {
			if (sqlSess != null)
				sqlSess.close();
		}
		return result;

	}
	
	
	public int updateCustomer(Customer customer) {
		int result = 0;
		
		SqlSession sqlSess = sqlSessFac.openSession();
		try{
			System.out.println("DAO : updateCus in     " + customer );
			
			result = sqlSess.update("cus.updateCus", customer);
			System.out.println("DAO : updateCus out    " + result);
			sqlSess.commit();
		}catch (Exception e){
			e.printStackTrace();
		}finally{
			if(sqlSess != null)sqlSess.close();
		}
		
		return result;

	}

	
}
