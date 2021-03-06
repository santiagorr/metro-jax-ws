/*
 * Copyright (c) 2004, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package fromjava.inherited_soapbindings.server;

import fromjava.inherited_soapbindings.server.base3.*;
import javax.jws.*;

@WebService(portName="EchoPort")
public class EchoImpl extends EchoBase4 {
    @WebMethod
    public String echoF(String str) {
        return "EchoImpl:"+str;
    }
    @WebMethod	
    public String echoH(String str) {
        return "EchoImpl:"+str;
    }

    public void badImpl1(String str) {
    }	
}
