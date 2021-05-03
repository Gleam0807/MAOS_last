package com.mcos.evaluation.persistence;

import java.util.List;

import com.mcos.community.common.Pagination;
import com.mcos.evaluation.domain.EvaluationVO;

public interface EvaluationDAO {
	
	//직원평가하기
	public void saveEvaluation(EvaluationVO vo)throws Exception;
	
	//직원평가 상세보기
	public EvaluationVO readEvaluation(int evalid)throws Exception;
	
	//직원평가 삭제하기
	public void deleteEvaluation(int evalid)throws Exception;
	
	//직원평가 리스트
	public List<EvaluationVO> listAll(Pagination pagination)throws Exception;
	
	//총 게시글 개수 확인
	public int evalListCnt() throws Exception;
}
