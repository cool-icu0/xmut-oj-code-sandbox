package com.cool.XmutOJcodesandbox;


import com.cool.XmutOJcodesandbox.model.ExecuteCodeRequest;
import com.cool.XmutOJcodesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
