package com.chen.service;

import com.chen.pojo.Books;

import java.util.List;

public interface BookService {
    // 增加一本书
    int addBook(Books books);
    // 删除一本书
    int deleteBookById(int id);
    // 修改一本书
    int updateBook(Books books);
    // 根据ID查询一本书
    Books queryBookById(int id);
    // 查询全部的书
    List<Books> queryAllBook();
    // 根据书名查书
    List<Books> queryBookByName(String bookName);
}
