package com.zrz.zblog;

import com.zrz.zblog.controller.vo.BlogDetailVO;
import com.zrz.zblog.entity.*;
import com.zrz.zblog.service.*;
import com.zrz.zblog.util.PageResult;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@MapperScan("com.zrz.zblog.dao")
@SpringBootTest
public class ZblogApplicationTests {

//    @Autowired
//    private CategoryService categoryService;
//    @Autowired
//    private TagService tagService;
//    @Autowired
//    private BlogService blogService;
//    @Autowired
//    private CommentService commentService;
//    @Autowired
//    private LinkService linkService;
//
    @Test
    public void categoryTest(){
//        categoryService.saveCategory("category1");
//        categoryService.saveCategory("category2");
//        categoryService.saveCategory("category3");
//        List<BlogCategory> allCategories = categoryService.getAllCategories();
//        Assert.assertEquals(allCategories.get(0).getCategoryName(),"category1");
//        Assert.assertEquals(allCategories.get(1).getCategoryName(),"category2");
//        Assert.assertEquals(allCategories.get(2).getCategoryName(),"category3");
//        categoryService.deleteBatch(new Integer[]{1,2,3});
//        int totalCategories = categoryService.getTotalCategories();
//        Assert.assertEquals(totalCategories,0);
    }
//
//    @Test
//    public void tagTest(){
//        tagService.saveTag("tag1");
//        tagService.saveTag("tag2");
//        tagService.saveTag("tag3");
//        int totalTags = tagService.getTotalTags();
//        Assert.assertEquals(totalTags,3);
//        tagService.deleteBatch(new Integer[]{1,2,3});
//        int totalTags1 = tagService.getTotalTags();
//        Assert.assertEquals(totalTags1,0);
//    }
//
//    @Test
//    public void BlogTest(){
//        categoryService.saveCategory("category1");
//        tagService.saveTag("tag1");
//
//        Blog blog = new Blog();
//        blog.setBlogTitle("blog");
//        blog.setBlogContent("xxx");
//        blog.setBlogCategoryId(1);
//        blog.setBlogTags("xxx,sss");
//        blog.setBlogSubUrl("dsa");
//        blog.setBlogStatus((byte) 1);
//
//        blogService.saveBlog(blog);
//        BlogDetailVO blogDetail = blogService.getBlogDetail(1L);
//        Assert.assertEquals(blogDetail.getBlogTitle(),"blog");
//
//        int totalBlogs = blogService.getTotalBlogs();
//        Assert.assertEquals(totalBlogs,1);
//
//        blog.setBlogId(1L);
//        blog.setBlogTitle("new Title");
//        blogService.updateBlog(blog);
//        Assert.assertEquals(blogService.getBlogById( 1L).getBlogTitle(),"new Title");
//
//        blogService.deleteBatch(new Integer[]{1});
//        int totalBlogs1 = blogService.getTotalBlogs();
//        Assert.assertEquals(totalBlogs1,0);
//    }
//
//    @Test
//    public void commentTest(){
//        BlogComment blogComment = new BlogComment();
//        blogComment.setCommentator("zzz");
//        blogComment.setEmail("401844090@qq.com");
//        blogComment.setBlogId(1L);
//        blogComment.setCommentStatus((byte) 1);
//        commentService.addComment(blogComment);
//
//        int totalComments = commentService.getTotalComments();
//        Assert.assertEquals(totalComments,1);
//
//        PageResult pageResult = commentService.getCommentPageByBlogIdAndPageNum(1L, 1);
//        BlogComment blogComment1 = (BlogComment)pageResult.getList().get(0);
//        Assert.assertEquals(blogComment1.getCommentator(),"zzz");
//
//        commentService.deleteBatch(new Integer[]{1});
//        int totalComments2 = commentService.getTotalComments();
//        Assert.assertEquals(totalComments2,0);
//    }
//
//    @Test
//    public void linkTest(){
//        BlogLink blogLink = new BlogLink();
//        blogLink.setLinkDescription("xxx");
//        blogLink.setLinkUrl("xx");
//        blogLink.setLinkName("x");
//        blogLink.setLinkType((byte) 1);
//        linkService.saveLink(blogLink);
//
//        BlogLink blogLink1 = linkService.selectById(1);
//        Assert.assertEquals(blogLink1.getLinkName(),"x");
//
//        linkService.deleteBatch(new Integer[]{1});
//        int totalLinks = linkService.getTotalLinks();
//        Assert.assertEquals(totalLinks,0);
//    }

}
