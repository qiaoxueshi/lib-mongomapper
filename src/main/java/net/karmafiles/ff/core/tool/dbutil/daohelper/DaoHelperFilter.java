package net.karmafiles.ff.core.tool.dbutil.daohelper;

import com.mongodb.DBCollection;
import com.mongodb.DBObject;

/**
 * Created by Ilya Brodotsky
 * Date: 17.10.2010
 * Time: 17:26:55
 * <p/>
 * All rights reserved.
 * <p/>
 * Contact me:
 * email, jabber: ilya.brodotsky@gmail.com
 * skype: ilya.brodotsky
 */

public interface DaoHelperFilter {
    public DBObject doFilter(DBCollection dbCollection, DBObject entity);
}