package com.gmail.chigantseva.streetdataapi.domain;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {
    @JsonAlias("postal_code")
    private String postalCode;

    @JsonAlias("country")
    private String country;

    @JsonAlias("country_iso_code")
    private String countryIsoCode;

    @JsonAlias("federal_district")
    private String federalDistrict;

    @JsonAlias("region_fias_id")
    private String regionFiasId;

    @JsonAlias("region_kladr_id")
    private String regionKladrId;

    @JsonAlias("region_iso_code")
    private String regionIsoCode;

    @JsonAlias("region_with_type")
    private String regionWithType;

    @JsonAlias("region_type")
    private String regionType;

    @JsonAlias("region_type_full")
    private String regionTypeFull;

    @JsonAlias("region")
    private String region;

    @JsonAlias("area_fias_id")
    private String areaFiasId;

    @JsonAlias("area_kladr_id")
    private String areaKladrId;

    @JsonAlias("area_with_type")
    private String areaWithType;

    @JsonAlias("area_type")
    private String areaType;

    @JsonAlias("area_type_full")
    private String areaTypeFull;

    @JsonAlias("area")
    private String area;

    @JsonAlias("city_fias_id")
    private String cityFiasId;

    @JsonAlias("city_kladr_id")
    private String cityKladrId;

    @JsonAlias("city_with_type")
    private String cityWithType;

    @JsonAlias("city_type")
    private String cityType;

    @JsonAlias("city_type_full")
    private String cityTypeFull;

    @JsonAlias("city")
    private String city;

    @JsonAlias("city_district_fias_id")
    private String cityDistrictFiasId;

    @JsonAlias("city_district_kladr_id")
    private String cityDistrictKladrId;

    @JsonAlias("city_district_with_type")
    private String cityDistrictWithType;

    @JsonAlias("city_district_type")
    private String cityDistrictType;

    @JsonAlias("city_district_type_full")
    private String cityDistrictTypeFull;

    @JsonAlias("city_district")
    private String cityDistrict;

    @JsonAlias("settlement_fias_id")
    private String settlementFiasId;

    @JsonAlias("settlement_kladr_id")
    private String settlement_kladr_id;

    @JsonAlias("settlement_with_type")
    private String settlementWithType;

    @JsonAlias("settlement_type")
    private String settlementType;

    @JsonAlias("settlement_type_full")
    private String settlementTypeFull;

    @JsonAlias("settlement")
    private String settlement;

    @JsonAlias("street_fias_id")
    private String streetFiasId;

    @JsonAlias("street_kladr_id")
    private String streetKladrId;

    @JsonAlias("street_with_type")
    private String streetWithType;

    @JsonAlias("street_type")
    private String streetType;

    @JsonAlias("street_type_full")
    private String streetTypeFull;

    @JsonAlias("street")
    private String street;

    @JsonAlias("stead_fias_id")
    private String steadFiasId;

    @JsonAlias("stead_kladr_id")
    private String steadKladrId;

    @JsonAlias("stead_cadnum")
    private String steadCadnum;

    @JsonAlias("stead_type")
    private String steadType;

    @JsonAlias("stead_type_full")
    private String steadTypeFull;

    @JsonAlias("stead")
    private String stead;

    @JsonAlias("house_fias_id")
    private String houseFiasId;

    @JsonAlias("house_kladr_id")
    private String houseKladrId;

    @JsonAlias("house_cadnum")
    private String houseCadnum;

    @JsonAlias("house_type")
    private String houseType;

    @JsonAlias("house_type_full")
    private String houseTypeFull;

    @JsonAlias("house")
    private String house;

    @JsonAlias("block_type")
    private String blockType;

    @JsonAlias("block_type_full")
    private String blockTypeFull;

    @JsonAlias("block")
    private String block;

    @JsonAlias("entrance")
    private String entrance;

    @JsonAlias("floor")
    private String floor;

    @JsonAlias("flat_fias_id")
    private String flatFiasId;

    @JsonAlias("flat_cadnum")
    private String flatCadnum;

    @JsonAlias("flat_type")
    private String flatType;

    @JsonAlias("flat_type_full")
    private String flatTypeFull;

    @JsonAlias("flat")
    private String flat;

    @JsonAlias("postal_box")
    private String postalBox;

    @JsonAlias("fias_id")
    private String fiasId;

    @JsonAlias("fias_level")
    private String fiasLevel;

    @JsonAlias("kladr_id")
    private String kladrId;

    @JsonAlias("geoname_id")
    private String geonameId;

    @JsonAlias("capital_marker")
    private String capitalMarker;

    @JsonAlias("okato")
    private String okato;

    @JsonAlias("oktmo")
    private String oktmo;

    @JsonAlias("tax_office")
    private String taxOffice;

    @JsonAlias("tax_office_legal")
    private String taxOfficeLegal;

    @JsonAlias("history_values")
    private List<String> historyValues;

    @JsonAlias("geo_lat")
    private String geoLat;

    @JsonAlias("geo_lon")
    private String geoLon;

    @JsonAlias("qc_geo")
    private String qcGeo;

    @JsonAlias("fias_code")
    private String fiasCode;

    @JsonAlias("fias_actuality_state")
    private String fiasActualityState;

    @JsonAlias("city_area")
    private String cityArea;

    @JsonAlias("beltway_hit")
    private String beltwayHit;

    @JsonAlias("beltway_distance")
    private String beltwayDistance;

    @JsonAlias("flat_area")
    private String flatArea;

    @JsonAlias("square_meter_price")
    private String squareMeterPrice;

    @JsonAlias("flat_price")
    private String flatPrice;

    @JsonAlias("timezone")
    private String timezone;

    @JsonAlias("metro")
    private List<Metro> metro;

    @JsonAlias("qc_complete")
    private String qcComplete;

    @JsonAlias("qc_house")
    private String qcHouse;

    @JsonAlias("qc")
    private String qc;

    @JsonAlias("source")
    private String source;

    @JsonAlias("unparsed_parts")
    private String unparsedParts;
}
