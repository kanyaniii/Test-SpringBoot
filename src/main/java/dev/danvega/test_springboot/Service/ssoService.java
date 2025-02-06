package dev.danvega.test_springboot.Service;

import dev.danvega.test_springboot.Entity.ssoEntity;
import dev.danvega.test_springboot.Repository.ssoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ssoService {
    private final ssoRepository repository;

    @Autowired
    public ssoService(ssoRepository repository) {
        this.repository = repository;
    }

    public ssoEntity save(ssoEntity userTest) {
        if (userTest == null) {
            throw new IllegalArgumentException("userTest is null");
        }
        try {
            return repository.save(userTest);
        } catch (Exception e) {
            System.err.println("Error saving userTest: " + e.getMessage());
            throw new RuntimeException("Failed to save userTest ");
        }
    }

    public Optional<ssoEntity> getUserTest(LocalDateTime requestDate) {
        return repository.findById(requestDate);
    }

    public List<ssoEntity> findAllUserTests() {
        return  repository.findAll();
    }


}
