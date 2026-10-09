package com.google.android.recaptcha.internal;

import fz.e;
import kotlin.jvm.internal.n;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgr extends n implements e {
    final /* synthetic */ zzgd zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgr(zzgd zzgdVar, String str, int i11) {
        super(2);
        this.zza = zzgdVar;
        this.zzb = str;
        this.zzc = i11;
    }

    @Override // fz.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object[] objArr = (Object[]) obj;
        this.zza.zzi().zzb(this.zzb, (String) obj2);
        int i11 = this.zzc;
        if (i11 != -1) {
            this.zza.zzc().zze(i11, objArr);
        }
        return b0.f48488a;
    }
}
