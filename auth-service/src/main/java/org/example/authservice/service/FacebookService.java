package org.example.authservice.service;

import com.clone.instagram.authservice.client.FacebookClient;
import com.clone.instagram.authservice.exception.InternalServerException;
import com.clone.instagram.authservice.model.InstaUserDetails;
import com.clone.instagram.authservice.model.Role;
import com.clone.instagram.authservice.model.facebook.FacebookUser;
import com.clone.instagram.authservice.model.Profile;
import com.clone.instagram.authservice.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
@Slf4j
public class FacebookService {
}
g