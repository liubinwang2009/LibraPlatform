/*
 *    Copyright [2021] [LibraPlatform of copyright huangfubin]
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package cn.hfbin.common.core.api;

/**
 * @author hfbin
 * @email huangfubin00@gmail.com
 * @date 2020/9/15 9:13 上午
 * @description: 响应编码
 */
public interface ServiceCode {
    /**
     * 响应编码
     * @return
     */
    int getCode();

    /**
     * 响应描述
     * @return
     */
    String getMsg();
}

