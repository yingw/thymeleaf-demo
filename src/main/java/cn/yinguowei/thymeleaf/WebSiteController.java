package cn.yinguowei.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 创建 by 殷国伟 于 2017/8/3.
 */
@Controller
@RequestMapping("/site")
public class WebSiteController {

    WebSiteRepository webSiteRepository;

    public WebSiteController(WebSiteRepository webSiteRepository) {
        this.webSiteRepository = webSiteRepository;
    }

    @GetMapping({"/", ""})
//    @ResponseBody
    public ModelAndView listAllSites() {
        return new ModelAndView("sites", "sites", webSiteRepository.findAll());

    }
}
