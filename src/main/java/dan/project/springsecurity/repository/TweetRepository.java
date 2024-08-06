package dan.project.springsecurity.repository;

import dan.project.springsecurity.entity.Tweet;
import dan.project.springsecurity.entity.User;
import org.hibernate.query.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, Long> {

}
