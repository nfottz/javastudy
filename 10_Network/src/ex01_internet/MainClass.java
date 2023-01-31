package ex01_internet;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class MainClass {

	/*
	 	URL
	 	1. Uniform Resource Locator
	 	2. 정형화된 자원의 경로
	 	3. 실제로는 웹 주소를 의미한다.
	 	4. 구성
	 		프로토콜://		호스트	   /  서버경로  ? 파라미터=값&파라미터=값&...
	 		   https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=삼성전자
	 		1) 프로토콜 : 통신규약, https(secure + http : 보안 처리된 하이퍼텍스트 전송 프로토콜)
	 		2) 호스트 	: 서버의 대표 주소
	 		3) 서버경로 : URL Mapping(URL Pattern)
	 		4) 파라미터 : 서버로 보내는 데이터를 의미(변수라고 생각하면 된다.)
	 */
	
	public static void ex01() {
		
		String apiURL = "https://search.naver.com/search.naver?query=삼성전자";
		URL url = null;
		
		try {
			
			url = new URL(apiURL);	// 반드시 예외 처리가 필요한 코드
			
			System.out.println("프로토콜 : " + url.getProtocol());
			System.out.println("호스트   : " + url.getHost());
			System.out.println("파라미터 : " + url.getQuery());
			
		} catch(MalformedURLException e) {
			System.out.println("apiURL 주소 오류");
		}
		
	}
	
	public static void ex02() {
		
		// 웹 접속을 담당하는 HttpURLCOnnection
		
		String apiURL = "https://www.naver.com";
		URL url = null;
		HttpURLConnection con = null;
		
		try {
			
			url = new URL(apiURL);	// MalformedURLException 처리 필요
			con = (HttpURLConnection)url.openConnection();	// IOException 처리 필요
			
			/* 
				HTTP 응답 코드 공부하기
			 	1. 200 : 정상
			 	2. 40X : 잘못된 요청(사용자가 잘못하였음)
				3. 50X : 서버측 오류(서버가 잘못하였음)
			*/
			System.out.println("정상 응답 : " + HttpURLConnection.HTTP_OK);
			System.out.println("Not Found : " + HttpURLConnection.HTTP_NOT_FOUND);
			System.out.println("Internal Error : " + HttpURLConnection.HTTP_INTERNAL_ERROR);
			
			// apiURL 접속 확인
			int responseCode = con.getResponseCode();
			if(responseCode == 200) {
				System.out.println(apiURL + " 접속 완료");
			}
			
			// 요청 방식(요청 메소드)
			String requestMethod = con.getRequestMethod();
			System.out.println("요청 방식 : " + requestMethod);
			
			// 컨텐트 타입
			String contentType = con.getContentType();
			System.out.println("컨텐트 타입 : " + contentType);
			
			// 요청 헤더
			String userAgent = con.getRequestProperty("User-Agent");
			System.out.println("User-Agent : " + userAgent);
			
			String referer = con.getRequestProperty("Referer");
			System.out.println("Referer : " + referer);	// 이전 주소가 나옴
			
			// 접속 종료
			con.disconnect();
			
		} catch(MalformedURLException e) {
			System.out.println("apiURL 주소 오류");
		} catch(IOException e) {
			System.out.println("apiURL 접속 오류");
		}
		
	}
	
	public static void ex03() {
		
		String apiURL = "https://t1.daumcdn.net/daumtop_chanel/op/20200723055344399.png";
		URL url = null;
		HttpURLConnection con = null;
		
		InputStream in = null;			// Daum 로고를 읽어들이는 입력 스트림
		FileOutputStream out = null;	// C:\storage\daum.png로 내보내는 출력 스트림
		
		try {
			
			url = new URL(apiURL);
			con = (HttpURLConnection)url.openConnection();
			
			int responseCode = con.getResponseCode();
			if(responseCode == HttpURLConnection.HTTP_OK) {
				
				in = con.getInputStream();
				out = new FileOutputStream("C:" + File.separator + "storage" + File.separator + "daum.png");
				byte[] b = new byte[10];
				int readByte = 0;
				
				while((readByte = in.read(b)) != -1) {
					out.write(b, 0, readByte);
				}
				
				System.out.println("다운로드 완료");
				
				out.close();
				in.close();
				con.disconnect();
				
			}
			
		} catch(MalformedURLException e) {
			System.out.println("apiURL 주소 오류");
		} catch (IOException e) {
			// 접속 실패 또는 스트링 관련 오류
			e.printStackTrace();
		}
		
	}
	
	public static void ex03_pr() {
		
		String apiURL = "https://brunch.co.kr/@@52g1/159";
		URL url = null;
		HttpURLConnection con = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		File file = new File("C:" + File.separator + "storage" + File.separator + "practice.txt");
		
		try {
			url = new URL(apiURL);
			con = (HttpURLConnection)url.openConnection();
			
			int responseCode = con.getResponseCode();
			if(responseCode == 200) {
				
				bis = new BufferedInputStream(con.getInputStream());
				bos = new BufferedOutputStream(new FileOutputStream(file));

				byte[] b = new byte[20];
				int readByte = 0;
				
				while((readByte = bis.read(b)) != -1) {
					
					bos.write(b, 0, readByte);
					
				}

				System.out.println("다운로드 완료");
				
				bis.close();
				bos.close();
				con.disconnect();
				
			}
			
		} catch(MalformedURLException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void ex04() {
		
		String apiURL = "https://gdlms.cafe24.com/uflist/curri/10004/bbs/68_63d8848f7d506.txt";
		URL url = null;
		HttpURLConnection con = null;
		
		InputStreamReader reader = null;
		FileWriter writer = null;
		File file = new File("C:" + File.separator + "storage", "다운로드문서.txt");
		
		try {
			
			url = new URL(apiURL);
			con = (HttpURLConnection)url.openConnection();
			
			int responseCode = con.getResponseCode();
			if(responseCode == HttpURLConnection.HTTP_OK) {
				reader = new InputStreamReader(con.getInputStream());
				
				StringBuilder sb = new StringBuilder();
				char[] cbuf = new char[2];
				int readCount = 0;
				
				while((readCount = reader.read(cbuf)) != -1) {
					sb.append(cbuf, 0, readCount);
				}
				
				writer = new FileWriter(file);
				writer.write(sb.toString());
				
				writer.close();
				reader.close();
				con.disconnect();
				
				System.out.println("다운로드 완료");
				
			} else {
				reader = new InputStreamReader(con.getErrorStream());
			}
			
		} catch(MalformedURLException e) {
			System.out.println("apiURL 주소 오류");
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

	public static void ex04_pr() {
		
		String apiURL = "https://gdlms.cafe24.com/uflist/curri/10004/bbs/68_63d8848f7d506.txt";
		URL url = null;
		HttpURLConnection con = null;
		
		BufferedReader reader = null;
		BufferedWriter writer = null;
		File file = null;
		
		try {
			
			url = new URL(apiURL);
			con = (HttpURLConnection)url.openConnection();
			
			String message = null;
			int responseCode = con.getResponseCode();
			if(responseCode == HttpURLConnection.HTTP_OK) {
				reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
				file = new File("C:" + File.separator + "storage", "다운로드문서_버퍼.txt");
				message = "다운로드 성공";
				
//				StringBuilder sb = new StringBuilder();
//				
//				char[] cbuf = new char[2];
//				int readCount = 0;
//				
//				while((readCount = reader.read(cbuf)) != -1) {
//					sb.append(cbuf, 0, readCount);
//				}

				String str = null;
				writer = new BufferedWriter(new FileWriter(file));
				while((str = reader.readLine()) != null) {
					writer.write(str);
				}
				
//				writer.write(sb.toString());
				
				writer.close();
				reader.close();
				con.disconnect();

				
			} else {
				reader = new BufferedReader(new InputStreamReader(con.getErrorStream()));
				message = "다운로드 실패";
			}
			
			System.out.println(message);
			
		} catch(MalformedURLException e) {
			System.out.println("apiURL 주소 오류");
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void ex05() {
		
		 /*
		  	인코딩(암호화) : 원본 데이터를 UTF-8 방식으로 암호화
		  	디코딩(복호화) : UTF-8 방식으로 암호화된 데이터를 복원
		  */
		
		String data = "한글 english 12345 !@#$+-";
		
		try {
			
			// 인코딩
			String encodeData = URLEncoder.encode(data, "UTF-8");
			System.out.println(encodeData);
			
			// 디코딩
			String decodeData = URLDecoder.decode(encodeData, "UTF-8");
			System.out.println(decodeData);
			
		} catch(UnsupportedEncodingException e) {
			System.out.println("인코딩 실패");
		}
		
	}
	
	public static void main(String[] args) {
		ex05();
	}
	
}
