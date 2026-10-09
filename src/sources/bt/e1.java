package bt;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewModel;
import com.lingodeer.data.model.CourseSentence;
import com.yalantis.ucrop.view.CropImageView;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e1 implements fz.a {
    public final /* synthetic */ Object H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5340e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5341f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f5342t;

    public /* synthetic */ e1(ImageView imageView, qh.c0 c0Var, ImageView imageView2, LinearLayout linearLayout, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3) {
        this.f5336a = 5;
        this.f5337b = imageView;
        this.f5339d = c0Var;
        this.f5338c = imageView2;
        this.f5340e = linearLayout;
        this.H = bitmap;
        this.f5341f = bitmap2;
        this.f5342t = bitmap3;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f5336a) {
            case 0:
                CourseSentence courseSentence = (CourseSentence) this.f5337b;
                b.k((ys.d0) this.f5339d, (l1.b1) this.f5338c, (l1.b1) this.f5340e, (rz.b0) this.f5341f, courseSentence, (l1.a1) this.f5342t, (l1.b1) this.H, jh.h.u(courseSentence), new ht.i(courseSentence.getSlowVisemedMap()));
                break;
            case 1:
                CourseSentence courseSentence2 = (CourseSentence) this.f5337b;
                s5.g((l1.b1) this.f5338c, (jt.x0) this.H, (ys.d0) this.f5339d, (l1.b1) this.f5340e, (rz.b0) this.f5341f, courseSentence2, (l1.a1) this.f5342t, jh.h.u(courseSentence2), new ht.i(courseSentence2.getSlowVisemedMap()));
                break;
            case 2:
                ur.a aVar = (ur.a) this.f5337b;
                rz.b0 b0Var = (rz.b0) this.f5341f;
                ys.v vVar = (ys.v) this.f5339d;
                ns.z zVar = (ns.z) this.f5340e;
                rt.z5 z5Var = (rt.z5) this.H;
                l1.b1 b1Var = (l1.b1) this.f5338c;
                fz.c cVar = (fz.c) this.f5342t;
                aVar.c("jxz_main_emm_button_click", new dt.m0(vVar, zVar, 3));
                rz.e0.B(b0Var, null, null, new b0.f(z5Var, zVar, b1Var, cVar, (vy.d) null, 11), 3);
                break;
            case 3:
                gn.e eVar = (gn.e) this.f5337b;
                l1.b1 b1Var2 = (l1.b1) this.f5338c;
                l1.b1 b1Var3 = (l1.b1) this.f5340e;
                l1.b1 b1Var4 = (l1.b1) this.H;
                l1.b1 b1Var5 = (l1.b1) this.f5339d;
                l1.b1 b1Var6 = (l1.b1) this.f5341f;
                l1.b1 b1Var7 = (l1.b1) this.f5342t;
                b1Var2.setValue(Boolean.FALSE);
                b1Var3.setValue(null);
                b1Var4.setValue(null);
                b1Var5.setValue(null);
                b1Var6.setValue(null);
                b1Var7.setValue(null);
                eVar.a();
                break;
            case 4:
                tq.d dVar = (tq.d) this.f5337b;
                l1.b1 b1Var8 = (l1.b1) this.f5338c;
                l1.b1 b1Var9 = (l1.b1) this.f5340e;
                l1.b1 b1Var10 = (l1.b1) this.H;
                l1.b1 b1Var11 = (l1.b1) this.f5339d;
                l1.b1 b1Var12 = (l1.b1) this.f5341f;
                l1.b1 b1Var13 = (l1.b1) this.f5342t;
                b1Var8.setValue(Boolean.FALSE);
                b1Var9.setValue(null);
                b1Var10.setValue(null);
                b1Var11.setValue(null);
                b1Var12.setValue(null);
                b1Var13.setValue(null);
                dVar.a();
                break;
            default:
                ImageView imageView = (ImageView) this.f5337b;
                qh.c0 c0Var = (qh.c0) this.f5339d;
                ImageView imageView2 = (ImageView) this.f5338c;
                LinearLayout linearLayout = (LinearLayout) this.f5340e;
                Bitmap bitmap = (Bitmap) this.H;
                Bitmap bitmap2 = (Bitmap) this.f5341f;
                Bitmap bitmap3 = (Bitmap) this.f5342t;
                z4.w0 w0VarB = z4.s0.b(imageView);
                View view = (View) w0VarB.f58909a.get();
                if (view != null) {
                    view.animate().rotation(-25.0f);
                }
                Context contextRequireContext = c0Var.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                w0VarB.k((-fr.j3.y(contextRequireContext)) / 2.0f);
                Context contextRequireContext2 = c0Var.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                w0VarB.m(fr.j3.Z(72, contextRequireContext2));
                w0VarB.e(300L);
                w0VarB.i();
                z4.w0 w0VarB2 = z4.s0.b(imageView2);
                View view2 = (View) w0VarB2.f58909a.get();
                if (view2 != null) {
                    view2.animate().rotation(25.0f);
                }
                Context contextRequireContext3 = c0Var.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
                w0VarB2.k(fr.j3.y(contextRequireContext3) / 2.0f);
                Context contextRequireContext4 = c0Var.requireContext();
                kotlin.jvm.internal.m.e(contextRequireContext4, "requireContext(...)");
                w0VarB2.m(fr.j3.Z(72, contextRequireContext4));
                w0VarB2.e(300L);
                w0VarB2.i();
                linearLayout.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
                qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new oi.c(c0Var, imageView, imageView2, bitmap, bitmap2, bitmap3), vx.b.f54316e);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ e1(ViewModel viewModel, l1.b1 b1Var, l1.b1 b1Var2, l1.b1 b1Var3, l1.b1 b1Var4, l1.b1 b1Var5, l1.b1 b1Var6, int i11) {
        this.f5336a = i11;
        this.f5337b = viewModel;
        this.f5338c = b1Var;
        this.f5340e = b1Var2;
        this.H = b1Var3;
        this.f5339d = b1Var4;
        this.f5341f = b1Var5;
        this.f5342t = b1Var6;
    }

    public /* synthetic */ e1(CourseSentence courseSentence, l1.a1 a1Var, l1.b1 b1Var, l1.b1 b1Var2, l1.b1 b1Var3, rz.b0 b0Var, ys.d0 d0Var) {
        this.f5336a = 0;
        this.f5337b = courseSentence;
        this.f5339d = d0Var;
        this.f5338c = b1Var;
        this.f5340e = b1Var2;
        this.f5341f = b0Var;
        this.f5342t = a1Var;
        this.H = b1Var3;
    }

    public /* synthetic */ e1(CourseSentence courseSentence, l1.b1 b1Var, jt.x0 x0Var, ys.d0 d0Var, l1.b1 b1Var2, rz.b0 b0Var, l1.a1 a1Var) {
        this.f5336a = 1;
        this.f5337b = courseSentence;
        this.f5338c = b1Var;
        this.H = x0Var;
        this.f5339d = d0Var;
        this.f5340e = b1Var2;
        this.f5341f = b0Var;
        this.f5342t = a1Var;
    }

    public /* synthetic */ e1(ur.a aVar, rz.b0 b0Var, ys.v vVar, ns.z zVar, rt.z5 z5Var, l1.b1 b1Var, fz.c cVar) {
        this.f5336a = 2;
        this.f5337b = aVar;
        this.f5341f = b0Var;
        this.f5339d = vVar;
        this.f5340e = zVar;
        this.H = z5Var;
        this.f5338c = b1Var;
        this.f5342t = cVar;
    }
}
