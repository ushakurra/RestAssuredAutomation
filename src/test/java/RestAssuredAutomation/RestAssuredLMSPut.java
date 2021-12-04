package RestAssuredAutomation;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import java.util.*;
import org.json.simple.JSONObject;
public class RestAssuredLMSPut {
	
	 @Test

	    public void test_3() {
	    	
		 JSONObject obj = new JSONObject();
			
			obj.put("programId", "363");
			obj.put("programName", "Peoplesoft HRMS Module");
			
			
			System.out.println(obj);
			
			given().auth().basic("admin","password").
			header("Content-Type", "application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(obj.toJSONString()).when().put("https://lms-program-rest-service.herokuapp.com/programs/363").then().log().all();
          
		}
}
