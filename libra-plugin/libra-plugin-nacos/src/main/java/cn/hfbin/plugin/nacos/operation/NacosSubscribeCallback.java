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


package cn.hfbin.plugin.nacos.operation;

/**
 * @Author: huangfubin
 * @Description:
 * @Date: 2022/01/26
 */
public interface NacosSubscribeCallback {
    /**
     *   nacos subscribe callback
     * @param config nacos config
     * @return void
     */
    void callback(String config);
}
