package com.addressbookDB;

import com.bridgelabz.contactInfo;

import java.util.List;

public class AddressBookService {
    private List<contactInfo> personInfoList;
    private final AddressBookDBService addressBookDBService;

    enum IOService {DB_IO}

    public AddressBookService() {
        addressBookDBService = AddressBookDBService.getInstance();
    }

    /**
     * Purpose : To get the list of person info from the database
     *
     * @param ioService takes enum
     * @return the contact details
     */
    public List<contactInfo> readPersonInfoData(IOService ioService) {
        if (ioService.equals(IOService.DB_IO))
            this.personInfoList = addressBookDBService.readData();
        return this.personInfoList;
    }
}
