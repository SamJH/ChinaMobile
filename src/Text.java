import org.hibernate.Session;

import com.oracle.po.Users;
import com.oracle.util.getSession;


public class Text {

	public static void main(String[] args) {
		getSession s = new getSession();
		Session session = s.gets();
		session.beginTransaction();
		Users user = new Users("1001","SamJiang","111",true);
		session.save(user);
		session.getTransaction().commit();
	}
}
