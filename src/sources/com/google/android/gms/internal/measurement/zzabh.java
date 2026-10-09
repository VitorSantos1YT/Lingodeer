package com.google.android.gms.internal.measurement;

import defpackage.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzabh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzza f11181b;

    public zzabh(zzza zzzaVar, int i11) {
        if (zzzaVar == null) {
            throw new IllegalArgumentException("format options cannot be null");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(e.g(i11, "invalid index: ", new StringBuilder(String.valueOf(i11).length() + 15)));
        }
        this.f11180a = i11;
        this.f11181b = zzzaVar;
    }

    public abstract void a(zzyy zzyyVar, Object obj);
}
