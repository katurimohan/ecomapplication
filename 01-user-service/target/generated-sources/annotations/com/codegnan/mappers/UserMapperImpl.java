package com.codegnan.mappers;

import com.codegnan.dto.CredentialDto;
import com.codegnan.dto.UserDto;
import com.codegnan.models.Credential;
import com.codegnan.models.RoleBasedAuthority;
import com.codegnan.models.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-24T12:01:38+0530",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.44.0.v20251118-1623, environment: Java 25.0.1 (Eclipse Adoptium)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto toDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setEmailAddress( user.getEmail() );
        userDto.setContact( user.getPhone() );
        userDto.setUserId( user.getUserId() );
        userDto.setFirstName( user.getFirstName() );
        userDto.setLastName( user.getLastName() );
        userDto.setCredential( credentialToCredentialDto( user.getCredential() ) );

        return userDto;
    }

    @Override
    public User toEntity(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        User user = new User();

        user.setEmail( userDto.getEmailAddress() );
        user.setPhone( userDto.getContact() );
        user.setUserId( userDto.getUserId() );
        user.setFirstName( userDto.getFirstName() );
        user.setLastName( userDto.getLastName() );
        user.setCredential( credentialDtoToCredential( userDto.getCredential() ) );

        return user;
    }

    protected CredentialDto credentialToCredentialDto(Credential credential) {
        if ( credential == null ) {
            return null;
        }

        CredentialDto credentialDto = new CredentialDto();

        credentialDto.setUsername( credential.getUsername() );
        credentialDto.setPassword( credential.getPassword() );
        if ( credential.getRoleBasedAuthority() != null ) {
            credentialDto.setRoleBasedAuthority( credential.getRoleBasedAuthority().name() );
        }

        return credentialDto;
    }

    protected Credential credentialDtoToCredential(CredentialDto credentialDto) {
        if ( credentialDto == null ) {
            return null;
        }

        Credential credential = new Credential();

        credential.setUsername( credentialDto.getUsername() );
        credential.setPassword( credentialDto.getPassword() );
        if ( credentialDto.getRoleBasedAuthority() != null ) {
            credential.setRoleBasedAuthority( Enum.valueOf( RoleBasedAuthority.class, credentialDto.getRoleBasedAuthority() ) );
        }

        return credential;
    }
}
