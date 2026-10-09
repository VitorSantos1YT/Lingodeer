package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzpb implements zzpo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzpg f13583a;

    public zzpb(zzpg zzpgVar) {
        this.f13583a = zzpgVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzpo
    public final void a(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        zzpg zzpgVar = this.f13583a;
        if (!zIsEmpty) {
            zzpgVar.e().p(new zzpa(this, str, str2, bundle));
            return;
        }
        zzic zzicVar = zzpgVar.f13606l;
        if (zzicVar != null) {
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12942f.b(str2, "AppId not known when logging event");
        }
    }
}
