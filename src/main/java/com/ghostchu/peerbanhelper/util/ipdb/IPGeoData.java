package com.ghostchu.peerbanhelper.util.ipdb;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.Nullable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public final class IPGeoData {
    @Nullable
    private CityData city;
    @Nullable
    private CountryData country;
    @Nullable
    private ASData as;
    @Nullable
    private NetworkData network;

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static final class CityData {
        @Nullable
        private String name;

        @Nullable
        private Long iso;

        @Nullable
        private LocationData location;

        @Nullable
        private String cnProvince;

        @Nullable
        private String cnCity;

        @Nullable
        private String cnDistricts;

        @AllArgsConstructor
        @NoArgsConstructor
        @Data
        public static final class LocationData {
            @Nullable
            private Double latitude;
            @Nullable
            private Double longitude;
            @Nullable
            private String timeZone;
            @Nullable
            private Integer accuracyRadius;
        }
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static final class CountryData {
        @Nullable
        private String name;
        @Nullable
        private String iso;

    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static final class ASData {
        @Nullable
        private Long number;
        @Nullable
        private String organization;
        @Nullable
        private String ipAddress;
        @Nullable
        private ASNetwork network;

        @AllArgsConstructor
        @NoArgsConstructor
        @Data
        public static final class ASNetwork {
            @Nullable
            private String ipAddress;
            @Nullable
            private Integer prefixLength;
        }
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static final class NetworkData {
        @Nullable
        private String isp;
        @Nullable
        private String netType;
    }
}
