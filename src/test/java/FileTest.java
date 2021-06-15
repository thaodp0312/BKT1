import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

public class FileTest {
    String str = "You Only Live Once. But if You do it right. once is Enough";
    demtu dt2 = new demtu();
    @Test
    public void testMethodchuoi1() {


        assertThat(dt2.sotu(str)).isEqualTo(7)
                .isNotNull();
    }
    @Test
    public void testMethodchuoi2() {
        assertThat(dt2.inhoa(str)).isEqualTo("You Only Live Once. But If You Do It Right. Once Is Enough")
                .isNotNull();
    }
    @Test
    public void testMethodchuoi3() {
        assertThat(dt2.chuyenkytu(str)).isEqualTo("You only live once. But if you do it right. Once is enough")
                .isNotNull();
    }

}
