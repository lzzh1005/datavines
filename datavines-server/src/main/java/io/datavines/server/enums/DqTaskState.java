/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.datavines.server.enums;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;

/**
 * data quality task state
 */
public enum DqTaskState {
    /**
     * 0-none
     * 1-success
     * 2-failure
     */
    NONE(0,"none"),
    SUCCESS(1,"success"),
    FAILURE(2,"failure");

    DqTaskState(int code, String description) {
        this.code = code;
        this.description = description;
    }

    private final int code;
    private final String description;

    public int getCode() {
        return code;
    }

    @JsonValue
    public String getDescription() {
        return description;
    }

    private static final Map<Integer, DqTaskState> VALUES_MAP = new HashMap<>();

    static {
        for (DqTaskState type : DqTaskState.values()) {
            VALUES_MAP.put(type.code,type);
        }
    }

    public static DqTaskState of(Integer status) {
        if (VALUES_MAP.containsKey(status)) {
            return VALUES_MAP.get(status);
        }
        throw new IllegalArgumentException("invalid code : " + status);
    }
}