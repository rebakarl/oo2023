package ee.karl.proovikt2;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ToiduaineRepository extends JpaRepository<toiduaine, Long> {
    toiduaine findByNimetus(String nimetus);

    List<toiduaine> findByRasvIsBetween(int alg, int l6pp);
}
