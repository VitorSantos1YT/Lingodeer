package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import kotlin.jvm.internal.m;
import ry.l;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzga extends zzfx {
    private final zzfz zza;
    private final String zzb;

    public zzga(zzfz zzfzVar, String str, Object obj) {
        super(obj);
        this.zza = zzfzVar;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzfx
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        if (!m.a(method.getName(), this.zzb)) {
            return false;
        }
        this.zza.zzb(objArr != null ? l.A(objArr) : r.f50854a);
        return true;
    }
}
