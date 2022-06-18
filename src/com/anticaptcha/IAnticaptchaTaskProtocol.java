package com.anticaptcha;

import com.anticaptcha.ApiResponse.TaskResultResponse;

import org.json.JSONObject;

public interface IAnticaptchaTaskProtocol {
    JSONObject getPostData();

    TaskResultResponse.SolutionData getTaskSolution();
}
