package com.nk.model;

public class Picture {
    private Long id;
    private String link;
    private Student student;
    private String content;

    @Override
    public String toString() {
        return "Picture{" +
                "id=" + id +
                ", link='" + link + '\'' +
                ", student=" + student +
                ", content='" + content + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
