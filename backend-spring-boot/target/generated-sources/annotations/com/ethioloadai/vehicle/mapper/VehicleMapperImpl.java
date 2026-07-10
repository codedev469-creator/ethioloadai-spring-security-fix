package com.ethioloadai.vehicle.mapper;

import com.ethioloadai.vehicle.dto.VehicleCreateRequest;
import com.ethioloadai.vehicle.dto.VehicleResponse;
import com.ethioloadai.vehicle.dto.VehicleUpdateRequest;
import com.ethioloadai.vehicle.entity.Vehicle;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-07-09T18:08:03+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.11 (Eclipse Adoptium)"
)
@Component
public class VehicleMapperImpl implements VehicleMapper {

    @Override
    public Vehicle toEntity(VehicleCreateRequest request) {
        if ( request == null ) {
            return null;
        }

        Vehicle.VehicleBuilder vehicle = Vehicle.builder();

        vehicle.truckType( request.getTruckType() );
        vehicle.vehicleCategory( vehicleCategoryToVehicleCategory( request.getVehicleCategory() ) );
        vehicle.plateNumber( request.getPlateNumber() );
        vehicle.capacity( request.getCapacity() );
        vehicle.currentCity( request.getCurrentCity() );
        vehicle.latitude( request.getLatitude() );
        vehicle.longitude( request.getLongitude() );

        return vehicle.build();
    }

    @Override
    public VehicleResponse toResponse(Vehicle vehicle) {
        if ( vehicle == null ) {
            return null;
        }

        VehicleResponse.VehicleResponseBuilder vehicleResponse = VehicleResponse.builder();

        vehicleResponse.id( vehicle.getId() );
        vehicleResponse.userId( vehicle.getUserId() );
        vehicleResponse.fleetOwnerId( vehicle.getFleetOwnerId() );
        vehicleResponse.truckType( vehicle.getTruckType() );
        vehicleResponse.vehicleCategory( vehicleCategoryToVehicleCategory1( vehicle.getVehicleCategory() ) );
        vehicleResponse.plateNumber( vehicle.getPlateNumber() );
        vehicleResponse.capacity( vehicle.getCapacity() );
        vehicleResponse.currentCity( vehicle.getCurrentCity() );
        vehicleResponse.latitude( vehicle.getLatitude() );
        vehicleResponse.longitude( vehicle.getLongitude() );
        vehicleResponse.lastLocationAt( vehicle.getLastLocationAt() );
        vehicleResponse.availabilityStatus( vehicle.getAvailabilityStatus() );
        vehicleResponse.rating( vehicle.getRating() );
        vehicleResponse.createdAt( vehicle.getCreatedAt() );
        vehicleResponse.updatedAt( vehicle.getUpdatedAt() );

        return vehicleResponse.build();
    }

    @Override
    public void updateEntityFromDto(VehicleUpdateRequest request, Vehicle vehicle) {
        if ( request == null ) {
            return;
        }

        if ( request.getTruckType() != null ) {
            vehicle.setTruckType( request.getTruckType() );
        }
        if ( request.getVehicleCategory() != null ) {
            vehicle.setVehicleCategory( vehicleCategoryToVehicleCategory2( request.getVehicleCategory() ) );
        }
        if ( request.getPlateNumber() != null ) {
            vehicle.setPlateNumber( request.getPlateNumber() );
        }
        if ( request.getCapacity() != null ) {
            vehicle.setCapacity( request.getCapacity() );
        }
        if ( request.getCurrentCity() != null ) {
            vehicle.setCurrentCity( request.getCurrentCity() );
        }
        if ( request.getLatitude() != null ) {
            vehicle.setLatitude( request.getLatitude() );
        }
        if ( request.getLongitude() != null ) {
            vehicle.setLongitude( request.getLongitude() );
        }
        if ( request.getAvailabilityStatus() != null ) {
            vehicle.setAvailabilityStatus( request.getAvailabilityStatus() );
        }
    }

    protected Vehicle.VehicleCategory vehicleCategoryToVehicleCategory(VehicleCreateRequest.VehicleCategory vehicleCategory) {
        if ( vehicleCategory == null ) {
            return null;
        }

        Vehicle.VehicleCategory vehicleCategory1;

        switch ( vehicleCategory ) {
            case HEAVY: vehicleCategory1 = Vehicle.VehicleCategory.HEAVY;
            break;
            case LIGHT: vehicleCategory1 = Vehicle.VehicleCategory.LIGHT;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + vehicleCategory );
        }

        return vehicleCategory1;
    }

    protected VehicleResponse.VehicleCategory vehicleCategoryToVehicleCategory1(Vehicle.VehicleCategory vehicleCategory) {
        if ( vehicleCategory == null ) {
            return null;
        }

        VehicleResponse.VehicleCategory vehicleCategory1;

        switch ( vehicleCategory ) {
            case HEAVY: vehicleCategory1 = VehicleResponse.VehicleCategory.HEAVY;
            break;
            case LIGHT: vehicleCategory1 = VehicleResponse.VehicleCategory.LIGHT;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + vehicleCategory );
        }

        return vehicleCategory1;
    }

    protected Vehicle.VehicleCategory vehicleCategoryToVehicleCategory2(VehicleUpdateRequest.VehicleCategory vehicleCategory) {
        if ( vehicleCategory == null ) {
            return null;
        }

        Vehicle.VehicleCategory vehicleCategory1;

        switch ( vehicleCategory ) {
            case HEAVY: vehicleCategory1 = Vehicle.VehicleCategory.HEAVY;
            break;
            case LIGHT: vehicleCategory1 = Vehicle.VehicleCategory.LIGHT;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + vehicleCategory );
        }

        return vehicleCategory1;
    }
}
