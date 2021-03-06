package com.youku.soku.manage.torque;


import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.ObjectUtils;
import org.apache.torque.TorqueException;
import org.apache.torque.map.TableMap;
import org.apache.torque.om.BaseObject;
import org.apache.torque.om.NumberKey;
import org.apache.torque.om.ObjectKey;
import org.apache.torque.om.SimpleKey;
import org.apache.torque.util.Transaction;





/**
 * վ������
 *
 * This class was autogenerated by Torque on:
 *
 * [Tue Oct 19 18:29:41 CST 2010]
 *
 * You should not use this class directly.  It should not even be
 * extended all references should be to ShieldSite
 */
public abstract class BaseShieldSite extends BaseObject
{
    /** Serial version */
    private static final long serialVersionUID = 1287484181464L;

    /** The Peer class */
    private static final ShieldSitePeer peer =
        new ShieldSitePeer();


    /** The value for the id field */
    private int id;

    /** The value for the name field */
    private String name;

    /** The value for the url field */
    private String url;

    /** The value for the siteCategory field */
    private int siteCategory;

    /** The value for the siteLevel field */
    private int siteLevel;

    /** The value for the siteId field */
    private int siteId;

    /** The value for the modifier field */
    private String modifier;

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
     * Get the Name
     *
     * @return String
     */
    public String getName()
    {
        return name;
    }


    /**
     * Set the value of Name
     *
     * @param v new value
     */
    public void setName(String v) 
    {

        if (!ObjectUtils.equals(this.name, v))
        {
            this.name = v;
            setModified(true);
        }


    }

    /**
     * Get the Url
     *
     * @return String
     */
    public String getUrl()
    {
        return url;
    }


    /**
     * Set the value of Url
     *
     * @param v new value
     */
    public void setUrl(String v) 
    {

        if (!ObjectUtils.equals(this.url, v))
        {
            this.url = v;
            setModified(true);
        }


    }

    /**
     * Get the SiteCategory
     *
     * @return int
     */
    public int getSiteCategory()
    {
        return siteCategory;
    }


    /**
     * Set the value of SiteCategory
     *
     * @param v new value
     */
    public void setSiteCategory(int v) 
    {

        if (this.siteCategory != v)
        {
            this.siteCategory = v;
            setModified(true);
        }


    }

    /**
     * Get the SiteLevel
     *
     * @return int
     */
    public int getSiteLevel()
    {
        return siteLevel;
    }


    /**
     * Set the value of SiteLevel
     *
     * @param v new value
     */
    public void setSiteLevel(int v) 
    {

        if (this.siteLevel != v)
        {
            this.siteLevel = v;
            setModified(true);
        }


    }

    /**
     * Get the SiteId
     *
     * @return int
     */
    public int getSiteId()
    {
        return siteId;
    }


    /**
     * Set the value of SiteId
     *
     * @param v new value
     */
    public void setSiteId(int v) 
    {

        if (this.siteId != v)
        {
            this.siteId = v;
            setModified(true);
        }


    }

    /**
     * Get the Modifier
     *
     * @return String
     */
    public String getModifier()
    {
        return modifier;
    }


