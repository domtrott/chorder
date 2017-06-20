package rechorder;

import java.io.IOException;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;

public class ReChorder {

	private static final String KEY = "c045b8ee6df977bcda033b8b2f7090ae08b93cd3";
	private static final String URL = "http://api.guitarparty.com/v2/songs/?query=";
	private static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
	
	public static void main(String[] args) {
		refresh();
	}
	
	private static void refresh(){
		try {
			HttpRequestFactory requestFactory = HTTP_TRANSPORT.createRequestFactory();
			HttpRequest request = requestFactory.buildGetRequest(new GenericUrl(URL+"a"));
			HttpHeaders headers = new HttpHeaders();
		    headers.set("Guitarparty-Api-Key", KEY);
		    request.setHeaders(headers);
		    HttpResponse response = request.execute();
		    System.out.println(response.parseAsString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}














