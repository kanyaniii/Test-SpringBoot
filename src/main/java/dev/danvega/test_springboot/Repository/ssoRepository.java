package dev.danvega.test_springboot.Repository;

import dev.danvega.test_springboot.Entity.ssoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ssoRepository extends JpaRepository<ssoEntity, LocalDateTime>{

    List<ssoEntity> findAll();


}
