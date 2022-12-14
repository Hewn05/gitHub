package com.study.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.study.springboot.dao.Transaction1Dao;
import com.study.springboot.dao.Transaction2Dao;

@Service
public class BuyTicketServiceImpl implements BuyTicketService{

	@Autowired
	Transaction1Dao trans1;
	@Autowired
	Transaction2Dao trans2;
//	@Autowired
//	PlatformTransactionManager transactionManager;
//	@Autowired
//	TransactionDefinition transDef;
	@Autowired
	TransactionTemplate transactionTemplate;
	
	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public int buy(String consumerId, int amount, String error) {
		
//		TransactionStatus status = transactionManager.getTransaction(transDef);
		try {
			transactionTemplate.execute(new TransactionCallbackWithoutResult() {
				@Override
				protected void doInTransactionWithoutResult(TransactionStatus status) {
					trans1.pay(consumerId,  amount);
					if(error.equals("1")) {int n=10/0;}   //억지로 에러발생
					trans2.pay(consumerId,  amount);
				}
			});
			
//			transactionManager.commit(status);			
			return 1;
		}catch(Exception e) {
//			e.printStackTrace();
//			transactionManager.rollback(status);
			System.out.println("transactionTemplate rollback");
			return 0;
		}
	}

}