    /**
     * Set the value of Modifier
     *
     * @param v new value
     */
    public void setModifier(String v) 
    {

        if (!ObjectUtils.equals(this.modifier, v))
        {
            this.modifier = v;
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
            fieldNames.add("Name");
            fieldNames.add("Url");
            fieldNames.add("SiteCategory");
            fieldNames.add("SiteLevel");
            fieldNames.add("SiteId");
            fieldNames.add("Modifier");
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
        if (name.equals("Name"))
        {
            return getName();
        }
        if (name.equals("Url"))
        {
            return getUrl();
        }
        if (name.equals("SiteCategory"))
        {
            return new Integer(getSiteCategory());
        }
        if (name.equals("SiteLevel"))
        {
            return new Integer(getSiteLevel());
        }
        if (name.equals("SiteId"))
        {
            return new Integer(getSiteId());
        }
        if (name.equals("Modifier"))
        {
            return getModifier();
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
     * @throws TorqueException If a problem occures with the set[Field] method.
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
        if (name.equals("Name"))
        {
            // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setName((String) value);
            return true;
        }
        if (name.equals("Url"))
        {
            // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setUrl((String) value);
            return true;
        }
        if (name.equals("SiteCategory"))
        {
            if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setSiteCategory(((Integer) value).intValue());
            return true;
        }
        if (name.equals("SiteLevel"))
        {
            if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setSiteLevel(((Integer) value).intValue());
            return true;
        }
        if (name.equals("SiteId"))
        {
            if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setSiteId(((Integer) value).intValue());
            return true;
        }
        if (name.equals("Modifier"))
        {
            // Object fields can be null
            if (value != null && ! String.class.isInstance(value))
            {
                throw new IllegalArgumentException("Invalid type of object specified for value in setByName");
            }
            setModifier((String) value);
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
        if (name.equals(ShieldSitePeer.ID))
        {
            return new Integer(getId());
        }
        if (name.equals(ShieldSitePeer.NAME))
        {
            return getName();
        }
        if (name.equals(ShieldSitePeer.URL))
        {
            return getUrl();
        }
        if (name.equals(ShieldSitePeer.SITE_CATEGORY))
        {
            return new Integer(getSiteCategory());
        }
        if (name.equals(ShieldSitePeer.SITE_LEVEL))
        {
            return new Integer(getSiteLevel());
        }
        if (name.equals(ShieldSitePeer.SITE_ID))
        {
            return new Integer(getSiteId());
        }
        if (name.equals(ShieldSitePeer.MODIFIER))
        {
            return getModifier();
        }
        if (name.equals(ShieldSitePeer.UPDATE_TIME))
        {
            return getUpdateTime();
        }
        if (name.equals(ShieldSitePeer.CREATE_TIME))
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
     * @throws TorqueException If a problem occures with the set[Field] method.
     */
    public boolean setByPeerName(String name, Object value)
        throws TorqueException, IllegalArgumentException
    {
      if (ShieldSitePeer.ID.equals(name))
        {
            return setByName("Id", value);
        }
      if (ShieldSitePeer.NAME.equals(name))
        {
            return setByName("Name", value);
        }
      if (ShieldSitePeer.URL.equals(name))
        {
            return setByName("Url", value);
        }
      if (ShieldSitePeer.SITE_CATEGORY.equals(name))
        {
            return setByName("SiteCategory", value);
        }
      if (ShieldSitePeer.SITE_LEVEL.equals(name))
        {
            return setByName("SiteLevel", value);
        }
      if (ShieldSitePeer.SITE_ID.equals(name))
        {
            return setByName("SiteId", value);
        }
      if (ShieldSitePeer.MODIFIER.equals(name))
        {
            return setByName("Modifier", value);
        }
      if (ShieldSitePeer.UPDATE_TIME.equals(name))
        {
            return setByName("UpdateTime", value);
        }
      if (ShieldSitePeer.CREATE_TIME.equals(name))
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
            return getName();
        }
        if (pos == 2)
        {
            return getUrl();
        }
        if (pos == 3)
        {
            return new Integer(getSiteCategory());
        }
        if (pos == 4)
        {
            return new Integer(getSiteLevel());
        }
        if (pos == 5)
        {
            return new Integer(getSiteId());
        }
        if (pos == 6)
        {
            return getModifier();
        }
        if (pos == 7)
        {
            return getUpdateTime();
        }
        if (pos == 8)
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
     * @throws TorqueException If a problem occures with the set[Field] method.
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
            return setByName("Name", value);
        }
    if (position == 2)
        {
            return setByName("Url", value);
        }
    if (position == 3)
        {
            return setByName("SiteCategory", value);
        }
    if (position == 4)
        {
            return setByName("SiteLevel", value);
        }
    if (position == 5)
        {
            return setByName("SiteId", value);
        }
    if (position == 6)
        {
            return setByName("Modifier", value);
        }
    if (position == 7)
        {
            return setByName("UpdateTime", value);
        }
    if (position == 8)
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
        save(ShieldSitePeer.DATABASE_NAME);
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
                    ShieldSitePeer.doInsert((ShieldSite) this, con);
                    setNew(false);
                }
                else
                {
                    ShieldSitePeer.doUpdate((ShieldSite) this, con);
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
    public ShieldSite copy() throws TorqueException
    {
        return copy(true);
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
    public ShieldSite copy(boolean deepcopy) throws TorqueException
    {
        return copyInto(new ShieldSite(), deepcopy);
    }

    /**
     * Fills the copyObj with the contents of this object.
     * The associated objects are also copied and treated as new objects.
     * @param copyObj the object to fill.
     */
    protected ShieldSite copyInto(ShieldSite copyObj) throws TorqueException
    {
        return copyInto(copyObj, true);
    }

    /**
     * Fills the copyObj with the contents of this object.
     * If deepcopy is true, The associated objects are also copied
     * and treated as new objects.
     * @param copyObj the object to fill.
     * @param deepcopy whether the associated objects should be copied.
     */
    protected ShieldSite copyInto(ShieldSite copyObj, boolean deepcopy) throws TorqueException
    {
        copyObj.setId(id);
        copyObj.setName(name);
        copyObj.setUrl(url);
        copyObj.setSiteCategory(siteCategory);
        copyObj.setSiteLevel(siteLevel);
        copyObj.setSiteId(siteId);
        copyObj.setModifier(modifier);
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
    public ShieldSitePeer getPeer()
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
        return ShieldSitePeer.getTableMap();
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("ShieldSite:\n");
        str.append("Id = ")
           .append(getId())
           .append("\n");
        str.append("Name = ")
           .append(getName())
           .append("\n");
        str.append("Url = ")
           .append(getUrl())
           .append("\n");
        str.append("SiteCategory = ")
           .append(getSiteCategory())
           .append("\n");
        str.append("SiteLevel = ")
           .append(getSiteLevel())
           .append("\n");
        str.append("SiteId = ")
           .append(getSiteId())
           .append("\n");
        str.append("Modifier = ")
           .append(getModifier())
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
