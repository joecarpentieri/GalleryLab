import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtistTest {

    Artist artist;

    @BeforeEach
    public void setUp() {
        artist = new Artist("Tim");
    }

    @Test
    public void artistHasName(){
        assertThat(artist.getArtistName()).isEqualTo("Tim");
    }
}
