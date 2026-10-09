package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.material.datepicker.d;
import java.util.Iterator;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f12686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f12687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zzbf f12688g;

    public zzbc(zzic zzicVar, String str, String str2, String str3, long j11, long j12, long j13, Bundle bundle) {
        zzbf zzbfVar;
        Preconditions.d(str2);
        Preconditions.d(str3);
        this.f12682a = str2;
        this.f12683b = str3;
        this.f12684c = true == TextUtils.isEmpty(str) ? null : str;
        this.f12685d = j11;
        this.f12686e = j12;
        this.f12687f = j13;
        if (j13 != 0 && j13 > j11) {
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12945i.b(zzgu.o(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle == null || bundle.isEmpty()) {
            zzbfVar = new zzbf(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    zzgu zzguVar2 = zzicVar.f13099f;
                    zzic.m(zzguVar2);
                    zzguVar2.f12942f.a("Param name can't be null");
                    it.remove();
                } else {
                    zzpp zzppVar = zzicVar.f13102i;
                    zzic.k(zzppVar);
                    Object objP = zzppVar.p(bundle2.get(next), next);
                    if (objP == null) {
                        zzgu zzguVar3 = zzicVar.f13099f;
                        zzic.m(zzguVar3);
                        zzguVar3.f12945i.b(zzicVar.f13103j.b(next), "Param value can't be null");
                        it.remove();
                    } else {
                        zzpp zzppVar2 = zzicVar.f13102i;
                        zzic.k(zzppVar2);
                        zzppVar2.x(bundle2, next, objP);
                    }
                }
            }
            zzbfVar = new zzbf(bundle2);
        }
        this.f12688g = zzbfVar;
    }

    public final zzbc a(zzic zzicVar, long j11) {
        return new zzbc(zzicVar, this.f12684c, this.f12682a, this.f12683b, this.f12685d, this.f12686e, j11, this.f12688g);
    }

    public final String toString() {
        String string = this.f12688g.toString();
        String str = this.f12682a;
        int length = String.valueOf(str).length();
        String str2 = this.f12683b;
        StringBuilder sb2 = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + string.length() + 1);
        d.w(sb2, "Event{appId='", str, "', name='", str2);
        return p.u(sb2, "', params=", string, "}");
    }

    public zzbc(zzic zzicVar, String str, String str2, String str3, long j11, long j12, long j13, zzbf zzbfVar) {
        Preconditions.d(str2);
        Preconditions.d(str3);
        Preconditions.g(zzbfVar);
        this.f12682a = str2;
        this.f12683b = str3;
        this.f12684c = true == TextUtils.isEmpty(str) ? null : str;
        this.f12685d = j11;
        this.f12686e = j12;
        this.f12687f = j13;
        if (j13 != 0 && j13 > j11) {
            zzgu zzguVar = zzicVar.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12945i.c(zzgu.o(str2), zzgu.o(str3), "Event created with reverse previous/current timestamps. appId, name");
        }
        this.f12688g = zzbfVar;
    }
}
