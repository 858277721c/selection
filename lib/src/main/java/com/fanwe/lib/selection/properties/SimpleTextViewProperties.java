/*
 * Copyright (C) 2017 zhengjun, fanwe (http://www.fanwe.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.fanwe.lib.selection.properties;

import android.view.View;

import com.fanwe.lib.selection.invoker.TextColorInvoker;
import com.fanwe.lib.selection.invoker.TextSizeInvoker;

class SimpleTextViewProperties extends SimpleViewProperties implements TextViewProperties
{
    private Integer mTextColor;
    private Integer mTextSize;

    @Override
    public TextViewProperties setTextColor(Integer value)
    {
        mTextColor = value;
        return this;
    }

    @Override
    public TextViewProperties setTextSize(Integer value)
    {
        mTextSize = value;
        return this;
    }

    @Override
    public void invoke(View view)
    {
        super.invoke(view);

        if (view != null)
        {
            new TextColorInvoker().invoke(view, mTextColor);
            new TextSizeInvoker().invoke(view, mTextSize);
        }
    }

    @Override
    public TextViewProperties clear()
    {
        super.clear();
        mTextColor = null;
        mTextSize = null;
        return this;
    }
}
