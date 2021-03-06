/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package com.sun.tools.ws.wsdl.document;

import com.sun.tools.ws.wsdl.framework.ExtensionVisitor;

/**
 * A visitor for WSDL documents.
 *
 * @author WS Development Team
 */
public interface WSDLDocumentVisitor extends ExtensionVisitor {

    public void preVisit(Definitions definitions) throws Exception;
    public void postVisit(Definitions definitions) throws Exception;
    public void visit(Import i) throws Exception;
    public void preVisit(Types types) throws Exception;
    public void postVisit(Types types) throws Exception;
    public void preVisit(Message message) throws Exception;
    public void postVisit(Message message) throws Exception;
    public void visit(MessagePart part) throws Exception;
    public void preVisit(PortType portType) throws Exception;
    public void postVisit(PortType portType) throws Exception;
    public void preVisit(Operation operation) throws Exception;
    public void postVisit(Operation operation) throws Exception;
    public void preVisit(Input input) throws Exception;
    public void postVisit(Input input) throws Exception;
    public void preVisit(Output output) throws Exception;
    public void postVisit(Output output) throws Exception;
    public void preVisit(Fault fault) throws Exception;
    public void postVisit(Fault fault) throws Exception;
    public void preVisit(Binding binding) throws Exception;
    public void postVisit(Binding binding) throws Exception;
    public void preVisit(BindingOperation operation) throws Exception;
    public void postVisit(BindingOperation operation) throws Exception;
    public void preVisit(BindingInput input) throws Exception;
    public void postVisit(BindingInput input) throws Exception;
    public void preVisit(BindingOutput output) throws Exception;
    public void postVisit(BindingOutput output) throws Exception;
    public void preVisit(BindingFault fault) throws Exception;
    public void postVisit(BindingFault fault) throws Exception;
    public void preVisit(Service service) throws Exception;
    public void postVisit(Service service) throws Exception;
    public void preVisit(Port port) throws Exception;
    public void postVisit(Port port) throws Exception;
    public void visit(Documentation documentation) throws Exception;
}
