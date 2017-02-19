package com.yoghurt.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Collection;


@Entity
@Table(name = "blog", schema = "springdemo", catalog = "")
public class BlogEntity {
    private int id;
    private String tittle;
    private String content;
    private Date pubDate;
    private BlogEntity userByUserId;
    private Collection<BlogEntity> blogById;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "tittle", nullable = true, length = 100)
    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    @Basic
    @Column(name = "content", nullable = true, length = 255)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "pub_date", nullable = true)
    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BlogEntity that = (BlogEntity) o;

        if (id != that.id) return false;
        if (tittle != null ? !tittle.equals(that.tittle) : that.tittle != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (pubDate != null ? !pubDate.equals(that.pubDate) : that.pubDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (tittle != null ? tittle.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (pubDate != null ? pubDate.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    public BlogEntity getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(BlogEntity userByUserId) {
        this.userByUserId = userByUserId;
    }

    @OneToMany(mappedBy = "userByUserId")
    public Collection<BlogEntity> getBlogById() {
        return blogById;
    }

    public void setBlogById(Collection<BlogEntity> blogById) {
        this.blogById = blogById;
    }
}
