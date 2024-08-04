package test04_filter_stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ScannerTest {
	public static void main(String[] args) {
		
		private static void method2() {
			// 문자 스트림: FileReader, FileWriter
			// 버퍼 기능을 추가해보자: BufferedReader, BufferedWriter
			try(BufferedReader reader = new BufferedReader(new FileReader("big_input.txt"));
				BufferedWriter writer = new BufferedWriter(new FileWriter("big_input_2.txt"));){

				String line; // BufferedReader는 입력을 줄 단위로 받는다.
				while((line=reader.readline())!=null) {
					writer.write(line);
					writer.newLine();
				}
				System.out.println("복사 끝");
			} catch(IOException e) {
						
			}
			
		}
		

	}
}
