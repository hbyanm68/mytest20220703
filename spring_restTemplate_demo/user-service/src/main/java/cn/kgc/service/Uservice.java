package cn.kgc.service;

import cn.kgc.pojo.User;

/**
 * @Author: yan.
 * @Description:
 * @Date:Created in 2022/5/24 12:04.
 * @Modified By:
 */
public interface Uservice {
    /***
     * 根据id查询用户对象
     * @param id
     * @return
     */
    User getUserById(Integer id);
}
