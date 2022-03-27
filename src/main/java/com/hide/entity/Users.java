package com.hide.entity;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Users {

    public Users() {
    }

    private List<User> users;
}
