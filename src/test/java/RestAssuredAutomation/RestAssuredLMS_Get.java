package RestAssuredAutomation;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class RestAssuredLMS_Get {
	
	 @Test

	    public void test_1() {
	    	
	   // given().get("https://lms-program-rest-service.herokuapp.com/programs").then().log().all();
          
		 given().auth().basic("admin","password").get("https://lms-program-rest-service.herokuapp.com/programs").then().log().all();
}
}
