package gr;

import a0.f1;
import a0.l1;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import b0.b0;
import b0.h0;
import b0.i2;
import b0.j0;
import b0.u0;
import b7.e0;
import bt.w6;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingo.lingoskill.object.LanguageItem;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import dt.u2;
import fr.j3;
import fr.n2;
import g2.f0;
import h1.g7;
import h1.k7;
import h1.r4;
import h1.s1;
import h1.ua;
import h1.v1;
import hh.p0;
import j0.a2;
import j0.e2;
import j0.i1;
import j0.o2;
import j0.z1;
import j3.y0;
import j9.c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.z;
import l0.y;
import l1.a1;
import l1.b1;
import l1.b3;
import l1.c3;
import l1.d0;
import l1.h1;
import l1.k1;
import l1.q1;
import l1.x1;
import rt.m9;
import vf.eq.EHjhWcesDUIsIw;
import w2.a0;
import w2.q0;
import z2.g1;
import z2.q2;
import z2.u1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1.d f29723a = new t1.d(new dt.g(14), false, -2128369527);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t1.d f29724b = new t1.d(new dt.g(15), false, 642748430);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t1.d f29725c = new t1.d(new dt.g(16), false, -1312714651);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t1.d f29726d = new t1.d(new dt.f(20), false, 160599804);

    public static final void a(int i11, long j11, String text, l1.n nVar, z1.r rVar) {
        z1.r rVar2;
        kotlin.jvm.internal.m.f(text, "text");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1169077715);
        int i12 = i11 | (sVar.e(j11) ? 4 : 2) | (sVar.d(R.drawable.billing_welcome_checked) ? 32 : 16) | (sVar.f(text) ? 256 : 128) | 3072;
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            a2 a2VarA = z1.a(j0.i.g(12), z1.c.L, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.o oVar = z1.o.f58481a;
            z1.r rVarC = z1.a.c(sVar, oVar);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, a2VarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            d0.n.c(se.k.y(R.drawable.billing_welcome_checked, sVar, (i12 >> 3) & 14), null, e2.n(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 2, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 19), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 440, 120);
            ua.b(text, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(ua.f31167a), j11, j3.A(19), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, (i12 >> 6) & 14, 0, 65534);
            sVar = sVar;
            sVar.p(true);
            rVar2 = oVar;
        } else {
            sVar.W();
            rVar2 = rVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new i(j11, text, rVar2, i11, 0);
        }
    }

    public static final void b(String str, long j11, long j12, long j13, z1.r rVar, fz.a onClick, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(onClick, "onClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1449267692);
        int i12 = (sVar.f(str) ? 4 : 2) | i11 | (sVar.e(j11) ? 32 : 16) | (sVar.e(j12) ? 256 : 128) | (sVar.e(j13) ? 2048 : 1024);
        if ((i11 & 24576) == 0) {
            i12 |= sVar.f(rVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        int i13 = i12 | (sVar.h(onClick) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536);
        if (sVar.T(i13 & 1, (74899 & i13) != 74898)) {
            j0 j0VarP = b0.e.p(BuildConfig.VERSION_NAME, sVar, 0);
            i2 i2VarR = b0.e.r(1000, 0, b0.f3441d, 2);
            u0 u0Var = u0.Reverse;
            h0 h0VarG = b0.e.g(j0VarP, 1.0f, 1.1f, b0.e.o(i2VarR, u0Var, 4), BuildConfig.VERSION_NAME, sVar, 29112, 0);
            h0 h0VarG2 = b0.e.g(j0VarP, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, b0.e.o(b0.e.r(500, 0, b0.f3438a, 2), u0Var, 4), BuildConfig.VERSION_NAME, sVar, 29112, 0);
            List listL = ns.o.L(new g2.x(j12), new g2.x(j13));
            z1.r rVarE = e2.e(rVar, 1.0f);
            float fFloatValue = ((Number) h0VarG.f3553d.getValue()).floatValue();
            iu.k.e(onClick, d2.h.i(rVarE, fFloatValue, fFloatValue), false, j11, listL, t1.e.d(1042333687, new f(str, j11, h0VarG2, 0), sVar), sVar, ((i13 >> 15) & 14) | 196608 | ((i13 << 6) & 7168), 4);
            sVar = sVar;
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new h(str, j11, j12, j13, rVar, onClick, i11, 0);
        }
    }

    public static final void c(int i11, String title, String subTitle, long j11, long j12, long j13, l1.n nVar, int i12) {
        kotlin.jvm.internal.m.f(title, "title");
        kotlin.jvm.internal.m.f(subTitle, "subTitle");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1871454188);
        int i13 = i12 | (sVar.d(i11) ? 32 : 16) | (sVar.f(title) ? 256 : 128) | (sVar.f(subTitle) ? 2048 : 1024) | (sVar.e(j11) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE);
        if (sVar.T(i13 & 1, (i13 & 599187) != 599186)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarE = e2.e(oVar, 1.0f);
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.L, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarE);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, a2VarA, sVar);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar);
            sVar.d0(-23940652);
            d0.n.c(se.k.y(i11, sVar, (i13 >> 3) & 14), null, e2.n(oVar, 38), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 440, 120);
            sVar.p(false);
            z1.r rVarE2 = j0.c.E(oVar, 16, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarE2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, uVarA, sVar);
            l1.t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, sVar);
            d0 d0Var = ua.f31167a;
            ua.b(title, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(d0Var), j11, j12, n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, (i13 >> 6) & 14, 0, 65534);
            ua.b(subTitle, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 4, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(d0Var), j11, j13, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar, ((i13 >> 9) & 14) | 48, 0, 65532);
            sVar = sVar;
            sVar.p(true);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new ei.e(i11, title, subTitle, j11, j12, j13, i12);
        }
    }

    public static final void d(String str, long j11, l1.n nVar, int i11) {
        l1.s sVar;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-615706674);
        int i12 = i11 | (sVar2.f(str) ? 4 : 2) | (sVar2.e(j11) ? 32 : 16);
        if (sVar2.T(i12 & 1, (i12 & 19) != 18)) {
            float f5 = 22;
            sVar = sVar2;
            ua.b(str, j0.c.E(z1.o.f58481a, f5, 16, f5, CropImageView.DEFAULT_ASPECT_RATIO, 8), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(ua.f31167a), j11, j3.A(12), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar, i12 & 14, 0, 65532);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new d(i11, 0, j11, str);
        }
    }

    public static final void e(final long j11, final String str, final long j12, final long j13, final int i11, l1.n nVar, final int i12) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1784528380);
        int i13 = i12 | (sVar.f(str) ? 32 : 16) | (sVar.e(j12) ? 256 : 128) | (sVar.e(j13) ? 2048 : 1024) | (sVar.d(i11) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar.d(R.drawable.ic_billing_page_check_small) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536);
        if (sVar.T(i13 & 1, (i13 & 74899) != 74898)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarH = d0.n.h(e2.e(e2.g(oVar, 60), 1.0f), j11, f0.f28556b);
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarH);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, a2VarA, sVar);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar);
            y0 y0VarA = y0.a((y0) sVar.j(ua.f31167a), j13, j3.A(12), n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777208);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            ua.b(str, j0.c.E(new i1(1.0f, true), 26, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA, sVar, (i13 >> 3) & 14, 0, 65532);
            sVar = sVar;
            float f5 = 86;
            z1.r rVarS = e2.s(oVar, f5);
            z1.j jVar = z1.c.f58467e;
            q0 q0VarD = j0.o.d(jVar, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarS);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, q0VarD, sVar);
            l1.t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, sVar);
            float f11 = 21;
            int i14 = ((i13 << 3) & 7168) | 440;
            r4.b(se.k.y(i11, sVar, (i13 >> 12) & 14), null, e2.n(oVar, f11), j12, sVar, i14, 0);
            sVar.p(true);
            z1.r rVarS2 = e2.s(oVar, f5);
            q0 q0VarD2 = j0.o.d(jVar, false);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarS2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, q0VarD2, sVar);
            l1.t.J(hVar2, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
            }
            l1.t.J(hVar4, rVarC3, sVar);
            r4.b(se.k.y(R.drawable.ic_billing_page_check_small, sVar, (i13 >> 15) & 14), null, e2.n(oVar, f11), j12, sVar, i14, 0);
            sVar.p(true);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e(j11, str, j12, j13, i11, i12) { // from class: gr.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ long f29665a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f29666b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ long f29667c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ long f29668d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ int f29669e;

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(7);
                    n.e(this.f29665a, this.f29666b, this.f29667c, this.f29668d, this.f29669e, (l1.n) obj, iM);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void f(int i11, long j11, long j12, String str, l1.n nVar, z1.r rVar) {
        l1.s sVar;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1752340194);
        int i12 = i11 | (sVar2.f(str) ? 4 : 2) | (sVar2.e(j11) ? 32 : 16) | (sVar2.f(rVar) ? 256 : 128);
        if (sVar2.T(i12 & 1, (i12 & 1171) != 1170)) {
            sVar = sVar2;
            ua.b(str, rVar, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(ua.f31167a), j11, j12, n3.s.K, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar, (i12 & 14) | ((i12 >> 3) & 112), 0, 65532);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new e(str, j11, rVar, j12, i11, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0193  */
    /* JADX WARN: Code duplicated, block: B:103:0x019e  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:107:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:110:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:114:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:115:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:118:0x0214  */
    /* JADX WARN: Code duplicated, block: B:119:0x0216  */
    /* JADX WARN: Code duplicated, block: B:122:0x0225  */
    /* JADX WARN: Code duplicated, block: B:123:0x0227  */
    /* JADX WARN: Code duplicated, block: B:126:0x0245  */
    /* JADX WARN: Code duplicated, block: B:127:0x0247  */
    /* JADX WARN: Code duplicated, block: B:130:0x0251  */
    /* JADX WARN: Code duplicated, block: B:131:0x0253  */
    /* JADX WARN: Code duplicated, block: B:137:0x0274  */
    /* JADX WARN: Code duplicated, block: B:140:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:142:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:147:0x0308  */
    /* JADX WARN: Code duplicated, block: B:152:0x0327  */
    /* JADX WARN: Code duplicated, block: B:155:0x033d  */
    /* JADX WARN: Code duplicated, block: B:94:0x015e  */
    /* JADX WARN: Code duplicated, block: B:97:0x016a  */
    /* JADX WARN: Code duplicated, block: B:98:0x017a  */
    public static final void h(final List list, final List list2, final List list3, final List list4, final String str, final float f5, final Resources curLocalizedResource, final fz.a onBillingClick, final fz.a onTermsOfUseClick, final fz.a onPrivacyPolicyClick, l1.n nVar, final int i11) {
        int i12;
        float f11;
        l1.s sVar;
        fz.a aVar;
        y2.h hVar;
        Object objQ;
        l1.g gVar;
        final a1 a1Var;
        Object objQ2;
        long j11;
        final long j12;
        k1 k1Var;
        String string;
        final String string2;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        Object obj;
        String str2;
        l1.s sVar2;
        int iHashCode;
        Object objQ3;
        Object objQ4;
        kotlin.jvm.internal.m.f(curLocalizedResource, "curLocalizedResource");
        kotlin.jvm.internal.m.f(onBillingClick, "onBillingClick");
        kotlin.jvm.internal.m.f(onTermsOfUseClick, "onTermsOfUseClick");
        kotlin.jvm.internal.m.f(onPrivacyPolicyClick, "onPrivacyPolicyClick");
        l1.s sVar3 = (l1.s) nVar;
        sVar3.f0(1161230841);
        if ((i11 & 6) == 0) {
            i12 = (sVar3.h(list) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar3.h(list2) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar3.h(list3) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar3.h(list4) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar3.f(str) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            f11 = f5;
            i12 |= sVar3.c(f11) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        } else {
            f11 = f5;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar3.h(curLocalizedResource) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= sVar3.h(onBillingClick) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i12 |= sVar3.h(onTermsOfUseClick) ? 67108864 : 33554432;
        }
        if ((805306368 & i11) == 0) {
            i12 |= sVar3.h(onPrivacyPolicyClick) ? 536870912 : 268435456;
        }
        if (sVar3.T(i12 & 1, (306783379 & i12) != 306783378)) {
            z1.j jVar = z1.c.f58463a;
            q0 q0VarD = j0.o.d(jVar, false);
            int iHashCode2 = Long.hashCode(sVar3.T);
            q1 q1VarL = sVar3.l();
            int i13 = i12;
            z1.o oVar = z1.o.f58481a;
            z1.r rVarC = z1.a.c(sVar3, oVar);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar3.h0();
            if (sVar3.S) {
                sVar3.k(iVar);
            } else {
                sVar3.r0();
            }
            y2.h hVar2 = y2.j.f56917f;
            l1.t.J(hVar2, q0VarD, sVar3);
            y2.h hVar3 = y2.j.f56916e;
            l1.t.J(hVar3, q1VarL, sVar3);
            y2.h hVar4 = y2.j.f56918g;
            if (sVar3.S) {
                hVar = hVar2;
            } else {
                hVar = hVar2;
                if (!kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode2))) {
                }
                y2.h hVar5 = y2.j.f56915d;
                l1.t.J(hVar5, rVarC, sVar3);
                l0.w wVarA = y.a(0, sVar3, 3);
                objQ = sVar3.Q();
                gVar = l1.m.f39353a;
                if (objQ == gVar) {
                    objQ = defpackage.e.v(0, sVar3);
                }
                a1Var = (a1) objQ;
                objQ2 = sVar3.Q();
                if (objQ2 == gVar) {
                    objQ2 = l1.t.s(new j(a1Var, 0));
                    sVar3.o0(objQ2);
                }
                b3 b3Var = (b3) objQ2;
                kotlin.jvm.internal.m.f((s1) sVar3.j(v1.f31180a), "<this>");
                if (d0.n.t(sVar3)) {
                    j11 = ju.a.f37293a1;
                } else {
                    j11 = ju.a.X;
                }
                j12 = j11;
                long j13 = g2.x.f28621h;
                k1Var = xt.b.f56284f;
                if (((Boolean) k1Var.getValue()).booleanValue()) {
                    string = curLocalizedResource.getString(R.string.try_for_free);
                } else {
                    string = curLocalizedResource.getString(R.string.subscribe);
                }
                kotlin.jvm.internal.m.c(string);
                if (((Boolean) k1Var.getValue()).booleanValue()) {
                    string2 = curLocalizedResource.getString(R.string.cancel_anytime);
                } else {
                    string2 = curLocalizedResource.getString(R.string.cancel_anytime_or_manage_subscriptions_in_google_play);
                }
                kotlin.jvm.internal.m.c(string2);
                z1.r rVarD = e2.d(d0.n.h(oVar, j13, f0.f28556b), 1.0f);
                if ((i13 & 458752) == 131072) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean zH = z11 | sVar3.h(curLocalizedResource) | sVar3.h(list) | sVar3.e(j12);
                if ((i13 & 57344) == 16384) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean zF = z12 | zH | sVar3.f(string);
                if ((i13 & 29360128) == 8388608) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean zF2 = zF | z13 | sVar3.f(string2) | sVar3.h(list3) | sVar3.h(list2) | sVar3.h(list4);
                if ((i13 & 234881024) == 67108864) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z17 = zF2 | z14;
                if ((i13 & 1879048192) == 536870912) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z17 | z15;
                Object objQ5 = sVar3.Q();
                if (!z16 || objQ5 == gVar) {
                    final String str3 = string;
                    final float f12 = f11;
                    obj = new fz.c() { // from class: gr.k
                        @Override // fz.c
                        public final Object invoke(Object obj2) {
                            l0.h LazyColumn = (l0.h) obj2;
                            kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                            final float f13 = f12;
                            final Resources resources = curLocalizedResource;
                            final List list5 = list;
                            final long j14 = j12;
                            final String str4 = str;
                            final String str5 = str3;
                            final fz.a aVar2 = onBillingClick;
                            final String str6 = string2;
                            final a1 a1Var2 = a1Var;
                            l0.h.p(LazyColumn, null, new t1.d(new fz.f() { // from class: gr.m
                                @Override // fz.f
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    long j15;
                                    long j16;
                                    j0.d dVar;
                                    y2.h hVar6;
                                    y2.i iVar2;
                                    y2.h hVar7;
                                    z1.o oVar2;
                                    l1.s sVar4;
                                    int i14;
                                    m mVar;
                                    l0.c item = (l0.c) obj3;
                                    l1.n nVar2 = (l1.n) obj4;
                                    int iIntValue = ((Integer) obj5).intValue();
                                    z1.h hVar8 = z1.c.O;
                                    kotlin.jvm.internal.m.f(item, "$this$item");
                                    l1.s sVar5 = (l1.s) nVar2;
                                    if (sVar5.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        z1.o oVar3 = z1.o.f58481a;
                                        z1.r rVarG = e2.g(j0.c.F(oVar3), f13);
                                        j0.u uVarA = j0.t.a(j0.i.f35309g, hVar8, sVar5, 6);
                                        int iHashCode3 = Long.hashCode(sVar5.T);
                                        q1 q1VarL2 = sVar5.l();
                                        z1.r rVarC2 = z1.a.c(sVar5, rVarG);
                                        y2.k.J.getClass();
                                        y2.i iVar3 = y2.j.f56913b;
                                        sVar5.h0();
                                        if (sVar5.S) {
                                            sVar5.k(iVar3);
                                        } else {
                                            sVar5.r0();
                                        }
                                        y2.h hVar9 = y2.j.f56917f;
                                        l1.t.J(hVar9, uVarA, sVar5);
                                        y2.h hVar10 = y2.j.f56916e;
                                        l1.t.J(hVar10, q1VarL2, sVar5);
                                        y2.h hVar11 = y2.j.f56918g;
                                        if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode3))) {
                                            defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar11);
                                        }
                                        y2.h hVar12 = y2.j.f56915d;
                                        l1.t.J(hVar12, rVarC2, sVar5);
                                        Resources resources2 = resources;
                                        String string3 = resources2.getString(R.string.welcome_billing_premium);
                                        kotlin.jvm.internal.m.e(string3, "getString(...)");
                                        ua.b(string3, j0.c.E(e2.e(oVar3, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 60, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar5.j(ua.f31167a), ((s1) sVar5.j(v1.f31180a)).f31024f, j3.A(58), n3.s.N, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar5, 48, 0, 65532);
                                        float f14 = 26;
                                        z1.r rVarB = j0.c.B(j0.c.E(oVar3, f14, CropImageView.DEFAULT_ASPECT_RATIO, f14, CropImageView.DEFAULT_ASPECT_RATIO, 10), 16, 30);
                                        j0.u uVarA2 = j0.t.a(j0.i.g(24), hVar8, sVar5, 6);
                                        int iHashCode4 = Long.hashCode(sVar5.T);
                                        q1 q1VarL3 = sVar5.l();
                                        z1.r rVarC3 = z1.a.c(sVar5, rVarB);
                                        sVar5.h0();
                                        if (sVar5.S) {
                                            sVar5.k(iVar3);
                                        } else {
                                            sVar5.r0();
                                        }
                                        l1.t.J(hVar9, uVarA2, sVar5);
                                        l1.t.J(hVar10, q1VarL3, sVar5);
                                        if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode4))) {
                                            defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar11);
                                        }
                                        l1.t.J(hVar12, rVarC3, sVar5);
                                        sVar5.d0(795642753);
                                        Iterator it = list5.iterator();
                                        while (true) {
                                            boolean zHasNext = it.hasNext();
                                            j15 = j14;
                                            if (!zHasNext) {
                                                break;
                                            }
                                            n.a(0, j15, (String) it.next(), sVar5, null);
                                        }
                                        sVar5.p(false);
                                        sVar5.p(true);
                                        k7.g(j0.c.C(oVar3, 90, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1, f0.c(1084400290), sVar5, 438, 0);
                                        z1.h hVar13 = z1.c.P;
                                        z1.r rVarC4 = j0.c.C(e2.e(oVar3, 1.0f), 32, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                        j0.d dVar2 = j0.i.f35305c;
                                        j0.u uVarA3 = j0.t.a(dVar2, hVar13, sVar5, 48);
                                        int iHashCode5 = Long.hashCode(sVar5.T);
                                        q1 q1VarL4 = sVar5.l();
                                        z1.r rVarC5 = z1.a.c(sVar5, rVarC4);
                                        y2.k.J.getClass();
                                        y2.i iVar4 = y2.j.f56913b;
                                        sVar5.h0();
                                        if (sVar5.S) {
                                            sVar5.k(iVar4);
                                        } else {
                                            sVar5.r0();
                                        }
                                        y2.h hVar14 = y2.j.f56917f;
                                        l1.t.J(hVar14, uVarA3, sVar5);
                                        y2.h hVar15 = y2.j.f56916e;
                                        l1.t.J(hVar15, q1VarL4, sVar5);
                                        y2.h hVar16 = y2.j.f56918g;
                                        if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode5))) {
                                            defpackage.e.A(iHashCode5, sVar5, iHashCode5, hVar16);
                                        }
                                        y2.h hVar17 = y2.j.f56915d;
                                        l1.t.J(hVar17, rVarC5, sVar5);
                                        boolean zBooleanValue = ((Boolean) xt.b.f56284f.getValue()).booleanValue();
                                        String str7 = str4;
                                        if (zBooleanValue) {
                                            sVar5.d0(-538037093);
                                            String string4 = resources2.getString(R.string.seven_days_free);
                                            kotlin.jvm.internal.m.e(string4, "getString(...)");
                                            d0 d0Var = ua.f31167a;
                                            j16 = j15;
                                            hVar6 = hVar16;
                                            hVar7 = hVar14;
                                            dVar = dVar2;
                                            iVar2 = iVar4;
                                            iu.k.h(string4, null, 0L, null, null, 0L, j3.A(12), j3.A(38), null, 0L, null, 0, false, 1, 0, null, y0.a((y0) sVar5.j(d0Var), ((s1) sVar5.j(v1.f31180a)).f31024f, j3.A(38), n3.s.K, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), CropImageView.DEFAULT_ASPECT_RATIO, sVar5, 14155776, 1572864, 1507134);
                                            String string5 = resources2.getString(R.string.then_s_annually);
                                            kotlin.jvm.internal.m.e(string5, "getString(...)");
                                            ua.b(oz.x.q0(string5, "%s", str7), j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, 6, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar5.j(d0Var), j16, j3.A(18), n3.s.f43178t, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar5, 48, 0, 65532);
                                            sVar4 = sVar5;
                                            i14 = 0;
                                            sVar4.p(false);
                                            oVar2 = oVar3;
                                        } else {
                                            j16 = j15;
                                            dVar = dVar2;
                                            hVar6 = hVar16;
                                            iVar2 = iVar4;
                                            hVar7 = hVar14;
                                            sVar5.d0(-536737883);
                                            oVar2 = oVar3;
                                            ua.b(ep.a.D(resources2.getString(R.string.annual), ": ", str7), j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, 6, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar5.j(ua.f31167a), j16, j3.A(18), n3.s.K, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar5, 48, 0, 65532);
                                            sVar4 = sVar5;
                                            i14 = 0;
                                            sVar4.p(false);
                                        }
                                        sVar4.p(true);
                                        j0.u uVarA4 = j0.t.a(dVar, hVar8, sVar4, i14);
                                        int iHashCode6 = Long.hashCode(sVar4.T);
                                        q1 q1VarL5 = sVar4.l();
                                        z1.r rVarC6 = z1.a.c(sVar4, oVar2);
                                        sVar4.h0();
                                        if (sVar4.S) {
                                            sVar4.k(iVar2);
                                        } else {
                                            sVar4.r0();
                                        }
                                        l1.t.J(hVar7, uVarA4, sVar4);
                                        l1.t.J(hVar15, q1VarL5, sVar4);
                                        if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode6))) {
                                            defpackage.e.A(iHashCode6, sVar4, iHashCode6, hVar6);
                                        }
                                        l1.t.J(hVar17, rVarC6, sVar4);
                                        c3 c3Var = v1.f31180a;
                                        long j17 = ((s1) sVar4.j(c3Var)).f31025g;
                                        long j18 = ((s1) sVar4.j(c3Var)).f31024f;
                                        long j19 = ((s1) sVar4.j(c3Var)).f31024f;
                                        float f15 = 36;
                                        z1.o oVar4 = oVar2;
                                        z1.r rVarE = j0.c.E(oVar4, f15, CropImageView.DEFAULT_ASPECT_RATIO, f15, CropImageView.DEFAULT_ASPECT_RATIO, 10);
                                        Object objQ6 = sVar4.Q();
                                        l1.g gVar2 = l1.m.f39353a;
                                        if (objQ6 == gVar2) {
                                            mVar = this;
                                            objQ6 = new bt.a2(a1Var2, 8);
                                            sVar4.o0(objQ6);
                                        } else {
                                            mVar = this;
                                        }
                                        z1.r rVarN = a0.n(rVarE, (fz.c) objQ6);
                                        fz.a aVar3 = aVar2;
                                        boolean zF3 = sVar4.f(aVar3);
                                        Object objQ7 = sVar4.Q();
                                        if (zF3 || objQ7 == gVar2) {
                                            objQ7 = new et.p(10, aVar3);
                                            sVar4.o0(objQ7);
                                        }
                                        l1.s sVar6 = sVar4;
                                        m mVar2 = mVar;
                                        n.b(str5, j17, j18, j19, rVarN, (fz.a) objQ7, sVar6, 24576);
                                        y0 y0VarA = y0.a((y0) sVar6.j(ua.f31167a), j16, j3.A(11), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444);
                                        z1.r rVarE2 = e2.e(j0.c.E(j0.c.C(oVar4, f15, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 6, CropImageView.DEFAULT_ASPECT_RATIO, 42, 5), 1.0f);
                                        Object objQ8 = sVar6.Q();
                                        if (objQ8 == gVar2) {
                                            objQ8 = new n2(19);
                                            sVar6.o0(objQ8);
                                        }
                                        ua.b(str6, f0.q(rVarE2, (fz.c) objQ8), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA, sVar6, 48, 0, 65532);
                                        sVar6.p(true);
                                        sVar6.p(true);
                                    } else {
                                        sVar5.W();
                                    }
                                    return qy.b0.f48488a;
                                }
                            }, true, 1678640916), 3);
                            l0.h.p(LazyColumn, null, new t1.d(new a(list3, list2, list4, j14), true, -1246944245), 3);
                            final int i14 = 0;
                            l0.h.p(LazyColumn, null, new t1.d(new fz.f() { // from class: gr.b
                                @Override // fz.f
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    switch (i14) {
                                        case 0:
                                            l0.c item = (l0.c) obj3;
                                            l1.n nVar2 = (l1.n) obj4;
                                            int iIntValue = ((Integer) obj5).intValue();
                                            kotlin.jvm.internal.m.f(item, "$this$item");
                                            l1.s sVar4 = (l1.s) nVar2;
                                            if (sVar4.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                Resources resources2 = resources;
                                                String string3 = resources2.getString(R.string.premium_efficiency);
                                                kotlin.jvm.internal.m.e(string3, "getString(...)");
                                                float f14 = 44;
                                                z1.o oVar2 = z1.o.f58481a;
                                                z1.r rVarE = e2.e(j0.c.E(oVar2, f14, 40, f14, CropImageView.DEFAULT_ASPECT_RATIO, 8), 1.0f);
                                                long jA = j3.A(22);
                                                long j15 = j14;
                                                n.f(3072, j15, jA, string3, sVar4, rVarE);
                                                float f15 = 18;
                                                z1.r rVarB = d2.h.b(d0.n.h(e2.e(j0.c.C(j0.c.E(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, 24, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 20, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), g2.x.c(f0.e(4294950912L), 0.12f), r0.f.d(f15)), r0.f.d(f15));
                                                j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar4, 0);
                                                int iHashCode3 = Long.hashCode(sVar4.T);
                                                q1 q1VarL2 = sVar4.l();
                                                z1.r rVarC2 = z1.a.c(sVar4, rVarB);
                                                y2.k.J.getClass();
                                                y2.i iVar2 = y2.j.f56913b;
                                                sVar4.h0();
                                                if (sVar4.S) {
                                                    sVar4.k(iVar2);
                                                } else {
                                                    sVar4.r0();
                                                }
                                                y2.h hVar6 = y2.j.f56917f;
                                                l1.t.J(hVar6, uVarA, sVar4);
                                                y2.h hVar7 = y2.j.f56916e;
                                                l1.t.J(hVar7, q1VarL2, sVar4);
                                                y2.h hVar8 = y2.j.f56918g;
                                                if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode3))) {
                                                    defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar8);
                                                }
                                                y2.h hVar9 = y2.j.f56915d;
                                                l1.t.J(hVar9, rVarC2, sVar4);
                                                z1.r rVarE2 = e2.e(oVar2, 1.0f);
                                                long j16 = g2.x.f28621h;
                                                z1.r rVarG = e2.g(d0.n.h(rVarE2, j16, f0.f28556b), 42);
                                                a2 a2VarA = z1.a(j0.i.f35303a, z1.c.M, sVar4, 48);
                                                int iHashCode4 = Long.hashCode(sVar4.T);
                                                q1 q1VarL3 = sVar4.l();
                                                z1.r rVarC3 = z1.a.c(sVar4, rVarG);
                                                sVar4.h0();
                                                if (sVar4.S) {
                                                    sVar4.k(iVar2);
                                                } else {
                                                    sVar4.r0();
                                                }
                                                l1.t.J(hVar6, a2VarA, sVar4);
                                                l1.t.J(hVar7, q1VarL3, sVar4);
                                                if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode4))) {
                                                    defpackage.e.A(iHashCode4, sVar4, iHashCode4, hVar8);
                                                }
                                                l1.t.J(hVar9, rVarC3, sVar4);
                                                if (1.0f <= 0.0d) {
                                                    k0.a.a("invalid weight; must be greater than zero");
                                                }
                                                j0.c.g(sVar4, new i1(1.0f, true));
                                                String string4 = resources2.getString(R.string.free);
                                                kotlin.jvm.internal.m.e(string4, "getString(...)");
                                                d0 d0Var = ua.f31167a;
                                                y0 y0Var = (y0) sVar4.j(d0Var);
                                                long jA2 = j3.A(16);
                                                n3.s sVar5 = n3.s.L;
                                                float f16 = 86;
                                                ua.b(string4, e2.s(oVar2, f16), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a(y0Var, j15, jA2, sVar5, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar4, 48, 0, 65532);
                                                String string5 = resources2.getString(R.string.premium);
                                                kotlin.jvm.internal.m.e(string5, "getString(...)");
                                                ua.b(string5, e2.s(oVar2, f16), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar4.j(d0Var), j15, j3.A(16), sVar5, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar4, 48, 0, 65532);
                                                sVar4.p(true);
                                                long jC = g2.x.c(f0.e(4294950912L), 0.13f);
                                                String string6 = resources2.getString(R.string.free_vs_premium_1);
                                                kotlin.jvm.internal.m.e(string6, "getString(...)");
                                                c3 c3Var = v1.f31180a;
                                                n.e(jC, string6, ((s1) sVar4.j(c3Var)).f31017a, j15, R.drawable.ic_billing_page_check_small, sVar4, 6);
                                                String string7 = resources2.getString(R.string.free_vs_premium_2);
                                                kotlin.jvm.internal.m.e(string7, "getString(...)");
                                                n.e(j16, string7, ((s1) sVar4.j(c3Var)).f31017a, j15, R.drawable.ic_billing_page_check_small, sVar4, 6);
                                                long jC2 = g2.x.c(f0.e(4294950912L), 0.13f);
                                                String string8 = resources2.getString(R.string.free_vs_premium_3);
                                                kotlin.jvm.internal.m.e(string8, "getString(...)");
                                                n.e(jC2, string8, ((s1) sVar4.j(c3Var)).f31017a, j15, R.drawable.ic_sub_intro_lock, sVar4, 6);
                                                String string9 = resources2.getString(R.string.free_vs_premium_4);
                                                kotlin.jvm.internal.m.e(string9, "getString(...)");
                                                n.e(j16, string9, ((s1) sVar4.j(c3Var)).f31017a, j15, R.drawable.ic_sub_intro_lock, sVar4, 6);
                                                long jC3 = g2.x.c(f0.e(4294950912L), 0.13f);
                                                String string10 = resources2.getString(R.string.free_vs_premium_5);
                                                kotlin.jvm.internal.m.e(string10, "getString(...)");
                                                n.e(jC3, string10, ((s1) sVar4.j(c3Var)).f31017a, j15, R.drawable.ic_sub_intro_lock, sVar4, 6);
                                                String string11 = resources2.getString(R.string.free_vs_premium_6);
                                                kotlin.jvm.internal.m.e(string11, "getString(...)");
                                                n.e(j16, string11, ((s1) sVar4.j(c3Var)).f31017a, j15, R.drawable.ic_sub_intro_lock, sVar4, 6);
                                                sVar4.p(true);
                                            } else {
                                                sVar4.W();
                                            }
                                            break;
                                        default:
                                            l0.c item2 = (l0.c) obj3;
                                            l1.n nVar3 = (l1.n) obj4;
                                            int iIntValue2 = ((Integer) obj5).intValue();
                                            kotlin.jvm.internal.m.f(item2, "$this$item");
                                            l1.s sVar6 = (l1.s) nVar3;
                                            if (sVar6.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                j0.c.g(sVar6, e2.g(z1.o.f58481a, 32));
                                                Resources resources3 = resources;
                                                String string12 = resources3.getString(R.string.subs_can_be_cancel_anytime_for_any_reason);
                                                kotlin.jvm.internal.m.e(string12, "getString(...)");
                                                long j17 = j14;
                                                n.d(string12, j17, sVar6, 0);
                                                String string13 = resources3.getString(R.string.tv_subscription_rule);
                                                kotlin.jvm.internal.m.e(string13, "getString(...)");
                                                n.d(string13, j17, sVar6, 0);
                                                String string14 = resources3.getString(R.string.ld_plus_billing_alert);
                                                kotlin.jvm.internal.m.e(string14, "getString(...)");
                                                n.d(string14, j17, sVar6, 0);
                                                String string15 = resources3.getString(R.string.xiaomi_billing_alert);
                                                kotlin.jvm.internal.m.e(string15, "getString(...)");
                                                n.d(string15, j17, sVar6, 0);
                                            } else {
                                                sVar6.W();
                                            }
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            }, true, 812978252), 3);
                            final int i15 = 1;
                            l0.h.p(LazyColumn, null, new t1.d(new fz.f() { // from class: gr.b
                                @Override // fz.f
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    switch (i15) {
                                        case 0:
                                            l0.c item = (l0.c) obj3;
                                            l1.n nVar2 = (l1.n) obj4;
                                            int iIntValue = ((Integer) obj5).intValue();
                                            kotlin.jvm.internal.m.f(item, "$this$item");
                                            l1.s sVar4 = (l1.s) nVar2;
                                            if (sVar4.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                Resources resources2 = resources;
                                                String string3 = resources2.getString(R.string.premium_efficiency);
                                                kotlin.jvm.internal.m.e(string3, "getString(...)");
                                                float f14 = 44;
                                                z1.o oVar2 = z1.o.f58481a;
                                                z1.r rVarE = e2.e(j0.c.E(oVar2, f14, 40, f14, CropImageView.DEFAULT_ASPECT_RATIO, 8), 1.0f);
                                                long jA = j3.A(22);
                                                long j15 = j14;
                                                n.f(3072, j15, jA, string3, sVar4, rVarE);
                                                float f15 = 18;
                                                z1.r rVarB = d2.h.b(d0.n.h(e2.e(j0.c.C(j0.c.E(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, 24, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 20, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), g2.x.c(f0.e(4294950912L), 0.12f), r0.f.d(f15)), r0.f.d(f15));
                                                j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar4, 0);
                                                int iHashCode3 = Long.hashCode(sVar4.T);
                                                q1 q1VarL2 = sVar4.l();
                                                z1.r rVarC2 = z1.a.c(sVar4, rVarB);
                                                y2.k.J.getClass();
                                                y2.i iVar2 = y2.j.f56913b;
                                                sVar4.h0();
                                                if (sVar4.S) {
                                                    sVar4.k(iVar2);
                                                } else {
                                                    sVar4.r0();
                                                }
                                                y2.h hVar6 = y2.j.f56917f;
                                                l1.t.J(hVar6, uVarA, sVar4);
                                                y2.h hVar7 = y2.j.f56916e;
                                                l1.t.J(hVar7, q1VarL2, sVar4);
                                                y2.h hVar8 = y2.j.f56918g;
                                                if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode3))) {
                                                    defpackage.e.A(iHashCode3, sVar4, iHashCode3, hVar8);
                                                }
                                                y2.h hVar9 = y2.j.f56915d;
                                                l1.t.J(hVar9, rVarC2, sVar4);
                                                z1.r rVarE2 = e2.e(oVar2, 1.0f);
                                                long j16 = g2.x.f28621h;
                                                z1.r rVarG = e2.g(d0.n.h(rVarE2, j16, f0.f28556b), 42);
                                                a2 a2VarA = z1.a(j0.i.f35303a, z1.c.M, sVar4, 48);
                                                int iHashCode4 = Long.hashCode(sVar4.T);
                                                q1 q1VarL3 = sVar4.l();
                                                z1.r rVarC3 = z1.a.c(sVar4, rVarG);
                                                sVar4.h0();
                                                if (sVar4.S) {
                                                    sVar4.k(iVar2);
                                                } else {
                                                    sVar4.r0();
                                                }
                                                l1.t.J(hVar6, a2VarA, sVar4);
                                                l1.t.J(hVar7, q1VarL3, sVar4);
                                                if (sVar4.S || !kotlin.jvm.internal.m.a(sVar4.Q(), Integer.valueOf(iHashCode4))) {
                                                    defpackage.e.A(iHashCode4, sVar4, iHashCode4, hVar8);
                                                }
                                                l1.t.J(hVar9, rVarC3, sVar4);
                                                if (1.0f <= 0.0d) {
                                                    k0.a.a("invalid weight; must be greater than zero");
                                                }
                                                j0.c.g(sVar4, new i1(1.0f, true));
                                                String string4 = resources2.getString(R.string.free);
                                                kotlin.jvm.internal.m.e(string4, "getString(...)");
                                                d0 d0Var = ua.f31167a;
                                                y0 y0Var = (y0) sVar4.j(d0Var);
                                                long jA2 = j3.A(16);
                                                n3.s sVar5 = n3.s.L;
                                                float f16 = 86;
                                                ua.b(string4, e2.s(oVar2, f16), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a(y0Var, j15, jA2, sVar5, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar4, 48, 0, 65532);
                                                String string5 = resources2.getString(R.string.premium);
                                                kotlin.jvm.internal.m.e(string5, "getString(...)");
                                                ua.b(string5, e2.s(oVar2, f16), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar4.j(d0Var), j15, j3.A(16), sVar5, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar4, 48, 0, 65532);
                                                sVar4.p(true);
                                                long jC = g2.x.c(f0.e(4294950912L), 0.13f);
                                                String string6 = resources2.getString(R.string.free_vs_premium_1);
                                                kotlin.jvm.internal.m.e(string6, "getString(...)");
                                                c3 c3Var = v1.f31180a;
                                                n.e(jC, string6, ((s1) sVar4.j(c3Var)).f31017a, j15, R.drawable.ic_billing_page_check_small, sVar4, 6);
                                                String string7 = resources2.getString(R.string.free_vs_premium_2);
                                                kotlin.jvm.internal.m.e(string7, "getString(...)");
                                                n.e(j16, string7, ((s1) sVar4.j(c3Var)).f31017a, j15, R.drawable.ic_billing_page_check_small, sVar4, 6);
                                                long jC2 = g2.x.c(f0.e(4294950912L), 0.13f);
                                                String string8 = resources2.getString(R.string.free_vs_premium_3);
                                                kotlin.jvm.internal.m.e(string8, "getString(...)");
                                                n.e(jC2, string8, ((s1) sVar4.j(c3Var)).f31017a, j15, R.drawable.ic_sub_intro_lock, sVar4, 6);
                                                String string9 = resources2.getString(R.string.free_vs_premium_4);
                                                kotlin.jvm.internal.m.e(string9, "getString(...)");
                                                n.e(j16, string9, ((s1) sVar4.j(c3Var)).f31017a, j15, R.drawable.ic_sub_intro_lock, sVar4, 6);
                                                long jC3 = g2.x.c(f0.e(4294950912L), 0.13f);
                                                String string10 = resources2.getString(R.string.free_vs_premium_5);
                                                kotlin.jvm.internal.m.e(string10, "getString(...)");
                                                n.e(jC3, string10, ((s1) sVar4.j(c3Var)).f31017a, j15, R.drawable.ic_sub_intro_lock, sVar4, 6);
                                                String string11 = resources2.getString(R.string.free_vs_premium_6);
                                                kotlin.jvm.internal.m.e(string11, "getString(...)");
                                                n.e(j16, string11, ((s1) sVar4.j(c3Var)).f31017a, j15, R.drawable.ic_sub_intro_lock, sVar4, 6);
                                                sVar4.p(true);
                                            } else {
                                                sVar4.W();
                                            }
                                            break;
                                        default:
                                            l0.c item2 = (l0.c) obj3;
                                            l1.n nVar3 = (l1.n) obj4;
                                            int iIntValue2 = ((Integer) obj5).intValue();
                                            kotlin.jvm.internal.m.f(item2, "$this$item");
                                            l1.s sVar6 = (l1.s) nVar3;
                                            if (sVar6.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                j0.c.g(sVar6, e2.g(z1.o.f58481a, 32));
                                                Resources resources3 = resources;
                                                String string12 = resources3.getString(R.string.subs_can_be_cancel_anytime_for_any_reason);
                                                kotlin.jvm.internal.m.e(string12, "getString(...)");
                                                long j17 = j14;
                                                n.d(string12, j17, sVar6, 0);
                                                String string13 = resources3.getString(R.string.tv_subscription_rule);
                                                kotlin.jvm.internal.m.e(string13, "getString(...)");
                                                n.d(string13, j17, sVar6, 0);
                                                String string14 = resources3.getString(R.string.ld_plus_billing_alert);
                                                kotlin.jvm.internal.m.e(string14, "getString(...)");
                                                n.d(string14, j17, sVar6, 0);
                                                String string15 = resources3.getString(R.string.xiaomi_billing_alert);
                                                kotlin.jvm.internal.m.e(string15, "getString(...)");
                                                n.d(string15, j17, sVar6, 0);
                                            } else {
                                                sVar6.W();
                                            }
                                            break;
                                    }
                                    return qy.b0.f48488a;
                                }
                            }, true, -1422066547), 3);
                            l0.h.p(LazyColumn, null, new t1.d(new a(resources, j14, onTermsOfUseClick, onPrivacyPolicyClick), true, 637855950), 3);
                            return qy.b0.f48488a;
                        }
                    };
                    str2 = str3;
                    aVar = onBillingClick;
                    sVar2 = sVar3;
                    sVar2.o0(obj);
                } else {
                    obj = objQ5;
                    sVar2 = sVar3;
                    str2 = string;
                    aVar = onBillingClick;
                }
                l1.s sVar4 = sVar2;
                ue.f.a(rVarD, wVarA, null, null, null, null, false, null, (fz.c) obj, sVar4, 6, 508);
                sVar = sVar4;
                z1.r rVarV = j0.c.v(j0.r.f35391a.a(oVar, z1.c.H));
                q0 q0VarD2 = j0.o.d(jVar, false);
                iHashCode = Long.hashCode(sVar.T);
                q1 q1VarL2 = sVar.l();
                z1.r rVarC2 = z1.a.c(sVar, rVarV);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar, q0VarD2, sVar);
                l1.t.J(hVar3, q1VarL2, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
                }
                l1.t.J(hVar5, rVarC2, sVar);
                boolean zBooleanValue = ((Boolean) b3Var.getValue()).booleanValue();
                objQ3 = sVar.Q();
                if (objQ3 == gVar) {
                    objQ3 = new n2(20);
                    sVar.o0(objQ3);
                }
                l1 l1VarN = f1.n((fz.c) objQ3);
                objQ4 = sVar.Q();
                if (objQ4 == gVar) {
                    objQ4 = new n2(21);
                    sVar.o0(objQ4);
                }
                a0.j0.d(zBooleanValue, null, l1VarN, f1.t((fz.c) objQ4), null, t1.e.d(1617802333, new dl.h(str2, aVar), sVar), sVar, 200064, 18);
                sVar.p(true);
                sVar.p(true);
            }
            defpackage.e.A(iHashCode2, sVar3, iHashCode2, hVar4);
            y2.h hVar6 = y2.j.f56915d;
            l1.t.J(hVar6, rVarC, sVar3);
            l0.w wVarA2 = y.a(0, sVar3, 3);
            objQ = sVar3.Q();
            gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = defpackage.e.v(0, sVar3);
            }
            a1Var = (a1) objQ;
            objQ2 = sVar3.Q();
            if (objQ2 == gVar) {
                objQ2 = l1.t.s(new j(a1Var, 0));
                sVar3.o0(objQ2);
            }
            b3 b3Var2 = (b3) objQ2;
            kotlin.jvm.internal.m.f((s1) sVar3.j(v1.f31180a), "<this>");
            if (d0.n.t(sVar3)) {
                j11 = ju.a.f37293a1;
            } else {
                j11 = ju.a.X;
            }
            j12 = j11;
            long j14 = g2.x.f28621h;
            k1Var = xt.b.f56284f;
            if (((Boolean) k1Var.getValue()).booleanValue()) {
                string = curLocalizedResource.getString(R.string.try_for_free);
            } else {
                string = curLocalizedResource.getString(R.string.subscribe);
            }
            kotlin.jvm.internal.m.c(string);
            if (((Boolean) k1Var.getValue()).booleanValue()) {
                string2 = curLocalizedResource.getString(R.string.cancel_anytime);
            } else {
                string2 = curLocalizedResource.getString(R.string.cancel_anytime_or_manage_subscriptions_in_google_play);
            }
            kotlin.jvm.internal.m.c(string2);
            z1.r rVarD2 = e2.d(d0.n.h(oVar, j14, f0.f28556b), 1.0f);
            if ((i13 & 458752) == 131072) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean zH2 = z11 | sVar3.h(curLocalizedResource) | sVar3.h(list) | sVar3.e(j12);
            if ((i13 & 57344) == 16384) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean zF3 = z12 | zH2 | sVar3.f(string);
            if ((i13 & 29360128) == 8388608) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean zF4 = zF3 | z13 | sVar3.f(string2) | sVar3.h(list3) | sVar3.h(list2) | sVar3.h(list4);
            if ((i13 & 234881024) == 67108864) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z18 = zF4 | z14;
            if ((i13 & 1879048192) == 536870912) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = z18 | z15;
            Object objQ6 = sVar3.Q();
            if (z16) {
                final String str4 = string;
                final float f13 = f11;
                obj = new fz.c() { // from class: gr.k
                    @Override // fz.c
                    public final Object invoke(Object obj2) {
                        l0.h LazyColumn = (l0.h) obj2;
                        kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                        final float f14 = f13;
                        final Resources resources = curLocalizedResource;
                        final List list5 = list;
                        final long j15 = j12;
                        final String str5 = str;
                        final String str6 = str4;
                        final fz.a aVar2 = onBillingClick;
                        final String str7 = string2;
                        final a1 a1Var2 = a1Var;
                        l0.h.p(LazyColumn, null, new t1.d(new fz.f() { // from class: gr.m
                            @Override // fz.f
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                long j16;
                                long j17;
                                j0.d dVar;
                                y2.h hVar7;
                                y2.i iVar2;
                                y2.h hVar8;
                                z1.o oVar2;
                                l1.s sVar5;
                                int i14;
                                m mVar;
                                l0.c item = (l0.c) obj3;
                                l1.n nVar2 = (l1.n) obj4;
                                int iIntValue = ((Integer) obj5).intValue();
                                z1.h hVar9 = z1.c.O;
                                kotlin.jvm.internal.m.f(item, "$this$item");
                                l1.s sVar6 = (l1.s) nVar2;
                                if (sVar6.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    z1.o oVar3 = z1.o.f58481a;
                                    z1.r rVarG = e2.g(j0.c.F(oVar3), f14);
                                    j0.u uVarA = j0.t.a(j0.i.f35309g, hVar9, sVar6, 6);
                                    int iHashCode3 = Long.hashCode(sVar6.T);
                                    q1 q1VarL3 = sVar6.l();
                                    z1.r rVarC3 = z1.a.c(sVar6, rVarG);
                                    y2.k.J.getClass();
                                    y2.i iVar3 = y2.j.f56913b;
                                    sVar6.h0();
                                    if (sVar6.S) {
                                        sVar6.k(iVar3);
                                    } else {
                                        sVar6.r0();
                                    }
                                    y2.h hVar10 = y2.j.f56917f;
                                    l1.t.J(hVar10, uVarA, sVar6);
                                    y2.h hVar11 = y2.j.f56916e;
                                    l1.t.J(hVar11, q1VarL3, sVar6);
                                    y2.h hVar12 = y2.j.f56918g;
                                    if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode3))) {
                                        defpackage.e.A(iHashCode3, sVar6, iHashCode3, hVar12);
                                    }
                                    y2.h hVar13 = y2.j.f56915d;
                                    l1.t.J(hVar13, rVarC3, sVar6);
                                    Resources resources2 = resources;
                                    String string3 = resources2.getString(R.string.welcome_billing_premium);
                                    kotlin.jvm.internal.m.e(string3, "getString(...)");
                                    ua.b(string3, j0.c.E(e2.e(oVar3, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 60, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar6.j(ua.f31167a), ((s1) sVar6.j(v1.f31180a)).f31024f, j3.A(58), n3.s.N, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar6, 48, 0, 65532);
                                    float f15 = 26;
                                    z1.r rVarB = j0.c.B(j0.c.E(oVar3, f15, CropImageView.DEFAULT_ASPECT_RATIO, f15, CropImageView.DEFAULT_ASPECT_RATIO, 10), 16, 30);
                                    j0.u uVarA2 = j0.t.a(j0.i.g(24), hVar9, sVar6, 6);
                                    int iHashCode4 = Long.hashCode(sVar6.T);
                                    q1 q1VarL4 = sVar6.l();
                                    z1.r rVarC4 = z1.a.c(sVar6, rVarB);
                                    sVar6.h0();
                                    if (sVar6.S) {
                                        sVar6.k(iVar3);
                                    } else {
                                        sVar6.r0();
                                    }
                                    l1.t.J(hVar10, uVarA2, sVar6);
                                    l1.t.J(hVar11, q1VarL4, sVar6);
                                    if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode4))) {
                                        defpackage.e.A(iHashCode4, sVar6, iHashCode4, hVar12);
                                    }
                                    l1.t.J(hVar13, rVarC4, sVar6);
                                    sVar6.d0(795642753);
                                    Iterator it = list5.iterator();
                                    while (true) {
                                        boolean zHasNext = it.hasNext();
                                        j16 = j15;
                                        if (!zHasNext) {
                                            break;
                                        }
                                        n.a(0, j16, (String) it.next(), sVar6, null);
                                    }
                                    sVar6.p(false);
                                    sVar6.p(true);
                                    k7.g(j0.c.C(oVar3, 90, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1, f0.c(1084400290), sVar6, 438, 0);
                                    z1.h hVar14 = z1.c.P;
                                    z1.r rVarC5 = j0.c.C(e2.e(oVar3, 1.0f), 32, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                    j0.d dVar2 = j0.i.f35305c;
                                    j0.u uVarA3 = j0.t.a(dVar2, hVar14, sVar6, 48);
                                    int iHashCode5 = Long.hashCode(sVar6.T);
                                    q1 q1VarL5 = sVar6.l();
                                    z1.r rVarC6 = z1.a.c(sVar6, rVarC5);
                                    y2.k.J.getClass();
                                    y2.i iVar4 = y2.j.f56913b;
                                    sVar6.h0();
                                    if (sVar6.S) {
                                        sVar6.k(iVar4);
                                    } else {
                                        sVar6.r0();
                                    }
                                    y2.h hVar15 = y2.j.f56917f;
                                    l1.t.J(hVar15, uVarA3, sVar6);
                                    y2.h hVar16 = y2.j.f56916e;
                                    l1.t.J(hVar16, q1VarL5, sVar6);
                                    y2.h hVar17 = y2.j.f56918g;
                                    if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode5))) {
                                        defpackage.e.A(iHashCode5, sVar6, iHashCode5, hVar17);
                                    }
                                    y2.h hVar18 = y2.j.f56915d;
                                    l1.t.J(hVar18, rVarC6, sVar6);
                                    boolean zBooleanValue2 = ((Boolean) xt.b.f56284f.getValue()).booleanValue();
                                    String str8 = str5;
                                    if (zBooleanValue2) {
                                        sVar6.d0(-538037093);
                                        String string4 = resources2.getString(R.string.seven_days_free);
                                        kotlin.jvm.internal.m.e(string4, "getString(...)");
                                        d0 d0Var = ua.f31167a;
                                        j17 = j16;
                                        hVar7 = hVar17;
                                        hVar8 = hVar15;
                                        dVar = dVar2;
                                        iVar2 = iVar4;
                                        iu.k.h(string4, null, 0L, null, null, 0L, j3.A(12), j3.A(38), null, 0L, null, 0, false, 1, 0, null, y0.a((y0) sVar6.j(d0Var), ((s1) sVar6.j(v1.f31180a)).f31024f, j3.A(38), n3.s.K, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), CropImageView.DEFAULT_ASPECT_RATIO, sVar6, 14155776, 1572864, 1507134);
                                        String string5 = resources2.getString(R.string.then_s_annually);
                                        kotlin.jvm.internal.m.e(string5, "getString(...)");
                                        ua.b(oz.x.q0(string5, "%s", str8), j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, 6, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar6.j(d0Var), j17, j3.A(18), n3.s.f43178t, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar6, 48, 0, 65532);
                                        sVar5 = sVar6;
                                        i14 = 0;
                                        sVar5.p(false);
                                        oVar2 = oVar3;
                                    } else {
                                        j17 = j16;
                                        dVar = dVar2;
                                        hVar7 = hVar17;
                                        iVar2 = iVar4;
                                        hVar8 = hVar15;
                                        sVar6.d0(-536737883);
                                        oVar2 = oVar3;
                                        ua.b(ep.a.D(resources2.getString(R.string.annual), ": ", str8), j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, 6, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar6.j(ua.f31167a), j17, j3.A(18), n3.s.K, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar6, 48, 0, 65532);
                                        sVar5 = sVar6;
                                        i14 = 0;
                                        sVar5.p(false);
                                    }
                                    sVar5.p(true);
                                    j0.u uVarA4 = j0.t.a(dVar, hVar9, sVar5, i14);
                                    int iHashCode6 = Long.hashCode(sVar5.T);
                                    q1 q1VarL6 = sVar5.l();
                                    z1.r rVarC7 = z1.a.c(sVar5, oVar2);
                                    sVar5.h0();
                                    if (sVar5.S) {
                                        sVar5.k(iVar2);
                                    } else {
                                        sVar5.r0();
                                    }
                                    l1.t.J(hVar8, uVarA4, sVar5);
                                    l1.t.J(hVar16, q1VarL6, sVar5);
                                    if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode6))) {
                                        defpackage.e.A(iHashCode6, sVar5, iHashCode6, hVar7);
                                    }
                                    l1.t.J(hVar18, rVarC7, sVar5);
                                    c3 c3Var = v1.f31180a;
                                    long j18 = ((s1) sVar5.j(c3Var)).f31025g;
                                    long j19 = ((s1) sVar5.j(c3Var)).f31024f;
                                    long j110 = ((s1) sVar5.j(c3Var)).f31024f;
                                    float f16 = 36;
                                    z1.o oVar4 = oVar2;
                                    z1.r rVarE = j0.c.E(oVar4, f16, CropImageView.DEFAULT_ASPECT_RATIO, f16, CropImageView.DEFAULT_ASPECT_RATIO, 10);
                                    Object objQ7 = sVar5.Q();
                                    l1.g gVar2 = l1.m.f39353a;
                                    if (objQ7 == gVar2) {
                                        mVar = this;
                                        objQ7 = new bt.a2(a1Var2, 8);
                                        sVar5.o0(objQ7);
                                    } else {
                                        mVar = this;
                                    }
                                    z1.r rVarN = a0.n(rVarE, (fz.c) objQ7);
                                    fz.a aVar3 = aVar2;
                                    boolean zF5 = sVar5.f(aVar3);
                                    Object objQ8 = sVar5.Q();
                                    if (zF5 || objQ8 == gVar2) {
                                        objQ8 = new et.p(10, aVar3);
                                        sVar5.o0(objQ8);
                                    }
                                    l1.s sVar7 = sVar5;
                                    m mVar2 = mVar;
                                    n.b(str6, j18, j19, j110, rVarN, (fz.a) objQ8, sVar7, 24576);
                                    y0 y0VarA = y0.a((y0) sVar7.j(ua.f31167a), j17, j3.A(11), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444);
                                    z1.r rVarE2 = e2.e(j0.c.E(j0.c.C(oVar4, f16, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 6, CropImageView.DEFAULT_ASPECT_RATIO, 42, 5), 1.0f);
                                    Object objQ9 = sVar7.Q();
                                    if (objQ9 == gVar2) {
                                        objQ9 = new n2(19);
                                        sVar7.o0(objQ9);
                                    }
                                    ua.b(str7, f0.q(rVarE2, (fz.c) objQ9), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA, sVar7, 48, 0, 65532);
                                    sVar7.p(true);
                                    sVar7.p(true);
                                } else {
                                    sVar6.W();
                                }
                                return qy.b0.f48488a;
                            }
                        }, true, 1678640916), 3);
                        l0.h.p(LazyColumn, null, new t1.d(new a(list3, list2, list4, j15), true, -1246944245), 3);
                        final int i14 = 0;
                        l0.h.p(LazyColumn, null, new t1.d(new fz.f() { // from class: gr.b
                            @Override // fz.f
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                switch (i14) {
                                    case 0:
                                        l0.c item = (l0.c) obj3;
                                        l1.n nVar2 = (l1.n) obj4;
                                        int iIntValue = ((Integer) obj5).intValue();
                                        kotlin.jvm.internal.m.f(item, "$this$item");
                                        l1.s sVar5 = (l1.s) nVar2;
                                        if (sVar5.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            Resources resources2 = resources;
                                            String string3 = resources2.getString(R.string.premium_efficiency);
                                            kotlin.jvm.internal.m.e(string3, "getString(...)");
                                            float f15 = 44;
                                            z1.o oVar2 = z1.o.f58481a;
                                            z1.r rVarE = e2.e(j0.c.E(oVar2, f15, 40, f15, CropImageView.DEFAULT_ASPECT_RATIO, 8), 1.0f);
                                            long jA = j3.A(22);
                                            long j16 = j15;
                                            n.f(3072, j16, jA, string3, sVar5, rVarE);
                                            float f16 = 18;
                                            z1.r rVarB = d2.h.b(d0.n.h(e2.e(j0.c.C(j0.c.E(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, 24, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 20, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), g2.x.c(f0.e(4294950912L), 0.12f), r0.f.d(f16)), r0.f.d(f16));
                                            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar5, 0);
                                            int iHashCode3 = Long.hashCode(sVar5.T);
                                            q1 q1VarL3 = sVar5.l();
                                            z1.r rVarC3 = z1.a.c(sVar5, rVarB);
                                            y2.k.J.getClass();
                                            y2.i iVar2 = y2.j.f56913b;
                                            sVar5.h0();
                                            if (sVar5.S) {
                                                sVar5.k(iVar2);
                                            } else {
                                                sVar5.r0();
                                            }
                                            y2.h hVar7 = y2.j.f56917f;
                                            l1.t.J(hVar7, uVarA, sVar5);
                                            y2.h hVar8 = y2.j.f56916e;
                                            l1.t.J(hVar8, q1VarL3, sVar5);
                                            y2.h hVar9 = y2.j.f56918g;
                                            if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode3))) {
                                                defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar9);
                                            }
                                            y2.h hVar10 = y2.j.f56915d;
                                            l1.t.J(hVar10, rVarC3, sVar5);
                                            z1.r rVarE2 = e2.e(oVar2, 1.0f);
                                            long j17 = g2.x.f28621h;
                                            z1.r rVarG = e2.g(d0.n.h(rVarE2, j17, f0.f28556b), 42);
                                            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.M, sVar5, 48);
                                            int iHashCode4 = Long.hashCode(sVar5.T);
                                            q1 q1VarL4 = sVar5.l();
                                            z1.r rVarC4 = z1.a.c(sVar5, rVarG);
                                            sVar5.h0();
                                            if (sVar5.S) {
                                                sVar5.k(iVar2);
                                            } else {
                                                sVar5.r0();
                                            }
                                            l1.t.J(hVar7, a2VarA, sVar5);
                                            l1.t.J(hVar8, q1VarL4, sVar5);
                                            if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode4))) {
                                                defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar9);
                                            }
                                            l1.t.J(hVar10, rVarC4, sVar5);
                                            if (1.0f <= 0.0d) {
                                                k0.a.a("invalid weight; must be greater than zero");
                                            }
                                            j0.c.g(sVar5, new i1(1.0f, true));
                                            String string4 = resources2.getString(R.string.free);
                                            kotlin.jvm.internal.m.e(string4, "getString(...)");
                                            d0 d0Var = ua.f31167a;
                                            y0 y0Var = (y0) sVar5.j(d0Var);
                                            long jA2 = j3.A(16);
                                            n3.s sVar6 = n3.s.L;
                                            float f17 = 86;
                                            ua.b(string4, e2.s(oVar2, f17), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a(y0Var, j16, jA2, sVar6, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar5, 48, 0, 65532);
                                            String string5 = resources2.getString(R.string.premium);
                                            kotlin.jvm.internal.m.e(string5, "getString(...)");
                                            ua.b(string5, e2.s(oVar2, f17), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar5.j(d0Var), j16, j3.A(16), sVar6, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar5, 48, 0, 65532);
                                            sVar5.p(true);
                                            long jC = g2.x.c(f0.e(4294950912L), 0.13f);
                                            String string6 = resources2.getString(R.string.free_vs_premium_1);
                                            kotlin.jvm.internal.m.e(string6, "getString(...)");
                                            c3 c3Var = v1.f31180a;
                                            n.e(jC, string6, ((s1) sVar5.j(c3Var)).f31017a, j16, R.drawable.ic_billing_page_check_small, sVar5, 6);
                                            String string7 = resources2.getString(R.string.free_vs_premium_2);
                                            kotlin.jvm.internal.m.e(string7, "getString(...)");
                                            n.e(j17, string7, ((s1) sVar5.j(c3Var)).f31017a, j16, R.drawable.ic_billing_page_check_small, sVar5, 6);
                                            long jC2 = g2.x.c(f0.e(4294950912L), 0.13f);
                                            String string8 = resources2.getString(R.string.free_vs_premium_3);
                                            kotlin.jvm.internal.m.e(string8, "getString(...)");
                                            n.e(jC2, string8, ((s1) sVar5.j(c3Var)).f31017a, j16, R.drawable.ic_sub_intro_lock, sVar5, 6);
                                            String string9 = resources2.getString(R.string.free_vs_premium_4);
                                            kotlin.jvm.internal.m.e(string9, "getString(...)");
                                            n.e(j17, string9, ((s1) sVar5.j(c3Var)).f31017a, j16, R.drawable.ic_sub_intro_lock, sVar5, 6);
                                            long jC3 = g2.x.c(f0.e(4294950912L), 0.13f);
                                            String string10 = resources2.getString(R.string.free_vs_premium_5);
                                            kotlin.jvm.internal.m.e(string10, "getString(...)");
                                            n.e(jC3, string10, ((s1) sVar5.j(c3Var)).f31017a, j16, R.drawable.ic_sub_intro_lock, sVar5, 6);
                                            String string11 = resources2.getString(R.string.free_vs_premium_6);
                                            kotlin.jvm.internal.m.e(string11, "getString(...)");
                                            n.e(j17, string11, ((s1) sVar5.j(c3Var)).f31017a, j16, R.drawable.ic_sub_intro_lock, sVar5, 6);
                                            sVar5.p(true);
                                        } else {
                                            sVar5.W();
                                        }
                                        break;
                                    default:
                                        l0.c item2 = (l0.c) obj3;
                                        l1.n nVar3 = (l1.n) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        kotlin.jvm.internal.m.f(item2, "$this$item");
                                        l1.s sVar7 = (l1.s) nVar3;
                                        if (sVar7.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                            j0.c.g(sVar7, e2.g(z1.o.f58481a, 32));
                                            Resources resources3 = resources;
                                            String string12 = resources3.getString(R.string.subs_can_be_cancel_anytime_for_any_reason);
                                            kotlin.jvm.internal.m.e(string12, "getString(...)");
                                            long j18 = j15;
                                            n.d(string12, j18, sVar7, 0);
                                            String string13 = resources3.getString(R.string.tv_subscription_rule);
                                            kotlin.jvm.internal.m.e(string13, "getString(...)");
                                            n.d(string13, j18, sVar7, 0);
                                            String string14 = resources3.getString(R.string.ld_plus_billing_alert);
                                            kotlin.jvm.internal.m.e(string14, "getString(...)");
                                            n.d(string14, j18, sVar7, 0);
                                            String string15 = resources3.getString(R.string.xiaomi_billing_alert);
                                            kotlin.jvm.internal.m.e(string15, "getString(...)");
                                            n.d(string15, j18, sVar7, 0);
                                        } else {
                                            sVar7.W();
                                        }
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        }, true, 812978252), 3);
                        final int i15 = 1;
                        l0.h.p(LazyColumn, null, new t1.d(new fz.f() { // from class: gr.b
                            @Override // fz.f
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                switch (i15) {
                                    case 0:
                                        l0.c item = (l0.c) obj3;
                                        l1.n nVar2 = (l1.n) obj4;
                                        int iIntValue = ((Integer) obj5).intValue();
                                        kotlin.jvm.internal.m.f(item, "$this$item");
                                        l1.s sVar5 = (l1.s) nVar2;
                                        if (sVar5.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            Resources resources2 = resources;
                                            String string3 = resources2.getString(R.string.premium_efficiency);
                                            kotlin.jvm.internal.m.e(string3, "getString(...)");
                                            float f15 = 44;
                                            z1.o oVar2 = z1.o.f58481a;
                                            z1.r rVarE = e2.e(j0.c.E(oVar2, f15, 40, f15, CropImageView.DEFAULT_ASPECT_RATIO, 8), 1.0f);
                                            long jA = j3.A(22);
                                            long j16 = j15;
                                            n.f(3072, j16, jA, string3, sVar5, rVarE);
                                            float f16 = 18;
                                            z1.r rVarB = d2.h.b(d0.n.h(e2.e(j0.c.C(j0.c.E(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, 24, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 20, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), g2.x.c(f0.e(4294950912L), 0.12f), r0.f.d(f16)), r0.f.d(f16));
                                            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar5, 0);
                                            int iHashCode3 = Long.hashCode(sVar5.T);
                                            q1 q1VarL3 = sVar5.l();
                                            z1.r rVarC3 = z1.a.c(sVar5, rVarB);
                                            y2.k.J.getClass();
                                            y2.i iVar2 = y2.j.f56913b;
                                            sVar5.h0();
                                            if (sVar5.S) {
                                                sVar5.k(iVar2);
                                            } else {
                                                sVar5.r0();
                                            }
                                            y2.h hVar7 = y2.j.f56917f;
                                            l1.t.J(hVar7, uVarA, sVar5);
                                            y2.h hVar8 = y2.j.f56916e;
                                            l1.t.J(hVar8, q1VarL3, sVar5);
                                            y2.h hVar9 = y2.j.f56918g;
                                            if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode3))) {
                                                defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar9);
                                            }
                                            y2.h hVar10 = y2.j.f56915d;
                                            l1.t.J(hVar10, rVarC3, sVar5);
                                            z1.r rVarE2 = e2.e(oVar2, 1.0f);
                                            long j17 = g2.x.f28621h;
                                            z1.r rVarG = e2.g(d0.n.h(rVarE2, j17, f0.f28556b), 42);
                                            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.M, sVar5, 48);
                                            int iHashCode4 = Long.hashCode(sVar5.T);
                                            q1 q1VarL4 = sVar5.l();
                                            z1.r rVarC4 = z1.a.c(sVar5, rVarG);
                                            sVar5.h0();
                                            if (sVar5.S) {
                                                sVar5.k(iVar2);
                                            } else {
                                                sVar5.r0();
                                            }
                                            l1.t.J(hVar7, a2VarA, sVar5);
                                            l1.t.J(hVar8, q1VarL4, sVar5);
                                            if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode4))) {
                                                defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar9);
                                            }
                                            l1.t.J(hVar10, rVarC4, sVar5);
                                            if (1.0f <= 0.0d) {
                                                k0.a.a("invalid weight; must be greater than zero");
                                            }
                                            j0.c.g(sVar5, new i1(1.0f, true));
                                            String string4 = resources2.getString(R.string.free);
                                            kotlin.jvm.internal.m.e(string4, "getString(...)");
                                            d0 d0Var = ua.f31167a;
                                            y0 y0Var = (y0) sVar5.j(d0Var);
                                            long jA2 = j3.A(16);
                                            n3.s sVar6 = n3.s.L;
                                            float f17 = 86;
                                            ua.b(string4, e2.s(oVar2, f17), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a(y0Var, j16, jA2, sVar6, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar5, 48, 0, 65532);
                                            String string5 = resources2.getString(R.string.premium);
                                            kotlin.jvm.internal.m.e(string5, "getString(...)");
                                            ua.b(string5, e2.s(oVar2, f17), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar5.j(d0Var), j16, j3.A(16), sVar6, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar5, 48, 0, 65532);
                                            sVar5.p(true);
                                            long jC = g2.x.c(f0.e(4294950912L), 0.13f);
                                            String string6 = resources2.getString(R.string.free_vs_premium_1);
                                            kotlin.jvm.internal.m.e(string6, "getString(...)");
                                            c3 c3Var = v1.f31180a;
                                            n.e(jC, string6, ((s1) sVar5.j(c3Var)).f31017a, j16, R.drawable.ic_billing_page_check_small, sVar5, 6);
                                            String string7 = resources2.getString(R.string.free_vs_premium_2);
                                            kotlin.jvm.internal.m.e(string7, "getString(...)");
                                            n.e(j17, string7, ((s1) sVar5.j(c3Var)).f31017a, j16, R.drawable.ic_billing_page_check_small, sVar5, 6);
                                            long jC2 = g2.x.c(f0.e(4294950912L), 0.13f);
                                            String string8 = resources2.getString(R.string.free_vs_premium_3);
                                            kotlin.jvm.internal.m.e(string8, "getString(...)");
                                            n.e(jC2, string8, ((s1) sVar5.j(c3Var)).f31017a, j16, R.drawable.ic_sub_intro_lock, sVar5, 6);
                                            String string9 = resources2.getString(R.string.free_vs_premium_4);
                                            kotlin.jvm.internal.m.e(string9, "getString(...)");
                                            n.e(j17, string9, ((s1) sVar5.j(c3Var)).f31017a, j16, R.drawable.ic_sub_intro_lock, sVar5, 6);
                                            long jC3 = g2.x.c(f0.e(4294950912L), 0.13f);
                                            String string10 = resources2.getString(R.string.free_vs_premium_5);
                                            kotlin.jvm.internal.m.e(string10, "getString(...)");
                                            n.e(jC3, string10, ((s1) sVar5.j(c3Var)).f31017a, j16, R.drawable.ic_sub_intro_lock, sVar5, 6);
                                            String string11 = resources2.getString(R.string.free_vs_premium_6);
                                            kotlin.jvm.internal.m.e(string11, "getString(...)");
                                            n.e(j17, string11, ((s1) sVar5.j(c3Var)).f31017a, j16, R.drawable.ic_sub_intro_lock, sVar5, 6);
                                            sVar5.p(true);
                                        } else {
                                            sVar5.W();
                                        }
                                        break;
                                    default:
                                        l0.c item2 = (l0.c) obj3;
                                        l1.n nVar3 = (l1.n) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        kotlin.jvm.internal.m.f(item2, "$this$item");
                                        l1.s sVar7 = (l1.s) nVar3;
                                        if (sVar7.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                            j0.c.g(sVar7, e2.g(z1.o.f58481a, 32));
                                            Resources resources3 = resources;
                                            String string12 = resources3.getString(R.string.subs_can_be_cancel_anytime_for_any_reason);
                                            kotlin.jvm.internal.m.e(string12, "getString(...)");
                                            long j18 = j15;
                                            n.d(string12, j18, sVar7, 0);
                                            String string13 = resources3.getString(R.string.tv_subscription_rule);
                                            kotlin.jvm.internal.m.e(string13, "getString(...)");
                                            n.d(string13, j18, sVar7, 0);
                                            String string14 = resources3.getString(R.string.ld_plus_billing_alert);
                                            kotlin.jvm.internal.m.e(string14, "getString(...)");
                                            n.d(string14, j18, sVar7, 0);
                                            String string15 = resources3.getString(R.string.xiaomi_billing_alert);
                                            kotlin.jvm.internal.m.e(string15, "getString(...)");
                                            n.d(string15, j18, sVar7, 0);
                                        } else {
                                            sVar7.W();
                                        }
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        }, true, -1422066547), 3);
                        l0.h.p(LazyColumn, null, new t1.d(new a(resources, j15, onTermsOfUseClick, onPrivacyPolicyClick), true, 637855950), 3);
                        return qy.b0.f48488a;
                    }
                };
                str2 = str4;
                aVar = onBillingClick;
                sVar2 = sVar3;
                sVar2.o0(obj);
            } else {
                final String str5 = string;
                final float f14 = f11;
                obj = new fz.c() { // from class: gr.k
                    @Override // fz.c
                    public final Object invoke(Object obj2) {
                        l0.h LazyColumn = (l0.h) obj2;
                        kotlin.jvm.internal.m.f(LazyColumn, "$this$LazyColumn");
                        final float f15 = f14;
                        final Resources resources = curLocalizedResource;
                        final List list5 = list;
                        final long j15 = j12;
                        final String str6 = str;
                        final String str7 = str5;
                        final fz.a aVar2 = onBillingClick;
                        final String str8 = string2;
                        final a1 a1Var2 = a1Var;
                        l0.h.p(LazyColumn, null, new t1.d(new fz.f() { // from class: gr.m
                            @Override // fz.f
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                long j16;
                                long j17;
                                j0.d dVar;
                                y2.h hVar7;
                                y2.i iVar2;
                                y2.h hVar8;
                                z1.o oVar2;
                                l1.s sVar5;
                                int i14;
                                m mVar;
                                l0.c item = (l0.c) obj3;
                                l1.n nVar2 = (l1.n) obj4;
                                int iIntValue = ((Integer) obj5).intValue();
                                z1.h hVar9 = z1.c.O;
                                kotlin.jvm.internal.m.f(item, "$this$item");
                                l1.s sVar6 = (l1.s) nVar2;
                                if (sVar6.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    z1.o oVar3 = z1.o.f58481a;
                                    z1.r rVarG = e2.g(j0.c.F(oVar3), f15);
                                    j0.u uVarA = j0.t.a(j0.i.f35309g, hVar9, sVar6, 6);
                                    int iHashCode3 = Long.hashCode(sVar6.T);
                                    q1 q1VarL3 = sVar6.l();
                                    z1.r rVarC3 = z1.a.c(sVar6, rVarG);
                                    y2.k.J.getClass();
                                    y2.i iVar3 = y2.j.f56913b;
                                    sVar6.h0();
                                    if (sVar6.S) {
                                        sVar6.k(iVar3);
                                    } else {
                                        sVar6.r0();
                                    }
                                    y2.h hVar10 = y2.j.f56917f;
                                    l1.t.J(hVar10, uVarA, sVar6);
                                    y2.h hVar11 = y2.j.f56916e;
                                    l1.t.J(hVar11, q1VarL3, sVar6);
                                    y2.h hVar12 = y2.j.f56918g;
                                    if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode3))) {
                                        defpackage.e.A(iHashCode3, sVar6, iHashCode3, hVar12);
                                    }
                                    y2.h hVar13 = y2.j.f56915d;
                                    l1.t.J(hVar13, rVarC3, sVar6);
                                    Resources resources2 = resources;
                                    String string3 = resources2.getString(R.string.welcome_billing_premium);
                                    kotlin.jvm.internal.m.e(string3, "getString(...)");
                                    ua.b(string3, j0.c.E(e2.e(oVar3, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 60, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar6.j(ua.f31167a), ((s1) sVar6.j(v1.f31180a)).f31024f, j3.A(58), n3.s.N, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar6, 48, 0, 65532);
                                    float f16 = 26;
                                    z1.r rVarB = j0.c.B(j0.c.E(oVar3, f16, CropImageView.DEFAULT_ASPECT_RATIO, f16, CropImageView.DEFAULT_ASPECT_RATIO, 10), 16, 30);
                                    j0.u uVarA2 = j0.t.a(j0.i.g(24), hVar9, sVar6, 6);
                                    int iHashCode4 = Long.hashCode(sVar6.T);
                                    q1 q1VarL4 = sVar6.l();
                                    z1.r rVarC4 = z1.a.c(sVar6, rVarB);
                                    sVar6.h0();
                                    if (sVar6.S) {
                                        sVar6.k(iVar3);
                                    } else {
                                        sVar6.r0();
                                    }
                                    l1.t.J(hVar10, uVarA2, sVar6);
                                    l1.t.J(hVar11, q1VarL4, sVar6);
                                    if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode4))) {
                                        defpackage.e.A(iHashCode4, sVar6, iHashCode4, hVar12);
                                    }
                                    l1.t.J(hVar13, rVarC4, sVar6);
                                    sVar6.d0(795642753);
                                    Iterator it = list5.iterator();
                                    while (true) {
                                        boolean zHasNext = it.hasNext();
                                        j16 = j15;
                                        if (!zHasNext) {
                                            break;
                                        }
                                        n.a(0, j16, (String) it.next(), sVar6, null);
                                    }
                                    sVar6.p(false);
                                    sVar6.p(true);
                                    k7.g(j0.c.C(oVar3, 90, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1, f0.c(1084400290), sVar6, 438, 0);
                                    z1.h hVar14 = z1.c.P;
                                    z1.r rVarC5 = j0.c.C(e2.e(oVar3, 1.0f), 32, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                                    j0.d dVar2 = j0.i.f35305c;
                                    j0.u uVarA3 = j0.t.a(dVar2, hVar14, sVar6, 48);
                                    int iHashCode5 = Long.hashCode(sVar6.T);
                                    q1 q1VarL5 = sVar6.l();
                                    z1.r rVarC6 = z1.a.c(sVar6, rVarC5);
                                    y2.k.J.getClass();
                                    y2.i iVar4 = y2.j.f56913b;
                                    sVar6.h0();
                                    if (sVar6.S) {
                                        sVar6.k(iVar4);
                                    } else {
                                        sVar6.r0();
                                    }
                                    y2.h hVar15 = y2.j.f56917f;
                                    l1.t.J(hVar15, uVarA3, sVar6);
                                    y2.h hVar16 = y2.j.f56916e;
                                    l1.t.J(hVar16, q1VarL5, sVar6);
                                    y2.h hVar17 = y2.j.f56918g;
                                    if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode5))) {
                                        defpackage.e.A(iHashCode5, sVar6, iHashCode5, hVar17);
                                    }
                                    y2.h hVar18 = y2.j.f56915d;
                                    l1.t.J(hVar18, rVarC6, sVar6);
                                    boolean zBooleanValue2 = ((Boolean) xt.b.f56284f.getValue()).booleanValue();
                                    String str9 = str6;
                                    if (zBooleanValue2) {
                                        sVar6.d0(-538037093);
                                        String string4 = resources2.getString(R.string.seven_days_free);
                                        kotlin.jvm.internal.m.e(string4, "getString(...)");
                                        d0 d0Var = ua.f31167a;
                                        j17 = j16;
                                        hVar7 = hVar17;
                                        hVar8 = hVar15;
                                        dVar = dVar2;
                                        iVar2 = iVar4;
                                        iu.k.h(string4, null, 0L, null, null, 0L, j3.A(12), j3.A(38), null, 0L, null, 0, false, 1, 0, null, y0.a((y0) sVar6.j(d0Var), ((s1) sVar6.j(v1.f31180a)).f31024f, j3.A(38), n3.s.K, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), CropImageView.DEFAULT_ASPECT_RATIO, sVar6, 14155776, 1572864, 1507134);
                                        String string5 = resources2.getString(R.string.then_s_annually);
                                        kotlin.jvm.internal.m.e(string5, "getString(...)");
                                        ua.b(oz.x.q0(string5, "%s", str9), j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, 6, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar6.j(d0Var), j17, j3.A(18), n3.s.f43178t, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar6, 48, 0, 65532);
                                        sVar5 = sVar6;
                                        i14 = 0;
                                        sVar5.p(false);
                                        oVar2 = oVar3;
                                    } else {
                                        j17 = j16;
                                        dVar = dVar2;
                                        hVar7 = hVar17;
                                        iVar2 = iVar4;
                                        hVar8 = hVar15;
                                        sVar6.d0(-536737883);
                                        oVar2 = oVar3;
                                        ua.b(ep.a.D(resources2.getString(R.string.annual), ": ", str9), j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, 6, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar6.j(ua.f31167a), j17, j3.A(18), n3.s.K, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar6, 48, 0, 65532);
                                        sVar5 = sVar6;
                                        i14 = 0;
                                        sVar5.p(false);
                                    }
                                    sVar5.p(true);
                                    j0.u uVarA4 = j0.t.a(dVar, hVar9, sVar5, i14);
                                    int iHashCode6 = Long.hashCode(sVar5.T);
                                    q1 q1VarL6 = sVar5.l();
                                    z1.r rVarC7 = z1.a.c(sVar5, oVar2);
                                    sVar5.h0();
                                    if (sVar5.S) {
                                        sVar5.k(iVar2);
                                    } else {
                                        sVar5.r0();
                                    }
                                    l1.t.J(hVar8, uVarA4, sVar5);
                                    l1.t.J(hVar16, q1VarL6, sVar5);
                                    if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode6))) {
                                        defpackage.e.A(iHashCode6, sVar5, iHashCode6, hVar7);
                                    }
                                    l1.t.J(hVar18, rVarC7, sVar5);
                                    c3 c3Var = v1.f31180a;
                                    long j18 = ((s1) sVar5.j(c3Var)).f31025g;
                                    long j19 = ((s1) sVar5.j(c3Var)).f31024f;
                                    long j110 = ((s1) sVar5.j(c3Var)).f31024f;
                                    float f17 = 36;
                                    z1.o oVar4 = oVar2;
                                    z1.r rVarE = j0.c.E(oVar4, f17, CropImageView.DEFAULT_ASPECT_RATIO, f17, CropImageView.DEFAULT_ASPECT_RATIO, 10);
                                    Object objQ7 = sVar5.Q();
                                    l1.g gVar2 = l1.m.f39353a;
                                    if (objQ7 == gVar2) {
                                        mVar = this;
                                        objQ7 = new bt.a2(a1Var2, 8);
                                        sVar5.o0(objQ7);
                                    } else {
                                        mVar = this;
                                    }
                                    z1.r rVarN = a0.n(rVarE, (fz.c) objQ7);
                                    fz.a aVar3 = aVar2;
                                    boolean zF5 = sVar5.f(aVar3);
                                    Object objQ8 = sVar5.Q();
                                    if (zF5 || objQ8 == gVar2) {
                                        objQ8 = new et.p(10, aVar3);
                                        sVar5.o0(objQ8);
                                    }
                                    l1.s sVar7 = sVar5;
                                    m mVar2 = mVar;
                                    n.b(str7, j18, j19, j110, rVarN, (fz.a) objQ8, sVar7, 24576);
                                    y0 y0VarA = y0.a((y0) sVar7.j(ua.f31167a), j17, j3.A(11), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444);
                                    z1.r rVarE2 = e2.e(j0.c.E(j0.c.C(oVar4, f17, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 6, CropImageView.DEFAULT_ASPECT_RATIO, 42, 5), 1.0f);
                                    Object objQ9 = sVar7.Q();
                                    if (objQ9 == gVar2) {
                                        objQ9 = new n2(19);
                                        sVar7.o0(objQ9);
                                    }
                                    ua.b(str8, f0.q(rVarE2, (fz.c) objQ9), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA, sVar7, 48, 0, 65532);
                                    sVar7.p(true);
                                    sVar7.p(true);
                                } else {
                                    sVar6.W();
                                }
                                return qy.b0.f48488a;
                            }
                        }, true, 1678640916), 3);
                        l0.h.p(LazyColumn, null, new t1.d(new a(list3, list2, list4, j15), true, -1246944245), 3);
                        final int i14 = 0;
                        l0.h.p(LazyColumn, null, new t1.d(new fz.f() { // from class: gr.b
                            @Override // fz.f
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                switch (i14) {
                                    case 0:
                                        l0.c item = (l0.c) obj3;
                                        l1.n nVar2 = (l1.n) obj4;
                                        int iIntValue = ((Integer) obj5).intValue();
                                        kotlin.jvm.internal.m.f(item, "$this$item");
                                        l1.s sVar5 = (l1.s) nVar2;
                                        if (sVar5.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            Resources resources2 = resources;
                                            String string3 = resources2.getString(R.string.premium_efficiency);
                                            kotlin.jvm.internal.m.e(string3, "getString(...)");
                                            float f16 = 44;
                                            z1.o oVar2 = z1.o.f58481a;
                                            z1.r rVarE = e2.e(j0.c.E(oVar2, f16, 40, f16, CropImageView.DEFAULT_ASPECT_RATIO, 8), 1.0f);
                                            long jA = j3.A(22);
                                            long j16 = j15;
                                            n.f(3072, j16, jA, string3, sVar5, rVarE);
                                            float f17 = 18;
                                            z1.r rVarB = d2.h.b(d0.n.h(e2.e(j0.c.C(j0.c.E(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, 24, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 20, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), g2.x.c(f0.e(4294950912L), 0.12f), r0.f.d(f17)), r0.f.d(f17));
                                            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar5, 0);
                                            int iHashCode3 = Long.hashCode(sVar5.T);
                                            q1 q1VarL3 = sVar5.l();
                                            z1.r rVarC3 = z1.a.c(sVar5, rVarB);
                                            y2.k.J.getClass();
                                            y2.i iVar2 = y2.j.f56913b;
                                            sVar5.h0();
                                            if (sVar5.S) {
                                                sVar5.k(iVar2);
                                            } else {
                                                sVar5.r0();
                                            }
                                            y2.h hVar7 = y2.j.f56917f;
                                            l1.t.J(hVar7, uVarA, sVar5);
                                            y2.h hVar8 = y2.j.f56916e;
                                            l1.t.J(hVar8, q1VarL3, sVar5);
                                            y2.h hVar9 = y2.j.f56918g;
                                            if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode3))) {
                                                defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar9);
                                            }
                                            y2.h hVar10 = y2.j.f56915d;
                                            l1.t.J(hVar10, rVarC3, sVar5);
                                            z1.r rVarE2 = e2.e(oVar2, 1.0f);
                                            long j17 = g2.x.f28621h;
                                            z1.r rVarG = e2.g(d0.n.h(rVarE2, j17, f0.f28556b), 42);
                                            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.M, sVar5, 48);
                                            int iHashCode4 = Long.hashCode(sVar5.T);
                                            q1 q1VarL4 = sVar5.l();
                                            z1.r rVarC4 = z1.a.c(sVar5, rVarG);
                                            sVar5.h0();
                                            if (sVar5.S) {
                                                sVar5.k(iVar2);
                                            } else {
                                                sVar5.r0();
                                            }
                                            l1.t.J(hVar7, a2VarA, sVar5);
                                            l1.t.J(hVar8, q1VarL4, sVar5);
                                            if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode4))) {
                                                defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar9);
                                            }
                                            l1.t.J(hVar10, rVarC4, sVar5);
                                            if (1.0f <= 0.0d) {
                                                k0.a.a("invalid weight; must be greater than zero");
                                            }
                                            j0.c.g(sVar5, new i1(1.0f, true));
                                            String string4 = resources2.getString(R.string.free);
                                            kotlin.jvm.internal.m.e(string4, "getString(...)");
                                            d0 d0Var = ua.f31167a;
                                            y0 y0Var = (y0) sVar5.j(d0Var);
                                            long jA2 = j3.A(16);
                                            n3.s sVar6 = n3.s.L;
                                            float f18 = 86;
                                            ua.b(string4, e2.s(oVar2, f18), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a(y0Var, j16, jA2, sVar6, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar5, 48, 0, 65532);
                                            String string5 = resources2.getString(R.string.premium);
                                            kotlin.jvm.internal.m.e(string5, "getString(...)");
                                            ua.b(string5, e2.s(oVar2, f18), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar5.j(d0Var), j16, j3.A(16), sVar6, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar5, 48, 0, 65532);
                                            sVar5.p(true);
                                            long jC = g2.x.c(f0.e(4294950912L), 0.13f);
                                            String string6 = resources2.getString(R.string.free_vs_premium_1);
                                            kotlin.jvm.internal.m.e(string6, "getString(...)");
                                            c3 c3Var = v1.f31180a;
                                            n.e(jC, string6, ((s1) sVar5.j(c3Var)).f31017a, j16, R.drawable.ic_billing_page_check_small, sVar5, 6);
                                            String string7 = resources2.getString(R.string.free_vs_premium_2);
                                            kotlin.jvm.internal.m.e(string7, "getString(...)");
                                            n.e(j17, string7, ((s1) sVar5.j(c3Var)).f31017a, j16, R.drawable.ic_billing_page_check_small, sVar5, 6);
                                            long jC2 = g2.x.c(f0.e(4294950912L), 0.13f);
                                            String string8 = resources2.getString(R.string.free_vs_premium_3);
                                            kotlin.jvm.internal.m.e(string8, "getString(...)");
                                            n.e(jC2, string8, ((s1) sVar5.j(c3Var)).f31017a, j16, R.drawable.ic_sub_intro_lock, sVar5, 6);
                                            String string9 = resources2.getString(R.string.free_vs_premium_4);
                                            kotlin.jvm.internal.m.e(string9, "getString(...)");
                                            n.e(j17, string9, ((s1) sVar5.j(c3Var)).f31017a, j16, R.drawable.ic_sub_intro_lock, sVar5, 6);
                                            long jC3 = g2.x.c(f0.e(4294950912L), 0.13f);
                                            String string10 = resources2.getString(R.string.free_vs_premium_5);
                                            kotlin.jvm.internal.m.e(string10, "getString(...)");
                                            n.e(jC3, string10, ((s1) sVar5.j(c3Var)).f31017a, j16, R.drawable.ic_sub_intro_lock, sVar5, 6);
                                            String string11 = resources2.getString(R.string.free_vs_premium_6);
                                            kotlin.jvm.internal.m.e(string11, "getString(...)");
                                            n.e(j17, string11, ((s1) sVar5.j(c3Var)).f31017a, j16, R.drawable.ic_sub_intro_lock, sVar5, 6);
                                            sVar5.p(true);
                                        } else {
                                            sVar5.W();
                                        }
                                        break;
                                    default:
                                        l0.c item2 = (l0.c) obj3;
                                        l1.n nVar3 = (l1.n) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        kotlin.jvm.internal.m.f(item2, "$this$item");
                                        l1.s sVar7 = (l1.s) nVar3;
                                        if (sVar7.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                            j0.c.g(sVar7, e2.g(z1.o.f58481a, 32));
                                            Resources resources3 = resources;
                                            String string12 = resources3.getString(R.string.subs_can_be_cancel_anytime_for_any_reason);
                                            kotlin.jvm.internal.m.e(string12, "getString(...)");
                                            long j18 = j15;
                                            n.d(string12, j18, sVar7, 0);
                                            String string13 = resources3.getString(R.string.tv_subscription_rule);
                                            kotlin.jvm.internal.m.e(string13, "getString(...)");
                                            n.d(string13, j18, sVar7, 0);
                                            String string14 = resources3.getString(R.string.ld_plus_billing_alert);
                                            kotlin.jvm.internal.m.e(string14, "getString(...)");
                                            n.d(string14, j18, sVar7, 0);
                                            String string15 = resources3.getString(R.string.xiaomi_billing_alert);
                                            kotlin.jvm.internal.m.e(string15, "getString(...)");
                                            n.d(string15, j18, sVar7, 0);
                                        } else {
                                            sVar7.W();
                                        }
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        }, true, 812978252), 3);
                        final int i15 = 1;
                        l0.h.p(LazyColumn, null, new t1.d(new fz.f() { // from class: gr.b
                            @Override // fz.f
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                switch (i15) {
                                    case 0:
                                        l0.c item = (l0.c) obj3;
                                        l1.n nVar2 = (l1.n) obj4;
                                        int iIntValue = ((Integer) obj5).intValue();
                                        kotlin.jvm.internal.m.f(item, "$this$item");
                                        l1.s sVar5 = (l1.s) nVar2;
                                        if (sVar5.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            Resources resources2 = resources;
                                            String string3 = resources2.getString(R.string.premium_efficiency);
                                            kotlin.jvm.internal.m.e(string3, "getString(...)");
                                            float f16 = 44;
                                            z1.o oVar2 = z1.o.f58481a;
                                            z1.r rVarE = e2.e(j0.c.E(oVar2, f16, 40, f16, CropImageView.DEFAULT_ASPECT_RATIO, 8), 1.0f);
                                            long jA = j3.A(22);
                                            long j16 = j15;
                                            n.f(3072, j16, jA, string3, sVar5, rVarE);
                                            float f17 = 18;
                                            z1.r rVarB = d2.h.b(d0.n.h(e2.e(j0.c.C(j0.c.E(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, 24, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 20, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), g2.x.c(f0.e(4294950912L), 0.12f), r0.f.d(f17)), r0.f.d(f17));
                                            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar5, 0);
                                            int iHashCode3 = Long.hashCode(sVar5.T);
                                            q1 q1VarL3 = sVar5.l();
                                            z1.r rVarC3 = z1.a.c(sVar5, rVarB);
                                            y2.k.J.getClass();
                                            y2.i iVar2 = y2.j.f56913b;
                                            sVar5.h0();
                                            if (sVar5.S) {
                                                sVar5.k(iVar2);
                                            } else {
                                                sVar5.r0();
                                            }
                                            y2.h hVar7 = y2.j.f56917f;
                                            l1.t.J(hVar7, uVarA, sVar5);
                                            y2.h hVar8 = y2.j.f56916e;
                                            l1.t.J(hVar8, q1VarL3, sVar5);
                                            y2.h hVar9 = y2.j.f56918g;
                                            if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode3))) {
                                                defpackage.e.A(iHashCode3, sVar5, iHashCode3, hVar9);
                                            }
                                            y2.h hVar10 = y2.j.f56915d;
                                            l1.t.J(hVar10, rVarC3, sVar5);
                                            z1.r rVarE2 = e2.e(oVar2, 1.0f);
                                            long j17 = g2.x.f28621h;
                                            z1.r rVarG = e2.g(d0.n.h(rVarE2, j17, f0.f28556b), 42);
                                            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.M, sVar5, 48);
                                            int iHashCode4 = Long.hashCode(sVar5.T);
                                            q1 q1VarL4 = sVar5.l();
                                            z1.r rVarC4 = z1.a.c(sVar5, rVarG);
                                            sVar5.h0();
                                            if (sVar5.S) {
                                                sVar5.k(iVar2);
                                            } else {
                                                sVar5.r0();
                                            }
                                            l1.t.J(hVar7, a2VarA, sVar5);
                                            l1.t.J(hVar8, q1VarL4, sVar5);
                                            if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode4))) {
                                                defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar9);
                                            }
                                            l1.t.J(hVar10, rVarC4, sVar5);
                                            if (1.0f <= 0.0d) {
                                                k0.a.a("invalid weight; must be greater than zero");
                                            }
                                            j0.c.g(sVar5, new i1(1.0f, true));
                                            String string4 = resources2.getString(R.string.free);
                                            kotlin.jvm.internal.m.e(string4, "getString(...)");
                                            d0 d0Var = ua.f31167a;
                                            y0 y0Var = (y0) sVar5.j(d0Var);
                                            long jA2 = j3.A(16);
                                            n3.s sVar6 = n3.s.L;
                                            float f18 = 86;
                                            ua.b(string4, e2.s(oVar2, f18), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a(y0Var, j16, jA2, sVar6, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar5, 48, 0, 65532);
                                            String string5 = resources2.getString(R.string.premium);
                                            kotlin.jvm.internal.m.e(string5, "getString(...)");
                                            ua.b(string5, e2.s(oVar2, f18), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar5.j(d0Var), j16, j3.A(16), sVar6, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar5, 48, 0, 65532);
                                            sVar5.p(true);
                                            long jC = g2.x.c(f0.e(4294950912L), 0.13f);
                                            String string6 = resources2.getString(R.string.free_vs_premium_1);
                                            kotlin.jvm.internal.m.e(string6, "getString(...)");
                                            c3 c3Var = v1.f31180a;
                                            n.e(jC, string6, ((s1) sVar5.j(c3Var)).f31017a, j16, R.drawable.ic_billing_page_check_small, sVar5, 6);
                                            String string7 = resources2.getString(R.string.free_vs_premium_2);
                                            kotlin.jvm.internal.m.e(string7, "getString(...)");
                                            n.e(j17, string7, ((s1) sVar5.j(c3Var)).f31017a, j16, R.drawable.ic_billing_page_check_small, sVar5, 6);
                                            long jC2 = g2.x.c(f0.e(4294950912L), 0.13f);
                                            String string8 = resources2.getString(R.string.free_vs_premium_3);
                                            kotlin.jvm.internal.m.e(string8, "getString(...)");
                                            n.e(jC2, string8, ((s1) sVar5.j(c3Var)).f31017a, j16, R.drawable.ic_sub_intro_lock, sVar5, 6);
                                            String string9 = resources2.getString(R.string.free_vs_premium_4);
                                            kotlin.jvm.internal.m.e(string9, "getString(...)");
                                            n.e(j17, string9, ((s1) sVar5.j(c3Var)).f31017a, j16, R.drawable.ic_sub_intro_lock, sVar5, 6);
                                            long jC3 = g2.x.c(f0.e(4294950912L), 0.13f);
                                            String string10 = resources2.getString(R.string.free_vs_premium_5);
                                            kotlin.jvm.internal.m.e(string10, "getString(...)");
                                            n.e(jC3, string10, ((s1) sVar5.j(c3Var)).f31017a, j16, R.drawable.ic_sub_intro_lock, sVar5, 6);
                                            String string11 = resources2.getString(R.string.free_vs_premium_6);
                                            kotlin.jvm.internal.m.e(string11, "getString(...)");
                                            n.e(j17, string11, ((s1) sVar5.j(c3Var)).f31017a, j16, R.drawable.ic_sub_intro_lock, sVar5, 6);
                                            sVar5.p(true);
                                        } else {
                                            sVar5.W();
                                        }
                                        break;
                                    default:
                                        l0.c item2 = (l0.c) obj3;
                                        l1.n nVar3 = (l1.n) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        kotlin.jvm.internal.m.f(item2, "$this$item");
                                        l1.s sVar7 = (l1.s) nVar3;
                                        if (sVar7.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                            j0.c.g(sVar7, e2.g(z1.o.f58481a, 32));
                                            Resources resources3 = resources;
                                            String string12 = resources3.getString(R.string.subs_can_be_cancel_anytime_for_any_reason);
                                            kotlin.jvm.internal.m.e(string12, "getString(...)");
                                            long j18 = j15;
                                            n.d(string12, j18, sVar7, 0);
                                            String string13 = resources3.getString(R.string.tv_subscription_rule);
                                            kotlin.jvm.internal.m.e(string13, "getString(...)");
                                            n.d(string13, j18, sVar7, 0);
                                            String string14 = resources3.getString(R.string.ld_plus_billing_alert);
                                            kotlin.jvm.internal.m.e(string14, "getString(...)");
                                            n.d(string14, j18, sVar7, 0);
                                            String string15 = resources3.getString(R.string.xiaomi_billing_alert);
                                            kotlin.jvm.internal.m.e(string15, "getString(...)");
                                            n.d(string15, j18, sVar7, 0);
                                        } else {
                                            sVar7.W();
                                        }
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        }, true, -1422066547), 3);
                        l0.h.p(LazyColumn, null, new t1.d(new a(resources, j15, onTermsOfUseClick, onPrivacyPolicyClick), true, 637855950), 3);
                        return qy.b0.f48488a;
                    }
                };
                str2 = str5;
                aVar = onBillingClick;
                sVar2 = sVar3;
                sVar2.o0(obj);
            }
            l1.s sVar5 = sVar2;
            ue.f.a(rVarD2, wVarA2, null, null, null, null, false, null, (fz.c) obj, sVar5, 6, 508);
            sVar = sVar5;
            z1.r rVarV2 = j0.c.v(j0.r.f35391a.a(oVar, z1.c.H));
            q0 q0VarD3 = j0.o.d(jVar, false);
            iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarV2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, q0VarD3, sVar);
            l1.t.J(hVar3, q1VarL3, sVar);
            if (sVar.S) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
            } else {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar4);
            }
            l1.t.J(hVar6, rVarC3, sVar);
            boolean zBooleanValue2 = ((Boolean) b3Var2.getValue()).booleanValue();
            objQ3 = sVar.Q();
            if (objQ3 == gVar) {
                objQ3 = new n2(20);
                sVar.o0(objQ3);
            }
            l1 l1VarN2 = f1.n((fz.c) objQ3);
            objQ4 = sVar.Q();
            if (objQ4 == gVar) {
                objQ4 = new n2(21);
                sVar.o0(objQ4);
            }
            a0.j0.d(zBooleanValue2, null, l1VarN2, f1.t((fz.c) objQ4), null, t1.e.d(1617802333, new dl.h(str2, aVar), sVar), sVar, 200064, 18);
            sVar.p(true);
            sVar.p(true);
        } else {
            sVar = sVar3;
            aVar = onBillingClick;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            final fz.a aVar2 = aVar;
            x1VarT.f39502d = new fz.e() { // from class: gr.l
                @Override // fz.e
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    n.h(list, list2, list3, list4, str, f5, curLocalizedResource, aVar2, onTermsOfUseClick, onPrivacyPolicyClick, (l1.n) obj2, l1.t.M(i11 | 1));
                    return qy.b0.f48488a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v22, types: [l1.n] */
    /* JADX WARN: Type inference failed for: r1v14, types: [l1.s] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r4v45, types: [l1.s] */
    /* JADX WARN: Type inference failed for: r4v46, types: [l1.s] */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner] */
    /* JADX WARN: Type inference failed for: r9v1, types: [l1.n, l1.s] */
    /* JADX WARN: Type inference failed for: r9v2, types: [l1.s] */
    /* JADX WARN: Type inference failed for: r9v7, types: [l1.s] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void i(fz.a onBack, fz.c chooseLanguage, fz.a onTermsOfUseClick, fz.a onPrivacyPolicyClick, fz.e onSubscriptionSuccess, ni.m mVar, gp.l1 l1Var, l1.n nVar, int i11) {
        ni.m mVar2;
        gp.l1 l1Var2;
        ?? r9;
        gp.l1 l1Var3;
        int i12;
        ni.m mVar3;
        ?? r11;
        fz.c cVar;
        Object obj;
        boolean z11;
        boolean z12;
        ?? r12;
        gp.l1 l1Var4;
        ?? r13;
        b1 b1Var;
        z2.i1 i1Var;
        kotlin.jvm.internal.m.f(onBack, "onBack");
        kotlin.jvm.internal.m.f(chooseLanguage, "chooseLanguage");
        kotlin.jvm.internal.m.f(onTermsOfUseClick, "onTermsOfUseClick");
        kotlin.jvm.internal.m.f(onPrivacyPolicyClick, "onPrivacyPolicyClick");
        kotlin.jvm.internal.m.f(onSubscriptionSuccess, "onSubscriptionSuccess");
        ?? r14 = (l1.s) nVar;
        r14.f0(1788987296);
        int i13 = i11 | (r14.h(onBack) ? 4 : 2) | (r14.h(chooseLanguage) ? 32 : 16) | (r14.h(onTermsOfUseClick) ? 256 : 128) | (r14.h(onPrivacyPolicyClick) ? 2048 : 1024) | (r14.h(onSubscriptionSuccess) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | 589824;
        if (r14.T(i13 & 1, (599187 & i13) != 599186)) {
            r14.Y();
            int i14 = i11 & 1;
            Object obj2 = l1.m.f39353a;
            if (i14 == 0 || r14.C()) {
                Object objQ = r14.Q();
                if (objQ == obj2) {
                    objQ = new fk.a(20);
                    r14.o0(objQ);
                }
                fz.a aVar = (fz.a) objQ;
                r14.d0(-1614864554);
                ?? r15 = LocalViewModelStoreOwner.INSTANCE;
                int i15 = LocalViewModelStoreOwner.$stable;
                ViewModelStoreOwner current = r15.getCurrent(r14, i15);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(z.a(ni.m.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(r14), aVar);
                r14.p(false);
                ni.m mVar4 = (ni.m) viewModelA;
                Object objQ2 = r14.Q();
                if (objQ2 == obj2) {
                    objQ2 = new fk.a(21);
                    r14.o0(objQ2);
                }
                fz.a aVar2 = (fz.a) objQ2;
                r14.d0(-1614864554);
                ViewModelStoreOwner current2 = r15.getCurrent(r14, i15);
                if (current2 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA2 = i20.b.a(z.a(gp.l1.class), current2.getViewModelStore(), null, i20.a.a(current2), null, q10.b.a(r14), aVar2);
                r14.p(false);
                l1Var3 = (gp.l1) viewModelA2;
                i12 = i13 & (-4128769);
                mVar3 = mVar4;
            } else {
                r14.W();
                l1Var3 = l1Var;
                i12 = i13 & (-4128769);
                mVar3 = mVar;
            }
            r14.q();
            r14.d0(-1168520582);
            e20.a aVarA = q10.b.a(r14);
            r14.d0(-1633490746);
            boolean zF = r14.f(null) | r14.f(aVarA);
            Object objQ3 = r14.Q();
            if (zF || objQ3 == obj2) {
                objQ3 = w4.c.e(ur.a.class, aVarA, null, null, r14);
            }
            r14.p(false);
            r14.p(false);
            ur.a aVar3 = (ur.a) objQ3;
            Context context = (Context) r14.j(AndroidCompositionLocals_androidKt.f1200b);
            c3 c3Var = g1.f58547h;
            final v3.c cVar2 = (v3.c) r14.j(c3Var);
            f.n nVar2 = (f.n) r14.j(ju.f.f37369c);
            Object objQ4 = r14.Q();
            if (objQ4 == obj2) {
                objQ4 = l1.t.B(Boolean.FALSE);
                r14.o0(objQ4);
            }
            b1 b1Var2 = (b1) objQ4;
            int i16 = i12;
            Object objQ5 = r14.Q();
            if (objQ5 == obj2) {
                objQ5 = l1.t.q(r14);
                r14.o0(objQ5);
            }
            j9.v vVarH = cf.x.H(new c0[0], r14);
            Object objQ6 = r14.Q();
            if (objQ6 == obj2) {
                objQ6 = l1.t.B(Boolean.FALSE);
                r14.o0(objQ6);
            }
            b1 b1Var3 = (b1) objQ6;
            Object objQ7 = r14.Q();
            if (objQ7 == obj2) {
                objQ7 = l1.t.B(new v3.f(0));
                r14.o0(objQ7);
            }
            final b1 b1Var4 = (b1) objQ7;
            u1 u1Var = (u1) ((q2) r14.j(g1.f58558t));
            if (u1Var.f58680b == null) {
                fz.a aVar4 = u1Var.f58679a;
                if (aVar4 == null || (i1Var = (z2.i1) aVar4.invoke()) == null) {
                    i1Var = z2.i1.f58589c;
                }
                u1Var.f58680b = l1.t.B(i1Var);
                u1Var.f58679a = null;
            }
            k1 k1Var = u1Var.f58680b;
            kotlin.jvm.internal.m.c(k1Var);
            int i17 = (int) (((z2.i1) k1Var.getValue()).f58590a & 4294967295L);
            v3.c cVar3 = (v3.c) r14.j(c3Var);
            kotlin.jvm.internal.m.f(cVar3, "<this>");
            final float fQ = cVar3.Q(i17);
            Object objQ8 = r14.Q();
            if (objQ8 == obj2) {
                objQ8 = l1.t.B(null);
                r14.o0(objQ8);
            }
            b1 b1Var5 = (b1) objQ8;
            Object objQ9 = r14.Q();
            if (objQ9 == obj2) {
                objQ9 = l1.t.B(Locale.getDefault().getLanguage());
                r14.o0(objQ9);
            }
            b1 b1Var6 = (b1) objQ9;
            boolean zF2 = r14.f((String) b1Var6.getValue());
            Object objQ10 = r14.Q();
            if (zF2 || objQ10 == obj2) {
                int[] iArr = bq.r.f4959a;
                String str = (String) b1Var6.getValue();
                kotlin.jvm.internal.m.e(str, "SplashChooseLanguageScreen$lambda$17(...)");
                objQ10 = l1.t.B(bq.m.w(context, str));
                r14.o0(objQ10);
            }
            b1 b1Var7 = (b1) objQ10;
            Object objQ11 = r14.Q();
            if (objQ11 == obj2) {
                objQ11 = p0.s(0.5f, r14);
            }
            l1.g1 g1Var = (l1.g1) objQ11;
            b1 b1VarO = l1.t.o(mVar3.Z, r14);
            b1 b1VarO2 = l1.t.o(mVar3.O, r14);
            b1 b1VarO3 = l1.t.o(mVar3.S, r14);
            Object objQ12 = r14.Q();
            if (objQ12 == obj2) {
                objQ12 = l1.t.B(Boolean.FALSE);
                r14.o0(objQ12);
            }
            b1 b1Var8 = (b1) objQ12;
            ni.m mVar5 = mVar3;
            ni.h hVar = (ni.h) b1VarO.getValue();
            if (!kotlin.jvm.internal.m.a(hVar, ni.c.f43806a)) {
                if (kotlin.jvm.internal.m.a(hVar, ni.g.f43810a)) {
                    e0.A(aVar3, "ld_first_enter_subscribe_failure");
                } else if (kotlin.jvm.internal.m.a(hVar, ni.d.f43807a)) {
                    b1Var2.setValue(Boolean.TRUE);
                } else if (kotlin.jvm.internal.m.a(hVar, ni.e.f43808a)) {
                    b1Var2.setValue(Boolean.FALSE);
                } else {
                    if (!kotlin.jvm.internal.m.a(hVar, ni.f.f43809a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!((Boolean) b1Var8.getValue()).booleanValue()) {
                        b1Var8.setValue(Boolean.TRUE);
                        aVar3.c("ld_first_enter_subscribe_success", new m9(26));
                        b1Var2.setValue(Boolean.FALSE);
                        LanguageItem languageItem = (LanguageItem) b1Var5.getValue();
                        if (languageItem != null) {
                            onSubscriptionSuccess.invoke(languageItem, (com.android.billingclient.api.o) b1VarO2.getValue());
                        }
                    }
                }
            }
            if (((Boolean) b1Var2.getValue()).booleanValue()) {
                r14.d0(-525974461);
                r11 = 0;
                tv.a.c(r14, 0);
            } else {
                r11 = 0;
                r14.d0(-531299486);
            }
            r14.p(r11);
            z1.o oVar = z1.o.f58481a;
            z1.r rVarV = j0.c.v(j0.c.F(oVar));
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, r14, r11);
            int iHashCode = Long.hashCode(r14.T);
            q1 q1VarL = r14.l();
            z1.r rVarC = z1.a.c(r14, rVarV);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            r14.h0();
            if (r14.S) {
                r14.k(iVar);
            } else {
                r14.r0();
            }
            y2.h hVar2 = y2.j.f56917f;
            l1.t.J(hVar2, uVarA, r14);
            y2.h hVar3 = y2.j.f56916e;
            l1.t.J(hVar3, q1VarL, r14);
            y2.h hVar4 = y2.j.f56918g;
            b1 b1Var9 = b1Var5;
            if (r14.S || !kotlin.jvm.internal.m.a(r14.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, r14, iHashCode, hVar4);
            }
            y2.h hVar5 = y2.j.f56915d;
            l1.t.J(hVar5, rVarC, r14);
            boolean zH = r14.h(vVarH);
            Object objQ13 = r14.Q();
            if (zH || objQ13 == obj2) {
                objQ13 = new fu.j0(vVarH, b1Var3, g1Var, 1);
                r14.o0(objQ13);
            }
            l1.t.c(vVarH, (fz.c) objQ13, r14);
            WeakHashMap weakHashMap = o2.f35353v;
            final int i18 = j0.b.e(r14).f35359f.e().f48794b;
            final int i19 = j0.b.e(r14).f35358e.e().f48796d;
            z1.i iVar2 = z1.c.M;
            boolean zC = r14.c(fQ) | r14.f(cVar2) | r14.d(i18) | r14.d(i19);
            Object objQ14 = r14.Q();
            if (zC || objQ14 == obj2) {
                objQ14 = new fz.c() { // from class: gr.o
                    @Override // fz.c
                    public final Object invoke(Object obj3) {
                        w2.x it = (w2.x) obj3;
                        kotlin.jvm.internal.m.f(it, "it");
                        int iM = (int) (it.m() & 4294967295L);
                        v3.c cVar4 = cVar2;
                        b1Var4.setValue(new v3.f(fQ - (cVar4.Q(i19) + (cVar4.Q(i18) + cVar4.Q(iM)))));
                        return qy.b0.f48488a;
                    }
                };
                r14.o0(objQ14);
            }
            z1.r rVarN = a0.n(oVar, (fz.c) objQ14);
            a2 a2VarA = z1.a(j0.i.f35303a, iVar2, r14, 48);
            int iHashCode2 = Long.hashCode(r14.T);
            q1 q1VarL2 = r14.l();
            z1.r rVarC2 = z1.a.c(r14, rVarN);
            r14.h0();
            if (r14.S) {
                r14.k(iVar);
            } else {
                r14.r0();
            }
            l1.t.J(hVar2, a2VarA, r14);
            l1.t.J(hVar3, q1VarL2, r14);
            if (r14.S || !kotlin.jvm.internal.m.a(r14.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, r14, iHashCode2, hVar4);
            }
            l1.t.J(hVar5, rVarC2, r14);
            boolean zH2 = r14.h(vVarH) | ((i16 & 14) == 4);
            Object objQ15 = r14.Q();
            if (zH2 || objQ15 == obj2) {
                objQ15 = new p(vVarH, onBack, 0);
                r14.o0(objQ15);
            }
            k7.h((fz.a) objQ15, null, false, null, f29723a, r14, 196608, 30);
            Object objQ16 = r14.Q();
            if (objQ16 == obj2) {
                objQ16 = new u2(g1Var, 1);
                r14.o0(objQ16);
            }
            fz.a aVar5 = (fz.a) objQ16;
            float f5 = 16;
            z1.r rVarE = j0.c.E(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, 10);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            z1.r rVarG = e2.g(w4.c.p(1.0f, true, rVarE), 8);
            float f11 = -4;
            Object objQ17 = r14.Q();
            if (objQ17 == obj2) {
                objQ17 = new n2(22);
                r14.o0(objQ17);
            }
            gp.l1 l1Var5 = l1Var3;
            g7.c(aVar5, rVarG, 0L, 0L, 0, f11, (fz.c) objQ17, r14, 1769478, 28);
            if (((Boolean) b1Var3.getValue()).booleanValue()) {
                r14.d0(-1291161460);
                boolean z13 = (i16 & 112) == 32;
                Object objQ18 = r14.Q();
                if (z13 || objQ18 == obj2) {
                    cVar = chooseLanguage;
                    b1Var = b1Var9;
                    objQ18 = new bp.q(b1Var, cVar, 4);
                    r14.o0(objQ18);
                } else {
                    cVar = chooseLanguage;
                    b1Var = b1Var9;
                }
                b1Var9 = b1Var;
                obj = obj2;
                k7.h((fz.a) objQ18, null, false, null, f29724b, r14, 196608, 30);
                r14.p(false);
                z12 = true;
                z11 = false;
                r12 = r14;
            } else {
                cVar = chooseLanguage;
                obj = obj2;
                r14.d0(-1290645744);
                Object objQ19 = r14.Q();
                if (objQ19 == obj) {
                    objQ19 = new ju.d(25);
                    r14.o0(objQ19);
                }
                z11 = false;
                k7.h((fz.a) objQ19, null, false, null, f29725c, r14, 196998, 26);
                ?? r16 = r14;
                r16.p(false);
                z12 = true;
                r12 = r16;
            }
            r12.p(z12);
            boolean zF3 = r12.f(b1VarO3);
            j9.v vVar = vVarH;
            boolean zH3 = zF3 | ((i16 & 112) == 32 ? true : z11) | r12.h(vVar) | r12.h(aVar3) | r12.f(b1Var7) | r12.h(mVar5) | r12.h(l1Var5) | r12.h(nVar2) | ((i16 & 896) == 256 ? true : z11) | ((i16 & 7168) == 2048 ? true : z11);
            Object objQ20 = r12.Q();
            if (zH3 || objQ20 == obj) {
                ?? r17 = r12;
                q qVar = new q(b1VarO3, cVar, vVar, b1Var9, b1Var6, aVar3, mVar5, l1Var5, nVar2, onTermsOfUseClick, onPrivacyPolicyClick, b1Var4, b1Var7);
                vVar = vVar;
                l1Var4 = l1Var5;
                r17.o0(qVar);
                objQ20 = qVar;
                r13 = r17;
            } else {
                r13 = r12;
                l1Var4 = l1Var5;
            }
            ?? r18 = r13;
            com.bumptech.glide.e.c(vVar, "chooseLanguage", null, null, null, null, null, null, (fz.c) objQ20, r18, 48);
            ?? r19 = r18;
            r19.p(true);
            l1Var2 = l1Var4;
            mVar2 = mVar5;
            r9 = r19;
        } else {
            r14.W();
            mVar2 = mVar;
            l1Var2 = l1Var;
            r9 = r14;
        }
        x1 x1VarT = r9.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bt.b1(onBack, chooseLanguage, onTermsOfUseClick, onPrivacyPolicyClick, onSubscriptionSuccess, mVar2, l1Var2, i11, 7);
        }
    }

    public static final void j(boolean z11, fz.a onClickStart, fz.a onClickLogin, fz.a onClickLogout, l1.n nVar, int i11) {
        int i12;
        fz.a aVar;
        l1.s sVar;
        int i13;
        Object obj;
        boolean z12;
        kotlin.jvm.internal.m.f(onClickStart, "onClickStart");
        kotlin.jvm.internal.m.f(onClickLogin, "onClickLogin");
        kotlin.jvm.internal.m.f(onClickLogout, "onClickLogout");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-357917957);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.g(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.h(onClickStart) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar2.h(onClickLogin) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.h(onClickLogout) ? 2048 : 1024;
        }
        if (sVar2.T(i12 & 1, (i12 & 1171) != 1170)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarV = j0.c.v(j0.c.F(j0.c.E(e2.d(oVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 16, 7)));
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar2, 48);
            int iHashCode = Long.hashCode(sVar2.T);
            q1 q1VarL = sVar2.l();
            z1.r rVarC = z1.a.c(sVar2, rVarV);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(y2.j.f56917f, uVarA, sVar2);
            l1.t.J(y2.j.f56916e, q1VarL, sVar2);
            y2.h hVar = y2.j.f56918g;
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar2);
            j0.c.g(sVar2, j0.v.a(oVar, 1.0f));
            ua.b(ub.a.e0(sVar2, R.string.welcome), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(ua.f31167a), 0L, j3.A(26), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar2, 0, 0, 65534);
            d0.n.c(se.k.y(R.drawable.ic_splash_start_logo, sVar2, 0), null, d2.h.i(oVar, 0.8f, 0.8f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar2, 440, 120);
            j0.c.g(sVar2, j0.v.a(oVar, 1.5f));
            ad.p pVarL = gb.r.L(new ad.r(R.raw.anim_splash_start), sVar2);
            ad.i iVarE = ff.h.e((wc.h) pVarL.getValue(), false, CropImageView.DEFAULT_ASPECT_RATIO, sVar2, 958);
            wc.h hVar2 = (wc.h) pVarL.getValue();
            boolean zF = sVar2.f(iVarE);
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                objQ = new w6(iVarE, 5);
                sVar2.o0(objQ);
            }
            j3.a(hVar2, (fz.a) objQ, e2.n(oVar, 290), null, null, null, sVar2, 384, 0, 131064);
            l1.s sVar3 = sVar2;
            Object objQ2 = sVar3.Q();
            if (objQ2 == gVar) {
                i13 = 2;
                Integer[] numArr = {Integer.valueOf(R.string.accelerated_learning), Integer.valueOf(R.string.effective_results_a), Integer.valueOf(R.string.convenient_to_use_a)};
                sVar3.o0(numArr);
                obj = numArr;
            } else {
                i13 = 2;
                obj = objQ2;
            }
            Integer[] numArr2 = (Integer[]) obj;
            Object objQ3 = sVar3.Q();
            if (objQ3 == gVar) {
                z12 = false;
                objQ3 = defpackage.e.v(0, sVar3);
            } else {
                z12 = false;
            }
            a1 a1Var = (a1) objQ3;
            Object objQ4 = sVar3.Q();
            if (objQ4 == gVar) {
                objQ4 = new gp.a(a1Var, null, 2);
                sVar3.o0(objQ4);
            }
            l1.t.f((fz.e) objQ4, qy.b0.f48488a, sVar3);
            Integer numValueOf = Integer.valueOf(((h1) a1Var).l());
            Object objQ5 = sVar3.Q();
            if (objQ5 == gVar) {
                objQ5 = new n2(24);
                sVar3.o0(objQ5);
            }
            boolean z13 = z12;
            int i14 = i13;
            a0.o.b(numValueOf, null, (fz.c) objQ5, null, null, null, t1.e.d(-6024645, new bt.t(numArr2, 2), sVar3), sVar3, 1573248, 58);
            j0.c.g(sVar3, j0.v.a(oVar, 2.0f));
            float f5 = 32;
            iu.k.e(onClickStart, e2.e(j0.c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, i14), 1.0f), false, 0L, null, f29726d, sVar3, ((i12 >> 3) & 14) | 196656, 28);
            boolean z14 = ((i12 & 896) == 256 ? true : z13) | ((i12 & 14) == 4 ? true : z13) | ((i12 & 7168) == 2048 ? true : z13);
            Object objQ6 = sVar3.Q();
            if (z14 || objQ6 == gVar) {
                aVar = onClickLogin;
                objQ6 = new w(z11, aVar, onClickLogout, 0);
                sVar3.o0(objQ6);
            } else {
                aVar = onClickLogin;
            }
            k7.m((fz.a) objQ6, e2.e(j0.c.C(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 4, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), f5, CropImageView.DEFAULT_ASPECT_RATIO, i14), 1.0f), false, null, null, null, t1.e.d(493026926, new dt.h(z11, 1), sVar3), sVar3, 805306416, 508);
            sVar3.p(true);
            sVar = sVar3;
        } else {
            aVar = onClickLogin;
            sVar2.W();
            sVar = sVar2;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new x(i11, 0, onClickStart, aVar, onClickLogout, z11);
        }
    }

    public static final String k(com.android.billingclient.api.o oVar) {
        ArrayList arrayList;
        com.android.billingclient.api.n nVar;
        com.android.billingclient.api.m mVar;
        ArrayList arrayList2;
        com.android.billingclient.api.l lVar;
        String str;
        return (oVar == null || (arrayList = oVar.f7569h) == null || (nVar = (com.android.billingclient.api.n) ry.m.q0(arrayList)) == null || (mVar = nVar.f7561b) == null || (arrayList2 = mVar.f7554a) == null || (lVar = (com.android.billingclient.api.l) ry.m.z0(arrayList2)) == null || (str = lVar.f7548a) == null) ? BuildConfig.VERSION_NAME : str;
    }

    public static final void g(float f5, Resources curLocalizedResource, ni.m mVar, gp.l1 l1Var, fz.c onBillingClick, fz.a onTermsOfUseClick, fz.a onPrivacyPolicyClick, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(curLocalizedResource, "curLocalizedResource");
        kotlin.jvm.internal.m.f(l1Var, EHjhWcesDUIsIw.NOTJHuZhQirJlKQ);
        kotlin.jvm.internal.m.f(onBillingClick, "onBillingClick");
        kotlin.jvm.internal.m.f(onTermsOfUseClick, "onTermsOfUseClick");
        kotlin.jvm.internal.m.f(onPrivacyPolicyClick, "onPrivacyPolicyClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-615887152);
        int i12 = i11 | (sVar.c(f5) ? 4 : 2) | (sVar.h(curLocalizedResource) ? 32 : 16) | (sVar.h(mVar) ? 256 : 128) | (sVar.h(onBillingClick) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar.h(onTermsOfUseClick) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar.h(onPrivacyPolicyClick) ? 1048576 : 524288);
        if (sVar.T(i12 & 1, (598163 & i12) != 598162)) {
            b1 b1VarO = l1.t.o(mVar.K, sVar);
            List listL = ns.o.L(curLocalizedResource.getString(R.string.welcome_billing_benefit_1), curLocalizedResource.getString(R.string.welcome_billing_benefit_2), curLocalizedResource.getString(R.string.welcome_billing_benefit_3), curLocalizedResource.getString(R.string.welcome_billing_benefit_4));
            List listL2 = ns.o.L(curLocalizedResource.getString(R.string.sell_point_1), curLocalizedResource.getString(R.string.sell_point_2), curLocalizedResource.getString(R.string.sell_point_3));
            List listL3 = ns.o.L(curLocalizedResource.getString(R.string.sell_point_1_detail), curLocalizedResource.getString(R.string.sell_point_2_detail), curLocalizedResource.getString(R.string.sell_point_3_detail));
            List listL4 = ns.o.L(Integer.valueOf(R.drawable.billing_welcome_point_1), Integer.valueOf(R.drawable.billing_welcome_point_2), Integer.valueOf(R.drawable.billing_welcome_point_3));
            String strK = k((com.android.billingclient.api.o) b1VarO.getValue());
            boolean zF = sVar.f(b1VarO) | ((i12 & 57344) == 16384);
            Object objQ = sVar.Q();
            if (zF || objQ == l1.m.f39353a) {
                objQ = new bp.q(b1VarO, onBillingClick, 3);
                sVar.o0(objQ);
            }
            int i13 = i12 << 9;
            h(listL, listL4, listL2, listL3, strK, f5, curLocalizedResource, (fz.a) objQ, onTermsOfUseClick, onPrivacyPolicyClick, sVar, ((i12 << 15) & 4128768) | (234881024 & i13) | (i13 & 1879048192));
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new g(f5, curLocalizedResource, mVar, l1Var, onBillingClick, onTermsOfUseClick, onPrivacyPolicyClick, i11);
        }
    }
}
