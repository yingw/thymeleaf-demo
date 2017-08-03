package cn.yinguowei.thymeleaf;

import lombok.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 创建 by 殷国伟 于 2017/8/3.
 */
@Data
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Entity
public class WebSite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @NonNull
    @NotNull
    String name;
    @NonNull
    @NotNull
    String url;

    LocalDate onLiveDate;
    @Column(length = 5000)
    String description;

    @CreatedDate
    @Column(updatable = false)
    LocalDateTime created;
    @LastModifiedDate
    LocalDateTime updated;
    @CreatedBy
    String createdBy;
    @LastModifiedBy
    String updatedBy;
}
