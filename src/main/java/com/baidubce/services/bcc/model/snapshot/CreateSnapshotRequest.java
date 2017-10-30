/*
 * Copyright (c) 2014 Baidu.com, Inc. All Rights Reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.baidubce.services.bcc.model.snapshot;

import com.baidubce.auth.BceCredentials;
import com.baidubce.model.AbstractBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * The request for creating a new snapshot.
 */
public class CreateSnapshotRequest extends AbstractBceRequest {
    /**
     * An ASCII string whose length is less than 64.
     * The request will be idempotent if client token is provided.
     * If the clientToken is not specified by the user, a random String generated by default algorithm will be used.
     * See more detail at
     * <a href = "https://bce.baidu.com/doc/BCC/API.html#.E5.B9.82.E7.AD.89.E6.80.A7">
     *     BCE API doc</a>
     */
    @JsonIgnore
    private String clientToken;

    /**
     * The id which specify where the snapshot will be created from.
     * If you want to create an snapshot from a customized volume,a id of the volume will be set.
     * If you want to create an snapshot from a system volume,a id of the instance will be set.
     */
    private String volumeId;

    /**
     * The name for the snapshot that will be created.
     * The name length from 1 to 65,only contains letters,digital and underline.
     */
    private String snapshotName;

    /**
     * The optional parameter to describe the information of the new snapshot.
     */
    private String desc;

    public String getClientToken() {
        return clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * Configure optional client token for the request. The request will be idempotent if client token is provided.
     * If the clientToken is not specified by the user, a random String generated by default algorithm will be used.
     * @param clientToken An ASCII string whose length is less than 64.
     *                    See more detail at
     *                    <a href = "https://bce.baidu.com/doc/BCC/API.html#.E5.B9.82.E7.AD.89.E6.80.A7">
     *                        BCE API doc</a>
     * @return CreateSnapshotRequest with specific clientToken
     */
    public CreateSnapshotRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * Configure volumeId for the request.
     *
     * @param volumeId The id which specify where the snapshot will be created from.
     *                 If you want to create an snapshot from a customized volume,a id of the volume will be set.
     *                 If you want to create an snapshot from a system volume,a id of the instance will be set.
     * @return CreateSnapshotRequest with volumeId.
     */
    public CreateSnapshotRequest withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    public String getSnapshotName() {
        return snapshotName;
    }

    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }

    /**
     * Configure snapshotName for the request.
     *
     * @param snapshotName The name for the snapshot that will be created.
     *                     The name length from 1 to 65,only contains letters,digital and underline.
     * @return CreateSnapshotRequest with snapshotName.
     */
    public CreateSnapshotRequest withSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * Configure desc for the request.
     *
     * @param desc The optional parameter to describe the information of the new snapshot.
     * @return CreateSnapshotRequest with desc.
     */
    public CreateSnapshotRequest withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * Configure request credential for the request.
     *
     * @param credentials a valid instance of BceCredentials.
     * @return CreateSnapshotRequest with credentials.
     */
    @Override
    public CreateSnapshotRequest withRequestCredentials(BceCredentials credentials) {
        this.setRequestCredentials(credentials);
        return this;
    }
}