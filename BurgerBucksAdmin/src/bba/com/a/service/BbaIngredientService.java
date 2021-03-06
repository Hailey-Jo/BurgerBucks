package bba.com.a.service;

import java.util.List;

import bba.com.a.model.Bb_IngredientDto;
import bba.com.a.model.Bb_ImageDto;

public interface BbaIngredientService {
	
	/*--------------------------------------------------------------------------------------------
	 * 재료 새로 등록 (이미지와함께) 
	 *-------------------------------------------------------------------------------------------*/
	public Bb_IngredientDto registerIng(Bb_IngredientDto bbdto, Bb_ImageDto bidto);
	/*--------------------------------------------------------------------------------------------
	 * 재료 리스트 불러오기(이미지와함께) 
	 *-------------------------------------------------------------------------------------------*/
	public List<Bb_IngredientDto> getIngList();
	/*--------------------------------------------------------------------------------------------
	 * 재료 수정을 위한 디테일 불러오기
	 *-------------------------------------------------------------------------------------------*/	
	public Bb_IngredientDto getIngDetail(int seq);
	
	/*--------------------------------------------------------------------------------------------
	 * 재료 테이블 수정
	 *-------------------------------------------------------------------------------------------*/	
	public void updateIngAf(Bb_IngredientDto bbdto);
	/*--------------------------------------------------------------------------------------------
	 * 재료 이미지 수정
	 *-------------------------------------------------------------------------------------------*/	
	public void updateIngImageAf(Bb_ImageDto bidto);
	
	/*--------------------------------------------------------------------------------------------
	 * 재료랑 이미지 삭제하기
	 *-------------------------------------------------------------------------------------------*/
	
	public void deleteIng(int seq, int image_Seq);

}
