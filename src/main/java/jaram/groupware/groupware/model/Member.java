package jaram.groupware.groupware.model;

import org.springframework.stereotype.Component;

@Component
public class Member {
    public int cardinalNumber;
    public String name;
    public String position;
    public String phone;
    public String email;
    public String attendingState;

    Member(){}

    public Member(int cardinalNumber, String name, String phone, String email){
        this.cardinalNumber = cardinalNumber;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.position = "준회원";
        this.attendingState = "재학";
    }

    public Member updateMember
            (int cardinalNumber, String name, String position, String phone, String email, String attendingState){
        this.cardinalNumber = cardinalNumber;
        this.name = name;
        this.position = position;
        this.phone = phone;
        this.email = email;
        this.attendingState = attendingState;

        return this;
    }
}
