package cn.yinguowei.thymeleaf;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.stereotype.Component;

/**
 * 创建 by 殷国伟 于 2017/8/3.
 */
@Configuration
public class MyAuditConfig implements AuditorAware<String> {
    @Override
    public String getCurrentAuditor() {
        return "yinguowei";
    }
}
