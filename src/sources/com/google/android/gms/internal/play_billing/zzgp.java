package com.google.android.gms.internal.play_billing;

import b7.e0;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgp implements zzgv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzgl f12413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzhh f12414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzev f12416d;

    public zzgp(zzhh zzhhVar, zzev zzevVar, zzgl zzglVar) {
        this.f12414b = zzhhVar;
        this.f12415c = zzglVar instanceof zzff;
        this.f12416d = zzevVar;
        this.f12413a = zzglVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final boolean a(Object obj) {
        ((zzff) obj).zzb.c();
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final void b(Object obj, zzhu zzhuVar) {
        Iterator itA = ((zzff) obj).zzb.a();
        if (itA.hasNext()) {
            ((zzey) ((Map.Entry) itA.next()).getKey()).zzc();
            throw null;
        }
        zzhi zzhiVar = ((zzfi) obj).zzc;
        for (int i11 = 0; i11 < zzhiVar.f12450a; i11++) {
            zzhuVar.zzw(zzhiVar.f12451b[i11] >>> 3, zzhiVar.f12452c[i11]);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final int c(zzfi zzfiVar) {
        zzhi zzhiVar = zzfiVar.zzc;
        int iD = zzhiVar.f12453d;
        if (iD == -1) {
            iD = 0;
            for (int i11 = 0; i11 < zzhiVar.f12450a; i11++) {
                int i12 = zzhiVar.f12451b[i11] >>> 3;
                zzei zzeiVar = (zzei) zzhiVar.f12452c[i11];
                int iB = zzep.b(8);
                int iB2 = zzep.b(i12) + zzep.b(16);
                int iB3 = zzep.b(24);
                int iE = zzeiVar.e();
                iD += iB + iB + iB2 + e0.D(iE, iE, iB3);
            }
            zzhiVar.f12453d = iD;
        }
        if (this.f12415c) {
            zzgy zzgyVar = ((zzff) zzfiVar).zzb.f12370a;
            if (zzgyVar.f12444b > 0) {
                zzez.e(zzgyVar.d(0));
                throw null;
            }
            Iterator it = zzgyVar.b().iterator();
            if (it.hasNext()) {
                zzez.e((Map.Entry) it.next());
                throw null;
            }
        }
        return iD;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final int d(zzfi zzfiVar) {
        int iHashCode = zzfiVar.zzc.hashCode();
        return this.f12415c ? (iHashCode * 53) + ((zzff) zzfiVar).zzb.f12370a.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final void e(Object obj, byte[] bArr, int i11, int i12, zzdw zzdwVar) {
        zzfi zzfiVar = (zzfi) obj;
        if (zzfiVar.zzc == zzhi.f12449f) {
            zzfiVar.zzc = zzhi.b();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final boolean f(zzfi zzfiVar, zzfi zzfiVar2) {
        if (!zzfiVar.zzc.equals(zzfiVar2.zzc)) {
            return false;
        }
        if (this.f12415c) {
            return ((zzff) zzfiVar).zzb.equals(((zzff) zzfiVar2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final Object zze() {
        zzgl zzglVar = this.f12413a;
        return zzglVar instanceof zzfi ? (zzfi) ((zzfi) zzglVar).f(4) : zzglVar.a().zzg();
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final void zzf(Object obj) {
        this.f12414b.b(obj);
        this.f12416d.a(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgv
    public final void zzg(Object obj, Object obj2) {
        zzgx.l(obj, obj2);
        if (!this.f12415c || ((zzff) obj2).zzb.f12370a.isEmpty()) {
            return;
        }
        throw null;
    }
}
