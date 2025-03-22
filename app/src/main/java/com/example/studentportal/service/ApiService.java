package com.example.studentportal.service;


import com.example.studentportal.model.FeedbackModel;
import com.example.studentportal.model.ResponseModel;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiService {
    @Headers(
            "Content-Type: application/json"
    ) // Optional, ensures JSON format
    @POST("submitFeedback")  // API endpoint
    Call<ResponseModel> submitFeedback(@Body FeedbackModel submitFeedback);
}

