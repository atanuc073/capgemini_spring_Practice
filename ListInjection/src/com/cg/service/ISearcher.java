package com.cg.service;

import java.util.List;

public interface ISearcher {
	boolean search(String str);
	List<String> searchStartsWith(String str);
	List<String> displayAll();
}
