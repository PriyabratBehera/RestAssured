package org.example;

//import com.fasterxml.jackson.databind.util.JSONPObject;
//import io.restassured.RestAssured;
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.http.ContentType;
//import io.restassured.response.Response;
//import io.restassured.response.ResponseBody;
//import io.restassured.specification.RequestSpecification;
//import io.restassured.specification.ResponseSpecification;
//import org.json.simple.JSONObject;
//import pojo.LoginRequest;
//import pojo.LoginResponsePayload;
//import io.restassured.common.mapper.TypeRef;
//
//
//import static io.restassured.RestAssured.given;
//
//public class EcommerceAPIDemo {
//    public static void main(String[] args) {
////        RequestSpecification req=new RequestSpecBuilder().setBaseUri("https://s.finprim.com").setContentType(ContentType.JSON).build();
////        LoginRequest loginRequest=new LoginRequest();
////        loginRequest.setUserEmail("amit@floatr.in");
////        loginRequest.setUserPassword("sbXTnJZ#KyPauq7sa");
////        JSONObject jsonObject=new JSONObject();
////        jsonObject.put("email","amit@floatr.in");
////        jsonObject.put("password","sbXTnJZ#KyPauq7sa");
////
////        RequestSpecification login=given().log().all().spec(req).body();
////        LoginResponsePayload loginResponsePayload=login.when().post("/api/auth/admin/login").then().log().all().extract().response().as(LoginResponsePayload.class);
////        System.out.println(loginResponsePayload.getToken());
//
//        RequestSpecification requestSpecification= RestAssured.given();
//        requestSpecification.baseUri("https://s.finprim.com");
//        requestSpecification.baseUri("/api/auth/admin/login");
//        JSONObject jsonObject=new JSONObject();
//        jsonObject.put("email","amit@floatr.in");
//        jsonObject.put("password","sbXTnJZ#KyPauq7sa");
//        Response response=requestSpecification.contentType(ContentType.JSON).body(jsonObject.toJSONString()).post();
//        ResponseBody responseBody=response.getBody();
//        System.out.println(responseBody.asString());
//
//    }
//
//}
