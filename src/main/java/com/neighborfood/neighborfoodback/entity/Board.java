package com.neighborfood.neighborfoodback.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer board_no;

    private String title;
    private String contents;
    private String category;
    private String location;
    private String order_time;
    private String max_people;
    private LocalDateTime reg_date;
    private LocalDateTime mod_date;

    private String email;
    private Integer restaurant_no;

}
