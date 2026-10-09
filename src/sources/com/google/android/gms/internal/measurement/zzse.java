package com.google.android.gms.internal.measurement;

import com.google.common.collect.Iterables;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzse implements zzro {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OutputStream f11948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zzsm f11949b;

    @Override // com.google.android.gms.internal.measurement.zzro
    public final void a(ArrayList arrayList) {
        OutputStream outputStream = (OutputStream) Iterables.c(arrayList);
        if (outputStream instanceof zzsm) {
            this.f11949b = (zzsm) outputStream;
            this.f11948a = (OutputStream) arrayList.get(0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzro
    public final void zzb() throws IOException {
        if (this.f11949b == null) {
            throw new zzsk("Cannot sync underlying stream");
        }
        this.f11948a.flush();
        this.f11949b.f11952a.getFD().sync();
    }
}
