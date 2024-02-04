package REST_API_Automation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

public class TC3 {

    @Test
    public void TC3Test(){
        JSONObject requestParams = new JSONObject();
        requestParams.put("title", "this is title");
        requestParams.put("body", "this is body");
        requestParams.put("userId", "this is user id");

        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        request.body(requestParams.toString());

        Response response = request.post("https://jsonplaceholder.typicode.com/posts");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 201);
    }
}
