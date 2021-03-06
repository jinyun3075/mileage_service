package com.Triple_HomeWork.Triple_HomeWork.domain.review.entity;

import com.Triple_HomeWork.Triple_HomeWork.util.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(indexes = {
        @Index(name = "review_id", columnList = "reviewId"),
        @Index(name = "user_id", columnList = "userid"),
        @Index(name = "review_id_bonus_check", columnList = "reviewId,bonusCheck"),
        @Index(name = "place_id_user_id", columnList = "placeId,userId"),
        @Index(name = "bonus_check_place_id", columnList = "bonusCheck, placeId")
})
public class ReviewEvent extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lno;

    @Column(nullable = false, length = 50)
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

    private Boolean bonusCheck;

    private Long mileage;

    public Long getMileage() {
        return mileage;
    }
    public void setBonusCheck(){
        bonusCheck = false;
    }
}