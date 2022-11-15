package com.shop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.shop.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{
	//쿼리 메소드
	//find + entity + 변수명
	List<Item> findByItemNm(String itemNm);
	//and or  between
	List<Item> findByItemNmOrItemDetail(String itemNm, String itemDetail);
	//LessThan LessThanEqual GreaterThan GreaterThanEqual
	List<Item> findByPriceLessThan(Integer price);
	//OrderBy DESC
	List<Item> findByPriceLessThanOrderByPriceDesc(Integer price);
	
	// JPQL java persistence query language
	@Query("select i from Item i where i.itemDetail like %:itemDetail% order by i.price desc")
	List<Item> findByItemDetail(@Param("itemDetail") String itemDetail);
	
	@Query(value = "select * from item i where i.item_detail like %:itemDetail% order by i.price desc", nativeQuery = true)
    List<Item> findByItemDetailByNative(@Param("itemDetail") String itemDetail);
	
	
}