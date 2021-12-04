package RestAssuredAutomation;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import java.util.*;
import org.json.simple.JSONObject;

public class RestAssured_POST {
	
	@Test
	
	public void test_post () {
		
		
		JSONObject obj = new JSONObject();
		
		obj.put("Job Title", "intern");
		obj.put("Job Company Name", "c3 controls");
		obj.put("Job Location", "Beaver");
		obj.put("Job Type", "contract");
		obj.put("Job Posted time", "2 hours ago");
		obj.put("Job Description", "IT work");
		obj.put("Job Id", "2580");
		
		System.out.println(obj);
		
		given().
		header("Content-Type", "application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(obj.toJSONString()).when().post("https://jobs123.herokuapp.com/Jobs").then().log().all();
		
	}


}
