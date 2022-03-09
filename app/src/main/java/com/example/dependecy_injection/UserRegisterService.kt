package com.example.dependecy_injection

class UserRegisterService(var userRepo: UserRepo = UserRepo(),
                          var emailService: EmailService = EmailService()
) {

    fun registeruser(email:String,pass:String)
    {
        userRepo.savedata(email,pass)
        emailService.Send(email,"user@gmail.com","user registed")
    }


}

