package com.addressbookDB;

import com.bridgelabz.contactInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AddressBookTest {
    AddressBookService addressBookService;

    @BeforeEach
    void setUp() {
        addressBookService = new AddressBookService();
    }

    @Test
    void givenPersonInfoInDB_WhenRetrieved_ShouldMatchContactCount() {
        List<contactInfo> contactInfoList = addressBookService.readPersonInfoData(AddressBookService.IOService.DB_IO);
        Assertions.assertEquals(6, contactInfoList.size());
    }
}
