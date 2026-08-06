import java.time.ZonedDateTime;
import java.time.ZoneId;

public class ZonedDateTimes {

	public static void main(String[] args) {
		
		ZonedDateTime obj= ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("India Zone time "+obj);

	}

}
