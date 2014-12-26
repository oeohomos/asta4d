/*
 * Copyright 2014 astamuse company,Ltd.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package com.astamuse.asta4d.web.form.field.impl;

import static com.astamuse.asta4d.render.SpecialRenderer.Clear;

import com.astamuse.asta4d.render.Renderer;
import com.astamuse.asta4d.web.form.field.FormFieldValueRenderer;

public class AvailableWhenEditOnlyRenderer implements FormFieldValueRenderer {

    @Override
    public Renderer renderForEdit(String editTargetSelector, Object value) {
        return Renderer.create();
    }

    @Override
    public Renderer renderForDisplay(String editTargetSelector, String displayTargetSelector, Object value) {
        Renderer render = Renderer.create().disableMissingSelectorWarning();
        render.add(editTargetSelector, Clear).add(displayTargetSelector, Clear);
        return render.enableMissingSelectorWarning();
    }

}
