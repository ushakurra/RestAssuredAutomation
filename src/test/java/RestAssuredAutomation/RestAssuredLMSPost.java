package RestAssuredAutomation;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import java.util.*;
import org.json.simple.JSONObject;
public class RestAssuredLMSPost {
	
	 @Test

	    public void test_2() {
	    	
		 JSONObject obj = new JSONObject();
			
			obj.put("programId", "999");
			obj.put("programName", "Peoplesoft");
			obj.put("programDescription", "ERP Package");
			obj.put("online", "false");
			
			
			System.out.println(obj);
			
			given().auth().basic("admin","password").
			header("Content-Type", "application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(obj.toJSONString()).when().post("https://lms-program-rest-service.herokuapp.com/programs").then().log().all();
          
		}
}
