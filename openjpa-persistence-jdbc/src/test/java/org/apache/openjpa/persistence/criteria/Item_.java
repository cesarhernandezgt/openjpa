/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package org.apache.openjpa.persistence.criteria;

import javax.persistence.metamodel.Attribute;
import javax.persistence.metamodel.Map;

@javax.persistence.metamodel.TypesafeMetamodel(value=org.apache.openjpa.persistence.criteria.Item.class)
@javax.annotation.Generated(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Sat May 09 23:22:02 PDT 2009")
public class Item_ {
    public static volatile Attribute<Item,Integer> id;
    public static volatile Attribute<Item,String> name;
    public static volatile Map<Item,String,Photo> photos;
}
