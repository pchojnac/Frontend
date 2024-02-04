package REST_API_Automation;

import org.junit.Assert;
import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TC1 {

    @Test
    public void TC1Test(){
        Response response = RestAssured.get("https://jsonplaceholder.typicode.com/posts");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);

        String titleFields = response.jsonPath().getString("title");
        Assert.assertTrue("Fields title are null", titleFields!=null);

        String bodyFields = response.jsonPath().getString("body");
        Assert.assertTrue("Fields body are null", bodyFields!=null);
    }
}
