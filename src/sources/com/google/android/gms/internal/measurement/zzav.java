package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzav {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f11459a = new ArrayList();

    public abstract zzao a(String str, zzg zzgVar, ArrayList arrayList);

    public final void b(String str) {
        if (!this.f11459a.contains(zzh.e(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
    }
}
