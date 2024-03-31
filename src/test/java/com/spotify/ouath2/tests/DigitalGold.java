//package com.spotify.ouath2.tests;
//
//import com.spotify.ouath2.api.applicationApi.PlaylistApi;
//import com.spotify.ouath2.pojo.Playlist;
//import io.restassured.response.Response;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import static com.spotify.ouath2.api.Route.*;
//import static com.spotify.ouath2.api.Route.ORDERS;
//
//public class DigitalGold {
//    static String contact="9522442244";
//
//    @Test(priority = 1)
//    public void ChangeTimeInterval(){
//        Playlist requestPlaylist= new Playlist();
//        requestPlaylist.setFirstname("nishath");
//        requestPlaylist.setMiddlename("");
//        requestPlaylist.setLastname("Khanum");
//        requestPlaylist.setType("changeinterval");
//        requestPlaylist.setContact(contact);
//
//        Response response= PlaylistApi.post(requestPlaylist, API + TESTING + DELETEDATA);
//
//        int statusCode=response.getStatusCode();
//        Assert.assertEquals(200,statusCode);
//
//    }
//}
