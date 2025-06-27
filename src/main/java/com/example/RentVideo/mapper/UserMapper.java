// package com.example.RentVideo.mapper;

// import com.example.RentVideo.entity.User;
// import com.example.RentVideo.exchanges.UserDto;

// public class UserMapper {

//     public static UserDto mapToUserDto(User user) {
        
//         if (user == null){
//             return null;
//         }

//         UserDto userDto = new UserDto(
//             user.getEmail(),
//             user.getPassword(),
//             user.getFirstName(),
//             user.getLastName(),
//             user.getRole()
//         );

//         return userDto;
//     }

//     public static User maptoUser(UserDto userDto) {
        
//         if (userDto == null){
//             return null;
//         }

//         User user = new User();
//         user.setEmail(userDto.getEmail());
//         user.setPassword(user.getPassword());
//         user.setFirstName(user.getFirstName());
//         user.setLastName(user.getLastName());
//         user.setRole(user.getRole());

//         return user;
//     }
// }
