//package com.spotify.ouath2.tests;
//
//import com.spotify.ouath2.api.applicationApi.PlaylistApi;
//import com.spotify.ouath2.pojo.Playlist;
//import com.spotify.ouath2.utils.DataLoader;
//import io.restassured.response.Response;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import static com.spotify.ouath2.api.Route.*;
//import static com.spotify.ouath2.api.Route.ORDERS;
//
//public class MfSIP {
//
//    static String sip_id= DataLoader.getInstance().getMfSipID();
//    static int old_id;
//    @Test(priority = 1)
//    public void getSipOldId(){
//        Playlist requestPlaylist= new Playlist();
//        requestPlaylist.setPlan(sip_id);
//
//        Response response= PlaylistApi.post(requestPlaylist, BASE_PATH + MF_PURCHASE);
//        old_id=response.path("old_id");
//
//        int statusCode=response.getStatusCode();
//        Assert.assertEquals(200,statusCode);
//
//    }
//    @Test(priority = 2)
//    public void changeSipStatus(){
//        Playlist requestPlaylist= new Playlist();
//        requestPlaylist.setStatus("SUBMITTED");
//
//        Response response= PlaylistApi.post(requestPlaylist,API + OMS + SIMULATE + ORDERS +"/"+old_id);
//        String message=response.path("message");
//        Assert.assertEquals("order updated successfully",message);
//
//        int statusCode=response.getStatusCode();
//        Assert.assertEquals(200,statusCode);
//    }
//    @Test(priority = 3)
//    public void increaseInstallments(){
//        Playlist requestPlaylist= new Playlist();
//        requestPlaylist.setStatus("SUCCESSFUL");
//
//        Response response= PlaylistApi.post(requestPlaylist,API + OMS + SIMULATE + ORDERS +"/"+old_id);
//        String message=response.path("message");
//        Assert.assertEquals("order updated successfully",message);
//
//        int statusCode=response.getStatusCode();
//        Assert.assertEquals(200,statusCode);
//    }
//}
