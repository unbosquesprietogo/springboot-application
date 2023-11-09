package com.near.springbootapplication.entity.user;


import org.springframework.data.ldap.repository.LdapRepository;

import java.util.Optional;



public interface LdapUserRepository extends LdapRepository<LdapUser> {

    Optional<LdapUser> findByUsername(String username);

}
