package RestAssuredAutomation;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class RestAssured_DELETE {
@Test
	
	public void test_delete() 

{
	JSONObject obj = new JSONObject();
	
	obj.put("Job Id", "2580");	
	
	System.out.println(obj);
	
	
	//given().delete("https://jobs123.herokuapp.com/Jobs").then().log().all();
	given().
	header("Content-Type", "application/json").
	contentType(ContentType.JSON).
	accept(ContentType.JSON).
	body(obj.toJSONString()).when().delete("https://jobs123.herokuapp.com/Jobs").then().log().all();
	}


}
