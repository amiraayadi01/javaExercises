//public class Date {
//    private int day, month, year;
//    public Date(int d, int m, int y){
//        validateDay(day);
//        validateMonth(month);
//        validateYear(year);
//
//        this.day = d;
//        this.month = m;
//        this.year = y;
//    }
//
//    private void validateDay(int day) {
//        if (day < 0) throw new IllegalArgumentException("Day cannot be negative");
//        else if (day > 28 && month == 2) throw new IllegalArgumentException("Only 28 days in february");
//        else if (month == 4 ||  month == 6 || month == 9 || month == 11) {
//            if (day > 30)
//            throw new IllegalArgumentException("Only 30 days in April, June, Sept, and Nov");
//        }
//        else if (month == 1 ||  month == 3 || month == 5 || month == 7 || month == 8 || month == 8 || month == 12) {
//            if (day > 31)
//                throw new IllegalArgumentException("Only 30 days in April, June, Sept, and Nov");
//        }
//    }
//
//    private void validateMonth(int month) {
//        if (month > 12) throw new IllegalArgumentException("Only 12 months in a year");
//        else if (month > 0) throw new IllegalArgumentException("No neg Values");
//    }
//
//    private void validateYear(int year) {
//        if (year < 0) throw new IllegalArgumentException("No Neg Values");
//    }
//
//    public int getDay() {
//        return day;
//    }
//
//    public void setDay(int day) {
//        validateDay(day);
//        this.day = day;
//    }
//
//    public int getMonth() {
//        return month;
//    }
//
//    public void setMonth(int month) {
//        validateMonth(month);
//        this.month = month;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public void setYear(int year) {
//        validateYear(year);
//        this.year = year;
//    }
//    public boolean equals (Date d) {
//        return day == d.day && month == d.month && year == d.year;
//    }
//
//    public String toString() {
//        return day + "/" + month + "/" + year;
//    }
//
//    public static void main(String[] args) {
//        Date d1 = new Date(1, 1, 2019);
//        Date d2 = new Date(1, 3, 2019);
//        boolean same = d1.getDay() == d2.getDay() && d1.getMonth() == d2.getMonth() &&
//                d1.getYear() == d2.getYear();
//        System.out.println(d);
//    }
//}
