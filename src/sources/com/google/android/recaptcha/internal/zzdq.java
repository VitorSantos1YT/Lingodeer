package com.google.android.recaptcha.internal;

import android.app.Application;
import fz.a;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdq extends n implements a {
    public static final zzdq zza = new zzdq();

    public zzdq() {
        super(0);
    }

    @Override // fz.a
    public final Object invoke() throws zzbd {
        int i11 = zzav.zza;
        Object objZzb = zzau.zza().zzb(735120228);
        if (objZzb != null) {
            return (Application) objZzb;
        }
        throw new zzbd(zzbb.zzb, zzba.zzax, null);
    }
}
