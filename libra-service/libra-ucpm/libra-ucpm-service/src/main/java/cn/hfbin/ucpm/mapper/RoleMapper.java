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

package cn.hfbin.ucpm.mapper;

import cn.hfbin.ucpm.entity.Role;
import cn.hfbin.ucpm.params.RoleParams;
import com.baomidou.mybatisplus.annotation.InterceptorIgnore;
import org.apache.ibatis.annotations.Mapper;
import cn.hfbin.common.database.SuperMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: huangfubin
 * @Description: 角色表
 * @Date: 2021-06-16
 */
@Mapper
public interface RoleMapper extends SuperMapper<Role> {

    @InterceptorIgnore(tenantLine = "1")
    List<Role> selectListIgnoreTr(@Param("params") RoleParams roleParams);
}
