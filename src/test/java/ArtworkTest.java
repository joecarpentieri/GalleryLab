import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {

    Artwork artwork;
    Artist artist;

    @BeforeEach
    public void setUp(){
        artwork = new Artwork("Mona Lisa", artist, 1000);
    };

    @Test
    public void artworkTitle(){
        assertThat(artwork.getArtworkTitle()).isEqualTo("Mona Lisa");
    }

    @Test
    public void artworkArtist(){
        assertThat(artwork.getArtworkArtist()).isEqualTo(artist);
    }

    @Test
    public void artworkPrice(){
        assertThat(artwork.getArtworkPrice()).isEqualTo(1000);
    }

}
