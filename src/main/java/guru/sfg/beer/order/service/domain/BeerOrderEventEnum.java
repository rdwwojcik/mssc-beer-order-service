package guru.sfg.beer.order.service.domain;

/**
 * Created by radek on 2023-07-07
 */
public enum BeerOrderEventEnum {

    VALIDATE_ORDER, VALIDATION_PASSED, VALIDATION_FAILED,
    ALLOCATION_SUCCESS, ALLOCATION_NO_INVENTORY, ALLOCATION_FAILED,
    BEERORDER_PICKED_UP
}
