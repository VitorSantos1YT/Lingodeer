package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.InputStream;
import ns.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzna implements zzrt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11755a;

    public zzna(boolean z11) {
        this.f11755a = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzrt
    public final /* bridge */ /* synthetic */ Object a(zzrs zzrsVar) throws IOException {
        zznd zzndVarA;
        InputStream inputStreamC = zzst.c(zzrsVar);
        try {
            int i11 = 4096;
            if (this.f11755a) {
                if (inputStreamC instanceof zzsf) {
                    long length = ((zzsf) inputStreamC).zza().length();
                    if (length == 0) {
                        i11 = 512;
                    } else if (length < 4096) {
                        i11 = (int) length;
                    }
                }
                zzndVarA = zznd.a(zzacv.h(inputStreamC, i11), true);
            } else {
                zzndVarA = zznd.a(zzacv.h(inputStreamC, 4096), false);
            }
            o.m(inputStreamC, null);
            return zzndVarA;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                o.m(inputStreamC, th2);
                throw th3;
            }
        }
    }
}
