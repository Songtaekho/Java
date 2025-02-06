package Quiz21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileQuiz03 {
    public static void main(String[] args) {

        /*
         * youjin choi가 입사한 회사에서는 매일 오전 7시에 연계사에서 
         * 날짜유형의 csv파일을 전송을 해줍니다.
         * 
         * ex) 2025_01_24_data.csv 유형의 파일입니다
         *
         * 그래서 youjin choi는 *매일 아침*마다 csv파일을 읽어서 데이터베이스에 저장하는
         * 프로그램 코드를 만들어야 합니다.
         *
         * 데이터베이스에 저장하려면, List<Data>클래스로 값을 저장해야 합니다.
         * Data클래스는 getter, setter를 가지는 은닉 클래스입니다.
         * 
         * 1. buffered를 사용해서 날짜_data.csv파일을 읽어서 한줄 한줄씩 출력해주세요. 
         * 2. 읽은 데이터를 ,기준으로 분리해서 데이터를 리스트에 잘 정리해서 저장해 주세요.
         */
        
        String path = "C:\\Users\\user\\Desktop\\course\\java\\workspace\\JavaQuiz\\src\\Quiz21\\2025_01_24_data.csv";
        
        BufferedReader br = null;
        
        // Data 객체들을 저장할 리스트
        List<Data> list = new ArrayList<>();
        
        try {
            br = new BufferedReader(new FileReader(path));
            
            br.readLine();
            
            String str;
            
            // 한 줄씩 읽으면서 처리
            while( (str = br.readLine()) != null) {
                System.out.println(str); // 파일의 각 줄을 출력
                
                // 데이터를 ,로 분리하여 배열에 저장
                String[] arr = str.split(",");
                
                // 분리된 데이터를 Data 객체로 만들어 리스트에 추가
                // 예시: arr[0]은 이름, arr[1]은 나이, arr[2]은 이메일, arr[3]은 도시 등
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
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}

