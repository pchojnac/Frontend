package REST_API_Automation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

public class TC2 {

    @Test
    public void TC2Test(){
        Response response = RestAssured.get("https://jsonplaceholder.typicode.com/posts/1");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);

        int idResponse = response.jsonPath().getInt("id");
        Assert.assertEquals(idResponse, 1);
    }
}
