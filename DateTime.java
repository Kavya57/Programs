import java.time.LocalTime;
import java.time.LocalDate;
class DateTime
{
 public static void main(String[] args)
  {
   LocalDate date=LocalDate.of(90,12,5);
   LocalTime time=LocalTime.now();
   System.out.println(date.getDayOfMonth()+"/"+date.getMonthValue()+"/"+date.getYear());
   System.out.println(time.getHour()+":"+time.getMinute()+":"+time.getSecond());
  }
}
