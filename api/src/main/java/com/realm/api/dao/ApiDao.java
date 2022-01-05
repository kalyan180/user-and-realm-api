package com.realm.api.dao;

import com.realm.api.model.Api;

public interface ApiDao  {
	Api createApi(Api api);
	Api updateApi(Api api);
	Api getApi(Integer id);
	String deleteApiById(Integer id);


}
