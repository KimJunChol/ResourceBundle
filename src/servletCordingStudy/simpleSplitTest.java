package servletCordingStudy;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

public class simpleSplitTest {

	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("NCMHK2");
		String query = rb.getString("contextPath");
		
		//String query = request.getQueryString();
		
		//HttpServletRequest
		
		String username = "";
		String newQuery = "";
		if (query != null) {
			String[] querySplit = query.split("&");
			for (int i = 0; i < querySplit.length; i++) {
				String key = querySplit[i].split("=")[0];
				String value = querySplit[i].split("=")[1];
				
				if (key.equals("username")) {
					username = value;
					continue;
				} else {
					newQuery += querySplit[i];
				}
				
				if (i < querySplit.length-1) {
					newQuery += "&";
				}
			}
		}
		
		System.out.println(newQuery);
		
		
		
		
		//test2
		System.out.println("######test2#######");
	    String str = "http://example.com/foo/?locale=en_US&xyz";
	    URL url;
		try {
			url = new URL(str);
			System.out.println(url.getQuery());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
