package shop.mtcoding.test.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardRepository {
    public int insert();

    public List<Board> findAll();

    public Board findById();

    public int update();

    public int delete();

    public List<Board> findByUserId(int userId);
}
