package com.google.zxing.datamatrix;

import com.google.zxing.Reader;
import com.google.zxing.datamatrix.decoder.Decoder;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class DataMatrixReader implements Reader {
    public DataMatrixReader() {
        new Decoder();
    }
}
