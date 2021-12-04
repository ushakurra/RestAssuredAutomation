package RestAssuredAutomation;

			import org.testng.annotations.Test;
			import static io.restassured.RestAssured.*;
			import static org.hamcrest.Matchers.*;

public class RestAssured_Get {
	
    @Test

    public void test_1() {
    	
    given().get("https://jobs123.herokuapp.com/Jobs").then().statusCode(200).log().all();
  //  given().get("https://jobs123.herokuapp.com/Jobs").then().statusCode(200).body("data.Job Id[0]", equalTo("1001")).log().all();
  //  given().get("https://lms-program-rest-service.herokuapp.com/swagger-ui/").then().statusCode(200).log().all();	     

	
    }
}








