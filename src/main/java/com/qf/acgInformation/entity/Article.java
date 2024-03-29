package com.qf.acgInformation.entity;

import lombok.Data;
import org.omg.CORBA.INTERNAL;

/**
 * 文章信息实体类
 * CHAN
 * 2019/12/19 17:07
 */
@Data
public class Article {
    //文章id
    private Integer aId;
    //标签
    private String aType;
    //文章标题
    private String title;
    //文章内容
    private String aText;
    //文章图片
    private String aPic;
    //文章作者id
    private Integer aAuthor;
    //文章点赞数量
    private Integer aLike;
    //文章阅读数量
    private Integer aRead;
    //文章发布时间
    private String aDate;
    //文章核审状态(1默认核审状态，2通过核审，0不通过)
    private Integer aState;
}
