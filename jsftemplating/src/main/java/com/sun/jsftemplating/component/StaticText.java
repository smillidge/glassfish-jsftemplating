/*
 * Copyright (c) 2006, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package com.sun.jsftemplating.component;


/**
 *  <p>	This <code>UIComponent</code> produces static text output.</p>
 *
 *  @author Ken Paulsen (ken.paulsen@sun.com)
 */
public class StaticText extends TemplateComponentBase {
    /**
     *	<p> Constructor for <code>StaticText</code>.</p>
     */
    public StaticText() {
	super();
	setRendererType("com.sun.jsftemplating.StaticText");
	setLayoutDefinitionKey(LAYOUT_KEY);
    }

    /**
     *	<p> Return the family for this component.</p>
     */
    public String getFamily() {
	return "com.sun.jsftemplating.StaticText";
    }

    /**
     *	<p> This is the location of the XML file that declares the layout for
     *	    the StaticText. (/jsftemplating/staticText.xml)</p>
     */
    public static final String	LAYOUT_KEY  =	"/jsftemplating/staticText.xml";
}
