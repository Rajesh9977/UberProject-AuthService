package Uber_AuthService.Uber_AuthService.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class PassengerDto {

    private String id;

    private String name;
    private String email;
    private String phoneNumber;
    private String password;
    private Date CreateAt;
}
