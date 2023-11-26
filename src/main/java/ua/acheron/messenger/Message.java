package ua.acheron.messenger;

import lombok.Builder;
import lombok.Data;
import lombok.Value;

import java.time.LocalDateTime;

@Data
@Builder
public class Message {
    String content;
    String sender;

}
