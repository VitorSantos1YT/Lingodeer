package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzh {
    public Long A;
    public long B;
    public String C;
    public int D;
    public int E;
    public long F;
    public String G;
    public byte[] H;
    public int I;
    public long J;
    public long K;
    public long L;
    public long M;
    public long N;
    public long O;
    public long P;
    public String Q;
    public boolean R;
    public long S;
    public long T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzic f12967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f12969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f12970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f12971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f12972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f12973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f12974h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f12975i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f12976j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f12977k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f12978l;
    public long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f12979n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f12980o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f12981p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Boolean f12982q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f12983r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f12984s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f12985t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f12986u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f12987v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f12988w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f12989x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f12990y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Long f12991z;

    public zzh(zzic zzicVar, String str) {
        Preconditions.g(zzicVar);
        Preconditions.d(str);
        this.f12967a = zzicVar;
        this.f12968b = str;
        zzhz zzhzVar = zzicVar.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
    }

    public final void A(long j11) {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        this.R |= this.f12987v != j11;
        this.f12987v = j11;
    }

    public final void B(long j11) {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        this.R |= this.f12988w != j11;
        this.f12988w = j11;
    }

    public final void C(long j11) {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        this.R |= this.B != j11;
        this.B = j11;
    }

    public final String D() {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        return this.C;
    }

    public final String E() {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        return this.f12968b;
    }

    public final String F() {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        return this.f12969c;
    }

    public final void G(String str) {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        this.R |= !Objects.equals(this.f12969c, str);
        this.f12969c = str;
    }

    public final String H() {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        return this.f12970d;
    }

    public final void I(String str) {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.R |= true ^ Objects.equals(this.f12970d, str);
        this.f12970d = str;
    }

    public final void J(String str) {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        this.R |= !Objects.equals(this.f12971e, str);
        this.f12971e = str;
    }

    public final String K() {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        return this.f12972f;
    }

    public final void L(String str) {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        this.R |= !Objects.equals(this.f12972f, str);
        this.f12972f = str;
    }

    public final void M(long j11) {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        this.R |= this.f12974h != j11;
        this.f12974h = j11;
    }

    public final void N(long j11) {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        this.R |= this.f12975i != j11;
        this.f12975i = j11;
    }

    public final String O() {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        return this.f12976j;
    }

    public final void P(String str) {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        this.R |= !Objects.equals(this.f12976j, str);
        this.f12976j = str;
    }

    public final long Q() {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        return this.f12977k;
    }

    public final void R(long j11) {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        this.R |= this.f12977k != j11;
        this.f12977k = j11;
    }

    public final void S(String str) {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        this.R |= !Objects.equals(this.f12978l, str);
        this.f12978l = str;
    }

    public final void T(long j11) {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        this.R |= this.m != j11;
        this.m = j11;
    }

    public final void a(long j11) {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        this.R |= this.f12979n != j11;
        this.f12979n = j11;
    }

    public final long b() {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        return this.f12983r;
    }

    public final void c(long j11) {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        this.R |= this.f12983r != j11;
        this.f12983r = j11;
    }

    public final void d(boolean z11) {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        this.R |= this.f12980o != z11;
        this.f12980o = z11;
    }

    public final void e(long j11) {
        Preconditions.b(j11 >= 0);
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        this.R |= this.f12973g != j11;
        this.f12973g = j11;
    }

    public final void f(long j11) {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        this.R |= this.S != j11;
        this.S = j11;
    }

    public final void g(long j11) {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        this.R |= this.T != j11;
        this.T = j11;
    }

    public final void h(long j11) {
        zzic zzicVar = this.f12967a;
        zzhz zzhzVar = zzicVar.f13100g;
        zzgu zzguVar = zzicVar.f13099f;
        zzic.m(zzhzVar);
        zzhzVar.g();
        long j12 = this.f12973g + j11;
        String str = this.f12968b;
        if (j12 > 2147483647L) {
            zzic.m(zzguVar);
            zzguVar.f12945i.b(zzgu.o(str), "Bundle index overflow. appId");
            j12 = (-1) + j11;
        }
        long j13 = this.F + 1;
        if (j13 > 2147483647L) {
            zzic.m(zzguVar);
            zzguVar.f12945i.b(zzgu.o(str), "Delivery index overflow. appId");
            j13 = 0;
        }
        this.R = true;
        this.f12973g = j12;
        this.F = j13;
    }

    public final void i(long j11) {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        this.R |= this.K != j11;
        this.K = j11;
    }

    public final void j(long j11) {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        this.R |= this.L != j11;
        this.L = j11;
    }

    public final void k(long j11) {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        this.R |= this.M != j11;
        this.M = j11;
    }

    public final void l(long j11) {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        this.R |= this.N != j11;
        this.N = j11;
    }

    public final void m(long j11) {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        this.R |= this.P != j11;
        this.P = j11;
    }

    public final void n(long j11) {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        this.R |= this.O != j11;
        this.O = j11;
    }

    public final boolean o() {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        return this.R;
    }

    public final void p(int i11) {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        this.R |= this.D != i11;
        this.D = i11;
    }

    public final void q(int i11) {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        this.R |= this.E != i11;
        this.E = i11;
    }

    public final void r(long j11) {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        this.R |= this.F != j11;
        this.F = j11;
    }

    public final String s() {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        return this.G;
    }

    public final int t() {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        return this.I;
    }

    public final void u(long j11) {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        this.R |= this.J != j11;
        this.J = j11;
    }

    public final String v() {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        String str = this.Q;
        w(null);
        return str;
    }

    public final void w(String str) {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        this.R |= !Objects.equals(this.Q, str);
        this.Q = str;
    }

    public final Boolean x() {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        return this.f12982q;
    }

    public final void y(List list) {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        if (Objects.equals(this.f12984s, list)) {
            return;
        }
        this.R = true;
        this.f12984s = list != null ? new ArrayList(list) : null;
    }

    public final boolean z() {
        zzhz zzhzVar = this.f12967a.f13100g;
        zzic.m(zzhzVar);
        zzhzVar.g();
        return this.f12986u;
    }
}
