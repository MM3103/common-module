package liga.medical.common.service.debug;

import liga.medical.common.service.model.Debug;
import liga.medical.common.service.repository.DebugRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DebugService {

    private final DebugRepository repository;

    public DebugService(DebugRepository repository) {
        this.repository = repository;
    }

    public List<Debug> getAllDebugs() {
        return repository.findAll();
    }

    public void addDebug(Debug newDebug) {
        repository.save(newDebug);
    }
}
