package com.lingo.lingoskill.thaiskill.ui.learn;

import android.os.Bundle;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import bp.f0;
import br.j;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import ff.h;
import fr.j3;
import fz.c;
import g2.v0;
import g2.x;
import h1.k7;
import h1.p7;
import h1.ua;
import j0.e2;
import j0.v1;
import j3.p0;
import j3.y0;
import java.util.List;
import kotlin.jvm.internal.z;
import l1.b1;
import l1.g;
import l1.m;
import l1.n;
import l1.s;
import l1.x1;
import m0.b;
import n3.a0;
import n3.l;
import n3.p;
import nz.k;
import oz.q;
import pr.t;
import pr.y;
import ro.f;
import se.i;
import t1.e;
import uo.a;
import xg.d;
import z1.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class THAISyllableIntroductionActivity extends d {
    public static final /* synthetic */ int M = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f22036t = "ก\nk/k\n[kokai]\n\tข\nkh/k\n[khokhai]\n\tค\nkh/k\n[khokhwai]\n\tฆ\nkh/k\n[khorakhang]\n\tง\nŋ/ŋ\n[ngongu]\n\tจ\nc/t\n[chochan]\n\tฉ\nch/t\n[choching]\n\tช\nch/t\n[chochang]\n\tซ\ns/t\n[soso]\n\tฌ\nch/t\n[chochoe]\n\tญ\ny/n\n[yoying]\n\tฎ\nd/t\n[dochada]\n\tฏ\nt/t\n[topatak]\n\tฑ\nth/t\n[thomontho]\n\tฒ\nth/t\n[thophuthao]\n\tณ\nn/n\n[nonen]\n\tฐ\nth/t\n[thothan]\n\tด\nd/t\n[dodek]\n\tต\nt/t\n[totao]\n\tถ\nth/t\n[thothung]\n\tท\nth/t\n[thothahan]\n\tน\nn/n\n[nonu]\n\tบ\nb/p\n[bobaimai]\n\tธ\nth/t\n[thothong]\n\tป\np/p\n[popla]\n\tผ\nph/-\n[phophueng]\n\tฝ\nf/-\n[fofa]\n\tพ\nph/p\n[phophan]\n\tฟ\nf/p\n[fofan]\n\tภ\nph/p\n[phosamphao]\n\tม\nm/m\n[moma]\n\tย\ny/y\n[yoyak]\n\tร\nr/n\n[roruea]\n\tล\nl/n\n[loling]\n\tว\nw/w\n[wowaen]\n\tศ\ns/t\n[sosala]\n\tษ\ns/t\n[soruesi]\n\tส\ns/t\n[sosuea]\n\tห\nh/-\n[hohip]\n\tฬ\nl/n\n[lochula]\n\tอ\n-/-\n[oang]\n\tฮ\nh/-\n[honokhuk]\n";
    public final String H = "◌ะ\na\n[a]\n\t◌า\naa\n[aa]\n\t◌ิ\ni\n[i]\n\t◌ี\nii\n[ii]\n\t◌ึ\nʉ\n[eu]\n\t◌ื\nʉʉ\n[eueu]\n\t◌ุ\nu\n[u]\n\t◌ู\nuu\n[uu]\n\tเ◌ะ\ne\n[e]\n\tเ◌\nee\n[ee]\n\tแ◌ะ\nɛ\n[ae]\n\tแ◌\nɛɛ\n[aeae]\n\tโ◌ะ\no\n[o]\n\tโ◌\noo\n[oo]\n\tเ◌าะ\nɔ\n[xo]\n\t◌อ\nɔɔ\n[xoxo]\n\tเ◌อะ\nə\n[v]\n\tเ◌อ\nəə\n[vv]\n";
    public final String K = "เ◌ียะ\nia\n[ia]\n\tเ◌ีย\nia, iia\n[iia]\n\tเ◌ือะ\nʉa\n[eua]\n\tเ◌ือ\nʉa, ʉʉa\n[eueua]\n\t◌ัวะ\nua\n[ua]\n\t◌ัว\nua, uua\n[uua]\n\t◌ำ\nam, aam\n[am]\n\tเ◌า\naw\n[aw]\n\tใ◌\nay, aay\n[ai]\n\tไ◌\nay, aay\n[ai2]\n\tฤ\nrʉ\n[reu]\n\tฤา\nrʉʉ\n[reueu]\n\tฦ\nlʉ\n[leu]\n\tฦา\nlʉʉ\n[leueu]\n";
    public final l L = new l(ry.l.A(new a0[]{h.a(R.font.sarabun_medium, null, 14)}));

    @Override // xg.d
    public final void j(Bundle bundle, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(413738155);
        int i12 = (sVar.h(this) ? 32 : 16) | i11;
        if (sVar.T(i12 & 1, (i12 & 17) != 16)) {
            u(null, sVar, i12 & 112);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new y(this, i11, 7, bundle);
        }
    }

    public final void p(a aVar, n nVar, int i11) {
        s sVar;
        s sVar2 = (s) nVar;
        sVar2.f0(1241772031);
        int i12 = (sVar2.h(aVar) ? 4 : 2) | i11 | (sVar2.h(this) ? 32 : 16);
        if (sVar2.T(i12 & 1, (i12 & 19) != 18)) {
            Object objQ = sVar2.Q();
            g gVar = m.f39353a;
            if (objQ == gVar) {
                objQ = q.W0(this.f22036t, new String[]{"\t"}, 0, 6);
                sVar2.o0(objQ);
            }
            List list = (List) objQ;
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                objQ2 = q.W0(this.H, new String[]{"\t"}, 0, 6);
                sVar2.o0(objQ2);
            }
            List list2 = (List) objQ2;
            Object objQ3 = sVar2.Q();
            if (objQ3 == gVar) {
                objQ3 = q.W0(this.K, new String[]{"\t"}, 0, 6);
                sVar2.o0(objQ3);
            }
            List list3 = (List) objQ3;
            b bVar = new b(4);
            float f5 = 16;
            v1 v1Var = new v1(f5, f5, f5, 32);
            boolean zH = sVar2.h(this) | sVar2.h(list) | sVar2.h(aVar) | sVar2.h(list2) | sVar2.h(list3);
            Object objQ4 = sVar2.Q();
            if (zH || objQ4 == gVar) {
                b1.a aVar2 = new b1.a(list, list2, list3, this, aVar, 20);
                sVar2.o0(aVar2);
                objQ4 = aVar2;
            }
            sVar = sVar2;
            md.a.a(bVar, null, null, v1Var, null, null, null, false, null, (c) objQ4, sVar, 0, 1014);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new ro.c(this, aVar, i11, 0);
        }
    }

    public final void q(String str, n nVar, int i11) {
        s sVar;
        s sVar2 = (s) nVar;
        sVar2.f0(-1690787764);
        int i12 = i11 | (sVar2.f(str) ? 4 : 2);
        if (sVar2.T(i12 & 1, (i12 & 3) != 2)) {
            sVar = sVar2;
            ua.b(str, j0.c.E(o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 8, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(ua.f31167a), i.k(sVar2, R.color.second_black), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777214), sVar, (i12 & 14) | 48, 0, 65532);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new ro.g(this, str, i11, 2);
        }
    }

    public final void r(String str, String str2, fz.a aVar, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(614978926);
        int i12 = i11 | (sVar.f(str) ? 4 : 2) | (sVar.f(str2) ? 32 : 16) | (sVar.h(aVar) ? 256 : 128) | (sVar.h(this) ? 2048 : 1024);
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            k7.d(j0.c.j(e2.e(j0.c.A(o.f58481a, 1), 1.0f), 1.0f), null, k7.p(i.k(sVar, R.color.white), sVar, 0), null, null, e.d(-695831328, new j(aVar, str, this, str2, 15), sVar), sVar, 196614, 26);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new t(this, str, str2, aVar, i11);
        }
    }

    public final void s(String str, n nVar, int i11) {
        s sVar;
        s sVar2 = (s) nVar;
        sVar2.f0(-1788130067);
        int i12 = i11 | (sVar2.f(str) ? 4 : 2);
        if (sVar2.T(i12 & 1, (i12 & 3) != 2)) {
            sVar = sVar2;
            ua.b(str, j0.c.C(o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 8, 1), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(ua.f31167a), i.k(sVar2, R.color.primary_black), j3.A(16), n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, (i12 & 14) | 48, 0, 65532);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new ro.g(this, str, i11, 1);
        }
    }

    public final void t(String str, n nVar, int i11) {
        s sVar;
        s sVar2 = (s) nVar;
        sVar2.f0(-1863334265);
        int i12 = i11 | (sVar2.f(str) ? 4 : 2);
        if (sVar2.T(i12 & 1, (i12 & 3) != 2)) {
            sVar = sVar2;
            ua.b(str, j0.c.E(o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 16, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(ua.f31167a), i.k(sVar2, R.color.primary_black), j3.A(18), n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, (i12 & 14) | 48, 0, 65532);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new ro.g(this, str, i11, 0);
        }
    }

    public final void u(a aVar, n nVar, int i11) {
        a aVar2;
        a aVar3;
        a aVar4;
        s sVar = (s) nVar;
        sVar.f0(-358093715);
        int i12 = i11 | 2 | (sVar.h(this) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, 6);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                aVar3 = (a) ViewModelKt.viewModel(z.a(a.class), current, (String) null, (ViewModelProvider.Factory) null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, sVar, 0, 0);
            } else {
                sVar.W();
                aVar3 = aVar;
            }
            sVar.q();
            b1 b1VarO = l1.t.o(aVar3.f53043b, sVar);
            if (((Number) b1VarO.getValue()).floatValue() < 1.0f) {
                sVar.d0(729162023);
                tv.a.g(((Number) b1VarO.getValue()).floatValue(), null, sVar, 0, 6);
                sVar.p(false);
                aVar4 = aVar3;
            } else {
                sVar.d0(729265098);
                aVar4 = aVar3;
                p7.a(null, e.d(-1745881131, new ro.i(this, 0), sVar), null, null, null, 0, 0L, 0L, null, e.d(-34595808, new f(this, aVar3, 1), sVar), sVar, 805306416, 509);
                sVar.p(false);
            }
            aVar2 = aVar4;
        } else {
            sVar.W();
            aVar2 = aVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new ro.c(this, aVar2, i11, 1);
        }
    }

    public final void v(String str, String str2, String str3, String str4, fz.a aVar, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(1972964988);
        int i12 = i11 | (sVar.f(str3) ? 256 : 128) | (sVar.f(str4) ? 2048 : 1024) | (sVar.h(aVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar.h(this) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536);
        if (sVar.T(i12 & 1, (74899 & i12) != 74898)) {
            oz.o oVar = new oz.o("Mmm");
            j3.e eVar = new j3.e();
            k kVar = new k(oz.o.c(oVar, str4));
            int i13 = 0;
            while (kVar.hasNext()) {
                oz.l lVar = (oz.l) kVar.next();
                int i14 = lVar.b().f40532a;
                int i15 = lVar.b().f40533b + 1;
                String strSubstring = str4.substring(i13, i14);
                kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
                eVar.d(strSubstring);
                int i16 = eVar.i(new p0(x.f28620g, 0L, (n3.s) null, (n3.o) null, (p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (u3.l) null, (v0) null, 65534));
                try {
                    String strSubstring2 = str4.substring(i14, i15);
                    kotlin.jvm.internal.m.e(strSubstring2, "substring(...)");
                    eVar.d(strSubstring2);
                    eVar.f(i16);
                    i13 = i15;
                } catch (Throwable th2) {
                    eVar.f(i16);
                    throw th2;
                }
            }
            String strSubstring3 = str4.substring(i13, str4.length());
            kotlin.jvm.internal.m.e(strSubstring3, "substring(...)");
            eVar.d(strSubstring3);
            k7.d(j0.c.E(o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 8, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), null, k7.p(i.k(sVar, R.color.white), sVar, 0), null, null, e.d(398286026, new es.h(aVar, str, this, str2, str3, eVar.j(), 7), sVar), sVar, 196614, 26);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new f0(this, str, str2, str3, str4, aVar, i11);
        }
    }
}
