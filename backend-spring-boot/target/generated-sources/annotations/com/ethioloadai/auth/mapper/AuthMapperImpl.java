package com.ethioloadai.auth.mapper;

import com.ethioloadai.auth.dto.RegisterRequest;
import com.ethioloadai.auth.dto.UpdateProfileRequest;
import com.ethioloadai.auth.dto.UserResponse;
import com.ethioloadai.user.entity.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-07-09T18:08:03+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.11 (Eclipse Adoptium)"
)
@Component
public class AuthMapperImpl implements AuthMapper {

    @Override
    public User toEntity(RegisterRequest request) {
        if ( request == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.role( mapRole( request.getRole() ) );
        user.fullName( request.getFullName() );
        user.phone( request.getPhone() );
        user.email( request.getEmail() );
        user.password( request.getPassword() );

        user.verificationStatus( calculateVerificationStatus(request.getRole()) );
        user.isActive( calculateIsActive(request.getRole()) );

        return user.build();
    }

    @Override
    public UserResponse toResponse(User user) {
        if ( user == null ) {
            return null;
        }

        UserResponse.UserResponseBuilder userResponse = UserResponse.builder();

        userResponse.id( user.getId() );
        userResponse.fullName( user.getFullName() );
        userResponse.phone( user.getPhone() );
        userResponse.email( user.getEmail() );
        if ( user.getRole() != null ) {
            userResponse.role( user.getRole().name() );
        }
        userResponse.location( user.getLocation() );
        userResponse.verificationStatus( user.getVerificationStatus() );
        userResponse.isActive( user.getIsActive() );
        userResponse.createdAt( user.getCreatedAt() );
        userResponse.updatedAt( user.getUpdatedAt() );

        return userResponse.build();
    }

    @Override
    public void updateEntityFromDto(UpdateProfileRequest request, User user) {
        if ( request == null ) {
            return;
        }

        user.setFullName( request.getFullName() );
        user.setPhone( request.getPhone() );
    }
}
