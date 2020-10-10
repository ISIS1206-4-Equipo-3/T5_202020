/*
 * Copyright 2017 Andrew Rucker Jones.
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
package com.opencsv.bean.mocks.split;

import com.opencsv.bean.CsvBindAndSplitByPosition;
import java.util.concurrent.TransferQueue;

/**
 *
 * @author Andrew Rucker Jones
 */
public class UnknownCollectionType {
    
    @CsvBindAndSplitByPosition(elementType = Integer.class, position = 0)
    private TransferQueue<Integer> transferQueue;

    public TransferQueue<Integer> getTransferQueue() {
        return transferQueue;
    }

    public void setTransferQueue(TransferQueue<Integer> transferQueue) {
        this.transferQueue = transferQueue;
    }
}
