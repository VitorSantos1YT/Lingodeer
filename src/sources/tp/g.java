package tp;

import android.content.Context;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsetsController;
import android.widget.ImageView;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hj.v1;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import jp.p0;
import z4.s0;
import z4.w0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements tx.c, uv.s, u8.d, av.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f52461b;

    public /* synthetic */ g(Object obj, int i11) {
        this.f52460a = i11;
        this.f52461b = obj;
    }

    @Override // av.l
    public void a() {
        ((bp.p) this.f52461b).invoke();
    }

    @Override // tx.c
    public void accept(Object obj) {
        int i11 = this.f52460a;
        Object obj2 = this.f52461b;
        switch (i11) {
            case 0:
                Throwable it = (Throwable) obj;
                kotlin.jvm.internal.m.f(it, "it");
                h hVar = (h) obj2;
                lc.d dVar = hVar.O;
                if (dVar != null) {
                    dVar.dismiss();
                }
                String string = hVar.getString(R.string.error);
                kotlin.jvm.internal.m.e(string, "getString(...)");
                ff.h.C(string);
                return;
            default:
                Long it2 = (Long) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                zi.g gVar = (zi.g) obj2;
                mp.b bVar = gVar.f59222a;
                xi.b pinyinElem = gVar.f59223b;
                kotlin.jvm.internal.m.f(pinyinElem, "pinyinElem");
                qy.q qVar = fv.f.f28191a;
                String str = pinyinElem.f56087a;
                kotlin.jvm.internal.m.c(str);
                String str2 = pinyinElem.f56088b;
                kotlin.jvm.internal.m.c(str2);
                String strM = defpackage.e.m(xt.b.a().b(), fv.f.a(pinyinElem.f56089c, str, str2));
                ta.a aVar = gVar.f59227f;
                kotlin.jvm.internal.m.c(aVar);
                ((p0) bVar).H((ImageView) ((v1) aVar).f33450d.f32408d, strM);
                ta.a aVar2 = gVar.f59227f;
                kotlin.jvm.internal.m.c(aVar2);
                w0 w0VarB = s0.b(((v1) aVar2).f33449c);
                ta.a aVar3 = gVar.f59227f;
                kotlin.jvm.internal.m.c(aVar3);
                w0VarB.l(-((v1) aVar3).f33449c.getHeight());
                w0VarB.e(300L);
                w0VarB.i();
                View view = gVar.f59226e;
                if (view != null) {
                    bq.z.b(view, new zi.d(gVar, 2));
                    return;
                } else {
                    kotlin.jvm.internal.m.n("view");
                    throw null;
                }
        }
    }

    @Override // uv.s
    public byte b(int i11) {
        return ((uv.s) this.f52461b).b(i11);
    }

    @Override // uv.s
    public boolean c() {
        return ((uv.s) this.f52461b).c();
    }

    @Override // uv.s
    public boolean e(int i11) {
        return ((uv.s) this.f52461b).e(i11);
    }

    @Override // u8.d
    public int f(long j11) {
        return j11 < 0 ? 0 : -1;
    }

    @Override // uv.s
    public boolean i() {
        return ((uv.s) this.f52461b).i();
    }

    @Override // u8.d
    public long j(int i11) {
        b7.a.d(i11 == 0);
        return 0L;
    }

    @Override // uv.s
    public void l() {
        ((uv.s) this.f52461b).l();
    }

    @Override // uv.s
    public void m() {
        ((uv.s) this.f52461b).m();
    }

    @Override // uv.s
    public boolean n(String str, String str2, int i11, int i12, boolean z11, boolean z12) {
        return ((uv.s) this.f52461b).n(str, str2, i11, i12, z11, z12);
    }

    @Override // uv.s
    public void o(Context context) {
        ((uv.s) this.f52461b).o(context);
    }

    @Override // u8.d
    public List p(long j11) {
        return j11 >= 0 ? (List) this.f52461b : Collections.EMPTY_LIST;
    }

    @Override // uv.s
    public void q(Context context) {
        ((uv.s) this.f52461b).q(context);
    }

    @Override // uv.s
    public boolean r() {
        return ((uv.s) this.f52461b).r();
    }

    @Override // u8.d
    public int s() {
        return 1;
    }

    public g(y6.d dVar) {
        this.f52460a = 8;
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            c3.c.i(usage);
        }
        if (i11 >= 32) {
            y6.c.b(usage);
            y6.c.a(usage);
        }
        this.f52461b = usage.build();
    }

    public g(View view) {
        this.f52460a = 10;
        if (Build.VERSION.SDK_INT >= 30) {
            z4.b0 b0Var = new z4.b0(view);
            b0Var.f58812b = view;
            this.f52461b = b0Var;
            return;
        }
        this.f52461b = new qp.i(view);
    }

    public g(int i11) {
        Object nVar;
        this.f52460a = i11;
        switch (i11) {
            case 7:
                this.f52461b = new Bundle();
                break;
            default:
                if (ew.d.f25940a.f25944d) {
                    nVar = new uv.l();
                } else {
                    nVar = new uv.n();
                }
                this.f52461b = nVar;
                break;
        }
    }

    public g(WindowInsetsController windowInsetsController) {
        this.f52460a = 10;
        z4.b0 b0Var = new z4.b0(null);
        b0Var.f58813c = windowInsetsController;
        this.f52461b = b0Var;
    }

    public g(long[] jArr) {
        y.z zVar;
        this.f52460a = 5;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            zVar = new y.z(jArrCopyOf.length);
            int i11 = zVar.f56791b;
            if (i11 >= 0) {
                if (jArrCopyOf.length != 0) {
                    int length = jArrCopyOf.length + i11;
                    long[] jArr2 = zVar.f56790a;
                    if (jArr2.length < length) {
                        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                        kotlin.jvm.internal.m.e(jArrCopyOf2, "copyOf(...)");
                        zVar.f56790a = jArrCopyOf2;
                    }
                    long[] jArr3 = zVar.f56790a;
                    int i12 = zVar.f56791b;
                    if (i11 != i12) {
                        ry.l.J(jArr3, jArr3, jArrCopyOf.length + i11, i11, i12);
                    }
                    ry.l.J(jArrCopyOf, jArr3, i11, 0, jArrCopyOf.length);
                    zVar.f56791b += jArrCopyOf.length;
                }
            } else {
                z.a.d(BuildConfig.VERSION_NAME);
                throw null;
            }
        } else {
            zVar = new y.z(16);
        }
        this.f52461b = zVar;
    }
}
