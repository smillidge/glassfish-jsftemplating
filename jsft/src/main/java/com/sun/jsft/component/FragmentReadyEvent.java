/*
 * Copyright (c) 2011, 2020 Oracle and/or its affiliates. All rights reserved.
 * Portions Copyright (c) 2011 Ken Paulsen
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

package com.sun.jsft.component;

import jakarta.faces.event.ComponentSystemEvent;


/**
 *  <p>	This event is used for dispatching {@link Task} related events.</p>
 */
public class FragmentReadyEvent extends ComponentSystemEvent {

    /**
     *	<p> Constructor.</p>
     */
    public FragmentReadyEvent(DeferredFragment source) {
	super(source);
    }
}
