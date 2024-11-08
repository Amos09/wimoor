package com.wimoor.amazon.feed.service.impl;

import com.amazon.spapi.client.ApiCallback;
import com.amazon.spapi.client.ApiException;
import com.amazon.spapi.model.feeds.CreateFeedResponse;
import com.wimoor.amazon.auth.pojo.entity.AmazonAuthority;
import com.wimoor.amazon.auth.pojo.entity.Marketplace;
import com.wimoor.amazon.feed.pojo.entity.AmzSubmitFeedQueue;
import com.wimoor.amazon.feed.service.ISubmitfeedService;
import java.util.List;
import java.util.Map;

public class ApiCallbackCreateFeed implements ApiCallback<CreateFeedResponse> {

    ISubmitfeedService iSubmitfeedService;
    AmazonAuthority amazonAuthority;
    Marketplace marketplace;
    AmzSubmitFeedQueue queue;

    public ApiCallbackCreateFeed(ISubmitfeedService iSubmitfeedService, AmazonAuthority amazonAuthority,
            Marketplace marketplace,
            AmzSubmitFeedQueue queue) {
        // TODO Auto-generated constructor stub
        this.iSubmitfeedService = iSubmitfeedService;
        this.amazonAuthority = amazonAuthority;
        this.marketplace = marketplace;
        this.queue = queue;
    }

    @Override
    public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
        amazonAuthority.setApiRateLimit(responseHeaders, e);
        e.printStackTrace();
    }

    @Override
    public void onSuccess(CreateFeedResponse result, int statusCode, Map<String, List<String>> responseHeaders) {
        // TODO Auto-generated method stub
        iSubmitfeedService.handlerCreateFeed(result, amazonAuthority, queue, marketplace);
    }

    @Override
    public void onUploadProgress(long bytesWritten, long contentLength, boolean done) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onDownloadProgress(long bytesRead, long contentLength, boolean done) {
        // TODO Auto-generated method stub

    }

}
