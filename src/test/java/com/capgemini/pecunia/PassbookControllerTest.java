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

}
