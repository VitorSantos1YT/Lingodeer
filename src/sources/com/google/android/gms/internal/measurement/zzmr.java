package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.DataFormatException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzmr extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzmu f11737a;

    public zzmr(zzmu zzmuVar) {
        this.f11737a = zzmuVar;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0];
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        zzmu zzmuVar = this.f11737a;
        try {
            int iInflate = zzmuVar.f11739a.inflate(bArr, i11, i12);
            if (iInflate > 0) {
                return iInflate;
            }
            if (i12 == 0) {
                return 0;
            }
            if (zzmuVar.f11739a.getRemaining() == 0) {
                return -1;
            }
            int remaining = zzmuVar.f11739a.getRemaining();
            StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 70 + String.valueOf(remaining).length());
            sb2.append("Read no bytes (requested up to ");
            sb2.append(i12);
            sb2.append(") but did not reach end of stream, had ");
            sb2.append(remaining);
            throw new IOException(sb2.toString());
        } catch (DataFormatException e8) {
            throw new IOException(e8);
        }
    }
}
