package api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;


public class ApiMain {

	public static void main(String[] args) {
		
		String serviceKey = "bEQBRPHjt0tZrc7EsL0T8usfsZ1+wT+5jqamBef/ErC/5ZO6N7nYdRmrwR91bh5d3I1AQeY5qdbJOF6Kv0U1CQ==";
		String apiURL = "http://apis.data.go.kr/B552061/AccidentDeath/getRestTrafficAccidentDeath";
		URL url = null;
		HttpURLConnection con = null;
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		try {
		
//			String siDo = "1100";
//			String guGun = "1125";
			StringBuilder sb = new StringBuilder();
			sb.append(apiURL);
			sb.append("?ServiceKey=" + URLEncoder.encode(serviceKey, "UTF-8"));
			sb.append("&searchYear=2021");
			sb.append("&siDo=1100");
			sb.append("&guGun=1125");
			sb.append("&type=json");
			sb.append("&numOfRows=10");
			sb.append("&pageNo=1");
			
			url = new URL(sb.toString());
			con = (HttpURLConnection) url.openConnection();
			
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
			
			JSONObject obj = new JSONObject(sbLine.toString());
			JSONArray items = obj.getJSONObject("items").getJSONArray("item");
			List<Accident> list = new ArrayList<Accident>();
			StringBuilder print = new StringBuilder();
			String[] dayStr = {"일", "월", "화", "수","목","금","토"};
			File file = new File("accident.txt");
			writer = new BufferedWriter(new FileWriter(file));
			
			for(int i = 0, length = items.length(); i < length; i++) {
				JSONObject item = items.getJSONObject(i);
				Accident acc = new Accident();
				acc.setOccrrncDt(item.getString("occrrnc_dt"));
				acc.setOccrrncDayCd(item.getString("occrrnc_day_cd"));
				acc.setDthDnvCnt(item.getInt("dth_dnv_cnt"));
				acc.setInjpsnCnt(item.getInt("injpsn_cnt"));
				list.add(acc);
				
				print.append("발생일자 " + item.getString("occrrnc_dt") 
				+ " " + dayStr[Integer.parseInt(item.getString("occrrnc_day_cd")) -1] + "요일, "
				+ "사망자수 " + item.getInt("dth_dnv_cnt") + "명, "
				+ "부상자수 " + item.getInt("injpsn_cnt") + "명" + "\n");
			}
			
			writer.write(print.toString());	
			writer.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
