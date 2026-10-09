package com.google.android.gms.internal.play_billing;

import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzep extends zzdz {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f12356b = Logger.getLogger(zzep.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f12357c = zzho.f12460e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zzeq f12358a;

    private zzep() {
        throw null;
    }

    public static int a(String str) {
        int length;
        try {
            length = zzhr.c(str);
        } catch (zzhq unused) {
            length = str.getBytes(zzfo.f12383a).length;
        }
        return b(length) + length;
    }

    public static int b(int i11) {
        return (352 - (Integer.numberOfLeadingZeros(i11) * 9)) >>> 6;
    }

    public static int c(long j11) {
        return (640 - (Long.numberOfLeadingZeros(j11) * 9)) >>> 6;
    }

    public abstract void d(byte b3);

    public abstract void e(int i11, boolean z11);

    public abstract void f(int i11, zzei zzeiVar);

    public abstract void g(int i11, int i12);

    public abstract void h(int i11);

    public abstract void i(int i11, long j11);

    public abstract void j(long j11);

    public abstract void k(int i11, int i12);

    public abstract void l(int i11);

    public abstract void m(int i11, zzgl zzglVar, zzgv zzgvVar);

    public abstract void n(int i11, zzgl zzglVar);

    public abstract void o(int i11, zzei zzeiVar);

    public abstract void p(int i11, String str);

    public abstract void q(int i11, int i12);

    public abstract void r(int i11, int i12);

    public abstract void s(int i11);

    public abstract void t(int i11, long j11);

    public abstract void u(long j11);
}
