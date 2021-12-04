package RestAssuredAutomation;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class RestAssured_PUT {

@Test
	
	public void test_put () {
		
		
		JSONObject obj = new JSONObject();
		
		obj.put("Job Id", "2580");
		obj.put("Job Company Name", "c3 controls llc usha test");
		
		
		
		System.out.println(obj);
		
		given().
		header("Content-Type", "application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(obj.toJSONString()).when().put("https://jobs123.herokuapp.com/Jobs").then().log().all();
		
	}

	
}
