package com.google.android.gms.measurement.internal;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzpc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.zzid f13584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f13585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f13586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f13587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zzpg f13588e;

    public /* synthetic */ zzpc(zzpg zzpgVar) {
        this.f13588e = zzpgVar;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0090  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c1 A[RETURN] */
    public final boolean a(long j11, com.google.android.gms.internal.measurement.zzhs zzhsVar) {
        com.google.android.gms.internal.measurement.zzid zzidVar;
        if (this.f13586c == null) {
            this.f13586c = new ArrayList();
        }
        if (this.f13585b == null) {
            this.f13585b = new ArrayList();
        }
        if (this.f13586c.isEmpty() || ((((com.google.android.gms.internal.measurement.zzhs) this.f13586c.get(0)).F() / 1000) / 60) / 60 == ((zzhsVar.F() / 1000) / 60) / 60) {
            long jH = this.f13587d + ((long) zzhsVar.h());
            zzpg zzpgVar = this.f13588e;
            if (!zzpgVar.f0().r(null, zzfy.Y0)) {
                zzpgVar.f0();
                if (jH < Math.max(0, ((Integer) zzfy.f12861j.a(null)).intValue())) {
                    this.f13587d = jH;
                    this.f13586c.add(zzhsVar);
                    this.f13585b.add(Long.valueOf(j11));
                    zzidVar = this.f13584a;
                    if (this.f13586c.size() < Math.max(1, zzpgVar.f0().p(zzidVar != null ? zzidVar.y() : null, zzfy.f12864k))) {
                        return true;
                    }
                }
            } else if (this.f13586c.isEmpty()) {
                this.f13587d = jH;
                this.f13586c.add(zzhsVar);
                this.f13585b.add(Long.valueOf(j11));
                zzidVar = this.f13584a;
                if (this.f13586c.size() < Math.max(1, zzpgVar.f0().p(zzidVar != null ? zzidVar.y() : null, zzfy.f12864k))) {
                    return true;
                }
            } else {
                zzpgVar.f0();
                if (jH < Math.max(0, ((Integer) zzfy.f12861j.a(null)).intValue())) {
                    this.f13587d = jH;
                    this.f13586c.add(zzhsVar);
                    this.f13585b.add(Long.valueOf(j11));
                    zzidVar = this.f13584a;
                    if (this.f13586c.size() < Math.max(1, zzpgVar.f0().p(zzidVar != null ? zzidVar.y() : null, zzfy.f12864k))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
