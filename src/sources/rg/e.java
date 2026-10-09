package rg;

import android.content.Context;
import android.util.Base64;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import gc.h;
import gc.i;
import hc.g;
import kotlin.jvm.internal.m;
import l1.n;
import l1.s;
import l1.x1;
import mt.k6;
import oz.q;
import oz.x;
import wb.k;
import z1.r;
import z2.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f49258a = 64;

    public static final void a(String url, String str, r rVar, n nVar, int i11) {
        s sVar;
        m.f(url, "url");
        s sVar2 = (s) nVar;
        sVar2.f0(1913083167);
        if (((i11 | (sVar2.f(url) ? 4 : 2) | (sVar2.f(str) ? 32 : 16)) & 1171) == 1170 && sVar2.F()) {
            sVar2.W();
            sVar = sVar2;
        } else {
            Object objDecode = (x.s0(url, "data:image", false) && q.v0(url, "base64", false)) ? Base64.decode(q.a1(url, "base64,", url), 0) : url;
            h hVar = new h((Context) sVar2.j(AndroidCompositionLocals_androidKt.f1200b));
            hVar.f29004c = objDecode;
            g gVar = g.f32180c;
            hVar.m = new hc.e();
            hVar.f29015o = null;
            hVar.f29016p = null;
            hVar.f29017q = null;
            hVar.b();
            i iVarA = hVar.a();
            sVar2.e0(-1494234083);
            sVar = sVar2;
            wb.i iVarF = k.f(iVarA, k.e(wb.s.f54930a, sVar2), wb.i.W, null, w2.i.f54515b, null, sVar, 72, 64);
            sVar.p(false);
            j0.c.a(rVar, z1.c.f58467e, t1.e.d(-934771467, new e0.d((v3.c) sVar.j(g1.f58547h), iVarF, str, 2), sVar), sVar, 3126, 4);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k6(url, str, rVar, i11, 15);
        }
    }
}
