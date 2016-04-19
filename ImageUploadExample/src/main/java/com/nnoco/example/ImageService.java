package com.nnoco.example;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ImageService {
	private Map<String, ImageFile> imageFilesMap;
	
	public ImageService() {
		init();
	}
	
	/**
	 * 초기화
	 */
	private void init() {
		imageFilesMap = new HashMap<String, ImageFile>();
	}
	
	/**
	 * ID로 이미지 파일 가져오기
	 */
	public ImageFile get(String id) {
		return imageFilesMap.get(id);
	}
	
	/**
	 * Multipart File을 파일로 저장하고 DB(를 빙자한 맵)에 업로드 파일 정보 저장, 실패하는 경우 null리
	 */
	public ImageFile save(MultipartFile multipartFile) {
		// UUID로 유일할 것 같은 값 생성.. 낮은 확률로 중복 가능성이 있음
		String genId = UUID.randomUUID().toString();
		ImageFile imageFile = null;
		
		try {
			String savedFileName = saveToFile(multipartFile, genId);
			
			imageFile = new ImageFile(genId, 
					multipartFile.getContentType(),
					(int)multipartFile.getSize(),
					savedFileName);
			
			imageFilesMap.put(genId, imageFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return imageFile;
	}
	
	/**
	 * Multipart File의 내용을 파일로 저장, 저장 후 저장된 파일 이름을 반환
	 */
	private String saveToFile(MultipartFile src, String id) throws IOException {
		String fileName = src.getOriginalFilename();
		byte[] bytes = src.getBytes();
		String saveFileName = id + "." + getExtension(fileName);
		String savePath = ImageFile.IMAGE_DIR + saveFileName;

		/* 파일 쓰기 */
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(savePath));
		bos.write(bytes);
		bos.flush();
		bos.close();
		
		return saveFileName;
	}
	
	/**
	 * 파일이름으로부터 확장자를 반환하는 메서드
	 * 파일이름에 확장자 구분을 위한 . 문자가 없거나. 가장 끝에 있는 경우는 빈문자열 ""을 리턴
	 */
	private String getExtension(String fileName) {
		int dotPosition = fileName.lastIndexOf('.');
		
		if (-1 != dotPosition && fileName.length() - 1 > dotPosition) {
			return fileName.substring(dotPosition + 1);
		} else {
			return "";
		}
	}
}
