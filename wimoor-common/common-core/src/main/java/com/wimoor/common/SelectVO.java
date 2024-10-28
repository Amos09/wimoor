package com.wimoor.common;


import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SelectVO {

    public SelectVO(String value, String label) {
        this.value = value;
        this.label = label;
    }

    private String value;

    private String label;

    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    private List<SelectVO> children;

}
