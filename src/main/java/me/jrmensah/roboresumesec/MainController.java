package me.jrmensah.roboresumesec;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.security.Principal;

@Controller
public class MainController {
    @Autowired
    private UserService userService;

    @RequestMapping(value="/register", method = RequestMethod.GET)
    public String showRegistrationPage(Model model){
        model.addAttribute("user", new UserData("jjjschmidt@gmail.com", "john", "John", "Jingleheimer-Schmidt", true, "john"));
        return "registration";
    }
    @RequestMapping(value="/register", method = RequestMethod.POST)
    public String processRegistrationPage(@Valid @ModelAttribute("user") UserData user,
                                          BindingResult result, Model model) {
        model.addAttribute("user", new UserData("jjjschmidt@gmail.com", "john", "John", "Jingleheimer-Schmid", true, "john"));
        if (result.hasErrors()) {
            return "registration";
        } else {
            userService.saveUser(user);
            model.addAttribute("message", "User Account Successfully Created");
        }
        return "index";
    }

    @RequestMapping(value = "/list")
    public String getUserList(@ModelAttribute Resume resume, Model model){
        model.addAttribute(resume.findAll());
        return "list";
    }
    @RequestMapping("/user")
    public String getUser(@RequestParam("first")String firstName, String middleInit, String lastName, String email, String degree, String major, String school, String year,
                          String workTitle, String workplace,String date, String duty, String skill, String level, Model model) {

        //Print out name and email
        model.addAttribute("first" + firstName + middleInit + lastName);
        model.addAttribute("email"+ email);

        //Print out colleges, major, degree and year of graduation
        model.addAttribute("Education:" +" "+ degree + "in" + major + " " + school + "," + year);

        //Print out work history: title of job, name of company, date and duty performed
        model.addAttribute("Experience:"+ " "+ workTitle +" "+workplace+ " " +date+" "+duty+" "+duty+" ");

        //Print out skills and level of proficiency
        model.addAttribute("Skills:"+" "+skill+ " "+"," +level);
        model.addAttribute(new Resume());
        return "user";
    }

    @RequestMapping("/")
    public String index()
        {
        return "index";
    }
    @RequestMapping("/login")
    public String login()
        {
        return "login";
    }
    @RequestMapping("/secure")
    public String secure(HttpServletRequest request, Authentication authentication, Principal principal)
        {
            Boolean isAdmin = request.isUserInRole("ADMIN");
            Boolean isUser = request.isUserInRole("USER");
            UserDetails userDetails = (UserDetails) authentication.getPrincipal();
            String username = principal.getName();
        return "secure";
    }

    @RequestMapping ("/search")
    public String SearchResult(){
        //Get Names matching a string
        Iterable<Resume> resume = resumeRepository.findAllBySkillContainingIgnoreCase("");
        for (UserData user : users){


        }
    }


}

