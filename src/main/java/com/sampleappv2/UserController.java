
    package com.sampleappv2;
    
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.PostMapping;
    import org.springframework.web.bind.annotation.RequestBody;
    import org.springframework.web.bind.annotation.RestController;
    
    @RestController
    public class UserController {
        
        private UserService userService;
        
        @Autowired
        public UserController(UserService userService) {
            this.userService = userService;
        }
        
        @PostMapping("/register")
        public User registerUser(@RequestBody User user) {
            return userService.registerUser(user);
        }
        
        @PostMapping("/verify")
        public User verifyUser(@RequestBody User user) {
            return userService.verifyUser(user);
        }
        
    }
