package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzsw implements zzrt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zzro[] f11961a;

    private zzsw() {
    }

    public static zzsw b() {
        return new zzsw();
    }

    @Override // com.google.android.gms.internal.measurement.zzrt
    public final Object a(zzrs zzrsVar) throws IOException {
        ArrayList arrayListA = zzrsVar.a(zzrsVar.f11920a.d(zzrsVar.f11923d));
        zzro[] zzroVarArr = this.f11961a;
        if (zzroVarArr != null) {
            zzroVarArr[0].a(arrayListA);
        }
        return (OutputStream) arrayListA.get(0);
    }
}
