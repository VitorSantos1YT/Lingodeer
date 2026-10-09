package au;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.yalantis.ucrop.view.CropImageView;
import d0.b2;
import hj.k1;
import l1.x1;
import s0.m1;
import s0.o1;
import s0.v1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3035d;

    public /* synthetic */ k(Object obj, int i11, int i12, Object obj2) {
        this.f3032a = i12;
        this.f3034c = obj;
        this.f3033b = i11;
        this.f3035d = obj2;
    }

    @Override // fz.c
    public final Object invoke(Object obj) throws Exception {
        l1.v vVar;
        long[] jArr;
        l1.v vVar2;
        long[] jArr2;
        int i11;
        switch (this.f3032a) {
            case 0:
                String str = (String) this.f3034c;
                int i12 = this.f3033b;
                String str2 = (String) this.f3035d;
                ja.a _connection = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection, "_connection");
                ja.c cVarB1 = _connection.B1("UPDATE bookmark_folder SET id = ?, server_id = ? WHERE id = ?");
                try {
                    cVarB1.b0(1, str);
                    cVarB1.g(2, i12);
                    cVarB1.b0(3, str2);
                    cVarB1.r1();
                } finally {
                    cVarB1.close();
                }
                break;
            case 1:
                b2 b2Var = (b2) this.f3034c;
                w2.g1 g1Var = (w2.g1) this.f3035d;
                w2.f1 f1Var = (w2.f1) obj;
                int iL = b2Var.Q.f22659a.l();
                if (iL < 0) {
                    iL = 0;
                }
                int i13 = this.f3033b;
                if (iL > i13) {
                    iL = i13;
                }
                int i14 = -iL;
                boolean z11 = b2Var.R;
                int i15 = z11 ? 0 : i14;
                int i16 = z11 ? i14 : 0;
                f1Var.f54492a = true;
                w2.f1.l(f1Var, g1Var, i15, i16, null, 12);
                f1Var.f54492a = false;
                break;
            case 2:
                x1 x1Var = (x1) this.f3034c;
                y.d0 d0Var = (y.d0) this.f3035d;
                l1.v vVar3 = (l1.v) obj;
                int i17 = x1Var.f39503e;
                int i18 = this.f3033b;
                if (i17 == i18 && kotlin.jvm.internal.m.a(d0Var, x1Var.f39504f) && (vVar3 instanceof l1.z)) {
                    long[] jArr3 = d0Var.f56677a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i19 = 0;
                        while (true) {
                            long j11 = jArr3[i19];
                            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i21 = 8;
                                int i22 = 8 - ((~(i19 - length)) >>> 31);
                                int i23 = 0;
                                while (i23 < i22) {
                                    if ((255 & j11) < 128) {
                                        int i24 = (i19 << 3) + i23;
                                        Object obj2 = d0Var.f56678b[i24];
                                        boolean z12 = d0Var.f56679c[i24] != i18;
                                        if (z12) {
                                            i11 = i21;
                                            l1.z zVar = (l1.z) vVar3;
                                            vVar2 = vVar3;
                                            y.i0 i0Var = zVar.f39522t;
                                            com.bumptech.glide.g.v(i0Var, obj2, x1Var);
                                            jArr2 = jArr3;
                                            if (obj2 instanceof l1.g0) {
                                                l1.g0 g0Var = (l1.g0) obj2;
                                                if (!i0Var.c(g0Var)) {
                                                    com.bumptech.glide.g.w(zVar.L, g0Var);
                                                }
                                                y.i0 i0Var2 = x1Var.f39505g;
                                                if (i0Var2 != null) {
                                                    i0Var2.k(obj2);
                                                }
                                            }
                                        } else {
                                            vVar2 = vVar3;
                                            jArr2 = jArr3;
                                            i11 = i21;
                                        }
                                        if (z12) {
                                            d0Var.f(i24);
                                        }
                                    } else {
                                        vVar2 = vVar3;
                                        jArr2 = jArr3;
                                        i11 = i21;
                                    }
                                    j11 >>= i11;
                                    i23++;
                                    i21 = i11;
                                    vVar3 = vVar2;
                                    jArr3 = jArr2;
                                }
                                vVar = vVar3;
                                jArr = jArr3;
                                if (i22 == i21) {
                                }
                            } else {
                                vVar = vVar3;
                                jArr = jArr3;
                            }
                            if (i19 != length) {
                                i19++;
                                vVar3 = vVar;
                                jArr3 = jArr;
                            }
                        }
                    }
                }
                return qy.b0.f48488a;
            case 3:
                qp.j jVar = (qp.j) this.f3034c;
                FrameLayout frameLayout = (FrameLayout) this.f3035d;
                View v11 = (View) obj;
                kotlin.jvm.internal.m.f(v11, "v");
                ta.a aVar = jVar.f47886f;
                kotlin.jvm.internal.m.c(aVar);
                if (((k1) aVar).f32809d.getVisibility() == 0 && !jVar.f47989p) {
                    jVar.f47989p = true;
                    ta.a aVar2 = jVar.f47886f;
                    kotlin.jvm.internal.m.c(aVar2);
                    z4.w0 w0VarB = z4.s0.b(((k1) aVar2).f32809d);
                    ta.a aVar3 = jVar.f47886f;
                    kotlin.jvm.internal.m.c(aVar3);
                    w0VarB.m(((k1) aVar3).f32809d.getHeight());
                    w0VarB.e(400L);
                    w0VarB.g(new l.t(jVar, 3));
                    w0VarB.i();
                }
                ta.a aVar4 = jVar.f47886f;
                kotlin.jvm.internal.m.c(aVar4);
                ((k1) aVar4).f32810e.setVisibility(4);
                ta.a aVar5 = jVar.f47886f;
                kotlin.jvm.internal.m.c(aVar5);
                ((k1) aVar5).f32810e.setTranslationX(CropImageView.DEFAULT_ASPECT_RATIO);
                ta.a aVar6 = jVar.f47886f;
                kotlin.jvm.internal.m.c(aVar6);
                ((k1) aVar6).f32810e.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
                if (jVar.f47984j != null) {
                    jVar.f47984j = null;
                    jVar.f47988o = -1;
                }
                jVar.f47984j = (FrameLayout) v11;
                jVar.f47988o = this.f3033b;
                ta.a aVar7 = jVar.f47886f;
                kotlin.jvm.internal.m.c(aVar7);
                ViewGroup.LayoutParams layoutParams = ((k1) aVar7).f32810e.getLayoutParams();
                FrameLayout frameLayout2 = jVar.f47984j;
                kotlin.jvm.internal.m.c(frameLayout2);
                layoutParams.width = frameLayout2.getWidth();
                FrameLayout frameLayout3 = jVar.f47984j;
                kotlin.jvm.internal.m.c(frameLayout3);
                layoutParams.height = frameLayout3.getHeight();
                ta.a aVar8 = jVar.f47886f;
                kotlin.jvm.internal.m.c(aVar8);
                ((k1) aVar8).f32810e.setLayoutParams(layoutParams);
                ta.a aVar9 = jVar.f47886f;
                kotlin.jvm.internal.m.c(aVar9);
                ImageView imageView = ((k1) aVar9).f32810e;
                imageView.postDelayed(new b2.c(4, imageView, new mt.l0(jVar, frameLayout, v11, 15)), 0L);
                break;
            default:
                v1 v1Var = (v1) this.f3034c;
                w2.g1 g1Var2 = (w2.g1) this.f3035d;
                w2.f1 f1Var2 = (w2.f1) obj;
                int i25 = v1Var.f51239b;
                m1 m1Var = v1Var.f51238a;
                o3.d0 d0Var2 = v1Var.f51240c;
                o1 o1Var = (o1) v1Var.f51241d.invoke();
                m1Var.a(f0.h1.Vertical, s0.o0.l(f1Var2, i25, d0Var2, o1Var != null ? o1Var.f51124a : null, false, g1Var2.f54501a), this.f3033b, g1Var2.f54502b);
                w2.f1.k(f1Var2, g1Var2, 0, Math.round(-m1Var.f51099a.l()));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ k(v1 v1Var, w2.g1 g1Var, int i11) {
        this.f3032a = 4;
        this.f3034c = v1Var;
        this.f3035d = g1Var;
        this.f3033b = i11;
    }
}
