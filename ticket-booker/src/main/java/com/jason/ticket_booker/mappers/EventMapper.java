package com.jason.ticket_booker.mappers;

import com.jason.ticket_booker.domain.CreateEventRequest;
import com.jason.ticket_booker.domain.CreateTicketTypeRequest;
import com.jason.ticket_booker.domain.dtos.CreateEventRequestDto;
import com.jason.ticket_booker.domain.dtos.CreateEventResponseDto;
import com.jason.ticket_booker.domain.dtos.CreateTicketTypeRequestDto;
import com.jason.ticket_booker.domain.dtos.CreateTicketTypeResponseDto;
import com.jason.ticket_booker.domain.entities.Event;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EventMapper {

    CreateTicketTypeRequest fromDto(CreateTicketTypeRequestDto dto);

    CreateEventRequest fromDto(CreateEventRequestDto dto);

    CreateEventResponseDto toDto(Event event);
    
}
