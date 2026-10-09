package com.lingo.lingoskill.malskill.ui.learn;

import android.os.Bundle;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import b0.t1;
import ch.b0;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import fz.c;
import g2.v0;
import h1.e0;
import h1.k7;
import h1.ua;
import in.e;
import in.i;
import j0.e2;
import j0.u;
import j0.v1;
import j3.p0;
import j3.y0;
import java.util.List;
import kotlin.jvm.internal.z;
import l1.b1;
import l1.d0;
import l1.g;
import l1.m;
import l1.n;
import l1.q1;
import l1.s;
import l1.t;
import l1.x1;
import ln.a;
import m0.b;
import n3.p;
import oz.q;
import r0.f;
import u3.l;
import xg.d;
import y2.h;
import y2.j;
import y2.k;
import z1.o;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class MALSyllableIntroductionActivity extends d {
    public static final /* synthetic */ int Q = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f21914t = "A a\tB b\tC c\tD d\tE e\tF f\tG g\tH h\tI i\tJ j\tK k\tL l\tM m\tN n\tO o\tP p\tQ q\tR r\tS s\tT t\tU u\tV v\tW w\tX x\tY y\tZ z";
    public final String H = "a\tawak\nyou\ti\tini\nthis\to\tkosong\nempty, zero\tu\tguru\nteacher";
    public final String K = "e\nthe schwa\tenam\nsix\te\nthe open “e” sound\tboleh\ncan";
    public final String L = "saya\nI\n[zy-saya]\tsaya\nI\n[zy-saya_informal]\tnama\nname\n[zy-nama]\tnama\nname\n[zy-nama_informal]";
    public final String M = "b\tibu\nmother\t \tc\tcuaca\nwater\n[zy-cuaca_informal]\t \td\tdia\nhe, she\n[zy-dia_informal]\t \tf\tfilem\nmovie\tmaaf\nsorry\tg\tgigi\ntooth\t \th\thari\nday\ttujuh\nseven\tj\tjalan\nroad\t \tk\tkucing\ncat\tanak\nchild\tl\tlima\nfive\n[zy-lima_informal]\tmahal\nexpensive\tm\tmakan\nto eat\tayam\nchicken\tn\tnaik\nto ride\tjalan\nroad\tp\tpagi\nmorning\tsedap\ndelicious\tq\tQuran\nQuran\t \tr\tribu\nthousand\tair\nwater\ts\tsaya\nI\n[zy-saya_informal]\tais\nice\tt\ttiga\nthree\n[zy-tiga_informal]\tempat\nfour\tv\tvideo\nvideo\t \tw\twang\nmoney\t \ty\tya\nyes\n[zy-ya_informal]\t \tz\tzoo\nzoo\t ";
    public final String N = "sedap\ndelicious\tempat\nfour\tanak\nchild";
    public final String O = "sangat\nvery\tkucing\ncat";
    public final String P = "hanya\nonly\n[zy-hanya_informal]\tpenyanyi\nsinger";

    @Override // xg.d
    public final void j(Bundle bundle, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(1605242411);
        int i12 = (sVar.h(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            t(null, sVar, i12 & 112);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fu.n(this, i11, 7, bundle);
        }
    }

    public final void p(a aVar, n nVar, int i11) {
        int i12;
        s sVar;
        s sVar2 = (s) nVar;
        sVar2.f0(174833211);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.h(aVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.h(this) ? 32 : 16;
        }
        if (sVar2.T(i12 & 1, (i12 & 19) != 18)) {
            Object objQ = sVar2.Q();
            g gVar = m.f39353a;
            if (objQ == gVar) {
                objQ = q.W0(this.f21914t, new String[]{"\t"}, 0, 6);
                sVar2.o0(objQ);
            }
            List list = (List) objQ;
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                objQ2 = ry.m.g1(q.W0(this.H, new String[]{"\t"}, 0, 6), 2, 2);
                sVar2.o0(objQ2);
            }
            List list2 = (List) objQ2;
            Object objQ3 = sVar2.Q();
            if (objQ3 == gVar) {
                objQ3 = ry.m.g1(q.W0(this.K, new String[]{"\t"}, 0, 6), 2, 2);
                sVar2.o0(objQ3);
            }
            List list3 = (List) objQ3;
            Object objQ4 = sVar2.Q();
            if (objQ4 == gVar) {
                objQ4 = ry.m.g1(q.W0(this.L, new String[]{"\t"}, 0, 6), 2, 2);
                sVar2.o0(objQ4);
            }
            List list4 = (List) objQ4;
            Object objQ5 = sVar2.Q();
            if (objQ5 == gVar) {
                objQ5 = ry.m.g1(q.W0(this.M, new String[]{"\t"}, 0, 6), 3, 3);
                sVar2.o0(objQ5);
            }
            List list5 = (List) objQ5;
            Object objQ6 = sVar2.Q();
            if (objQ6 == gVar) {
                objQ6 = ry.m.g1(q.W0(this.N, new String[]{"\t"}, 0, 6), 3, 3);
                sVar2.o0(objQ6);
            }
            List list6 = (List) objQ6;
            Object objQ7 = sVar2.Q();
            if (objQ7 == gVar) {
                objQ7 = ry.m.g1(q.W0(this.O, new String[]{"\t"}, 0, 6), 2, 2);
                sVar2.o0(objQ7);
            }
            List list7 = (List) objQ7;
            Object objQ8 = sVar2.Q();
            if (objQ8 == gVar) {
                objQ8 = ry.m.g1(q.W0(this.P, new String[]{"\t"}, 0, 6), 2, 2);
                sVar2.o0(objQ8);
            }
            List list8 = (List) objQ8;
            b bVar = new b(5);
            float f5 = 16;
            v1 v1Var = new v1(f5, f5, f5, f5);
            boolean zH = sVar2.h(this) | sVar2.h(list) | sVar2.h(aVar) | sVar2.h(list2) | sVar2.h(list3) | sVar2.h(list4) | sVar2.h(list5) | sVar2.h(list6) | sVar2.h(list7) | sVar2.h(list8);
            Object objQ9 = sVar2.Q();
            if (zH || objQ9 == gVar) {
                objQ9 = new i(list, this, aVar, list2, list3, list4, list5, list6, list7, list8);
                sVar2.o0(objQ9);
            }
            sVar = sVar2;
            md.a.a(bVar, null, null, v1Var, null, null, null, false, null, (c) objQ9, sVar, 0, 1014);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new t1(this, i11, 5, aVar);
        }
    }

    public final void q(String str, n nVar, int i11) {
        s sVar;
        s sVar2 = (s) nVar;
        sVar2.f0(-1197203926);
        if (sVar2.T(i11 & 1, (i11 & 3) != 2)) {
            sVar = sVar2;
            ua.b(str, j0.c.E(o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 8, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(ua.f31167a), se.i.k(sVar2, R.color.second_black), 0L, null, null, null, 0L, null, null, 0, 0, j3.v(1.8d), null, 16646142), sVar, 54, 0, 65532);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new e(this, str, i11, 0);
        }
    }

    public final void r(String str, c cVar, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-315953408);
        int i12 = (sVar.f(str) ? 4 : 2) | i11 | (sVar.h(cVar) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            k7.d(j0.c.j(e2.e(j0.c.A(o.f58481a, 1), 1.0f), 1.0f), f.d(4), k7.p(se.i.k(sVar, R.color.white), sVar, 0), null, null, t1.e.d(-2018323214, new in.d(cVar, str, 0), sVar), sVar, 196614, 24);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fp.e((Object) this, str, (Object) cVar, i11, 3);
        }
    }

    public final void s(String str, n nVar, int i11) {
        s sVar;
        s sVar2 = (s) nVar;
        sVar2.f0(775035343);
        if (sVar2.T(i11 & 1, (i11 & 3) != 2)) {
            sVar = sVar2;
            ua.b(str, j0.c.E(o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 16, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(ua.f31167a), se.i.k(sVar2, R.color.primary_black), j3.A(18), n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, 54, 0, 65532);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new e(this, str, i11, 1);
        }
    }

    public final void t(a aVar, n nVar, int i11) {
        a aVar2;
        int i12;
        s sVar = (s) nVar;
        sVar.f0(-915725911);
        int i13 = i11 | 2 | (sVar.h(this) ? 32 : 16);
        if (sVar.T(i13 & 1, (i13 & 19) != 18)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, 6);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                aVar2 = (a) ViewModelKt.viewModel(z.a(a.class), current, (String) null, (ViewModelProvider.Factory) null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, sVar, 0, 0);
                i12 = i13 & (-15);
            } else {
                sVar.W();
                aVar2 = aVar;
                i12 = i13 & (-15);
            }
            sVar.q();
            b1 b1VarO = t.o(aVar2.f40175b, sVar);
            if (((Number) b1VarO.getValue()).floatValue() < 1.0f) {
                sVar.d0(1241910923);
                tv.a.g(((Number) b1VarO.getValue()).floatValue(), null, sVar, 0, 6);
                sVar.p(false);
            } else {
                sVar.d0(1242009193);
                u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
                int iHashCode = Long.hashCode(sVar.T);
                q1 q1VarL = sVar.l();
                r rVarC = z1.a.c(sVar, o.f58481a);
                k.J.getClass();
                y2.i iVar = j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                t.J(j.f56917f, uVarA, sVar);
                t.J(j.f56916e, q1VarL, sVar);
                h hVar = j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                t.J(j.f56915d, rVarC, sVar);
                e0.c(in.a.f34466a, null, t1.e.d(1376176061, new b0(this, 10), sVar), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, sVar, 390, 250);
                sVar = sVar;
                p(aVar2, sVar, i12 & 126);
                sVar.p(true);
                sVar.p(false);
            }
        } else {
            sVar.W();
            aVar2 = aVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fu.n(this, i11, 8, aVar2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x027c  */
    /* JADX WARN: Code duplicated, block: B:102:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:104:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:107:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:109:0x01f9 A[EDGE_INSN: B:109:0x01f9->B:98:0x01f9 BREAK  A[LOOP:0: B:91:0x01ba->B:97:0x01cd], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x01cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0086  */
    /* JADX WARN: Code duplicated, block: B:46:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x0099  */
    /* JADX WARN: Code duplicated, block: B:50:0x009b  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:58:0x00af  */
    /* JADX WARN: Code duplicated, block: B:61:0x00df A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:63:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:75:0x0132  */
    /* JADX WARN: Code duplicated, block: B:76:0x0136  */
    /* JADX WARN: Code duplicated, block: B:79:0x0149  */
    /* JADX WARN: Code duplicated, block: B:81:0x0157  */
    /* JADX WARN: Code duplicated, block: B:84:0x017e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0181  */
    /* JADX WARN: Code duplicated, block: B:88:0x0188  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:96:0x01cc  */
    public final void u(String str, String borderChar, r rVar, boolean z11, boolean z12, c cVar, n nVar, int i11, int i12) {
        int i13;
        boolean z13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z14;
        s sVar;
        boolean z15;
        boolean z16;
        x1 x1VarT;
        boolean z17;
        List listW0;
        boolean z18;
        boolean z19;
        boolean z20;
        Object objQ;
        int iHashCode;
        y2.i iVar;
        h hVar;
        j3.e eVar;
        String content;
        boolean z21;
        d0 d0Var;
        boolean z22;
        boolean z23;
        int i18;
        int iF0;
        int length;
        int length2;
        int iM0;
        s sVar2 = (s) nVar;
        sVar2.f0(-394599622);
        int i19 = (sVar2.f(str) ? 4 : 2) | i11;
        if ((i11 & 48) == 0) {
            i19 |= sVar2.f(borderChar) ? 32 : 16;
        }
        int i21 = i19 | (sVar2.f(rVar) ? 256 : 128);
        int i22 = i12 & 8;
        if (i22 == 0) {
            if ((i11 & 3072) == 0) {
                i21 |= sVar2.g(z11) ? 2048 : 1024;
            }
            i13 = i12 & 16;
            if (i13 != 0) {
                if ((i11 & 24576) == 0) {
                    z13 = z12;
                    if (sVar2.g(z13)) {
                        i14 = 16384;
                    } else {
                        i14 = OSSConstants.DEFAULT_BUFFER_SIZE;
                    }
                    i21 |= i14;
                }
                if (sVar2.h(cVar)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
                int i23 = i21 | i15;
                if (sVar2.h(this)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i17 = i23 | i16;
                if ((599187 & i17) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (sVar2.T(i17 & 1, z14)) {
                    if (i22 != 0) {
                        z15 = false;
                    } else {
                        z15 = z11;
                    }
                    if (i13 != 0) {
                        z17 = true;
                    } else {
                        z17 = z13;
                    }
                    listW0 = q.W0(str, new String[]{"\n"}, 0, 6);
                    float f5 = 4;
                    r rVarB = d2.h.b(d0.n.h(j0.c.A(rVar, 1), se.i.k(sVar2, R.color.white), f.d(f5)), f.d(f5));
                    if (q.K0(str) && z17) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    boolean zH = sVar2.h(listW0);
                    if ((i17 & 458752) == 131072) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z20 = z19 | zH;
                    objQ = sVar2.Q();
                    if (z20 || objQ == m.f39353a) {
                        objQ = new dl.m(listW0, cVar);
                        sVar2.o0(objQ);
                    }
                    r rVarO = d0.n.o(rVarB, z18, null, (fz.a) objQ, 14);
                    u uVarA = j0.t.a(j0.i.f35307e, z1.c.P, sVar2, 54);
                    iHashCode = Long.hashCode(sVar2.T);
                    q1 q1VarL = sVar2.l();
                    r rVarC = z1.a.c(sVar2, rVarO);
                    k.J.getClass();
                    iVar = j.f56913b;
                    sVar2.h0();
                    if (sVar2.S) {
                        sVar2.k(iVar);
                    } else {
                        sVar2.r0();
                    }
                    t.J(j.f56917f, uVarA, sVar2);
                    t.J(j.f56916e, q1VarL, sVar2);
                    hVar = j.f56918g;
                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                    }
                    t.J(j.f56915d, rVarC, sVar2);
                    eVar = new j3.e();
                    content = (String) listW0.get(0);
                    eVar.d(content);
                    kotlin.jvm.internal.m.f(content, "content");
                    kotlin.jvm.internal.m.f(borderChar, "borderChar");
                    if (q.K0(borderChar)) {
                        if (z15) {
                            i18 = 0;
                            z21 = true;
                            while (true) {
                                iF0 = q.F0(content, borderChar, i18, true);
                                if (iF0 != -1) {
                                    break;
                                }
                                length = borderChar.length() + iF0;
                                length2 = content.length();
                                if (length > length2) {
                                    length2 = length;
                                }
                                eVar.a(new p0(0L, 0L, n3.s.K, (n3.o) null, (p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (l) null, (v0) null, 65531), iF0, length2);
                                i18 = length2;
                            }
                        } else {
                            iM0 = q.M0(2, content, borderChar);
                            if (iM0 != -1) {
                                eVar.a(new p0(0L, 0L, n3.s.K, (n3.o) null, (p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (l) null, (v0) null, 65531), iM0, borderChar.length() + iM0);
                            }
                            z21 = true;
                        }
                    } else {
                        z21 = true;
                    }
                    j3.h hVarJ = eVar.j();
                    d0Var = ua.f31167a;
                    z22 = z21;
                    ua.c(hVarJ, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, y0.a((y0) sVar2.j(d0Var), se.i.k(sVar2, R.color.primary_black), j3.A(18), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar2, 0, 0, 131070);
                    sVar = sVar2;
                    if (listW0.size() >= 2) {
                        sVar.d0(-1668945862);
                        j0.c.g(sVar, e2.g(o.f58481a, 2));
                        ua.b((String) listW0.get(z22 ? 1 : 0), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(d0Var), se.i.k(sVar, R.color.second_black), j3.A(12), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar, 0, 0, 65534);
                        sVar = sVar;
                        z23 = false;
                    } else {
                        z23 = false;
                        sVar.d0(-1690965410);
                    }
                    sVar.p(z23);
                    sVar.p(z22);
                    z16 = z17;
                } else {
                    sVar = sVar2;
                    sVar.W();
                    z15 = z11;
                    z16 = z13;
                }
                x1VarT = sVar.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new in.g(this, str, borderChar, rVar, z15, z16, cVar, i11, i12);
                }
            }
            i21 |= 24576;
            z13 = z12;
            if (sVar2.h(cVar)) {
                i15 = 131072;
            } else {
                i15 = 65536;
            }
            int i24 = i21 | i15;
            if (sVar2.h(this)) {
                i16 = 1048576;
            } else {
                i16 = 524288;
            }
            i17 = i24 | i16;
            if ((599187 & i17) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (sVar2.T(i17 & 1, z14)) {
                if (i22 != 0) {
                    z15 = false;
                } else {
                    z15 = z11;
                }
                if (i13 != 0) {
                    z17 = true;
                } else {
                    z17 = z13;
                }
                listW0 = q.W0(str, new String[]{"\n"}, 0, 6);
                float f11 = 4;
                r rVarB2 = d2.h.b(d0.n.h(j0.c.A(rVar, 1), se.i.k(sVar2, R.color.white), f.d(f11)), f.d(f11));
                if (q.K0(str)) {
                    z18 = false;
                } else {
                    z18 = false;
                }
                boolean zH2 = sVar2.h(listW0);
                if ((i17 & 458752) == 131072) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z20 = z19 | zH2;
                objQ = sVar2.Q();
                if (z20) {
                    objQ = new dl.m(listW0, cVar);
                    sVar2.o0(objQ);
                } else {
                    objQ = new dl.m(listW0, cVar);
                    sVar2.o0(objQ);
                }
                r rVarO2 = d0.n.o(rVarB2, z18, null, (fz.a) objQ, 14);
                u uVarA2 = j0.t.a(j0.i.f35307e, z1.c.P, sVar2, 54);
                iHashCode = Long.hashCode(sVar2.T);
                q1 q1VarL2 = sVar2.l();
                r rVarC2 = z1.a.c(sVar2, rVarO2);
                k.J.getClass();
                iVar = j.f56913b;
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                t.J(j.f56917f, uVarA2, sVar2);
                t.J(j.f56916e, q1VarL2, sVar2);
                hVar = j.f56918g;
                if (sVar2.S) {
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                } else {
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                }
                t.J(j.f56915d, rVarC2, sVar2);
                eVar = new j3.e();
                content = (String) listW0.get(0);
                eVar.d(content);
                kotlin.jvm.internal.m.f(content, "content");
                kotlin.jvm.internal.m.f(borderChar, "borderChar");
                if (q.K0(borderChar)) {
                    if (z15) {
                        i18 = 0;
                        z21 = true;
                        while (true) {
                            iF0 = q.F0(content, borderChar, i18, true);
                            if (iF0 != -1) {
                                break;
                                break;
                            }
                            length = borderChar.length() + iF0;
                            length2 = content.length();
                            if (length > length2) {
                                length2 = length;
                            }
                            eVar.a(new p0(0L, 0L, n3.s.K, (n3.o) null, (p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (l) null, (v0) null, 65531), iF0, length2);
                            i18 = length2;
                        }
                    } else {
                        iM0 = q.M0(2, content, borderChar);
                        if (iM0 != -1) {
                            eVar.a(new p0(0L, 0L, n3.s.K, (n3.o) null, (p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (l) null, (v0) null, 65531), iM0, borderChar.length() + iM0);
                        }
                        z21 = true;
                    }
                } else {
                    z21 = true;
                }
                j3.h hVarJ2 = eVar.j();
                d0Var = ua.f31167a;
                z22 = z21;
                ua.c(hVarJ2, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, y0.a((y0) sVar2.j(d0Var), se.i.k(sVar2, R.color.primary_black), j3.A(18), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar2, 0, 0, 131070);
                sVar = sVar2;
                if (listW0.size() >= 2) {
                    sVar.d0(-1668945862);
                    j0.c.g(sVar, e2.g(o.f58481a, 2));
                    ua.b((String) listW0.get(z22 ? 1 : 0), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(d0Var), se.i.k(sVar, R.color.second_black), j3.A(12), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar, 0, 0, 65534);
                    sVar = sVar;
                    z23 = false;
                } else {
                    z23 = false;
                    sVar.d0(-1690965410);
                }
                sVar.p(z23);
                sVar.p(z22);
                z16 = z17;
            } else {
                sVar = sVar2;
                sVar.W();
                z15 = z11;
                z16 = z13;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new in.g(this, str, borderChar, rVar, z15, z16, cVar, i11, i12);
            }
        }
        i21 |= 3072;
        i13 = i12 & 16;
        if (i13 != 0) {
            if ((i11 & 24576) == 0) {
                z13 = z12;
                if (sVar2.g(z13)) {
                    i14 = 16384;
                } else {
                    i14 = OSSConstants.DEFAULT_BUFFER_SIZE;
                }
                i21 |= i14;
            }
            if (sVar2.h(cVar)) {
                i15 = 131072;
            } else {
                i15 = 65536;
            }
            int i25 = i21 | i15;
            if (sVar2.h(this)) {
                i16 = 1048576;
            } else {
                i16 = 524288;
            }
            i17 = i25 | i16;
            if ((599187 & i17) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (sVar2.T(i17 & 1, z14)) {
                if (i22 != 0) {
                    z15 = false;
                } else {
                    z15 = z11;
                }
                if (i13 != 0) {
                    z17 = true;
                } else {
                    z17 = z13;
                }
                listW0 = q.W0(str, new String[]{"\n"}, 0, 6);
                float f12 = 4;
                r rVarB3 = d2.h.b(d0.n.h(j0.c.A(rVar, 1), se.i.k(sVar2, R.color.white), f.d(f12)), f.d(f12));
                if (q.K0(str)) {
                    z18 = false;
                } else {
                    z18 = false;
                }
                boolean zH3 = sVar2.h(listW0);
                if ((i17 & 458752) == 131072) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z20 = z19 | zH3;
                objQ = sVar2.Q();
                if (z20) {
                    objQ = new dl.m(listW0, cVar);
                    sVar2.o0(objQ);
                } else {
                    objQ = new dl.m(listW0, cVar);
                    sVar2.o0(objQ);
                }
                r rVarO3 = d0.n.o(rVarB3, z18, null, (fz.a) objQ, 14);
                u uVarA3 = j0.t.a(j0.i.f35307e, z1.c.P, sVar2, 54);
                iHashCode = Long.hashCode(sVar2.T);
                q1 q1VarL3 = sVar2.l();
                r rVarC3 = z1.a.c(sVar2, rVarO3);
                k.J.getClass();
                iVar = j.f56913b;
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                t.J(j.f56917f, uVarA3, sVar2);
                t.J(j.f56916e, q1VarL3, sVar2);
                hVar = j.f56918g;
                if (sVar2.S) {
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                } else {
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                }
                t.J(j.f56915d, rVarC3, sVar2);
                eVar = new j3.e();
                content = (String) listW0.get(0);
                eVar.d(content);
                kotlin.jvm.internal.m.f(content, "content");
                kotlin.jvm.internal.m.f(borderChar, "borderChar");
                if (q.K0(borderChar)) {
                    if (z15) {
                        i18 = 0;
                        z21 = true;
                        while (true) {
                            iF0 = q.F0(content, borderChar, i18, true);
                            if (iF0 != -1) {
                                break;
                                break;
                            }
                            length = borderChar.length() + iF0;
                            length2 = content.length();
                            if (length > length2) {
                                length2 = length;
                            }
                            eVar.a(new p0(0L, 0L, n3.s.K, (n3.o) null, (p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (l) null, (v0) null, 65531), iF0, length2);
                            i18 = length2;
                        }
                    } else {
                        iM0 = q.M0(2, content, borderChar);
                        if (iM0 != -1) {
                            eVar.a(new p0(0L, 0L, n3.s.K, (n3.o) null, (p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (l) null, (v0) null, 65531), iM0, borderChar.length() + iM0);
                        }
                        z21 = true;
                    }
                } else {
                    z21 = true;
                }
                j3.h hVarJ3 = eVar.j();
                d0Var = ua.f31167a;
                z22 = z21;
                ua.c(hVarJ3, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, y0.a((y0) sVar2.j(d0Var), se.i.k(sVar2, R.color.primary_black), j3.A(18), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar2, 0, 0, 131070);
                sVar = sVar2;
                if (listW0.size() >= 2) {
                    sVar.d0(-1668945862);
                    j0.c.g(sVar, e2.g(o.f58481a, 2));
                    ua.b((String) listW0.get(z22 ? 1 : 0), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(d0Var), se.i.k(sVar, R.color.second_black), j3.A(12), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar, 0, 0, 65534);
                    sVar = sVar;
                    z23 = false;
                } else {
                    z23 = false;
                    sVar.d0(-1690965410);
                }
                sVar.p(z23);
                sVar.p(z22);
                z16 = z17;
            } else {
                sVar = sVar2;
                sVar.W();
                z15 = z11;
                z16 = z13;
            }
            x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new in.g(this, str, borderChar, rVar, z15, z16, cVar, i11, i12);
            }
        }
        i21 |= 24576;
        z13 = z12;
        if (sVar2.h(cVar)) {
            i15 = 131072;
        } else {
            i15 = 65536;
        }
        int i26 = i21 | i15;
        if (sVar2.h(this)) {
            i16 = 1048576;
        } else {
            i16 = 524288;
        }
        i17 = i26 | i16;
        if ((599187 & i17) != 599186) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (sVar2.T(i17 & 1, z14)) {
            if (i22 != 0) {
                z15 = false;
            } else {
                z15 = z11;
            }
            if (i13 != 0) {
                z17 = true;
            } else {
                z17 = z13;
            }
            listW0 = q.W0(str, new String[]{"\n"}, 0, 6);
            float f13 = 4;
            r rVarB4 = d2.h.b(d0.n.h(j0.c.A(rVar, 1), se.i.k(sVar2, R.color.white), f.d(f13)), f.d(f13));
            if (q.K0(str)) {
                z18 = false;
            } else {
                z18 = false;
            }
            boolean zH4 = sVar2.h(listW0);
            if ((i17 & 458752) == 131072) {
                z19 = true;
            } else {
                z19 = false;
            }
            z20 = z19 | zH4;
            objQ = sVar2.Q();
            if (z20) {
                objQ = new dl.m(listW0, cVar);
                sVar2.o0(objQ);
            } else {
                objQ = new dl.m(listW0, cVar);
                sVar2.o0(objQ);
            }
            r rVarO4 = d0.n.o(rVarB4, z18, null, (fz.a) objQ, 14);
            u uVarA4 = j0.t.a(j0.i.f35307e, z1.c.P, sVar2, 54);
            iHashCode = Long.hashCode(sVar2.T);
            q1 q1VarL4 = sVar2.l();
            r rVarC4 = z1.a.c(sVar2, rVarO4);
            k.J.getClass();
            iVar = j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            t.J(j.f56917f, uVarA4, sVar2);
            t.J(j.f56916e, q1VarL4, sVar2);
            hVar = j.f56918g;
            if (sVar2.S) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            } else {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            }
            t.J(j.f56915d, rVarC4, sVar2);
            eVar = new j3.e();
            content = (String) listW0.get(0);
            eVar.d(content);
            kotlin.jvm.internal.m.f(content, "content");
            kotlin.jvm.internal.m.f(borderChar, "borderChar");
            if (q.K0(borderChar)) {
                if (z15) {
                    i18 = 0;
                    z21 = true;
                    while (true) {
                        iF0 = q.F0(content, borderChar, i18, true);
                        if (iF0 != -1) {
                            break;
                            break;
                        }
                        length = borderChar.length() + iF0;
                        length2 = content.length();
                        if (length > length2) {
                            length2 = length;
                        }
                        eVar.a(new p0(0L, 0L, n3.s.K, (n3.o) null, (p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (l) null, (v0) null, 65531), iF0, length2);
                        i18 = length2;
                    }
                } else {
                    iM0 = q.M0(2, content, borderChar);
                    if (iM0 != -1) {
                        eVar.a(new p0(0L, 0L, n3.s.K, (n3.o) null, (p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (l) null, (v0) null, 65531), iM0, borderChar.length() + iM0);
                    }
                    z21 = true;
                }
            } else {
                z21 = true;
            }
            j3.h hVarJ4 = eVar.j();
            d0Var = ua.f31167a;
            z22 = z21;
            ua.c(hVarJ4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, y0.a((y0) sVar2.j(d0Var), se.i.k(sVar2, R.color.primary_black), j3.A(18), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar2, 0, 0, 131070);
            sVar = sVar2;
            if (listW0.size() >= 2) {
                sVar.d0(-1668945862);
                j0.c.g(sVar, e2.g(o.f58481a, 2));
                ua.b((String) listW0.get(z22 ? 1 : 0), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(d0Var), se.i.k(sVar, R.color.second_black), j3.A(12), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar, 0, 0, 65534);
                sVar = sVar;
                z23 = false;
            } else {
                z23 = false;
                sVar.d0(-1690965410);
            }
            sVar.p(z23);
            sVar.p(z22);
            z16 = z17;
        } else {
            sVar = sVar2;
            sVar.W();
            z15 = z11;
            z16 = z13;
        }
        x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new in.g(this, str, borderChar, rVar, z15, z16, cVar, i11, i12);
        }
    }
}
