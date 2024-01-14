package com.userapplication.config

import com.userdomain.config.UserDomainConfig
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import

@Configuration
@Import(UserDomainConfig::class)
@ComponentScan(basePackages = ["com.userapplication"])
class UserServiceConfig
