package com.nk.service;

import com.nk.model.Picture;

import java.util.List;

public interface IPictureService {

    List<Picture> findAll();

    String findStuIdById(Long id);

    List<Picture> findAllByStuId(String id);

    Picture findAllById(Long id);

    void deletePictureById(Long id);
}
