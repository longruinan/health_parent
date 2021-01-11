package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @项目: dubbo_parent
 * @包名: com.itheima.pojo
 * @
 * @作者: long rui nan
 * @日期: 2021-01-04 11:46
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User implements Serializable {
    private Integer id;
    private String username;
    private Integer age;

}
