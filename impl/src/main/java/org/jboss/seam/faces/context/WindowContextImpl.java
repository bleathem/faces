/*
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jboss.seam.faces.context;

import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.enterprise.inject.Typed;

/**
 * @author <a href="mailto:bleathem@gmail.com>Brian Leathem</a>
 * 
 */
@Typed()
public class WindowContextImpl implements WindowContext, Serializable
{
   private static final long serialVersionUID = 7502050909452181348L;

   private Integer id = null;
   private final Map<String, Object> map = new ConcurrentHashMap<String, Object>();

   public Object get(final String key)
   {
      return map.get(key);
   }

   public Integer getId()
   {
      return id;
   }

   public void setId(final int id)
   {
      this.id = id;
   }

   public boolean isEmpty()
   {
      return map.isEmpty();
   }

   public void put(final String key, final Object value)
   {
      map.put(key, value);
   }

}
