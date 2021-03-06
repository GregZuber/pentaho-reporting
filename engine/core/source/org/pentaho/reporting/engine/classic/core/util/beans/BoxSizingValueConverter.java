/*
 * This program is free software; you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License, version 2.1 as published by the Free Software
 * Foundation.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this
 * program; if not, you can obtain a copy at http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
 * or from the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * Copyright (c) 2001 - 2013 Object Refinery Ltd, Pentaho Corporation and Contributors..  All rights reserved.
 */

package org.pentaho.reporting.engine.classic.core.util.beans;

import org.pentaho.reporting.engine.classic.core.style.BoxSizing;

/**
 * Creation-Date: 06.09.2007, 14:00:42
 *
 * @author Thomas Morgner
 */
public class BoxSizingValueConverter implements ValueConverter {
  public BoxSizingValueConverter() {
  }

  public String toAttributeValue( final Object o ) throws BeanException {
    if ( o == null ) {
      throw new NullPointerException();
    }
    if ( o instanceof BoxSizing ) {
      return String.valueOf( o );
    } else {
      throw new BeanException( "Failed to convert object of type " + o.getClass() + ": Not a BoxSizing." );
    }
  }

  public Object toPropertyValue( final String s ) throws BeanException {
    if ( s == null ) {
      throw new NullPointerException();
    }
    if ( BoxSizing.BORDER_BOX.toString().equals( s ) ) {
      return BoxSizing.BORDER_BOX;
    }
    if ( BoxSizing.CONTENT_BOX.toString().equals( s ) ) {
      return BoxSizing.CONTENT_BOX;
    }
    throw new BeanException( "Invalid value specified for BoxSizing" );
  }
}
