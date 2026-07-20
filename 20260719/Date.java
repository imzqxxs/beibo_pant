public class Date {
    public int year;
    public int month;
    public int day;

    // ⽆参构造⽅法
    public Date(){
        this.year = 1900;
        this.month = 1;
        this.day = 1;
    }

    // 带有三个参数的构造⽅法
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setDate(Date this,int year,int month,int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public static void main(String[] args) {
        Date date=new Date(1900,1,1);
        date.setDate(2026,4,5);
    }
}
