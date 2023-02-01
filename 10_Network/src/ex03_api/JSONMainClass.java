package ex03_api;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;


public class JSONMainClass {

	public static void ex01() {
		
		String serviceKey = "GxglCuHtwp4CJcuT52KlHO7b6Wbrih22bXKzL4adhI7UbMQt9zCNMnoyqziFiAmTxpxMcsGIbqnduYKgPQdtYg==";
		String apiURL = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty";
		URL url = null;
		HttpURLConnection con = null;
		BufferedReader reader = null;
		
		try {
			
			String sidoName = "서울";
			StringBuilder sb = new StringBuilder();
			sb.append(apiURL);
			sb.append("?serviceKey=" + URLEncoder.encode(serviceKey, "UTF-8"));
			sb.append("&returnType=json");
			sb.append("&sidoName=" + URLEncoder.encode(sidoName, "UTF-8"));
			
			url = new URL(sb.toString());
			con = (HttpURLConnection)url.openConnection();
			
			con.setRequestMethod("GET");
			con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
			
			if(con.getResponseCode() == HttpURLConnection.HTTP_OK) {
				reader = new BufferedReader(new InputStreamReader(con.getInputStream()));	
			} else {
				reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			
			String line = null;
			StringBuilder sbLine = new StringBuilder();
			while((line = reader.readLine()) != null) {
				sbLine.append(line);
			}
			
			reader.close();
			con.disconnect();
			
			System.out.println(sbLine.toString());
			
			JSONObject obj = new JSONObject(sbLine.toString());
			JSONObject body = obj.getJSONObject("response").getJSONObject("body");
			JSONArray items = body.getJSONArray("items");
			for(int i = 0; i < items.length(); i++) {
				JSONObject item = items.getJSONObject(i);
				String stationName = item.getString("stationName");
				String pm10Value = item.getString("pm10Value");
				String o3Value = item.getString("o3Value");
				System.out.println(stationName + " : 미세먼지 - " + pm10Value +", 오존농도 - " + o3Value);
			}
//			System.out.println(items);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void ex02() {
		
		String serviceKey = "GxglCuHtwp4CJcuT52KlHO7b6Wbrih22bXKzL4adhI7UbMQt9zCNMnoyqziFiAmTxpxMcsGIbqnduYKgPQdtYg==";
		String apiURL = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMinuDustWeekFrcstDspth";
		URL url = null;
		HttpURLConnection con = null;
		BufferedReader reader = null;
		
		try {
			
			apiURL += "?serviceKey=" + URLEncoder.encode(serviceKey, "UTF-8");
			apiURL += "&returnType=json";
			apiURL += "&searchDate=2023-01-30";
			url = new URL(apiURL);
			con = (HttpURLConnection)url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
			
			if(con.getResponseCode() == HttpURLConnection.HTTP_OK) {
				reader = new BufferedReader(new InputStreamReader(con.getInputStream()));	
			} else {
				reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			
			String line = null;
			StringBuilder sbLine = new StringBuilder();
			while((line = reader.readLine()) != null) {
				sbLine.append(line);
			}
			
			reader.close();
			con.disconnect();
			
			JSONArray items = new JSONObject(sbLine.toString())
								.getJSONObject("response")
								.getJSONObject("body")
								.getJSONArray("items");

			for(int i = 0, length = items.length(); i < length; i++) {
				JSONObject item = items.getJSONObject(i);
				System.out.println(item.getString("frcstOneDt") + " -- " + item.getString("frcstOneCn"));
				System.out.println(item.getString("frcstTwoDt") + " -- " + item.getString("frcstTwoCn"));
				System.out.println(item.getString("frcstThreeDt") + " -- " + item.getString("frcstThreeCn"));
				System.out.println(item.getString("frcstFourDt") + " -- " + item.getString("frcstFourCn"));
			}
			
			//			JSONObject item = items.getJSONObject(0);
//			String[] count = {"One", "Two", "Three", "Four"};		
//			for(int i = 0; i < 4; i++) {
//				System.out.println("----" + (i + 1) + "일차 예보 ----");
//				System.out.println("날짜 : " + item.getString("frcst"+count[i]+"Dt"));
//				System.out.println("예보 : " + item.getString("frcst"+count[i]+"Cn"));
//			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		ex02();
	}
	
}
