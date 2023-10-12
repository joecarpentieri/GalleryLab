import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

    Gallery gallery;

    @BeforeEach
    public void setUp(){
        gallery = new Gallery("Gallery One", 0);
    }

    @Test
    public void GalleryName(){
        assertThat(gallery.getGalleryName()).isEqualTo("Gallery One");
    }

    @Test
    public void artworkTill(){
        assertThat(gallery.getGalleryTill()).isEqualTo(0);
    }

}
