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
//import static com.spotify.ouath2.api.Route.MF_REDEMPTIONS;
//
//public class MfSWP {
//
//    static String mf_swp_id= DataLoader.getInstance().getMfSwpId();
//    static int old_id;
//    @Test(priority = 1)
//    public void getSWPOldId(){
//        Playlist requestPlaylist= new Playlist();
//        requestPlaylist.setPlan(mf_swp_id);
//        Response response= PlaylistApi.post(requestPlaylist, BASE_PATH + MF_REDEMPTIONS);
//        old_id=response.path("old_id");
//
//        int statusCode=response.getStatusCode();
//        Assert.assertEquals(200,statusCode);
//
//    }
//    @Test(priority = 2)
//    public void checkSWPStatus(){
//        Response response= PlaylistApi.get(BASE_PATH + MF_REDEMPTIONS,"plan="+mf_swp_id);
//
//        int statusCode=response.getStatusCode();
//        Assert.assertEquals(200,statusCode);
//    }
//
//    @Test(priority = 3)
//    public void updateSwpStatusASSubmit(){
//        Playlist requestPlaylist= new Playlist();
//        requestPlaylist.setStatus("SUBMITTED");
//        Response response= PlaylistApi.post(requestPlaylist,API + OMS + SIMULATE + ORDERS +"/"+old_id);
//
//        int statusCode=response.getStatusCode();
//        Assert.assertEquals(200,statusCode);
//
//        String message="order updated successfully";
//        Assert.assertEquals(message,response.path("message"));
//    }
//    @Test(priority = 4)
//    public void updateSwpStatusASSuccess(){
//        Playlist requestPlaylist= new Playlist();
//        requestPlaylist.setStatus("SUCCESSFUL");
//        Response response= PlaylistApi.post(requestPlaylist,API + OMS + SIMULATE + ORDERS +"/"+old_id);
//
//        int statusCode=response.getStatusCode();
//        Assert.assertEquals(200,statusCode);
//
//        String message="order updated successfully";
//        Assert.assertEquals(message,response.path("message"));
//    }
//
//}