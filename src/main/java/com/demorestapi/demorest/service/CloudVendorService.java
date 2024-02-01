package com.demorestapi.demorest.service;
import com.demorestapi.demorest.model.CloudVendor;

import java.util.List;


public interface CloudVendorService {

    public String deleteCloudVendor(String cloudVendorId);
    public CloudVendor getCloudVendor(String cloudVendorId);
    public List<CloudVendor> getAllCloudVendor();

    public List<CloudVendor> getByVendorName(String vendorName);

    String createCloudVendor(CloudVendor cloudVendor);

    String updateCloudVendor(CloudVendor cloudVendor);
}
