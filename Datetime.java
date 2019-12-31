import java.time.LocalDate;
import java.time.LocalTime;
class Datetime
{
    public static void main(String[] args)
	{
	  LocalDate ld = LocalDate.now();
	  //LocalTime lt = LocalTime.now();
	  System.out.println(ld.getDayOfMonth()+"-"+ld.getMonthValue()+"-"+ld.getYear());
	  //System.out.println(lt.getHour()+":"+lt.getMinute()+":"+lt.getSecond()+":"+lt.getNano());
	  
		}
    }
	