package com.jason.ticket_booker.services;

import com.jason.ticket_booker.domain.CreateEventRequest;
import com.jason.ticket_booker.domain.entities.Event;

import java.util.UUID;

public interface EventService {
    Event createEvent(UUID organizerId, CreateEventRequest event);
}
