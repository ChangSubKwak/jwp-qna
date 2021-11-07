package qna.domain;

import java.time.*;

import javax.persistence.*;
import javax.persistence.Id;

import org.springframework.data.annotation.*;
import org.springframework.data.jpa.domain.support.*;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
public abstract class CommonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @CreatedDate
    @Column(nullable = false)
    protected LocalDateTime createdDate;

    @LastModifiedDate
    protected LocalDateTime modifiedDate;
}
