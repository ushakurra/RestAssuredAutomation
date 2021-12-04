package RestAssuredAutomation;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import java.util.*;
import org.json.simple.JSONObject;
public class RestAssuredLMSDelete {
	
	 @Test

	    public void test_4() {
	    	
		 JSONObject obj = new JSONObject();
			
			obj.put("programId", "359");
			
			
			System.out.println(obj);
			
			given().auth().basic("admin","password").
			header("Content-Type", "application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(obj.toJSONString()).when().delete("https://lms-program-rest-service.herokuapp.com/programs/359").then().log().all();
          
		}
}
