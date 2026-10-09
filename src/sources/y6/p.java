package y6;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.math.DoubleMath;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    public final float A;
    public final byte[] B;
    public final int C;
    public final g D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public int P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f57280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImmutableList f57281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f57282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f57283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f57284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f57285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f57286h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f57287i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f57288j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f57289k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c0 f57290l;
    public final String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f57291n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f57292o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f57293p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f57294q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l f57295r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f57296s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f57297t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f57298u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f57299v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f57300w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f57301x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final float f57302y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f57303z;

    static {
        new o().a();
        b7.f0.G(0);
        b7.f0.G(1);
        b7.f0.G(2);
        b7.f0.G(3);
        b7.f0.G(4);
        w4.c.s(5, 6, 7, 8, 9);
        w4.c.s(10, 11, 12, 13, 14);
        w4.c.s(15, 16, 17, 18, 19);
        w4.c.s(20, 21, 22, 23, 24);
        w4.c.s(25, 26, 27, 28, 29);
        w4.c.s(30, 31, 32, 33, 34);
        b7.f0.G(35);
        b7.f0.G(36);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(o oVar) {
        boolean z11;
        String str;
        this.f57279a = oVar.f57253a;
        String strL = b7.f0.L(oVar.f57256d);
        this.f57282d = strL;
        if (oVar.f57255c.isEmpty() && oVar.f57254b != null) {
            this.f57281c = ImmutableList.u(new q(strL, oVar.f57254b));
            this.f57280b = oVar.f57254b;
        } else if (oVar.f57255c.isEmpty() || oVar.f57254b != null) {
            if (!oVar.f57255c.isEmpty() || oVar.f57254b != null) {
                int i11 = 0;
                while (true) {
                    if (i11 >= oVar.f57255c.size()) {
                        z11 = false;
                        break;
                    } else {
                        if (((q) oVar.f57255c.get(i11)).f57310b.equals(oVar.f57254b)) {
                            z11 = true;
                            break;
                        }
                        i11++;
                    }
                }
            } else {
                z11 = true;
                break;
            }
            b7.a.j(z11);
            this.f57281c = oVar.f57255c;
            this.f57280b = oVar.f57254b;
        } else {
            ImmutableList immutableList = oVar.f57255c;
            this.f57281c = immutableList;
            int size = immutableList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    str = ((q) immutableList.get(0)).f57310b;
                    break;
                }
                E e8 = immutableList.get(i12);
                i12++;
                q qVar = (q) e8;
                if (TextUtils.equals(qVar.f57309a, strL)) {
                    str = qVar.f57310b;
                    break;
                }
            }
            this.f57280b = str;
        }
        this.f57283e = oVar.f57257e;
        b7.a.i("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", oVar.f57259g == 0 || (oVar.f57258f & 32768) != 0);
        this.f57284f = oVar.f57258f;
        this.f57285g = oVar.f57259g;
        int i13 = oVar.f57260h;
        this.f57286h = i13;
        int i14 = oVar.f57261i;
        this.f57287i = i14;
        this.f57288j = i14 != -1 ? i14 : i13;
        this.f57289k = oVar.f57262j;
        this.f57290l = oVar.f57263k;
        this.m = oVar.f57264l;
        this.f57291n = oVar.m;
        this.f57292o = oVar.f57265n;
        this.f57293p = oVar.f57266o;
        List list = oVar.f57267p;
        this.f57294q = list == null ? Collections.EMPTY_LIST : list;
        l lVar = oVar.f57268q;
        this.f57295r = lVar;
        this.f57296s = oVar.f57269r;
        this.f57297t = oVar.f57270s;
        this.f57298u = oVar.f57271t;
        this.f57299v = oVar.f57272u;
        this.f57300w = oVar.f57273v;
        this.f57301x = oVar.f57274w;
        this.f57302y = oVar.f57275x;
        int i15 = oVar.f57276y;
        this.f57303z = i15 == -1 ? 0 : i15;
        float f5 = oVar.f57277z;
        this.A = f5 == -1.0f ? 1.0f : f5;
        this.B = oVar.A;
        this.C = oVar.B;
        this.D = oVar.C;
        this.E = oVar.D;
        this.F = oVar.E;
        this.G = oVar.F;
        this.H = oVar.G;
        int i16 = oVar.H;
        this.I = i16 == -1 ? 0 : i16;
        int i17 = oVar.I;
        this.J = i17 != -1 ? i17 : 0;
        this.K = oVar.J;
        this.L = oVar.K;
        this.M = oVar.L;
        this.N = oVar.M;
        int i18 = oVar.N;
        if (i18 != 0 || lVar == null) {
            this.O = i18;
        } else {
            this.O = 1;
        }
    }

    public static String c(p pVar) {
        int i11;
        String str;
        String strH;
        if (pVar == null) {
            return "null";
        }
        int i12 = pVar.f57283e;
        ImmutableList immutableList = pVar.f57281c;
        String str2 = pVar.f57282d;
        int i13 = pVar.G;
        int i14 = pVar.F;
        int i15 = pVar.E;
        float f5 = pVar.f57302y;
        g gVar = pVar.D;
        float f11 = pVar.A;
        int i16 = pVar.f57301x;
        int i17 = pVar.f57300w;
        int i18 = pVar.f57299v;
        int i19 = pVar.f57298u;
        l lVar = pVar.f57295r;
        String str3 = pVar.f57289k;
        int i21 = pVar.f57288j;
        String str4 = pVar.m;
        int i22 = pVar.f57284f;
        Joiner joiner = new Joiner(String.valueOf(','));
        StringBuilder sbN = ep.a.n("id=");
        sbN.append(pVar.f57279a);
        sbN.append(", mimeType=");
        sbN.append(pVar.f57291n);
        if (str4 != null) {
            sbN.append(", container=");
            sbN.append(str4);
        }
        if (i21 != -1) {
            sbN.append(", bitrate=");
            sbN.append(i21);
        }
        if (str3 != null) {
            sbN.append(", codecs=");
            sbN.append(str3);
        }
        if (lVar != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i23 = 0; i23 < lVar.f57227d; i23++) {
                UUID uuid = lVar.f57224a[i23].f57217b;
                if (uuid.equals(f.f57189b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(f.f57190c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(f.f57192e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(f.f57191d)) {
                    linkedHashSet.add("widevine");
                } else {
                    if (uuid.equals(f.f57188a)) {
                        linkedHashSet.add("universal");
                    } else {
                        linkedHashSet.add("unknown (" + uuid + ")");
                    }
                }
            }
            sbN.append(", drm=[");
            joiner.b(sbN, linkedHashSet.iterator());
            sbN.append(']');
        }
        if (i19 != -1 && i18 != -1) {
            w4.c.t(i19, i18, ", res=", "x", sbN);
        }
        if (i17 != -1 && i16 != -1) {
            w4.c.t(i17, i16, ", decRes=", "x", sbN);
        }
        double d5 = f11;
        int i24 = DoubleMath.f17467a;
        if (Math.copySign(d5 - 1.0d, 1.0d) > 0.001d && d5 != 1.0d && (!Double.isNaN(d5) || !Double.isNaN(1.0d))) {
            sbN.append(", par=");
            Object[] objArr = {Float.valueOf(f11)};
            String str5 = b7.f0.f3975a;
            sbN.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (gVar != null) {
            int i25 = gVar.f57200f;
            int i26 = gVar.f57199e;
            if ((i26 != -1 && i25 != -1) || gVar.d()) {
                sbN.append(", color=");
                if (gVar.d()) {
                    String strB = g.b(gVar.f57195a);
                    String strA = g.a(gVar.f57196b);
                    String strC = g.c(gVar.f57197c);
                    Locale locale = Locale.US;
                    strH = w4.c.h(strB, "/", strA, "/", strC);
                } else {
                    strH = "NA/NA/NA";
                }
                sbN.append(strH + "/" + ((i26 == -1 || i25 == -1) ? "NA/NA" : i26 + "/" + i25));
            }
        }
        if (f5 != -1.0f) {
            sbN.append(", fps=");
            sbN.append(f5);
        }
        if (i15 != -1) {
            sbN.append(", maxSubLayers=");
            sbN.append(i15);
        }
        if (i14 != -1) {
            sbN.append(", channels=");
            sbN.append(i14);
        }
        if (i13 != -1) {
            sbN.append(", sample_rate=");
            sbN.append(i13);
        }
        if (str2 != null) {
            sbN.append(", language=");
            sbN.append(str2);
        }
        if (!immutableList.isEmpty()) {
            sbN.append(", labels=[");
            joiner.b(sbN, Lists.e(immutableList, new a7.c(14)).iterator());
            sbN.append("]");
        }
        if (i12 != 0) {
            sbN.append(", selectionFlags=[");
            String str6 = b7.f0.f3975a;
            ArrayList arrayList = new ArrayList();
            if ((i12 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i12 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i12 & 2) != 0) {
                arrayList.add("forced");
            }
            joiner.b(sbN, arrayList.iterator());
            sbN.append("]");
        }
        if (i22 != 0) {
            sbN.append(", roleFlags=[");
            String str7 = b7.f0.f3975a;
            ArrayList arrayList2 = new ArrayList();
            if ((i22 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i22 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i22 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i22 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i22 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i22 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i22 & 64) != 0) {
                arrayList2.add("caption");
            }
            i11 = i22;
            if ((i11 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i11 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i11 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i11 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i11 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i11 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i11 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i11 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i11 & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            joiner.b(sbN, arrayList2.iterator());
            sbN.append("]");
        } else {
            i11 = i22;
        }
        if ((i11 & 32768) != 0) {
            sbN.append(", auxiliaryTrackType=");
            int i27 = pVar.f57285g;
            String str8 = b7.f0.f3975a;
            if (i27 == 0) {
                str = "undefined";
            } else if (i27 == 1) {
                str = "original";
            } else if (i27 == 2) {
                str = "depth-linear";
            } else if (i27 == 3) {
                str = "depth-inverse";
            } else {
                if (i27 != 4) {
                    throw new IllegalStateException("Unsupported auxiliary track type");
                }
                str = "depth metadata";
            }
            sbN.append(str);
        }
        return sbN.toString();
    }

    public final o a() {
        o oVar = new o();
        oVar.f57253a = this.f57279a;
        oVar.f57254b = this.f57280b;
        oVar.f57255c = this.f57281c;
        oVar.f57256d = this.f57282d;
        oVar.f57257e = this.f57283e;
        oVar.f57258f = this.f57284f;
        oVar.f57260h = this.f57286h;
        oVar.f57261i = this.f57287i;
        oVar.f57262j = this.f57289k;
        oVar.f57263k = this.f57290l;
        oVar.f57264l = this.m;
        oVar.m = this.f57291n;
        oVar.f57265n = this.f57292o;
        oVar.f57266o = this.f57293p;
        oVar.f57267p = this.f57294q;
        oVar.f57268q = this.f57295r;
        oVar.f57269r = this.f57296s;
        oVar.f57270s = this.f57297t;
        oVar.f57271t = this.f57298u;
        oVar.f57272u = this.f57299v;
        oVar.f57273v = this.f57300w;
        oVar.f57274w = this.f57301x;
        oVar.f57275x = this.f57302y;
        oVar.f57276y = this.f57303z;
        oVar.f57277z = this.A;
        oVar.A = this.B;
        oVar.B = this.C;
        oVar.C = this.D;
        oVar.D = this.E;
        oVar.E = this.F;
        oVar.F = this.G;
        oVar.G = this.H;
        oVar.H = this.I;
        oVar.I = this.J;
        oVar.J = this.K;
        oVar.K = this.L;
        oVar.L = this.M;
        oVar.M = this.N;
        oVar.N = this.O;
        return oVar;
    }

    public final boolean b(p pVar) {
        List list = this.f57294q;
        if (list.size() != pVar.f57294q.size()) {
            return false;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (!Arrays.equals((byte[]) list.get(i11), (byte[]) pVar.f57294q.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i11;
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        int i12 = this.P;
        return (i12 == 0 || (i11 = pVar.P) == 0 || i12 == i11) && this.f57283e == pVar.f57283e && this.f57284f == pVar.f57284f && this.f57285g == pVar.f57285g && this.f57286h == pVar.f57286h && this.f57287i == pVar.f57287i && this.f57292o == pVar.f57292o && this.f57296s == pVar.f57296s && this.f57298u == pVar.f57298u && this.f57299v == pVar.f57299v && this.f57300w == pVar.f57300w && this.f57301x == pVar.f57301x && this.f57303z == pVar.f57303z && this.C == pVar.C && this.E == pVar.E && this.F == pVar.F && this.G == pVar.G && this.H == pVar.H && this.I == pVar.I && this.J == pVar.J && this.K == pVar.K && this.M == pVar.M && this.N == pVar.N && this.O == pVar.O && Float.compare(this.f57302y, pVar.f57302y) == 0 && Float.compare(this.A, pVar.A) == 0 && Objects.equals(this.f57279a, pVar.f57279a) && Objects.equals(this.f57280b, pVar.f57280b) && this.f57281c.equals(pVar.f57281c) && Objects.equals(this.f57289k, pVar.f57289k) && Objects.equals(this.m, pVar.m) && Objects.equals(this.f57291n, pVar.f57291n) && Objects.equals(this.f57282d, pVar.f57282d) && Arrays.equals(this.B, pVar.B) && Objects.equals(this.f57290l, pVar.f57290l) && Objects.equals(this.D, pVar.D) && Objects.equals(this.f57295r, pVar.f57295r) && b(pVar);
    }

    public final int hashCode() {
        if (this.P == 0) {
            String str = this.f57279a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f57280b;
            int iHashCode2 = (this.f57281c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.f57282d;
            int iHashCode3 = (((((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f57283e) * 31) + this.f57284f) * 31) + this.f57285g) * 31) + this.f57286h) * 31) + this.f57287i) * 31;
            String str4 = this.f57289k;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            c0 c0Var = this.f57290l;
            int iHashCode5 = (iHashCode4 + (c0Var == null ? 0 : c0Var.hashCode())) * 961;
            String str5 = this.m;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f57291n;
            this.P = ((((((((((((((((((((((Float.floatToIntBits(this.A) + ((((Float.floatToIntBits(this.f57302y) + ((((((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f57292o) * 31) + ((int) this.f57296s)) * 31) + this.f57298u) * 31) + this.f57299v) * 31) + this.f57300w) * 31) + this.f57301x) * 31)) * 31) + this.f57303z) * 31)) * 31) + this.C) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.M) * 31) + this.N) * 31) + this.O;
        }
        return this.P;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f57279a);
        sb2.append(", ");
        sb2.append(this.f57280b);
        sb2.append(", ");
        sb2.append(this.m);
        sb2.append(", ");
        sb2.append(this.f57291n);
        sb2.append(", ");
        sb2.append(this.f57289k);
        sb2.append(", ");
        sb2.append(this.f57288j);
        sb2.append(", ");
        sb2.append(this.f57282d);
        sb2.append(", [");
        sb2.append(this.f57298u);
        sb2.append(", ");
        sb2.append(this.f57299v);
        sb2.append(", ");
        sb2.append(this.f57302y);
        sb2.append(", ");
        sb2.append(this.D);
        sb2.append("], [");
        sb2.append(this.F);
        sb2.append(", ");
        return hh.p0.i(this.G, "])", sb2);
    }
}
