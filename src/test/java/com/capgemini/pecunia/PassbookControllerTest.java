package com.capgemini.pecunia;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.mockito.Mockito.when;

import com.capgemini.pecunia.entity.Transaction;
import com.capgemini.pecunia.service.PassbookService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PassbookControllerTest {
   
                                                 
    @MockBean                           
    private PassbookService passbookService;
                                               
    private List<Transaction> transactionList;       
                                            
 
    
    @Test
    public void testShouldGetAllTransactions() throws Exception{	
      this.transactionList = new ArrayList<Transaction>();                    
      this.transactionList.add(new Transaction("TR001", "Debit", 3000.0,LocalDate.of(2020, 9, 2),  "100000000001", null));  
      this.transactionList.add(new Transaction("TR002", "Credit", 4000.0,LocalDate.of(2020, 9, 10), "100000000001", null));
    	when(passbookService.accountSummary("100000000001",LocalDate.of(2020, 9, 2),LocalDate.of(2020, 9, 10))).thenReturn(transactionList);
    	assertEquals(2,passbookService.accountSummary("100000000001",LocalDate.of(2020, 9, 2),LocalDate.of(2020, 9, 10)).size());
    }
    
    @Test
    public void testAccountValidation() throws Exception{
    	when(passbookService.accountValidation("100000000001")).thenReturn(true);
    	assertEquals(true, passbookService.accountValidation("100000000001"));
    }
    
    @Test
    public void testUpdatePassbook() throws Exception{
        this.transactionList = new ArrayList<Transaction>();                    
        this.transactionList.add(new Transaction("TR001", "Debit", 3000.0,LocalDate.of(2020, 9, 2),  "100000000001", null));  
        this.transactionList.add(new Transaction("TR002", "Credit", 4000.0,LocalDate.of(2020, 9, 10), "100000000001", null));
    	when(passbookService.updatePassbook("100000000001")).thenReturn(transactionList);
    	assertEquals(2, passbookService.updatePassbook("100000000001").size());
    }
}
