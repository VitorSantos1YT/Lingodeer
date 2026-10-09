package com.google.android.gms.internal.measurement;

import defpackage.e;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzg f11599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzaw f11600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f11601c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f11602d = new HashMap();

    public zzg(zzg zzgVar, zzaw zzawVar) {
        this.f11599a = zzgVar;
        this.f11600b = zzawVar;
    }

    public final zzao a(zzao zzaoVar) {
        return this.f11600b.b(this, zzaoVar);
    }

    public final zzao b(zzae zzaeVar) {
        zzao zzaoVarB = zzao.f11445j;
        Iterator itK = zzaeVar.k();
        while (itK.hasNext()) {
            zzaoVarB = this.f11600b.b(this, zzaeVar.m(((Integer) itK.next()).intValue()));
            if (zzaoVarB instanceof zzag) {
                break;
            }
        }
        return zzaoVarB;
    }

    public final zzg c() {
        return new zzg(this, this.f11600b);
    }

    public final boolean d(String str) {
        if (this.f11601c.containsKey(str)) {
            return true;
        }
        zzg zzgVar = this.f11599a;
        if (zzgVar != null) {
            return zzgVar.d(str);
        }
        return false;
    }

    public final void e(String str, zzao zzaoVar) {
        zzg zzgVar;
        HashMap map = this.f11601c;
        if (!map.containsKey(str) && (zzgVar = this.f11599a) != null && zzgVar.d(str)) {
            zzgVar.e(str, zzaoVar);
        } else {
            if (this.f11602d.containsKey(str)) {
                return;
            }
            if (zzaoVar == null) {
                map.remove(str);
            } else {
                map.put(str, zzaoVar);
            }
        }
    }

    public final void f(String str, zzao zzaoVar) {
        if (this.f11602d.containsKey(str)) {
            return;
        }
        HashMap map = this.f11601c;
        if (zzaoVar == null) {
            map.remove(str);
        } else {
            map.put(str, zzaoVar);
        }
    }

    public final zzao g(String str) {
        HashMap map = this.f11601c;
        if (map.containsKey(str)) {
            return (zzao) map.get(str);
        }
        zzg zzgVar = this.f11599a;
        if (zzgVar != null) {
            return zzgVar.g(str);
        }
        throw new IllegalArgumentException(e.m(str, " is not defined"));
    }
}
