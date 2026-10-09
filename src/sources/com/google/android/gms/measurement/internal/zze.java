package com.google.android.gms.measurement.internal;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zze {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzji f12780a;

    public zze(zzji zzjiVar) {
        this.f12780a = zzjiVar;
    }

    public static zze a(String str) {
        return new zze((TextUtils.isEmpty(str) || str.length() > 1) ? zzji.UNINITIALIZED : zzjl.e(str.charAt(0)));
    }
}
