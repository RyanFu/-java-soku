package com.youku.search.console.pojo;


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
 * ??????��?��?��???����
 *
 * This class was autogenerated by Torque on:
 *
 * [Thu Mar 12 17:18:51 CST 2009]
 *
 * You should not use this class directly.  It should not even be
 * extended all references should be to TempPlayVersion
 */
public abstract class BaseTempPlayVersion extends BaseObject
{
    /** Serial version */
    private static final long serialVersionUID = 1236849531031L;

    /** The Peer class */
    private static final TempPlayVersionPeer peer =
        new TempPlayVersionPeer();

        
    /** The value for the id field */
    private int id;
      
    /** The value for the fkTeleplayId field */
    private int fkTeleplayId;
      
    /** The value for the cate field */
    private int cate;
      
    /** The value for the subcate field */
    private int subcate;
      
    /** The value for the name field */
    private String name;
                                          
    /** The value for the status field */
    private int status = 0;
  
            
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
     * Get the FkTeleplayId
     *
     * @return int
     */
    public int getFkTeleplayId()
    {
        return fkTeleplayId;
    }

                        
    /**
     * Set the value of FkTeleplayId
     *
     * @param v new value
     */
    public void setFkTeleplayId(int v) 
    {
    
                  if (this.fkTeleplayId != v)
              {
            this.fkTeleplayId = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the Cate
     *
     * @return int
     */
    public int getCate()
    {
        return cate;
    }

                        
    /**
     * Set the value of Cate
     *
     * @param v new value
     */
    public void setCate(int v) 
    {
    
                  if (this.cate != v)
              {
            this.cate = v;
            setModified(true);
        }
    
          
              }
          
    /**
     * Get the Subcate
     *
     * @return int
     */
    public int getSubcate()
    {
        return subcate;
    }

                        
    /**
     * Set the value of Subcate
     *
     * @param v new value
     */
    public void setSubcate(int v) 
    {
    
                  if (this.subcate != v)
              {
            this.subcate = v;
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
     * Get the Status
     *
     * @return int
     */
    public int getStatus()
    {
        return status;
    }

                        
    /**
     * Set the value of Status
     *
     * @param v new value
     */
    public void setStatus(int v) 
    {
    
                  if (this.status != v)
              {
            this.status = v;
            setModified(true);
        }
    
          
              }
  
         
                
    private static List<String> fieldNames = null;

    /**
     * Generate a list of field names.
     *
     * @return a list of field names
     */
    public static synchronized List<String> getFieldNames()
    {
        if (fieldNames == null)
        {
            fieldNames = new ArrayList<String>();
              fieldNames.add("Id");
              fieldNames.add("FkTeleplayId");
              fieldNames.add("Cate");
              fieldNames.add("Subcate");
              fieldNames.add("Name");
              fieldNames.add("Status");
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
          if (name.equals("FkTeleplayId"))
        {
                return new Integer(getFkTeleplayId());
            }
          if (name.equals("Cate"))
        {
                return new Integer(getCate());
            }
          if (name.equals("Subcate"))
        {
                return new Integer(getSubcate());
            }
          if (name.equals("Name"))
        {
                return getName();
            }
          if (name.equals("Status"))
        {
                return new Integer(getStatus());
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
          if (name.equals("FkTeleplayId"))
        {
                      if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setFkTeleplayId(((Integer) value).intValue());
                      return true;
        }
          if (name.equals("Cate"))
        {
                      if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setCate(((Integer) value).intValue());
                      return true;
        }
          if (name.equals("Subcate"))
        {
                      if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setSubcate(((Integer) value).intValue());
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
          if (name.equals("Status"))
        {
                      if (value == null || ! (Integer.class.isInstance(value)))
            {
                throw new IllegalArgumentException("setByName: value parameter was null or not an Integer object.");
            }
            setStatus(((Integer) value).intValue());
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
          if (name.equals(TempPlayVersionPeer.ID))
        {
                return new Integer(getId());
            }
          if (name.equals(TempPlayVersionPeer.FK_TELEPLAY_ID))
        {
                return new Integer(getFkTeleplayId());
            }
          if (name.equals(TempPlayVersionPeer.CATE))
        {
                return new Integer(getCate());
            }
          if (name.equals(TempPlayVersionPeer.SUBCATE))
        {
                return new Integer(getSubcate());
            }
          if (name.equals(TempPlayVersionPeer.NAME))
        {
                return getName();
            }
          if (name.equals(TempPlayVersionPeer.STATUS))
        {
                return new Integer(getStatus());
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
        if (TempPlayVersionPeer.ID.equals(name))
        {
            return setByName("Id", value);
        }
        if (TempPlayVersionPeer.FK_TELEPLAY_ID.equals(name))
        {
            return setByName("FkTeleplayId", value);
        }
        if (TempPlayVersionPeer.CATE.equals(name))
        {
            return setByName("Cate", value);
        }
        if (TempPlayVersionPeer.SUBCATE.equals(name))
        {
            return setByName("Subcate", value);
        }
        if (TempPlayVersionPeer.NAME.equals(name))
        {
            return setByName("Name", value);
        }
        if (TempPlayVersionPeer.STATUS.equals(name))
        {
            return setByName("Status", value);
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
                return new Integer(getFkTeleplayId());
            }
              if (pos == 2)
        {
                return new Integer(getCate());
            }
              if (pos == 3)
        {
                return new Integer(getSubcate());
            }
              if (pos == 4)
        {
                return getName();
            }
              if (pos == 5)
        {
                return new Integer(getStatus());
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
            return setByName("FkTeleplayId", value);
        }
          if (position == 2)
        {
            return setByName("Cate", value);
        }
          if (position == 3)
        {
            return setByName("Subcate", value);
        }
          if (position == 4)
        {
            return setByName("Name", value);
        }
          if (position == 5)
        {
            return setByName("Status", value);
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
          save(TempPlayVersionPeer.DATABASE_NAME);
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
                    TempPlayVersionPeer.doInsert((TempPlayVersion) this, con);
                    setNew(false);
                }
                else
                {
                    TempPlayVersionPeer.doUpdate((TempPlayVersion) this, con);
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
      public TempPlayVersion copy() throws TorqueException
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
    public TempPlayVersion copy(boolean deepcopy) throws TorqueException
    {
        return copyInto(new TempPlayVersion(), deepcopy);
    }
      
      /**
     * Fills the copyObj with the contents of this object.
     * The associated objects are also copied and treated as new objects.
     * @param copyObj the object to fill.
     */
    protected TempPlayVersion copyInto(TempPlayVersion copyObj) throws TorqueException
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
      protected TempPlayVersion copyInto(TempPlayVersion copyObj, boolean deepcopy) throws TorqueException
      {
          copyObj.setId(id);
          copyObj.setFkTeleplayId(fkTeleplayId);
          copyObj.setCate(cate);
          copyObj.setSubcate(subcate);
          copyObj.setName(name);
          copyObj.setStatus(status);
  
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
    public TempPlayVersionPeer getPeer()
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
        return TempPlayVersionPeer.getTableMap();
    }


    public String toString()
    {
        StringBuffer str = new StringBuffer();
        str.append("TempPlayVersion:\n");
        str.append("Id = ")
               .append(getId())
             .append("\n");
        str.append("FkTeleplayId = ")
               .append(getFkTeleplayId())
             .append("\n");
        str.append("Cate = ")
               .append(getCate())
             .append("\n");
        str.append("Subcate = ")
               .append(getSubcate())
             .append("\n");
        str.append("Name = ")
               .append(getName())
             .append("\n");
        str.append("Status = ")
               .append(getStatus())
             .append("\n");
        return(str.toString());
    }
}
