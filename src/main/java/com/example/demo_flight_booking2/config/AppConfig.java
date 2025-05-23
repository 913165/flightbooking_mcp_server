package com.example.demo_flight_booking2.config;

import com.example.demo_flight_booking2.service.FlightBookingService;
import org.springframework.ai.support.ToolCallbacks;
import org.springframework.ai.tool.ToolCallback;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AppConfig {
    @Bean
    public List<ToolCallback> toolCallbacks(FlightBookingService flightBookingService) {
        return List.of(ToolCallbacks.from(flightBookingService));
    }
}
