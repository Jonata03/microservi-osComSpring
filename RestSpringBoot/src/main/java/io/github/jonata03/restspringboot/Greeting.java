package io.github.jonata03.restspringboot;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Greeting {
    private final long id;
    private final String content;

}
