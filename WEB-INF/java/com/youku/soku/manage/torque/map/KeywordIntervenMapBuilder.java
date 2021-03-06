package com.youku.soku.manage.torque.map;

import org.apache.torque.Torque;
import org.apache.torque.TorqueException;
import org.apache.torque.map.ColumnMap;
import org.apache.torque.map.DatabaseMap;
import org.apache.torque.map.MapBuilder;
import org.apache.torque.map.TableMap;

/**
 * keyword to interven
 *
  *  This class was autogenerated by Torque on:
  *
  * [Wed Mar 10 16:13:12 CST 2010]
  *
  */
public class KeywordIntervenMapBuilder implements MapBuilder
{
    /**
     * The name of this class
     */
    public static final String CLASS_NAME =
        "com.youku.soku.manage.torque.map.KeywordIntervenMapBuilder";

    /**
     * The database map.
     */
    private DatabaseMap dbMap = null;

    /**
     * Tells us if this DatabaseMapBuilder is built so that we
     * don't have to re-build it every time.
     *
     * @return true if this DatabaseMapBuilder is built
     */
    public boolean isBuilt()
    {
        return (dbMap != null);
    }

    /**
     * Gets the databasemap this map builder built.
     *
     * @return the databasemap
     */
    public DatabaseMap getDatabaseMap()
    {
        return this.dbMap;
    }

    /**
     * The doBuild() method builds the DatabaseMap
     *
     * @throws TorqueException
     */
    public synchronized void doBuild() throws TorqueException
    {
        if ( isBuilt() ) {
            return;
        }
        dbMap = Torque.getDatabaseMap("soku");

        dbMap.addTable("keyword_interven");
        TableMap tMap = dbMap.getTable("keyword_interven");
        tMap.setJavaName("KeywordInterven");
        tMap.setOMClass( com.youku.soku.manage.torque.KeywordInterven.class );
        tMap.setPeerClass( com.youku.soku.manage.torque.KeywordIntervenPeer.class );
        tMap.setDescription("keyword to interven");
        tMap.setPrimaryKeyMethod(TableMap.NATIVE);
        tMap.setPrimaryKeyMethodInfo("keyword_interven");

        ColumnMap cMap = null;


  // ------------- Column: keyword_id --------------------
        cMap = new ColumnMap( "keyword_id", tMap);
        cMap.setType( new Integer(0) );
        cMap.setTorqueType( "INTEGER" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(true);
        cMap.setNotNull(true);
        cMap.setJavaName( "KeywordId" );
        cMap.setAutoIncrement(true);
        cMap.setProtected(false);
        cMap.setDescription("Key Word Id");
        cMap.setInheritance("false");
        cMap.setPosition(1);
        tMap.addColumn(cMap);
  // ------------- Column: name --------------------
        cMap = new ColumnMap( "name", tMap);
        cMap.setType( "" );
        cMap.setTorqueType( "VARCHAR" );
        cMap.setUsePrimitive(true);
        cMap.setPrimaryKey(false);
        cMap.setNotNull(true);
        cMap.setJavaName( "Name" );
        cMap.setAutoIncrement(false);
        cMap.setProtected(false);
        cMap.setDescription("Keyword Name");
        cMap.setInheritance("false");
        cMap.setSize( 500 );
        cMap.setPosition(2);
        tMap.addColumn(cMap);
        tMap.setUseInheritance(false);
    }
}
