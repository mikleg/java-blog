package mikleg.myblog.controllers;

import mikleg.myblog.models.Post;
import mikleg.myblog.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class HomeController {
    @Autowired
    private PostService postService;

    @RequestMapping("/")
    public String index(Model model) {
        List<Post> latest5Posts = postService.findLatest5();
        model.addAttribute("latest5posts", latest5Posts);
        List<Post> latest3Posts = latest5Posts.stream()
                .limit(3).collect(Collectors.toList());
        model.addAttribute("latest3posts", latest3Posts);

     //   model.addAttribute("title", "Mikle's site");
        return "index";
    }
}

//TODO Implement the “List latest 5 Posts” at the Home Page Sidebar /done
//TODO change template of view.html to bootstrap