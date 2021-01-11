package org.spt.firstmodel.model;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:\\Config\\book.properties")
@ConfigurationProperties(prefix = "book")
public class Book {
    private Long id;
    private String name;
    private String author;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}



////方法一
//@Component
//@PropertySource("classpath:\\Config\\book.properties")
//public class Book {
//    @Value("${book.id}")
//    private Long id;
//    @Value("${book.name}")
//    private String name;
//    @Value("${book.author}")
//    private String author;
//
//    @Override
//    public String toString() {
//        return "Book{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", author='" + author + '\'' +
//                '}';
//    }
//}
