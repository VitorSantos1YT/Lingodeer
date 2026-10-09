package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzu extends zzai {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Callable f12006c;

    public zzu(Callable callable) {
        super("internal.appMetadata");
        this.f12006c = callable;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao a(zzg zzgVar, List list) {
        try {
            return zzi.a(this.f12006c.call());
        } catch (Exception unused) {
            return zzao.f11445j;
        }
    }
}
