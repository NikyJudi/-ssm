package com.nk.service.impl;

import com.nk.dao.IPictureDao;
import com.nk.model.Picture;
import com.nk.service.IPictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PictureService implements IPictureService {

    @Autowired
    private IPictureDao pictureDao;

    @Override
    public List<Picture> findAll() {
        return pictureDao.findAll();
    }

    @Override
    public String findStuIdById(Long id) {
        return pictureDao.findStuIdById(id);
    }

    @Override
    public List<Picture> findAllByStuId(String id) {
        return pictureDao.findAllByStuId(id);
    }

    @Override
    public Picture findAllById(Long id) {
        return pictureDao.findAllById(id);
    }

    @Override
    public void deletePictureById(Long id) {
        pictureDao.deletePictureById(id);
    }

    @Override
    public Picture find(Long id) {
        return pictureDao.find(id);
    }

    @Override
    public void updateContent(String content, Long id) {
        pictureDao.updateContent(content, id);
    }
}
