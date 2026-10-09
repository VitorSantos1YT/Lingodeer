package com.google.android.gms.internal.auth;

import android.util.Base64;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzhz implements zzhx {
    static {
        zzcz zzczVar = new zzcz(new zzcz(zzcr.a(), false, false).a().f9460a, true, true);
        Double dValueOf = Double.valueOf(0.0d);
        new zzcx(zzczVar, dValueOf);
        zzczVar.c(true);
        zzczVar.b(20L);
        zzczVar.b(0L);
        try {
            zzhs zzhsVarI = zzhs.i(Base64.decode("ChNjb20uYW5kcm9pZC52ZW5kaW5nCiBjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5tZWV0aW5ncwohY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMubWVzc2FnaW5n", 3));
            int i11 = zzhy.f9580a;
            new zzcy(zzczVar, zzhsVarI);
            zzczVar.c(true);
            zzczVar.b(20L);
            zzczVar.b(20L);
            zzczVar.c(false);
            zzczVar.c(false);
            zzczVar.b(120L);
            zzczVar.c(true);
            new zzcx(zzczVar, dValueOf);
        } catch (Exception e8) {
            throw new AssertionError(e8);
        }
    }
}
