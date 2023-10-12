import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Customer customer;

    @BeforeEach
    public void setUp(){
        customer = new Customer("Amy", 1500);
    }

    @Test
    public void customerHasName(){
        assertThat(customer.getCustomerName()).isEqualTo("Amy");
    }

    @Test
    public void customerWalletAmount(){
        assertThat(customer.getWalletAmount()).isEqualTo(1500);
    }

    @Test
    public void canWithdrawAmount(){
        customer.reduceMoney(500);
        assertThat(customer.getWalletAmount()).isEqualTo(1000);
    }
}
