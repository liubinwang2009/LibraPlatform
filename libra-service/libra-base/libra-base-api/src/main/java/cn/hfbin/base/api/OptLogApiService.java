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

package cn.hfbin.base.api;

import cn.hfbin.base.entity.OptLog;
import cn.hfbin.common.core.api.ResponseData;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;



/**
 * @Author: huangfubin
 * @Description: 系统操作日志表 服务调用接口
 * @Date: 2021-08-31
 */
public interface OptLogApiService{

    /**
     * 分页查询
     * @param pageNo 页码
     * @param pageSize 页数
     * @param optLog 系统操作日志表
     * @return ResponseData
     */
    @GetMapping("/page")
    ResponseData<Page<OptLog>> page(@RequestParam(name = "pageNo",defaultValue = "1") Integer pageNo,
                                     @RequestParam(name = "pageSize",defaultValue = "10") Integer pageSize,
                                     OptLog optLog);

    /**
     * 通过id查询系统操作日志表
     * @param id id
     * @return ResponseData
     */
    @GetMapping("/{id}")
    ResponseData<OptLog> getById(@PathVariable("id" ) Long id);

    /**
     * 新增系统操作日志表
     * @param optLog 系统操作日志表
     * @return ResponseData
     */
    @PostMapping("/save")
     ResponseData<Integer> save(@RequestBody OptLog optLog);

    /**
     * 修改系统操作日志表
     * @param optLog 系统操作日志表
     * @return ResponseData
     */
    @PutMapping("/update")
    ResponseData<Integer> updateById(@RequestBody OptLog optLog);

    /**
     * 通过id删除系统操作日志表
     * @param id id
     * @return ResponseData
     */
    @DeleteMapping("/delete/{id}")
    ResponseData<Integer> removeById(@PathVariable("id") Long id);

}
