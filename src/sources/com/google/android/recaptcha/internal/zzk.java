package com.google.android.recaptcha.internal;

import fz.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import qy.n;
import qy.o;
import ry.r;
import rz.b0;
import rz.e0;
import rz.h0;
import vy.d;
import wy.a;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzk extends i implements e {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ zzek zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzsc zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzk(zzl zzlVar, zzek zzekVar, long j11, zzsc zzscVar, d dVar) {
        super(2, dVar);
        this.zzb = zzlVar;
        this.zzc = zzekVar;
        this.zzd = j11;
        this.zze = zzscVar;
    }

    @Override // xy.a
    public final d create(Object obj, d dVar) {
        zzk zzkVar = new zzk(this.zzb, this.zzc, this.zzd, this.zze, dVar);
        zzkVar.zzf = obj;
        return zzkVar;
    }

    @Override // fz.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzk) create((b0) obj, (d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        zzen zzenVar;
        Object objL;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.zza != 0) {
            zzenVar = (zzen) this.zzf;
            com.bumptech.glide.e.F(obj);
        } else {
            com.bumptech.glide.e.F(obj);
            b0 b0Var = (b0) this.zzf;
            this.zzb.zzb = this.zzc;
            zzek zzekVar = this.zzc;
            zzekVar.zzc(zzekVar.zzd());
            zzen zzenVarZzf = zzekVar.zzf(30);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzd().iterator();
            while (it.hasNext()) {
                arrayList.add(e0.f(b0Var, null, null, new zzj((zze) it.next(), this.zzd, this.zze, null), 3));
            }
            h0[] h0VarArr = (h0[]) arrayList.toArray(new h0[0]);
            h0[] h0VarArr2 = (h0[]) Arrays.copyOf(h0VarArr, h0VarArr.length);
            this.zzf = zzenVarZzf;
            this.zza = 1;
            obj = h0VarArr2.length == 0 ? r.f50854a : new rz.e(h0VarArr2).a(this);
            if (obj == aVar) {
                return aVar;
            }
            zzenVar = zzenVarZzf;
        }
        List list = (List) obj;
        if (list == null || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!(((o) it2.next()).f48498a instanceof n)) {
                    zzenVar.zza();
                    objL = qy.b0.f48488a;
                }
            }
            zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzY, null);
            zzenVar.zzb(zzbdVar);
            objL = com.bumptech.glide.e.l(zzbdVar);
        } else {
            zzbd zzbdVar2 = new zzbd(zzbb.zzb, zzba.zzY, null);
            zzenVar.zzb(zzbdVar2);
            objL = com.bumptech.glide.e.l(zzbdVar2);
        }
        return new o(objL);
    }
}
