
    package com.sampleappv2;
    
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.PostMapping;
    import org.springframework.web.bind.annotation.RequestBody;
    import org.springframework.web.bind.annotation.RestController;
    
    @RestController
    public class UserRegistrationController {
        
        private UserService userService;
        
        @Autowired
        public UserRegistrationController(UserService userService) {
            this.userService = userService;
        }
        
        @PostMapping("/register")
        public User registerUser(@RequestBody User user) {
            return userService.registerUser(user);
        }
        
    }
