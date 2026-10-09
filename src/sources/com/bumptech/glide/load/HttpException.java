package com.bumptech.glide.load;

import java.io.IOException;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class HttpException extends IOException {
    private static final long serialVersionUID = 1;

    public HttpException(int i11, IOException iOException, String str) {
        super(p.k(i11, str, ", status code: "), iOException);
    }
}
