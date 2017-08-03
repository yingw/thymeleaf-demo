package cn.yinguowei.thymeleaf;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * 创建 by 殷国伟 于 2017/8/3.
 */
@RepositoryRestResource
public interface WebSiteRepository extends JpaRepository<WebSite, Long> {

}
