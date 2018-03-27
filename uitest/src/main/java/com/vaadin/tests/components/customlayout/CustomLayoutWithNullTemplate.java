/*
 * Copyright 2000-2018 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.tests.components.customlayout;

import com.vaadin.server.VaadinRequest;
import com.vaadin.tests.components.AbstractReindeerTestUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomLayout;
import com.vaadin.ui.Label;

public class CustomLayoutWithNullTemplate extends AbstractReindeerTestUI {

    @Override
    protected void setup(VaadinRequest request) {
        CustomLayout cl = new CustomLayout();
        cl.addComponent(new Label("This Label should be visible."), "foo");
        cl.addComponent(new Button("This Button too."), "bar");

        addComponent(cl);
    }

    @Override
    protected String getTestDescription() {
        return "Verify that a default-constructed CustomLayout renders child components";
    }

    @Override
    protected Integer getTicketNumber() {
        return 17210;
    }
}
