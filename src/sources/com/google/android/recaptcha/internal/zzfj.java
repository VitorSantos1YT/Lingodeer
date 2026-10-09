package com.google.android.recaptcha.internal;

import com.bumptech.glide.d;
import com.bumptech.glide.e;
import qy.h;
import rz.e0;
import wy.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfj {
    private final h zza;

    public zzfj() {
        int i11 = zzav.zza;
        this.zza = d.v(zzfi.zza);
    }

    public static final /* synthetic */ zzex zza(zzfj zzfjVar) {
        return (zzex) zzfjVar.zza.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object zzc(zzfj zzfjVar, zzbr zzbrVar, zzsp zzspVar, vy.d dVar) {
        zzfg zzfgVar;
        if (dVar instanceof zzfg) {
            zzfgVar = (zzfg) dVar;
            int i11 = zzfgVar.zzc;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzfgVar.zzc = i11 - Integer.MIN_VALUE;
            } else {
                zzfgVar = new zzfg(zzfjVar, dVar);
            }
        } else {
            zzfgVar = new zzfg(zzfjVar, dVar);
        }
        Object obj = zzfgVar.zza;
        a aVar = a.COROUTINE_SUSPENDED;
        int i12 = zzfgVar.zzc;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.F(obj);
            return obj;
        }
        e.F(obj);
        zzfh zzfhVar = new zzfh(zzfjVar, zzbrVar, zzspVar, null);
        zzfgVar.zzc = 1;
        Object objL = e0.l(zzfhVar, zzfgVar);
        return objL == aVar ? aVar : objL;
    }

    public final Object zzb(zzbr zzbrVar, zzsp zzspVar, vy.d dVar) {
        return zzc(this, zzbrVar, zzspVar, dVar);
    }
}
