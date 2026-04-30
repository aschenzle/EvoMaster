package org.evomaster.client.java.controller.api.dto;

import java.util.*;

public class AdditionalInfoDto {

    public Set<String> queryParameters = new HashSet<>();

    public Set<String> headers = new HashSet<>();

    public Map<String, List<StringSpecializationInfoDto>> stringSpecializations = new LinkedHashMap<>();

    public String lastExecutedStatement = null;

    public Boolean rawAccessOfHttpBodyPayload = null;

    public Set<String> parsedDtoNames = new HashSet<>();

    public List<ExternalServiceInfoDto> externalServices = new ArrayList<>();

    public List<ExternalServiceInfoDto> employedDefaultWM = new ArrayList<>();

    public List<HostnameResolutionInfoDto> hostnameResolutionInfoDtos = new ArrayList<>();
}
