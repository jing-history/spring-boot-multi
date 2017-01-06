package tk.jingzing.book;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by wangyunjing on 2017/1/5.
 */
public interface ReaderRepository
        extends JpaRepository<Reader, String> {
}
