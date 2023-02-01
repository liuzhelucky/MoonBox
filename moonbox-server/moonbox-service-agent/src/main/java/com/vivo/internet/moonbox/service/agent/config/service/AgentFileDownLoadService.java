/*
Copyright 2022 vivo Communication Technology Co., Ltd.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
package com.vivo.internet.moonbox.service.agent.config.service;

import javax.servlet.http.HttpServletResponse;

/**
 * AgentFileDownLoadService - {@link AgentFileDownLoadService}
 *
 * @author xu.kai
 * @version 1.0
 * @since 2022/8/29 20:44
 */
public interface AgentFileDownLoadService {

    /**
     * downLoadFile
     * @param fileName 文件名称
     * @param httpServletResponse httpServletResponse
     */
    void downLoadFile(HttpServletResponse httpServletResponse,String fileName);
}