/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
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
 * </p>
 */

package io.shardingjdbc.proxy.transport.mysql.packet.command.statement.execute;

import io.shardingjdbc.proxy.transport.mysql.constant.ColumnType;
import lombok.Getter;

@Getter
public final class Parameter {
    
    private final ColumnType columnType;
    
    private final int unsignedFlag;
    
    private final String value;
    
    public Parameter(final int columnType, final int unsignedFlag, final String value) {
        this.columnType = ColumnType.valueOf(columnType);
        this.unsignedFlag = unsignedFlag;
        this.value = value;
    }
}
