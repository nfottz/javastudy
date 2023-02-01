package ex03_api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class XMLMainClass {

	
	public static void ex01() {
		
		/*
		 	한국공항공사_항공기 운항정보 : 공항 코드 정보
		 	1. 서비스 URL : http://openapi.airport.co.kr/service/rest/AirportCodeList/getAirportCodeList
		 	2. 요청변수(Request Parameter)
		 		1) ServiceKey : 인증키
		 */
		
		String serviceKey = "GxglCuHtwp4CJcuT52KlHO7b6Wbrih22bXKzL4adhI7UbMQt9zCNMnoyqziFiAmTxpxMcsGIbqnduYKgPQdtYg==";
		String apiURL = "http://openapi.airport.co.kr/service/rest/AirportCodeList/getAirportCodeList";
		URL url = null;
		HttpURLConnection con = null;
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		try {
			apiURL += "?serviceKey=" + URLEncoder.encode(serviceKey, "UTF-8");
			url = new URL(apiURL);
			con = (HttpURLConnection)url.openConnection();
			
			con.setRequestMethod("GET");	// 요청메소드 지정 - GET : 주소창 이용하는 방법
			con.setRequestProperty("Content-Type", "application/xml; charset=UTF-8");
			
			int responseCode = con.getResponseCode();
			if(responseCode == 200) {	// 200 : HttpURLConnection.HTTP_OK
				reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			} else {
				reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			
			String line = null;
			StringBuilder sb = new StringBuilder();
			while((line = reader.readLine()) != null) {
				sb.append(line);
			}
			
			reader.close();
			con.disconnect();
			
			File file = new File("C:" + File.separator + "storage", "공항코드정보.xml");
			writer = new BufferedWriter(new FileWriter(file));
			writer.write(sb.toString());
			writer.close();
			
			System.out.println("공항코드정보.xml이 생성되었습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		} catch(UnsupportedEncodingException e) {	// URLEncoder
//			e.printStackTrace();
//		} catch(MalformedURLException e) {		// URL
//			e.printStackTrace();
//		} catch(IOException e) {	// openConnection
//			e.printStackTrace();
//		}
		
	}
	
	public static void ex02() {

		/*
	 	한국공항공사_항공기 운항정보 : 국제선 운항 스케줄
	 	1. 서비스 URL : http://openapi.airport.co.kr/service/rest/AirportCodeList/getAirportCodeList
	 	2. 요청변수(Request Parameter)
	 		1) serviceKey : 인증키
	 		2) pageNo : 페이지 번호
	 		3) schDate : 검색일자
	 		4) schDeptCityCode : 출발도시코드
	 		5) schArrvCityCode : 도착도시코드
	 */
		
		String serviceKey = "GxglCuHtwp4CJcuT52KlHO7b6Wbrih22bXKzL4adhI7UbMQt9zCNMnoyqziFiAmTxpxMcsGIbqnduYKgPQdtYg==";
		String apiURL = "http://openapi.airport.co.kr/service/rest/FlightScheduleList/getIflightScheduleList";
		URL url = null;
		HttpURLConnection con = null;
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		try {
			
			apiURL += "?serviceKey=" + URLEncoder.encode(serviceKey, "UTF-8");
			apiURL += "&pageNo=" + "1";
			apiURL += "&schDate=" + "20230201";
			apiURL += "&schDeptCityCode=" + "ICN";
			apiURL += "&schArrvCityCode=" + "JFK";
			url = new URL(apiURL);
			con = (HttpURLConnection)url.openConnection();
			
			con.setRequestMethod("GET");	// 요청메소드 지정 - GET : 주소창 이용하는 방법
			con.setRequestProperty("Content-Type", "application/xml; charset=UTF-8");
			
			int responseCode = con.getResponseCode();
			if(responseCode == 200) {	// 200 : HttpURLConnection.HTTP_OK
				reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			} else {
				reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			
			String line = null;
			StringBuilder sb = new StringBuilder();
			while((line = reader.readLine()) != null) {
				sb.append(line);
			}
			
			reader.close();
			con.disconnect();
			
			File file = new File("C:" + File.separator + "storage", "국제선운항스케줄.xml");
			writer = new BufferedWriter(new FileWriter(file));
			writer.write(sb.toString());
			writer.close();
			
			System.out.println("국제선운항스케줄.xml이 생성되었습니다.");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		ex02();
	}
	
}
