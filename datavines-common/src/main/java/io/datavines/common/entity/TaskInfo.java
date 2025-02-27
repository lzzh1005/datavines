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
package io.datavines.common.entity;

public class TaskInfo {

    private Long id;
    private String name;
    private String engineType;
    private String engineParameter;
    private TaskParameter taskParameter;

    public TaskInfo() {
    }

    public TaskInfo(Long id, String name, String engineType, String engineParameter, TaskParameter taskParameter) {
        this.id = id;
        this.name = name;
        this.engineType = engineType;
        this.engineParameter = engineParameter;
        this.taskParameter = taskParameter;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getEngineParameter() {
        return engineParameter;
    }

    public void setEngineParameter(String engineParameter) {
        this.engineParameter = engineParameter;
    }

    public TaskParameter getTaskParameter() {
        return taskParameter;
    }

    public void setTaskParameter(TaskParameter taskParameter) {
        this.taskParameter = taskParameter;
    }
}
