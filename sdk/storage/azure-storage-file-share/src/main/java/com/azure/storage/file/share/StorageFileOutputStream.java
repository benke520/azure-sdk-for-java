// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.file.share;

import com.azure.storage.common.StorageOutputStream;
import com.azure.storage.common.implementation.Constants;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.nio.ByteBuffer;

/**
 * Provides an output stream to write a given storage file resource.
 */
public class StorageFileOutputStream extends StorageOutputStream {
    private long offsetPos;

    private final ShareFileAsyncClient client;

    StorageFileOutputStream(final ShareFileAsyncClient client, long offsetPos) {
        super(4 * Constants.MB);
        this.client = client;
        this.offsetPos = offsetPos;
    }

    private Mono<Void> uploadData(Flux<ByteBuffer> inputData, long writeLength, long offset) {
        return client.uploadWithResponse(inputData, writeLength, offset).then();
    }

    @Override
    protected Mono<Void> dispatchWrite(byte[] data, int writeLength, long offset) {
        if (writeLength == 0) {
            return Mono.empty();
        }

        Flux<ByteBuffer> fbb = Mono.fromCallable(() -> ByteBuffer.wrap(data, (int) offset, writeLength)).flux();

        long fileOffset = this.offsetPos;
        this.offsetPos = this.offsetPos + writeLength;

        return this.uploadData(fbb, writeLength, fileOffset);
    }
}
