package hello.core.member;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member {

    private Long id;
    private String name;
    private Grade grade;

    public Member(final Long id, final String name, final Grade grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
}
