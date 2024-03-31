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
//public class MutualfundSell {
//    static int old_id;
//    static String redemption_id= DataLoader.getInstance().getMfRedemptionId();
//    @Test(priority = 1)
//    public void getOldId(){
//        Response response= PlaylistApi.get(BASE_PATH + MF_REDEMPTIONS + redemption_id,"");
//        old_id=response.path("old_id");
//
//    }
//    @Test(priority = 2)
//    public void mfPurchaseSubmit(){
//        Playlist requestPlaylist= new Playlist();
//        requestPlaylist.setAmcOrderId(old_id);
//        requestPlaylist.setStatus("SUBMITTED");
//        Response response= PlaylistApi.post(requestPlaylist, API + OMS + SIMULATE + ORDERS +"/"+old_id);
//        Response response1= PlaylistApi.get(BASE_PATH + MF_REDEMPTIONS + redemption_id,"");
//        String state=response1.path("state");
//        Assert.assertEquals("submitted",state);
//
//        int statusCode=response.getStatusCode();
//        Assert.assertEquals(200,statusCode);
//
//    }
//    @Test(priority = 3)
//    public void mfPurchaseSuccess(){
//        Playlist requestPlaylist= new Playlist();
//        requestPlaylist.setAmcOrderId(old_id);
//        requestPlaylist.setStatus("SUCCESSFUL");
//        Response response= PlaylistApi.post(requestPlaylist,API + OMS + SIMULATE + ORDERS +"/"+old_id);
//
//        Response response2= PlaylistApi.get(BASE_PATH + MF_REDEMPTIONS + redemption_id,"");
//        String state=response2.path("state");
//        Assert.assertEquals("successful",state);
//
//        int statusCode=response.getStatusCode();
//        Assert.assertEquals(200,statusCode);
//    }
//
//}
