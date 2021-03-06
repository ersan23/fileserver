package com.huishu.file.FileServer.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.huishu.file.FileServer.entity.FilePdfImg;

/**
 * PDF文件
 * 
 * @author yindq
 * @date 2017年11月9日
 */
@Repository
public interface FilePdfImgRepository extends CrudRepository<FilePdfImg, Long> {

}
