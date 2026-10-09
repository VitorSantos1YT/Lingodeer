package fu;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.lingo.lingoskill.ui.base.LoginActivity;
import com.lingo.lingoskill.ui.learn.LessonTestActivity;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import com.lingodeer.ui.ShareMedalView;
import hj.x3;
import j0.s2;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.UUID;
import w2.f1;
import w2.g1;
import w2.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h0 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28101a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f28104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f28105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f28106f;

    public /* synthetic */ h0(g1.k kVar, hi.a aVar, int i11, int i12, String str) {
        this.f28104d = kVar;
        this.f28105e = aVar;
        this.f28102b = i11;
        this.f28103c = i12;
        this.f28106f = str;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11;
        int i12 = this.f28101a;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj2 = this.f28106f;
        int i13 = this.f28103c;
        int i14 = this.f28102b;
        Object obj3 = this.f28105e;
        Object obj4 = this.f28104d;
        switch (i12) {
            case 0:
                Context context = (Context) obj;
                kotlin.jvm.internal.m.f(context, "context");
                int i15 = 0;
                return new ShareMedalView(context, new t1.d(new i0((g2.t) obj4, i14, i13, i15), true, 213093298), new j0((rz.b0) obj3, context, (g0) obj2, i15));
            case 1:
                g1 g1Var = (g1) obj3;
                f1.i((f1) obj, g1Var, ((v3.j) ((s2) obj4).R.invoke(new v3.l((((long) (i13 - g1Var.f54502b)) & 4294967295L) | (((long) (i14 - g1Var.f54501a)) << 32)), ((s0) obj2).getLayoutDirection())).f53492a);
                return b0Var;
            default:
                g1.k kVar = (g1.k) obj4;
                hi.a aVar = (hi.a) obj3;
                String str = (String) obj2;
                View it = (View) obj;
                kotlin.jvm.internal.m.f(it, "it");
                Env env = (Env) kVar.f28531d;
                x3 x3Var = (x3) kVar.f28529b;
                l.m mVar = (l.m) kVar.f28530c;
                if (env.isUnloginUser()) {
                    if (mVar instanceof LessonTestActivity) {
                        i.c cVar = ((LessonTestActivity) mVar).W;
                        int i16 = LoginActivity.Q;
                        cVar.a(bp.g1.p(mVar, 10));
                    } else {
                        int i17 = LoginActivity.Q;
                        mVar.startActivity(bp.g1.p(mVar, 10));
                    }
                } else if (TextUtils.isEmpty(x3Var.f33578k.f32728f.getText()) && x3Var.f33578k.f32727e.isChecked()) {
                    String string = mVar.getString(R.string.please_tell_us_more_about_the_problem);
                    kotlin.jvm.internal.m.e(string, "getString(...)");
                    ff.h.C(string);
                } else if (((Bitmap) kVar.f28532e) == null) {
                    ff.h.C(ff.h.y(mVar, R.string.error_in_saving_the_image));
                    kVar.b();
                } else {
                    int[] iArr = bq.r.f4959a;
                    String strM = defpackage.e.m(env.feedbackDir, "android_" + bq.m.r(env.keyLanguage) + "_" + UUID.randomUUID() + ".jpg");
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(strM);
                        try {
                            try {
                                Bitmap bitmap = (Bitmap) kVar.f28532e;
                                kotlin.jvm.internal.m.c(bitmap);
                                bitmap.compress(Bitmap.CompressFormat.JPEG, 60, fileOutputStream);
                                fileOutputStream.close();
                                String strC = aVar.c();
                                if (strC == null) {
                                    kVar.b();
                                    ve.i.B(x3Var.f33568a);
                                    String string2 = mVar.getString(R.string.thanks_for_your_report);
                                    kotlin.jvm.internal.m.e(string2, "getString(...)");
                                    ff.h.C(string2);
                                } else {
                                    ArrayList arrayListL = w4.c.l(strM);
                                    a.a aVarB = s20.e.b(mVar);
                                    aVarB.F(arrayListL);
                                    aVarB.f5b = 100;
                                    aVarB.f7d = env.imDir;
                                    j4.i iVar = new j4.i();
                                    iVar.f35910c = kVar;
                                    iVar.f35911d = strC;
                                    iVar.f35908a = i14;
                                    iVar.f35909b = i13;
                                    iVar.f35912e = str;
                                    aVarB.f8e = iVar;
                                    aVarB.E();
                                }
                            } catch (Exception unused) {
                                i11 = R.string.error_in_saving_the_image;
                                ff.h.C(ff.h.y(mVar, i11));
                                kVar.b();
                                return b0Var;
                            }
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                ns.o.m(fileOutputStream, th2);
                                throw th3;
                            }
                        }
                    } catch (Exception unused2) {
                        i11 = R.string.error_in_saving_the_image;
                    }
                }
                return b0Var;
        }
    }

    public /* synthetic */ h0(g2.t tVar, int i11, int i12, rz.b0 b0Var, g0 g0Var) {
        this.f28104d = tVar;
        this.f28102b = i11;
        this.f28103c = i12;
        this.f28105e = b0Var;
        this.f28106f = g0Var;
    }

    public /* synthetic */ h0(s2 s2Var, int i11, g1 g1Var, int i12, s0 s0Var) {
        this.f28104d = s2Var;
        this.f28102b = i11;
        this.f28105e = g1Var;
        this.f28103c = i12;
        this.f28106f = s0Var;
    }
}
