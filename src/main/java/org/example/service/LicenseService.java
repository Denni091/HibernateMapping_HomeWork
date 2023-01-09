package org.example.service;

import org.example.dao.LicenseDao;
import org.example.entity.License;

public class LicenseService {

    private LicenseDao licenseDao = new LicenseDao();

    public void save(License license) {

        System.out.println("Licence for save: " + license.toString());
        licenseDao.save(license);
    }
}
