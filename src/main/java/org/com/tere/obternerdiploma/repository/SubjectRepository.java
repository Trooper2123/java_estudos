package org.com.tere.obternerdiploma.repository;

import org.springframework.stereotype.Repository;

import javax.security.auth.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject,> {
}
