package org.spt.firstjpa.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.spt.firstjpa.Entity.User;

import java.util.List;

public interface UserDao extends JpaRepository<User, Integer> {
    List<User> getUserByAddressEqualsAndIdLessThanEqual(String address, Integer id);

    @Query(value = "select * from t_user where id=(select max(id) from t_user )", nativeQuery = true)
    User maxIdUser();
}
