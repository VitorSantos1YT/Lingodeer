package com.bumptech.glide.load.resource.bitmap;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultImageHeaderParser$Reader$EndOfFileException extends IOException {
    private static final long serialVersionUID = 1;

    public DefaultImageHeaderParser$Reader$EndOfFileException() {
        super("Unexpectedly reached end of a file");
    }
}
