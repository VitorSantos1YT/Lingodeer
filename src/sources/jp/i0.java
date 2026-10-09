package jp;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import hj.x3;
import l0.Eeqr.HOBXIlHxIkMBEA;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i0 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f36495b;

    public /* synthetic */ i0(p0 p0Var, int i11) {
        this.f36494a = i11;
        this.f36495b = p0Var;
    }

    @Override // fz.a
    public final Object invoke() {
        int iN;
        String str;
        switch (this.f36494a) {
            case 0:
                Bundle bundle = new Bundle();
                b7.e0.v(this.f36495b.d(), bundle, "U", "unit");
                return bundle;
            case 1:
                try {
                    ta.a aVar = this.f36495b.f36400f;
                    kotlin.jvm.internal.m.c(aVar);
                    v10.c.F(((x3) aVar).f33576i.f32670i, 18, 2);
                    break;
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
                return qy.b0.f48488a;
            case 2:
                p0 p0Var = this.f36495b;
                try {
                    ta.a aVar2 = p0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar2);
                    TextView textView = ((x3) aVar2).f33576i.f32671j;
                    Context contextRequireContext = p0Var.requireContext();
                    kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
                    v10.c.F(textView, (int) ff.h.x(contextRequireContext, 24), 0);
                    break;
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                return qy.b0.f48488a;
            case 3:
                Bundle bundle2 = new Bundle();
                b7.e0.v(this.f36495b.d(), bundle2, "U", "unit");
                return bundle2;
            case 4:
                Bundle bundle3 = new Bundle();
                p0 p0Var2 = this.f36495b;
                b7.e0.v(p0Var2.d(), bundle3, "U", "unit");
                b7.e0.v(p0Var2.f36525a0, bundle3, "L", "lesson");
                bundle3.putString("mode", p0Var2.f36534j0);
                mp.a aVar3 = (mp.a) p0Var2.N;
                if (aVar3 != null) {
                    bundle3.putString("lesson_count", String.valueOf(aVar3.i()));
                    ta.a aVar4 = p0Var2.f36400f;
                    kotlin.jvm.internal.m.c(aVar4);
                    if (((x3) aVar4).f33576i.f32668g.getVisibility() == 0) {
                        iN = aVar3.n() + 1;
                    } else {
                        iN = aVar3.n() == -1 ? 0 : aVar3.n();
                    }
                    float f5 = iN;
                    String str2 = "91-100";
                    if (f5 / aVar3.i() <= 0.1f) {
                        str = "0-10";
                    } else if (f5 / aVar3.i() <= 0.2f) {
                        str = "11-20";
                    } else if (f5 / aVar3.i() <= 0.3f) {
                        str = "21-30";
                    } else if (f5 / aVar3.i() <= 0.4f) {
                        str = "31-40";
                    } else if (f5 / aVar3.i() <= 0.5f) {
                        str = "41-50";
                    } else if (f5 / aVar3.i() <= 0.6f) {
                        str = "51-60";
                    } else if (f5 / aVar3.i() <= 0.7f) {
                        str = "61-70";
                    } else if (f5 / aVar3.i() <= 0.8f) {
                        str = "71-80";
                    } else {
                        str = f5 / ((float) aVar3.i()) <= 0.9f ? "81-90" : "91-100";
                    }
                    bundle3.putString("answer_count", String.valueOf(iN));
                    bundle3.putString("progress", str);
                    int i11 = aVar3.i() - aVar3.m();
                    bundle3.putString("false_count", String.valueOf(aVar3.m()));
                    bundle3.putString("true_count", String.valueOf(i11));
                    float f11 = i11;
                    if (f11 / aVar3.i() <= 0.1f) {
                        str2 = "0-10";
                    } else if (f11 / aVar3.i() <= 0.2f) {
                        str2 = "11-20";
                    } else if (f11 / aVar3.i() <= 0.3f) {
                        str2 = "21-30";
                    } else if (f11 / aVar3.i() <= 0.4f) {
                        str2 = "31-40";
                    } else if (f11 / aVar3.i() <= 0.5f) {
                        str2 = "41-50";
                    } else if (f11 / aVar3.i() <= 0.6f) {
                        str2 = "51-60";
                    } else if (f11 / aVar3.i() <= 0.7f) {
                        str2 = "61-70";
                    } else if (f11 / aVar3.i() <= 0.8f) {
                        str2 = "71-80";
                    } else if (f11 / aVar3.i() <= 0.9f) {
                        str2 = "81-90";
                    }
                    bundle3.putString("accuracy", str2);
                }
                return bundle3;
            case 5:
                Bundle bundle4 = new Bundle();
                p0 p0Var3 = this.f36495b;
                b7.e0.v(p0Var3.d(), bundle4, "U", "unit");
                b7.e0.v(p0Var3.f36525a0, bundle4, HOBXIlHxIkMBEA.duIvTARannKctI, "lesson");
                bundle4.putString("mode", p0Var3.f36534j0);
                return bundle4;
            default:
                Bundle bundle5 = new Bundle();
                p0 p0Var4 = this.f36495b;
                b7.e0.v(p0Var4.d(), bundle5, "U", "unit");
                b7.e0.v(p0Var4.f36525a0, bundle5, "L", "lesson");
                bundle5.putString("mode", p0Var4.f36534j0);
                return bundle5;
        }
    }
}
