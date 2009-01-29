/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.openjpa.meta;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Item implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    private String title;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Artist artist;

    /**
     * A no-arg constructor is required for enhancement.
     */
    protected Item() {
        super();
    }

    /**
     * The public constructor constructs with a title.
     *
     * @param title the title of the item.
     */
    public Item(String title) {
        super();
        this.title = title;
    }

    /**
     * Gets the unique identifier of this receiver. There is no corresponding
     * <code>setId()</code> method as the identifier value is generated by the
     * Persistence Provider Runtime.
     *
     * @return unique identifier of this instance.
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the title of this item.
     *
     * @return return the tile of the item.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of this receiver.
     *
     * @param title must not be null or empty.
     */
    public void setTitle(String title) {
        if (title == null || title.trim().length() == 0)
            throw new IllegalArgumentException(
                "null or empty title not allowed");
        this.title = title;
    }

    /**
     * Gets the artist who created this item. This is an example of
     * unidirectional single-valued relationship.
     *
     * @return the artist who created this item.
     */
    public Artist getArtist() {
        return artist;
    }

    /**
     * Sets the artist who created this Item.
     *
     * @param artist must not be null.
     */
    public void setArtist(Artist artist) {
        if (artist == null)
            throw new IllegalArgumentException("null Artist for " + this);

        this.artist = artist;
    }
}
