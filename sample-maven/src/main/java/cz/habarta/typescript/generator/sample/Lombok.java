package cz.habarta.typescript.generator.sample;


import lombok.Data;

import javax.annotation.Nullable;

@Data
public class Lombok {

    @Nullable
    private String nullableName;

    @TsOptional
    private String tsOptionalName;

}
