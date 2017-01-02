package cn.zmlio.tinycms2.dao;

import cn.zmlio.tinycms2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zml on 2016/12/31.
 */
public interface UserRepository extends JpaRepository<User,String>{
}
