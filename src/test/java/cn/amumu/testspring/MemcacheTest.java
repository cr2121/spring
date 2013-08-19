package cn.amumu.testspring;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.PushbackInputStream;
import java.net.URISyntaxException;
import java.util.concurrent.TimeoutException;

import net.rubyeye.xmemcached.KeyIterator;
import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.MemcachedClientBuilder;
import net.rubyeye.xmemcached.XMemcachedClientBuilder;
import net.rubyeye.xmemcached.exception.MemcachedException;
import net.rubyeye.xmemcached.utils.AddrUtil;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import cn.amumu.spring.orm.Student;

public class MemcacheTest {
	
	private static int a = 12;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		MemcachedClientBuilder builder = new XMemcachedClientBuilder(AddrUtil.getAddresses("192.168.2.208:11211"));
		try {
			MemcachedClient mc = builder.build();
			mc.set("Hello", 0, "HELLO,memcached");
			String value = mc.get("Hello");
			System.out.println("Hello=" + value);

			KeyIterator it = mc.getKeyIterator(AddrUtil.getOneAddress("192.168.2.208:11211"));
			while (it.hasNext()) {
				System.out.println(it.next());
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TimeoutException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (MemcachedException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetContent() throws Exception {

		String str = "if ( a == 10) a = 0;\n";
		byte[] byt = str.getBytes();
		byte[] byt2 = "a".getBytes();
		int c;

		ByteArrayInputStream bais = new ByteArrayInputStream(byt);
		PushbackInputStream pbis = new PushbackInputStream(bais);

		while ((c = pbis.read()) != -1) {
			pbis.unread(byt2);
			System.out.print((char) c);

		}
	}

	@Test
	public void testSerializable() throws Exception {
		String objectFilePath = "c:\\student";
		
		Student student = new Student();
		student.setAge(25);
		student.setName("hot");
		
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(objectFilePath));
		os.writeObject(student);
		os.close();
		
		ObjectInputStream is = new ObjectInputStream(new FileInputStream(objectFilePath));
		Student stu = (Student) is.readObject();
		is.close();
		
		System.out.println(stu);
		System.out.println(stu == student);
	}
	
	@Test public void swapTest() {
		System.out.println(3%4);
	}
	
	public void swap(Integer a, Integer b){
		
	}
	
	class dssf {
		int c = a;
	}
}
