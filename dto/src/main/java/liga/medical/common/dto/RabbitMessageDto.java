package liga.medical.common.dto;

import lombok.Data;

@Data
public class RabbitMessageDto {

    private Long id;

    private MessageType messageType;

    private String description;
}
