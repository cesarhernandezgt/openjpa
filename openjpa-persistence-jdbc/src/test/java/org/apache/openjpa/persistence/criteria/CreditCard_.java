/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package org.apache.openjpa.persistence.criteria;

import javax.persistence.metamodel.Attribute;
import javax.persistence.metamodel.List;

@javax.persistence.metamodel.TypesafeMetamodel(value=org.apache.openjpa.persistence.criteria.CreditCard.class)
@javax.annotation.Generated(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Sat May 09 23:22:02 PDT 2009")
public class CreditCard_ {
    public static volatile Attribute<CreditCard,Customer> customer;
    public static volatile Attribute<CreditCard,Long> id;
    public static volatile List<CreditCard,TransactionHistory> transactionHistory;
}
