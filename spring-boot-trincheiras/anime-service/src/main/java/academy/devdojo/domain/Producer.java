package academy.devdojo.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
public class Producer {

    private Long id;
    private String name;
    private LocalDateTime createdAt;
    private static List<Producer> producers = new ArrayList<>();

    static {

        Producer mappa = Producer.builder()
                .id(1L)
                .name("Mappa")
                .createdAt(LocalDateTime.now())
                .build();

        Producer kyotoAnimation = Producer.builder()
                .id(2L)
                .name("Kyoto Animation")
                .createdAt(LocalDateTime.now())
                .build();

        Producer madhouse = Producer.builder()
                .id(3L)
                .name("Madhouse")
                .createdAt(LocalDateTime.now())
                .build();

        producers.addAll(List.of(mappa, kyotoAnimation, madhouse));
    }

    public static List<Producer> getProducers() {

        return producers;
    }
}
