package com.xp.proxy.staticProxy;

import com.xp.proxy.common.IDBQuery;

/**
 * Created by xiaop on 2018/5/27.
 */
public class DBQueryProxy implements IDBQuery {

    private DBQuery real = null;
    @Override
    public String request() {

        if (real == null){
            real = new DBQuery();
        }
        return real.request();
    }
}
