package wad;

import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class ReloadStatusService {

    public List<ReloadStatus> getTopList() {
        return new ArrayList<>();
    }

    public ReloadStatus reload() {
        return new ReloadStatus();
    }
}
