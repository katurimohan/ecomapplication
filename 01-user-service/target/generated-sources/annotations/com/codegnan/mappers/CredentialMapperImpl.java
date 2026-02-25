package com.codegnan.mappers;

import com.codegnan.dto.CredentialDto;
import com.codegnan.models.Credential;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-24T12:01:38+0530",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.44.0.v20251118-1623, environment: Java 25.0.1 (Eclipse Adoptium)"
)
@Component
public class CredentialMapperImpl implements CredentialMapper {

    @Override
    public CredentialDto toDto(Credential credential) {
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
}
