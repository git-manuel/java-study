package enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Gender {
    MASCULINE("masculine"),
    FEMININE("feminine");
    private String description;
}
