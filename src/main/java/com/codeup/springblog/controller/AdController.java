package com.codeup.springblog.controller;

        import com.codeup.springblog.models.Ad;
        import com.codeup.springblog.repositories.AdRepository;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/ads")
public class AdController {
    private final AdRepository adDao;

    public AdController(AdRepository adDao){
        this.adDao = adDao;
    }

    @GetMapping
    public String allAds(Model model){
        model.addAttribute("ads", adDao.findAll());
        return "ads/index";
    }

    @GetMapping("/{id}")
    public String showAnAd(@PathVariable long id, Model model){
        Ad ad = adDao.findById(id);
        model.addAttribute("ad", adDao.findById(id));
        return "ads/show";
    }

    @GetMapping("/search")
    public String adSearch(){
        return "ads/search";
    }

    @PostMapping("/search")
    public String searchResults(@RequestParam(name = "title") String title, Model model){
//        model.addAttribute("results", adDao.findByTitle(title));
        model.addAttribute("results", adDao.searchByTitleLike(title));
        return "ads/search";
    }

}