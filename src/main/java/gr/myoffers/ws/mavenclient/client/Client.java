/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.myoffers.ws.mavenclient.client;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
//import java.io.BufferedReader;
//import java.io.ByteArrayInputStream;
import java.net.URL;
import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.MalformedURLException;
//import org.apache.http.client.ClientProtocolException;
//import org.jboss.resteasy.client.ClientRequest;
//import org.jboss.resteasy.client.ClientResponse;



/**
 *
 * @author fil
 */
public class Client {
    
public static void main(String[] args) throws JsonParseException, JsonMappingException,IOException
{
            URL jsonURL = new URL("http://localhost:8080/WSoffer/service/getOfferByIdJSON/3");
            ObjectMapper mapper= new ObjectMapper();
            Store store = null;
            store = mapper.readValue(jsonURL, Store.class);
            System.out.println(store.getOffer().getOfferName());
            System.out.println(store.getOffer().getDescr());
            System.out.println(store.getOffer().getPrice());
//    Offer offer;
//	  try {
// 
//		ClientRequest request = new ClientRequest(
//				"http://83.212.101.78:8080/WSoffer/service/getOfferByIdJSON/3");
//		request.accept("application/json");
//		ClientResponse<String> response = request.get(String.class);
// 
////                              Response response = target.request().post(
////					Entity.entity(st, "application/json"));
//                
//                
//		if (response.getStatus() != 200) {
//			throw new RuntimeException("Failed : HTTP error code : "
//				+ response.getStatus());
//		}
// 
//		BufferedReader br = new BufferedReader(new InputStreamReader(
//			new ByteArrayInputStream(response.getEntity().getBytes())));
//                
//		String output;
//		System.out.println("Output from Server .... \n");
//                
//		while ((output = br.readLine()) != null) {
//			System.out.println(output);
//                        ObjectMapper mapper = new ObjectMapper();
////  Offer offer = (Offer)output;
//		}
// 
//	  } catch (ClientProtocolException e) {
// 
//		e.printStackTrace();
// 
//	  } catch (IOException e) {
// 
//		e.printStackTrace();
// 
//	  } catch (Exception e) {
// 
//		e.printStackTrace();
//// 
//	  }
//// 
	}    
    
}
