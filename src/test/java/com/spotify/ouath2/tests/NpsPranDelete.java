package com.spotify.ouath2.tests;

import com.spotify.ouath2.api.applicationApi.PlaylistApi;
import com.spotify.ouath2.pojo.Playlist;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.spotify.ouath2.api.Route.*;

public class NpsPranDelete {

    @Test(priority = 1)
    public void deletePran(){

        Response response= PlaylistApi.DELETE(API +  NPS + DELETE,"");

        int statusCode=response.getStatusCode();
        Assert.assertEquals(200,statusCode);

    }
}
