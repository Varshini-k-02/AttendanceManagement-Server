package com.example.AttendanceManagement.controller;
import com.example.AttendanceManagement.model.UserDTO;
import com.example.AttendanceManagement.model.Users;
import com.example.AttendanceManagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user-by-id")
    public List<Users> getUserById(@RequestBody UserDTO dto) {
        Long empid = dto.getId();
        return userRepository.findByEmpId(empid);
    }

    @PostMapping("/post-user-data")
    public Users postEmpData(@RequestBody Users user){
        return userRepository.save(user);
    }
    @PostMapping("/user-login")
    public Boolean getEmailAndPwd(@RequestBody UserDTO dto){
        String email=dto.getEmail();
        String pwd= dto.getPwd();
        Users user = userRepository.findByEmailAndPwd(email,pwd);
        return user != null;
    }
}

    @PostMapping("/user-login")
    public Boolean getEmailAndPwd(@RequestBody UserDTO dto){
        String email=dto.getEmail();
        String pwd= dto.getPwd();
        Users user = userRepository.findByEmailAndPwd(email,pwd);
        return user != null;
    }
}
