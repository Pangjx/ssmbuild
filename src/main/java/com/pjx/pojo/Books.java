package com.pjx.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    private int BookID;
    private String bookName;
    private int bookCounts;
    private String detail;
}
