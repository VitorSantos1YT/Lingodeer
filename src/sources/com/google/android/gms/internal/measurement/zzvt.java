package com.google.android.gms.internal.measurement;

import com.google.common.base.Preconditions;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
abstract class zzvt extends zzvn {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zzwl f12089f;

    public zzvt(String str, zzws zzwsVar, zzwl zzwlVar, zzwq zzwqVar) {
        super(str, zzwsVar, zzwqVar);
        Preconditions.g(zzwlVar.f12116c);
        this.f12089f = zzwlVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzws
    public final zzwl zzh() {
        return zzwl.a(this.f12089f, zzl());
    }

    public zzvt(String str, UUID uuid, String str2, zzwl zzwlVar, zzwq zzwqVar) {
        super(str, uuid, str2, zzwqVar);
        Preconditions.g(zzwlVar.f12116c);
        this.f12089f = zzwlVar;
    }
}
