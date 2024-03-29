package com.aidebar.greendaotest.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.yottamobile.doraemon.bean.DBScoreBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "DBSCORE_BEAN".
*/
public class DBScoreBeanDao extends AbstractDao<DBScoreBean, Long> {

    public static final String TABLENAME = "DBSCORE_BEAN";

    /**
     * Properties of entity DBScoreBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property UserId = new Property(0, long.class, "userId", true, "_id");
        public final static Property Score = new Property(1, int.class, "score", false, "DBScoreBean");
    }


    public DBScoreBeanDao(DaoConfig config) {
        super(config);
    }
    
    public DBScoreBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"DBSCORE_BEAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY NOT NULL ," + // 0: userId
                "\"DBScoreBean\" INTEGER NOT NULL );"); // 1: score
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"DBSCORE_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, DBScoreBean entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getUserId());
        stmt.bindLong(2, entity.getScore());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, DBScoreBean entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getUserId());
        stmt.bindLong(2, entity.getScore());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 0);
    }    

    @Override
    public DBScoreBean readEntity(Cursor cursor, int offset) {
        DBScoreBean entity = new DBScoreBean( //
            cursor.getLong(offset + 0), // userId
            cursor.getInt(offset + 1) // score
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, DBScoreBean entity, int offset) {
        entity.setUserId(cursor.getLong(offset + 0));
        entity.setScore(cursor.getInt(offset + 1));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(DBScoreBean entity, long rowId) {
        entity.setUserId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(DBScoreBean entity) {
        if(entity != null) {
            return entity.getUserId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(DBScoreBean entity) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
