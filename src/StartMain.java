import java.util.*;

public class StartMain {
    final static String line = "====================================";
    public static void main(String[] args) {
        HashMap<String, Student> stdList = new HashMap<String, Student>();
        while(true){
            printMain();
            Scanner s = new Scanner(System.in);
            System.out.print("커맨드를 입력해 주세요 : ");
            String cmd = s.nextLine();
            int command;
            try {
                command = Integer.parseInt(cmd) - 1;
            } catch (NumberFormatException e){
                System.out.println("다시 입력하시오");
                continue;
            }

            if(command == 0){
                System.out.print("학생 이름을 입력해 주세요 : ");
                String student = s.nextLine();
                stdAdd(student, stdList);
            } else if(command == 1){
                System.out.print("학생 이름을 입력해 주세요 : ");
                String student = s.nextLine();
                stdRemove(student, stdList);
            } else if(command == 2){
                System.out.print("학생 이름을 입력해 주세요: ");
                String student = s.nextLine();
                stdSearch(student, stdList);
            }
        }
    }

    private static void printMain(){
        String[] mainMenu = {"학생 추가", "학생 삭제", "학생 검색", "과목 검색", "현황 출력", "종료"};
        System.out.println(line);
        for(int i = 0; i < mainMenu.length; i++){
            System.out.println((i+1) + ". " + mainMenu[i]);
        }
        System.out.println(line);
    }

    private static void stdAdd(String student, HashMap<String,Student> stdList){
        stdList.put(student, new Student(student, stdList.size()));
        stdPrint(stdList);
    }

    private static void stdRemove(String student, HashMap stdList){
        stdList.remove(student);
        stdPrint(stdList);
    }

    private static void stdSearch(String student, HashMap<String, Student> stdList){
        Student std = stdList.get(student);
        System.out.println("이름 : " + std.name + "\n학번 : " + std.num);
    }

    private static void stdPrint(HashMap<String,Student> stdList){
        //학생출력
        Set<String> set = stdList.keySet();
        Iterator<String> itr = set.iterator();
        while(itr.hasNext()){
            String key = itr.next();
            Student value = stdList.get(key);
            System.out.println(value.name + " 학번 : " + value.num);
        }
    }
}
