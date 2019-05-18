import java.util.Calendar;

public class Student extends Score{
    String name;
    String num;
    String detail;
    String subject;
    String score;

    Student(String name, int num){
        Calendar date = Calendar.getInstance();
        this.name = name;
        this.num = date.get(Calendar.YEAR) + String.format("%04d", num + 1);
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
