package com.SearchForTalent.FindDev.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Dto {
    private String id;
    private String profile;
    private String desc;
    private int exp;
    private String[] techs;
}