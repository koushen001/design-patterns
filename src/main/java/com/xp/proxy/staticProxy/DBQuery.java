package com.xp.proxy.staticProxy;

import com.xp.proxy.common.IDBQuery;

/**
 * Created by xiaop on 2018/5/27.
 */
public class DBQuery implements IDBQuery {

   public DBQuery(){

       try {
           Thread.sleep(1000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
   }

    @Override
    public String request() {
        return "request string";
    }
}
