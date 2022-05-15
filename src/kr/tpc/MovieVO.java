package kr.tpc;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MovieVO {
    private String title;
    private int price;
    private String author;
    private int level;
    private float time;

}
