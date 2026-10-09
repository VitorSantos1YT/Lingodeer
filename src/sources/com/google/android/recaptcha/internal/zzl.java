package com.google.android.recaptcha.internal;

import com.bumptech.glide.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.f;
import qy.o;
import ry.m;
import ry.r;
import rz.e0;
import vy.d;
import wy.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzl {
    private final List zza;
    private zzek zzb;

    /* JADX WARN: Multi-variable type inference failed */
    public zzl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void zzh(zze... zzeVarArr) {
        m.e0(this.zza, zzeVarArr);
    }

    public final Object zzb(String str, long j11, d dVar) {
        return e0.l(new zzh(this, str, j11, null), dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object zzc(long j11, zzsc zzscVar, zzek zzekVar, d dVar) {
        zzi zziVar;
        if (dVar instanceof zzi) {
            zziVar = (zzi) dVar;
            int i11 = zziVar.zzc;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zziVar.zzc = i11 - Integer.MIN_VALUE;
            } else {
                zziVar = new zzi(this, dVar);
            }
        } else {
            zziVar = new zzi(this, dVar);
        }
        Object objL = zziVar.zza;
        a aVar = a.COROUTINE_SUSPENDED;
        int i12 = zziVar.zzc;
        if (i12 == 0) {
            e.F(objL);
            zzk zzkVar = new zzk(this, zzekVar, j11, zzscVar, null);
            zziVar.zzc = 1;
            objL = e0.l(zzkVar, zziVar);
            if (objL == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.F(objL);
        }
        return ((o) objL).f48498a;
    }

    public final List zzd() {
        return this.zza;
    }

    public final void zzf(zze... zzeVarArr) {
        zzh((zze[]) Arrays.copyOf(zzeVarArr, 1));
    }

    public final void zzg(zzsr zzsrVar) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zze) it.next()).zzk(zzsrVar);
        }
    }

    public /* synthetic */ zzl(List list, int i11, f fVar) {
        this.zza = new ArrayList();
        zze[] zzeVarArr = (zze[]) r.f50854a.toArray(new zze[0]);
        zzh((zze[]) Arrays.copyOf(zzeVarArr, zzeVarArr.length));
    }
}
