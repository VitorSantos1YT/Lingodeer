package com.lingo.lingoskill.ptskill.ui.syllable;

import android.content.res.Resources;
import android.os.Bundle;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import b0.b0;
import b0.h0;
import b0.u0;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import fu.i0;
import g2.x;
import h1.k7;
import h1.p7;
import j0.e2;
import j0.u;
import java.util.List;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import l1.b1;
import l1.n;
import l1.q1;
import l1.s;
import l1.t;
import l1.x1;
import mt.h3;
import ns.o;
import pr.y;
import r0.f;
import se.i;
import se.p;
import t1.e;
import w2.q0;
import xg.d;
import xn.b;
import y2.h;
import y2.j;
import y2.k;
import yn.a;
import z1.c;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class PTNewSyllableIntroductionActivity extends d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f21986t = 0;

    @Override // xg.d
    public final void j(Bundle bundle, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(21311261);
        int i12 = (sVar.h(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            p(null, sVar, i12 & 112);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new y(this, i11, 19, bundle);
        }
    }

    public final void p(a aVar, n nVar, int i11) {
        a aVar2;
        a aVar3;
        int i12;
        a aVar4;
        s sVar = (s) nVar;
        sVar.f0(853052695);
        int i13 = i11 | 2 | (sVar.h(this) ? 32 : 16);
        if (sVar.T(i13 & 1, (i13 & 19) != 18)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, 6);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                aVar3 = (a) ViewModelKt.viewModel(z.a(a.class), current, (String) null, (ViewModelProvider.Factory) null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, sVar, 0, 0);
                i12 = i13 & (-15);
            } else {
                sVar.W();
                i12 = i13 & (-15);
                aVar3 = aVar;
            }
            sVar.q();
            b1 b1VarO = t.o(aVar3.f57865b, sVar);
            if (((Number) b1VarO.getValue()).intValue() < 100) {
                sVar.d0(-28390092);
                r(((Number) b1VarO.getValue()).intValue(), sVar, i12 & 112);
                sVar.p(false);
                aVar4 = aVar3;
            } else {
                sVar.d0(-28304005);
                aVar4 = aVar3;
                p7.a(null, e.d(-1663261569, new b(this, 0), sVar), null, null, null, 0, i.k(sVar, R.color.color_F6F6F6), 0L, null, e.d(38513482, new qu.s(aVar3, 6), sVar), sVar, 805306416, 445);
                sVar.p(false);
            }
            aVar2 = aVar4;
        } else {
            sVar.W();
            aVar2 = aVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new y(this, i11, 20, aVar2);
        }
    }

    public final void q(r rVar, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(1265112961);
        int i12 = (sVar.f(rVar) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            List listL = o.L(new x(i.k(sVar, R.color.color_primary)), new x(i.k(sVar, R.color.colorControlAccent)));
            h0 h0VarG = b0.e.g(b0.e.p(BuildConfig.VERSION_NAME, sVar, 0), CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, b0.e.o(b0.e.r(1000, 0, b0.f3441d, 2), u0.Restart, 4), BuildConfig.VERSION_NAME, sVar, 29112, 0);
            float f5 = 2;
            r rVarH = d0.n.h(e2.g(e2.e(rVar, 1.0f), f5), ((x) listL.get(1)).f28624a, f.d(p.P(sVar, R.dimen.dp_10)));
            q0 q0VarD = j0.o.d(c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, rVarH);
            k.J.getClass();
            y2.i iVar = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(j.f56917f, q0VarD, sVar);
            t.J(j.f56916e, q1VarL, sVar);
            h hVar = j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            t.J(j.f56915d, rVarC, sVar);
            j0.o.a(d0.n.h(e2.g(e2.e(z1.o.f58481a, ((Number) h0VarG.f3553d.getValue()).floatValue()), f5), ((x) ry.m.q0(listL)).f28624a, f.d(p.P(sVar, R.dimen.dp_10))), sVar, 0);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new y(this, i11, 21, rVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00c2  */
    public final void r(int i11, n nVar, int i12) {
        int i13;
        int i14;
        s sVar;
        Object obj;
        int iN;
        s sVar2 = (s) nVar;
        sVar2.f0(1529571548);
        if ((i12 & 6) == 0) {
            i13 = (sVar2.d(i11) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= sVar2.h(this) ? 32 : 16;
        }
        if (sVar2.T(i13 & 1, (i13 & 19) != 18)) {
            Object objQ = sVar2.Q();
            if (objQ == l1.m.f39353a) {
                Resources resources = getResources();
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                if (cf.x.n().keyLanguage == 7 || cf.x.n().keyLanguage == 3 || cf.x.n().keyLanguage == 8 || cf.x.n().keyLanguage == 4 || cf.x.n().keyLanguage == 5 || cf.x.n().keyLanguage == 6) {
                    obj = objQ;
                    obj = objQ;
                    obj = objQ;
                    obj = objQ;
                    obj = objQ;
                    obj = objQ;
                    iN = new int[]{1, 2, 5, 6, 7, 8, 9, 10, 11}[j3.M(9)];
                } else {
                    obj = objQ;
                    iN = j3.N(1, 12);
                }
                String string = resources.getString(resources.getIdentifier(nv.p.j(iN, "download_wait_txt_"), "string", getPackageName()));
                m.e(string, "getString(...)");
                String strD = string;
                if (iN != 1 && iN != 2 && iN != 5 && iN != 6) {
                    switch (iN) {
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                            strD = ep.a.D(getString(R.string.quick_reminder), "\n", string);
                            break;
                    }
                } else {
                    strD = ep.a.D(getString(R.string.quick_reminder), "\n", string);
                }
                sVar2.o0(strD);
                obj = strD;
            }
            obj = objQ;
            String str = (String) obj;
            z1.o oVar = z1.o.f58481a;
            r rVarD = e2.d(oVar, 1.0f);
            u uVarA = j0.t.a(j0.i.f35307e, c.P, sVar2, 54);
            int iHashCode = Long.hashCode(sVar2.T);
            q1 q1VarL = sVar2.l();
            r rVarC = z1.a.c(sVar2, rVarD);
            k.J.getClass();
            y2.i iVar = j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            t.J(j.f56917f, uVarA, sVar2);
            t.J(j.f56916e, q1VarL, sVar2);
            h hVar = j.f56918g;
            if (sVar2.S || !m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            }
            t.J(j.f56915d, rVarC, sVar2);
            d0.n.c(se.k.y(R.drawable.ic_lesson_load_deer, sVar2, 0), BuildConfig.VERSION_NAME, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar2, 56, 124);
            k7.d(e2.g(e2.e(j0.c.C(oVar, p.P(sVar2, R.dimen.dp_32), CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), p.P(sVar2, R.dimen.dp_160)), f.d(p.P(sVar2, R.dimen.dp_8)), null, null, null, e.d(-1618374460, new h3(i11, this, str), sVar2), sVar2, 196608, 28);
            s sVar3 = sVar2;
            i14 = 1;
            sVar3.p(true);
            sVar = sVar3;
        } else {
            s sVar4 = sVar2;
            i14 = 1;
            sVar4.W();
            sVar = sVar4;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new i0(this, i11, i12, i14);
        }
    }
}
