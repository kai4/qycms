package com.windcoder.qycms.blog.entity;

import com.windcoder.qycms.core.system.entity.Auditable;
import com.windcoder.qycms.core.system.entity.User;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="blog_article")
@DynamicInsert
public class Article extends Auditable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;
    /**
     * 标题
     */
    private String title;
    /**
     * 内容-mkdown
     */
    @Lob
    private String content;
    /**
     * 内容-html
     */
    @Lob
    private String contentHtml;

    /**
     * 摘要
     */
    private String summary;



    /**
     * 链接
     */
    private String permaLink;


    /**
     * 缩略图
     */
    private String thumbnail;



    /**
     * 发布日期
     */
    private Date publishedDate;


    /**
     * 作者
     */
    @ManyToOne
    @JoinColumn(name = "author_id", foreignKey = @ForeignKey(name = "none", value = ConstraintMode.NO_CONSTRAINT))
    private User author;


    /**
     * 是否已发布
     */
    @ColumnDefault("0")
    private Boolean isPublished;

    /**
     * 是否已删除
     */
    @ColumnDefault("0")
    private Boolean isDeleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContentHtml() {
        return contentHtml;
    }

    public void setContentHtml(String contentHtml) {
        this.contentHtml = contentHtml;
    }

    public Boolean getIsPublished() {
        return isPublished;
    }

    public void setIsPublished(Boolean published) {
        this.isPublished = published;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getPermaLink() {
        return permaLink;
    }

    public void setPermaLink(String permaLink) {
        this.permaLink = permaLink;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
}
