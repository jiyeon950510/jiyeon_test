package shop.mtcoding.test.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserRepository {

    public int insert(@Param("username") String username, @Param("password") String password,
            @Param("email") String email);

    public List<User> findAll();

    public User findById();

    public int update(@Param("id") int id, @Param("password") String password, @Param("email") String email);

    public int delete();

    public User findByUsernameAndPassword(@Param("username") String username,
            @Param("password") String password);
}
