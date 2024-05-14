package com.example.springboot_deserialise_josn.Entity;
import jakarta.persistence.*;
@Entity
@Table(name="instructor_detail")
public class instructordetail {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="youtube_channel")
    private String youtubeChannel;
    @Column(name="hobby")
    private String hobby;
    @OneToOne(mappedBy = "instructorDetail",
            cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private instructor instructor;
    public instructordetail() { }
    public instructordetail(String youtubeChannel, String hobby) {
        this.youtubeChannel = youtubeChannel;
        this.hobby = hobby; }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getYoutubeChannel() {
        return youtubeChannel; }
    public void setYoutubeChannel(String youtubeChannel) { this.youtubeChannel = youtubeChannel; }
    public String getHobby() { return hobby; }
    public instructor getInstructor() { return instructor; }
    public void setInstructor(instructor instructor) { this.instructor = instructor; }
    public void setHobby(String hobby) { this.hobby = hobby; }
    @Override public String toString() {
        return "InstructorDetail{" +
                "id=" + id +
                ", youtubeChannel='" + youtubeChannel + '\'' +
                ", hobby='" + hobby + '\'' + '}'; }
}
