package com.youku.soku.library.load;


import java.math.BigDecimal;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.ObjectUtils;
import org.apache.torque.TorqueException;
import org.apache.torque.map.TableMap;
import org.apache.torque.om.BaseObject;
import org.apache.torque.om.ComboKey;
import org.apache.torque.om.DateKey;
import org.apache.torque.om.NumberKey;
import org.apache.torque.om.ObjectKey;
import org.apache.torque.om.SimpleKey;
import org.apache.torque.om.StringKey;
import org.apache.torque.om.Persistent;
import org.apache.torque.util.Criteria;
import org.apache.torque.util.Transaction;





/**
 * 自动搜索次数限制
 *
 * This class was autogenerated by Torque on:
 *
 * [Sat Apr 23 11:09:17 CST 2011]
 *
 * You should not use this class directly.  It should not even be
 * extended all references should be to SearchNums
 */
public abstract class BaseSearchNums extends BaseObject
{
    /** Serial version */
    private static final long serialVersionUID = 1303528157948L;

    /** The Peer class */
    private static final SearchNumsPeer peer =
        new SearchNumsPeer();


    /** The value for the id field */
    private int id;

    /** The value for the fkProgrammeSiteId field */
    private int fkProgrammeSiteId;

    /** The value for the orderId field */
    private int orderId;

    /** The value for the num field */
    private int num;

    /** The value for the updateTime field */
    private Date updateTime;

    /** The value for the createTime field */
    private Date createTime;


    /**
     * Get the Id
     *
     * @return int
     */
    public int getId()
    {
        return id;
    }


    /**
     * Set the value of Id
     *
     * @param v new value
     */
    public void setId(int v) 
    {

        if (this.id != v)
        {
            this.id = v;
            setModified(true);
        }


    }

    /**
     * Get the FkProgrammeSiteId
     *
     * @return int
     */
    public int getFkProgrammeSiteId()
    {
        return fkProgrammeSiteId;
    }


    /**
     * Set the value of FkProgrammeSiteId
     *
     * @param v new value
     */
    public void setFkProgrammeSiteId(int v) 
    {

        if (this.fkProgrammeSiteId != v)
        {
            this.fkProgrammeSiteId = v;
            setModified(true);
        }


    }

    /**
     * Get the OrderId
     *
     * @return int
     */
    public int getOrderId()
    {
        return orderId;
    }


    /**
     * Set the value of OrderId
     *
     * @param v new value
     */
    public void setOrderId(int v) 
    {

        if (this.orderId != v)
        {
            this.orderId = v;
            setModified(true);
        }


    }

    /**
     * Get the Num
     *
     * @return int
     */
    public int getNum()
    {
        return num;
    }


    /**
     * Set the value of Num
     *
     * @param v new value
     */
    public void setNum(int v) 
    {

        if (this.num != v)
        {
            this.num = v;
            setModified(true);
        }


    }

    /**
     * Get the UpdateTime
     *
     * @return Date
     */
    public Date getUpdateTime()
    {
        return updateTime;
    }


    /**
     * Set the value of UpdateTime
     *
     * @param v new value
     */
    public void setUpdateTime(Date v) 
    {

        if (!ObjectUtils.equals(this.updateTime, v))
        {
            this.updateTime = v;
            setModified(true);
        }


    }

    /**
     * Get the CreateTime
     *
     * @return Date
     */
    public Date getCreateTime()
    {
        return createTime;
    }


    /**
     * Set the value of CreateTime
     *
     * @param v new value
     */
    public void setCreateTime(Date v) 
    {

        if (!ObjectUtils.equals(this.createTime, v))
        {
            this.createTime = v;
            setModified(true);
        }


    }

       
        
    private static List fieldNames = null;

    /**
     * Generate a list of field names.
     *
     * @return a list of field names
     */
    public static synchronized List getFieldNames()
    {
        if (fieldNames == null)
        {
            fieldNames = new ArrayList();
            fieldNames.add("Id");
            fieldNames.add("FkProgrammeSiteId");
            fieldNames.add("OrderId");
            fieldNames.add("Num");
            fieldNames.add("UpdateTime");
            fieldNames.add("CreateTime");
            fieldNames = Collections.unmodifiableList(fieldNames);
        }
        return fieldNames;
    }

