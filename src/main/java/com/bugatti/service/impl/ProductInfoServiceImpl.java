package com.bugatti.service.impl;

import com.bugatti.dataObject.ProductInfo;
import com.bugatti.enums.ProductStatusEnums;
import com.bugatti.repository.ProductInfoRepository;
import com.bugatti.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductInfoServiceImpl implements ProductInfoService {
    @Autowired
    private ProductInfoRepository repository;

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return repository.save (productInfo);
    }

    @Override
    public ProductInfo findOne(String productId) {
        return repository.findOne (productId);
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return repository.findAll (pageable);
    }

    @Override
    public List<ProductInfo> findUpAll(Integer productStatus) {
        return repository.findByProductStatus (ProductStatusEnums.UP.getCode ());
    }
}
