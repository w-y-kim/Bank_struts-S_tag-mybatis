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
		Customer result = null;
		SqlSession sqlSess = sqlSessFac.openSession();
		try {
			result = sqlSess.selectOne("cus.selectCus", str); 
			sqlSess.commit();
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

		return result;

	}

	
}
