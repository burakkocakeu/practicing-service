package com.burakkocak.practicingservice.quick.autowire;

import com.burakkocak.practicingservice.samplingmappers.pojo.SimpleDestination;
import com.burakkocak.practicingservice.samplingmappers.pojo.SimpleSource;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ToStringTesting {

    private UUID id;

    private UUID countryOfResidence;

    private UUID nationality;

    private String firstName;

    private String lastName;

    private LocalDate dateOfBirth;

    private String idNumber;

    private String documentNumber;

    private String passportNumber;

    private SimpleSource documentType;

    private String city;

    private String district;

    private String neighbourhood;

    private String addressLine;

    private String buildingNumber;

    private String apartmentNumber;

    private String province;

    private SimpleDestination kycFlowBasicStatus;

    private UUID identityStatus;

    @Override
    public String toString() {
        return "KycFlowBasicStatusResponse{" +
                "id=" + id +
                ", countryOfResidence=" + countryOfResidence +
                ", nationality=" + nationality +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", idNumber=******'" + '\'' +
                ", documentNumber=******'" + '\'' +
                ", passportNumber=******'" + '\'' +
                ", documentType=" + documentType +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", neighbourhood='" + neighbourhood + '\'' +
                ", addressLine='" + addressLine + '\'' +
                ", buildingNumber='" + buildingNumber + '\'' +
                ", apartmentNumber='" + apartmentNumber + '\'' +
                ", province='" + province + '\'' +
                ", kycFlowBasicStatus=" + kycFlowBasicStatus +
                ", identityStatus=" + identityStatus +
                '}';
    }
}
