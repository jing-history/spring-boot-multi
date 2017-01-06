package tk.jingzing.book;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by wangyunjing on 2017/1/3.
 */
public interface ReadingListRepository extends JpaRepository<Book,Long> {
    List<Book> findByReader(String reader);
}