    /**
     * Retrieves a field from the object by field (Java) name passed in as a String.
     *
     * @param name field name
     * @return value
     */
    public Object getByName(String name)
    {
        if (name.equals("Id"))
        {
            return new Integer(getId());
        }
        if (name.equals("FkProgrammeSiteId"))
        {
            return new Integer(getFkProgrammeSiteId());
        }
        if (name.equals("OrderId"))
        {
            return new Integer(getOrderId());
        }
        if (name.equals("Num"))
        {
            return new Integer(getNum());
        }
        if (name.equals("UpdateTime"))
        {
            return getUpdateTime();
        }
        if (name.equals("CreateTime"))
        {
            return getCreateTime();
        }
        return null;
    }

    /**
     * Set a field in the object by field (Java) name.
     *
     * @param name field name
     * @param value field value
     * @return True if value was set, false if not (invalid name / protected field).
     * @throws IllegalArgumentException if object type of value does not match field object type.
     * @throws TorqueException If a problem occurs with the set[Field] method.
     */
    public boolean setByName(String name, Object value )
        throws TorqueException, IllegalArgumentException
    {
        if (name.equals("Id"))
        {
            if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setId(((Integer) value).intValue());
            return true;
        }
        if (name.equals("FkProgrammeSiteId"))
        {
            if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setFkProgrammeSiteId(((Integer) value).intValue());
            return true;
        }
        if (name.equals("OrderId"))
        {
            if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setOrderId(((Integer) value).intValue());
            return true;
        }
        if (name.equals("Num"))
        {
            if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setNum(((Integer) value).intValue());
            return true;
        }
        if (name.equals("UpdateTime"))
        {
            // Object fields can be null
            if (value != null && ! Date.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setUpdateTime((Date) value);
            return true;
        }
        if (name.equals("CreateTime"))
        {
            // Object fields can be null
            if (value != null && ! Date.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setCreateTime((Date) value);
            return true;
        }
        return false;
    }

    /**
     * Retrieves a field from the object by name passed in
     * as a String.  The String must be one of the static
     * Strings defined in this Class' Peer.
     *
     * @param name peer name
     * @return value
     */
    public Object getByPeerName(String name)
    {
        if (name.equals(SearchNumsPeer.ID))
        {
            return new Integer(getId());
        }
        if (name.equals(SearchNumsPeer.FK_PROGRAMME_SITE_ID))
        {
            return new Integer(getFkProgrammeSiteId());
        }
        if (name.equals(SearchNumsPeer.ORDER_ID))
        {
            return new Integer(getOrderId());
        }
        if (name.equals(SearchNumsPeer.NUM))
        {
            return new Integer(getNum());
        }
        if (name.equals(SearchNumsPeer.UPDATE_TIME))
        {
            return getUpdateTime();
        }
        if (name.equals(SearchNumsPeer.CREATE_TIME))
        {
            return getCreateTime();
        }
        return null;
    }

    /**
     * Set field values by Peer Field Name
     *
     * @param name field name
     * @param value field value
     * @return True if value was set, false if not (invalid name / protected field).
     * @throws IllegalArgumentException if object type of value does not match field object type.
     * @throws TorqueException If a problem occurs with the set[Field] method.
     */
    public boolean setByPeerName(String name, Object value)
        throws TorqueException, IllegalArgumentException
    {
      if (SearchNumsPeer.ID.equals(name))
        {
            return setByName("Id", value);
        }
      if (SearchNumsPeer.FK_PROGRAMME_SITE_ID.equals(name))
        {
            return setByName("FkProgrammeSiteId", value);
        }
      if (SearchNumsPeer.ORDER_ID.equals(name))
        {
            return setByName("OrderId", value);
        }
      if (SearchNumsPeer.NUM.equals(name))
        {
            return setByName("Num", value);
        }
      if (SearchNumsPeer.UPDATE_TIME.equals(name))
        {
            return setByName("UpdateTime", value);
        }
      if (SearchNumsPeer.CREATE_TIME.equals(name))
        {
            return setByName("CreateTime", value);
        }
        return false;
    }

    /**
     * Retrieves a field from the object by Position as specified
     * in the xml schema.  Zero-based.
     *
     * @param pos position in xml schema
     * @return value
     */
    public Object getByPosition(int pos)
    {
        if (pos == 0)
        {
            return new Integer(getId());
        }
        if (pos == 1)
        {
            return new Integer(getFkProgrammeSiteId());
        }
        if (pos == 2)
        {
            return new Integer(getOrderId());
        }
        if (pos == 3)
        {
            return new Integer(getNum());
        }
        if (pos == 4)
        {
            return getUpdateTime();
        }
        if (pos == 5)
        {
            return getCreateTime();
        }
        return null;
    }

    /**
     * Set field values by its position (zero based) in the XML schema.
     *
     * @param position The field position
     * @param value field value
     * @return True if value was set, false if not (invalid position / protected field).
     * @throws IllegalArgumentException if object type of value does not match field object type.
     * @throws TorqueException If a problem occurs with the set[Field] method.
     */
    public boolean setByPosition(int position, Object value)
        throws TorqueException, IllegalArgumentException
    {
    if (position == 0)
        {
            return setByName("Id", value);
        }
    if (position == 1)
        {
            return setByName("FkProgrammeSiteId", value);
        }
    if (position == 2)
        {
            return setByName("OrderId", value);
        }
    if (position == 3)
        {
            return setByName("Num", value);
        }
    if (position == 4)
        {
            return setByName("UpdateTime", value);
        }
    if (position == 5)
        {
            return setByName("CreateTime", value);
        }
        return false;
    }
     
    /**
     * Stores the object in the database.  If the object is new,
     * it inserts it; otherwise an update is performed.
     *
     * @throws Exception
     */
    public void save() throws Exception
    {
        save(SearchNumsPeer.DATABASE_NAME);
    }

    /**
     * Stores the object in the database.  If the object is new,
     * it inserts it; otherwise an update is performed.
     * Note: this code is here because the method body is
     * auto-generated conditionally and therefore needs to be
     * in this file instead of in the super class, BaseObject.
     *
     * @param dbName
     * @throws TorqueException
     */
    public void save(String dbName) throws TorqueException
    {
        Connection con = null;
        try
        {
            con = Transaction.begin(dbName);
            save(con);
            Transaction.commit(con);
        }
        catch(TorqueException e)
        {
            Transaction.safeRollback(con);
            throw e;
        }
    }

    /** flag to prevent endless save loop, if this object is referenced
        by another object which falls in this transaction. */
    private boolean alreadyInSave = false;
    /**
     * Stores the object in the database.  If the object is new,
     * it inserts it; otherwise an update is performed.  This method
     * is meant to be used as part of a transaction, otherwise use
     * the save() method and the connection details will be handled
     * internally
     *
     * @param con
     * @throws TorqueException
     */
    public void save(Connection con) throws TorqueException
    {
        if (!alreadyInSave)
        {
            alreadyInSave = true;



            // If this object has been modified, then save it to the database.
            if (isModified())
            {
                if (isNew())
                {
                    SearchNumsPeer.doInsert((SearchNums) this, con);
                    setNew(false);
                }
                else
                {
                    SearchNumsPeer.doUpdate((SearchNums) this, con);
                }
            }

            alreadyInSave = false;
        }
    }


    /**
     * Set the PrimaryKey using ObjectKey.
     *
     * @param key id ObjectKey
     */
    public void setPrimaryKey(ObjectKey key)
        
    {
        setId(((NumberKey) key).intValue());
    }

    /**
     * Set the PrimaryKey using a String.
     *
     * @param key
     */
    public void setPrimaryKey(String key) 
    {
        setId(Integer.parseInt(key));
    }


    /**
     * returns an id that differentiates this object from others
     * of its class.
     */
    public ObjectKey getPrimaryKey()
    {
        return SimpleKey.keyFor(getId());
    }
 

    /**
     * Makes a copy of this object.
     * It creates a new object filling in the simple attributes.
     * It then fills all the association collections and sets the
     * related objects to isNew=true.
     */
    public SearchNums copy() throws TorqueException
    {
        return copy(true);
    }

    /**
     * Makes a copy of this object using connection.
     * It creates a new object filling in the simple attributes.
     * It then fills all the association collections and sets the
     * related objects to isNew=true.
     *
     * @param con the database connection to read associated objects.
     */
    public SearchNums copy(Connection con) throws TorqueException
    {
        return copy(true, con);
    }

    /**
     * Makes a copy of this object.
     * It creates a new object filling in the simple attributes.
     * If the parameter deepcopy is true, it then fills all the
     * association collections and sets the related objects to
     * isNew=true.
     *
     * @param deepcopy whether to copy the associated objects.
     */
    public SearchNums copy(boolean deepcopy) throws TorqueException
    {
        return copyInto(new SearchNums(), deepcopy);
    }

    /**
     * Makes a copy of this object using connection.
     * It creates a new object filling in the simple attributes.
     * If the parameter deepcopy is true, it then fills all the
     * association collections and sets the related objects to
     * isNew=true.
     *
     * @param deepcopy whether to copy the associated objects.
     * @param con the database connection to read associated objects.
     */
    public SearchNums copy(boolean deepcopy, Connection con) throws TorqueException
    {
        return copyInto(new SearchNums(), deepcopy, con);
    }
  
    /**
     * Fills the copyObj with the contents of this object.
     * The associated objects are also copied and treated as new objects.
     *
     * @param copyObj the object to fill.
     */
    protected SearchNums copyInto(SearchNums copyObj) throws TorqueException
    {
        return copyInto(copyObj, true);
    }

  
    /**
     * Fills the copyObj with the contents of this object using connection.
     * The associated objects are also copied and treated as new objects.
     *
     * @param copyObj the object to fill.
     * @param con the database connection to read associated objects.
     */
    protected SearchNums copyInto(SearchNums copyObj, Connection con) throws TorqueException
    {
        return copyInto(copyObj, true, con);
    }
  
    /**
     * Fills the copyObj with the contents of this object.
     * If deepcopy is true, The associated objects are also copied
     * and treated as new objects.
     *
     * @param copyObj the object to fill.
     * @param deepcopy whether the associated objects should be copied.
     */
    protected SearchNums copyInto(SearchNums copyObj, boolean deepcopy) throws TorqueException
    {
        copyObj.setId(id);
        copyObj.setFkProgrammeSiteId(fkProgrammeSiteId);
        copyObj.setOrderId(orderId);
        copyObj.setNum(num);
        copyObj.setUpdateTime(updateTime);
        copyObj.setCreateTime(createTime);

        copyObj.setId( 0);

        if (deepcopy)
        {
        }
        return copyObj;
    }
        
    
    /**
     * Fills the copyObj with the contents of this object using connection.
     * If deepcopy is true, The associated objects are also copied
     * and treated as new objects.
     *
     * @param copyObj the object to fill.
     * @param deepcopy whether the associated objects should be copied.
     * @param con the database connection to read associated objects.
     */
    protected SearchNums copyInto(SearchNums copyObj, boolean deepcopy, Connection con) throws TorqueException
    {
        copyObj.setId(id);
        copyObj.setFkProgrammeSiteId(fkProgrammeSiteId);
        copyObj.setOrderId(orderId);
        copyObj.setNum(num);
        copyObj.setUpdateTime(updateTime);
        copyObj.setCreateTime(createTime);

        copyObj.setId( 0);

        if (deepcopy)
        {
        }
        return copyObj;
    }
    
    

    /**
     * returns a peer instance associated with this om.  Since Peer classes
     * are not to have any instance attributes, this method returns the
     * same instance for all member of this class. The method could therefore
     * be static, but this would prevent one from overriding the behavior.
     */
    public SearchNumsPeer getPeer()
    {
        return peer;
    }

    /**
     * Retrieves the TableMap object related to this Table data without
     * compiler warnings of using getPeer().getTableMap().
     *
     * @return The associated TableMap object.
     */
    public TableMap getTableMap() throws TorqueException
    {
        return SearchNumsPeer.getTableMap();
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("SearchNums:\n");
        str.append("Id = ")
           .append(getId())
           .append("\n");
        str.append("FkProgrammeSiteId = ")
           .append(getFkProgrammeSiteId())
           .append("\n");
        str.append("OrderId = ")
           .append(getOrderId())
           .append("\n");
        str.append("Num = ")
           .append(getNum())
           .append("\n");
        str.append("UpdateTime = ")
           .append(getUpdateTime())
           .append("\n");
        str.append("CreateTime = ")
           .append(getCreateTime())
           .append("\n");
        return(str.toString());
    }
}
