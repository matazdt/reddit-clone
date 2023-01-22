package com.example.springredditclone.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.IDENTITY;


public enum VoteType {
   UPVOTE(1),DOWNVOTE(-1),
    ;

   VoteType(int direction){

   }
}
