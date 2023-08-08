package com.hupi.project.model.dto.menu;

import com.hupi.project.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 菜单查询请求
 *
 * @author hupi
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class MenuListRequest extends PageRequest implements Serializable {

    /**
     * 页数
     */
    private int pageNum;

    private String name;


    private Integer isBan;


    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 更新时间
     */
    private String updateTime;

    /**
     * 每一页数量
     */
    private int pageSize;


    private static final long serialVersionUID = 1L;
}