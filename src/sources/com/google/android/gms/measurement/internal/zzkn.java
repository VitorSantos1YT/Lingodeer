package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzkn implements zzpo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzlj f13278a;

    public zzkn(zzlj zzljVar) {
        this.f13278a = zzljVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzpo
    public final void a(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        zzlj zzljVar = this.f13278a;
        if (zIsEmpty) {
            zzljVar.k("auto", "_err", bundle);
        } else {
            zzljVar.getClass();
            throw new IllegalStateException("Unexpected call on client side");
        }
    }
}
