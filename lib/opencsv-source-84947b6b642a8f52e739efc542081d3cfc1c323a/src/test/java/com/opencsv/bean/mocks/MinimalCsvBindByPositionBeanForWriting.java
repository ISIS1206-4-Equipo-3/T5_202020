/*
 * Copyright 2016 Andrew Rucker Jones.
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
package com.opencsv.bean.mocks;

import com.opencsv.bean.CsvBindByPosition;
import org.apache.commons.lang3.builder.EqualsBuilder;

/**
 *
 * @author Andrew Rucker Jones
 */
public class MinimalCsvBindByPositionBeanForWriting {
    
    @CsvBindByPosition(position = 1)
    private int b;
    
    @CsvBindByPosition(position = 2)
    private int c;
    
    @CsvBindByPosition(position = 3)
    private int a;

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) {return false;}
        if(obj == this) {return true;}
        if(obj.getClass() != getClass()) {return false;}
        MinimalCsvBindByPositionBeanForWriting rhs = (MinimalCsvBindByPositionBeanForWriting) obj;
        return new EqualsBuilder()
                .append(a, rhs.a)
                .append(b, rhs.b)
                .append(c, rhs.c)
                .isEquals();
    }
}
