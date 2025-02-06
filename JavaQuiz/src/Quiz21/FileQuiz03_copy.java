package Quiz21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FileQuiz03_copy {
    public static void main(String[] args) {

        String path = "C:\\Users\\user\\Desktop\\course\\java\\workspace\\JavaQuiz\\src\\Quiz21\\2025_01_24_data.csv";
        String outputPath = "C:\\Users\\user\\Desktop\\course\\java\\workspace\\JavaQuiz\\src\\Quiz21\\output_data.csv";
        
        BufferedReader br = null;
        BufferedWriter bw = null;
        
        // Data 객체들을 저장할 리스트
        List<Data> list = new ArrayList<>();
        
        try {
            // BufferedReader로 파일 읽기
            br = new BufferedReader(new FileReader(path));
            String str;
            
            // 한 줄씩 읽으면서 처리
            while( (str = br.readLine()) != null) {
                System.out.println(str); // 파일의 각 줄을 출력
                
                // 데이터를 ,로 분리하여 배열에 저장
                String[] arr = str.split(",");
                
                // 분리된 데이터를 Data 객체로 만들어 리스트에 추가
                if (arr.length == 4) {  // 데이터가 4개로 구성된다고 가정
                    Data data = new Data(arr[0], arr[1], arr[2], arr[3]);
                    list.add(data);
                } else {
                    System.out.println("데이터 형식이 잘못되었습니다.");
                }
            }
            
            // 최종적으로 리스트 내용 출력
            System.out.println("리스트에 저장된 데이터:");
            for (Data data : list) {
                System.out.println(data);
            }
            
            // BufferedWriter로 파일에 쓰기
            bw = new BufferedWriter(new FileWriter(outputPath));
            
            // 리스트에 저장된 데이터를 새로운 파일로 저장
            for (Data data : list) {
                String line = data.getName() + "," + data.getAge() + "," + data.getMail() + "," + data.getTown();
                bw.write(line);
                bw.newLine();  // 줄바꿈
            }
            
            System.out.println("데이터가 성공적으로 " + outputPath + "에 저장되었습니다.");
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (bw != null) {
                    bw.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
