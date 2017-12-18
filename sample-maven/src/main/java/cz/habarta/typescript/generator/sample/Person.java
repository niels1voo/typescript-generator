
package cz.habarta.typescript.generator.sample;




import javax.annotation.Nullable;
import java.util.*;


public class Person {

    public String name;
    public int age;
    public boolean hasChildren;
    public List<String> tags;
    public Map<String, String> emails;

    @TsOptional
    public String tsOptional;

    @Nullable
    public String nullablePreTransient;

    @javax.persistence.Transient
    public String excluded;

    @Nullable
    private String nullablePostTransient;
}
