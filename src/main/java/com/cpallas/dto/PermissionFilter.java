package com.cpallas.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class PermissionFilter {

    String role;
}