package com.ethioloadai.freight.mapper;

import com.ethioloadai.freight.dto.CreateFreightRequest;
import com.ethioloadai.freight.dto.FreightResponse;
import com.ethioloadai.freight.dto.UpdateFreightRequest;
import com.ethioloadai.freight.entity.Freight;
import com.ethioloadai.user.entity.User;
import com.ethioloadai.vehicle.entity.Vehicle;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-07-09T18:08:03+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.11 (Eclipse Adoptium)"
)
@Component
public class FreightMapperImpl implements FreightMapper {

    @Override
    public Freight toEntity(CreateFreightRequest request) {
        if ( request == null ) {
            return null;
        }

        Freight.FreightBuilder freight = Freight.builder();

        freight.pickupLocation( request.getPickupLocation() );
        freight.pickupLatitude( request.getPickupLatitude() );
        freight.pickupLongitude( request.getPickupLongitude() );
        freight.destination( request.getDestination() );
        freight.destinationLatitude( request.getDestinationLatitude() );
        freight.destinationLongitude( request.getDestinationLongitude() );
        freight.materialType( request.getMaterialType() );
        freight.cargoDescription( request.getCargoDescription() );
        freight.weightTons( request.getWeightTons() );
        freight.volumeM3( request.getVolumeM3() );
        freight.budget( request.getBudget() );
        freight.distanceKm( request.getDistanceKm() );
        freight.deadline( request.getDeadline() );
        freight.urgencyLevel( request.getUrgencyLevel() );

        return freight.build();
    }

    @Override
    public FreightResponse toResponse(Freight freight) {
        if ( freight == null ) {
            return null;
        }

        FreightResponse.FreightResponseBuilder freightResponse = FreightResponse.builder();

        freightResponse.shipperId( freightShipperId( freight ) );
        freightResponse.shipperName( freightShipperFullName( freight ) );
        freightResponse.matchedDriverId( freightMatchedDriverId( freight ) );
        freightResponse.matchedDriverName( freightMatchedDriverFullName( freight ) );
        freightResponse.matchedVehicleId( freightMatchedVehicleId( freight ) );
        freightResponse.id( freight.getId() );
        freightResponse.pickupLocation( freight.getPickupLocation() );
        freightResponse.pickupLatitude( freight.getPickupLatitude() );
        freightResponse.pickupLongitude( freight.getPickupLongitude() );
        freightResponse.destination( freight.getDestination() );
        freightResponse.destinationLatitude( freight.getDestinationLatitude() );
        freightResponse.destinationLongitude( freight.getDestinationLongitude() );
        freightResponse.materialType( freight.getMaterialType() );
        freightResponse.cargoDescription( freight.getCargoDescription() );
        freightResponse.weightTons( freight.getWeightTons() );
        freightResponse.volumeM3( freight.getVolumeM3() );
        freightResponse.budget( freight.getBudget() );
        freightResponse.distanceKm( freight.getDistanceKm() );
        freightResponse.deadline( freight.getDeadline() );
        freightResponse.urgencyLevel( freight.getUrgencyLevel() );
        if ( freight.getStatus() != null ) {
            freightResponse.status( freight.getStatus().name() );
        }
        freightResponse.matchedPrice( freight.getMatchedPrice() );
        freightResponse.createdAt( freight.getCreatedAt() );
        freightResponse.updatedAt( freight.getUpdatedAt() );

        return freightResponse.build();
    }

    @Override
    public void updateEntityFromDto(UpdateFreightRequest request, Freight freight) {
        if ( request == null ) {
            return;
        }

        if ( request.getCargoDescription() != null ) {
            freight.setCargoDescription( request.getCargoDescription() );
        }
        if ( request.getBudget() != null ) {
            freight.setBudget( request.getBudget() );
        }
        if ( request.getDeadline() != null ) {
            freight.setDeadline( request.getDeadline() );
        }
        if ( request.getUrgencyLevel() != null ) {
            freight.setUrgencyLevel( request.getUrgencyLevel() );
        }
        if ( request.getStatus() != null ) {
            freight.setStatus( request.getStatus() );
        }
    }

    private Long freightShipperId(Freight freight) {
        if ( freight == null ) {
            return null;
        }
        User shipper = freight.getShipper();
        if ( shipper == null ) {
            return null;
        }
        Long id = shipper.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String freightShipperFullName(Freight freight) {
        if ( freight == null ) {
            return null;
        }
        User shipper = freight.getShipper();
        if ( shipper == null ) {
            return null;
        }
        String fullName = shipper.getFullName();
        if ( fullName == null ) {
            return null;
        }
        return fullName;
    }

    private Long freightMatchedDriverId(Freight freight) {
        if ( freight == null ) {
            return null;
        }
        User matchedDriver = freight.getMatchedDriver();
        if ( matchedDriver == null ) {
            return null;
        }
        Long id = matchedDriver.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String freightMatchedDriverFullName(Freight freight) {
        if ( freight == null ) {
            return null;
        }
        User matchedDriver = freight.getMatchedDriver();
        if ( matchedDriver == null ) {
            return null;
        }
        String fullName = matchedDriver.getFullName();
        if ( fullName == null ) {
            return null;
        }
        return fullName;
    }

    private Long freightMatchedVehicleId(Freight freight) {
        if ( freight == null ) {
            return null;
        }
        Vehicle matchedVehicle = freight.getMatchedVehicle();
        if ( matchedVehicle == null ) {
            return null;
        }
        Long id = matchedVehicle.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
