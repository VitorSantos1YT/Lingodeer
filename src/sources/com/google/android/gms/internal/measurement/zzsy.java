package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzsy implements zzsx {
    @Override // com.google.android.gms.internal.measurement.zzsx
    public final OutputStream d(Uri uri) {
        return g().d(h(uri));
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final void e(Uri uri) throws IOException {
        g().e(h(uri));
    }

    @Override // com.google.android.gms.internal.measurement.zzsx
    public final void f(Uri uri, Uri uri2) throws IOException {
        g().f(h(uri), h(uri2));
    }

    public abstract zzsd g();

    public Uri h(Uri uri) {
        throw null;
    }
}
