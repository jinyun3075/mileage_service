package com.Triple_HomeWork.Triple_HomeWork.domain.review.entity;

import com.Triple_HomeWork.Triple_HomeWork.util.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReviewLog extends BaseEntity {

    @Id
    @Column(length = 50)
    private String reviewId;

    @Column(nullable = false, length = 50)
    private String userId;

    @Column(nullable = false, length = 50)
    private String placeId;


    @Column(nullable = false, length = 10)
    private String action;

    @Column(nullable = false, length = 10)
    private String type;

    @Column(length = 1000)
    private String content;

    @ElementCollection
    @CollectionTable(name = "attached_photo_ids")
    private List<String> photo;
}