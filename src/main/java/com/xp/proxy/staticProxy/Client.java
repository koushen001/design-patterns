package com.xp.proxy.staticProxy;

import com.xp.proxy.common.IDBQuery;

/**
 * Created by xiaop on 2018/5/27.
 */
public class Client {
    public static void main(String args[]){
        IDBQuery q = new DBQueryProxy();
        q.request(); //在使用的时候
    }
}
