package mta.qldv.dao.impl;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.web.context.support.XmlWebApplicationContext;

import mta.qldv.dao.TaiKhoanDao;
import mta.qldv.entity.TaiKhoan;

public class TaiKhoanDaoImplTest {
	private static XmlWebApplicationContext context;
	private static TaiKhoanDao taiKhoanDao;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new XmlWebApplicationContext();
		context.setConfigLocation("WEB-INF/applicationContext.xml");
		
		context.refresh();
		taiKhoanDao = (TaiKhoanDao) context.getBean("taiKhoanDao");
	}

	@Test
	public void testGetList() {
		List<TaiKhoan> actual = taiKhoanDao.getList();
		List<TaiKhoan> expected = new ArrayList<>();
		TaiKhoan tp = new TaiKhoan();
		tp.setTenTaiKhoan("MKB");
		tp.setMatKhau("123");
		
		try {
			int size = actual.size();
			for(int i=0; i<size; i++) {
				assertEquals(expected.get(i).getTenTaiKhoan(), actual.get(i).getTenTaiKhoan());
				assertEquals(expected.get(i).getMatKhau(), actual.get(i).getMatKhau());
				
			}
		} catch(Exception e) {
			fail();
		}
	}

	@Test
	public void testCreateAccount() {
		fail("Not yet implemented");
	}

}
