package cn.yinguowei.thymeleaf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 创建 by 殷国伟 于 2017/8/3.
 */
@Component
public class WebsiteCLR implements CommandLineRunner {

    WebSiteRepository webSiteRepository;

    public WebsiteCLR(WebSiteRepository webSiteRepository) {
        this.webSiteRepository = webSiteRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        WebSite taobao = new WebSite("淘宝", "http://www.taobao.com");
        WebSite jd = new WebSite("京东", "http://www.jd.com");
webSiteRepository.save(taobao);
webSiteRepository.save(jd);

        List<WebSite> list = webSiteRepository.findAll();
        for (WebSite site : list) {
            System.out.println("site = " + site);
        }
    }
}
