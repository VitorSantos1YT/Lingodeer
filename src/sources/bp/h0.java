package bp;

import com.google.api.Service;
import com.google.logging.type.LogSeverity;
import com.lingo.course.ui.CourseTestActivity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h0 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f4615b;

    public /* synthetic */ h0(int i11, l1.b1 b1Var) {
        this.f4614a = i11;
        this.f4615b = b1Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f4614a;
        qy.b0 b0Var = qy.b0.f48488a;
        l1.b1 b1Var = this.f4615b;
        switch (i11) {
            case 0:
                w2.x coordinates = (w2.x) obj;
                kotlin.jvm.internal.m.f(coordinates, "coordinates");
                b1Var.setValue(fb.g0.A(w2.a0.e(coordinates)));
                return b0Var;
            case 1:
                kotlin.jvm.internal.m.f((wb.f) obj, "it");
                b1Var.setValue(Boolean.TRUE);
                return b0Var;
            case 2:
                ht.l it = (ht.l) obj;
                kotlin.jvm.internal.m.f(it, "it");
                b1Var.setValue(it);
                return b0Var;
            case 3:
                w2.x it2 = (w2.x) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                b1Var.setValue(new v3.l(it2.m()));
                return b0Var;
            case 4:
                w2.x it3 = (w2.x) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                b1Var.setValue(new f2.b(it3.c(0L)));
                return b0Var;
            case 5:
                b1Var.setValue((jt.h2) obj);
                return b0Var;
            case 6:
                w2.x it4 = (w2.x) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                b1Var.setValue(it4);
                return b0Var;
            case 7:
                f2.c it5 = (f2.c) obj;
                kotlin.jvm.internal.m.f(it5, "it");
                b1Var.setValue(it5);
                return b0Var;
            case 8:
                ht.l it6 = (ht.l) obj;
                kotlin.jvm.internal.m.f(it6, "it");
                b1Var.setValue(it6);
                return b0Var;
            case 9:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                int i12 = CourseTestActivity.R;
                b1Var.setValue(bool);
                return b0Var;
            case 10:
                b1Var.setValue(new v3.l(((v3.l) obj).f53498a));
                return b0Var;
            case 11:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                b1Var.setValue(bool2);
                return b0Var;
            case 12:
                b1Var.setValue(new v3.l(((v3.l) obj).f53498a));
                return b0Var;
            case 13:
                b1Var.setValue(Boolean.TRUE);
                return b0Var;
            case 14:
                kotlin.jvm.internal.m.f((w2.x) obj, "it");
                b1Var.setValue(Boolean.TRUE);
                return b0Var;
            case 15:
                kotlin.jvm.internal.m.f((w2.x) obj, "it");
                b1Var.setValue(Boolean.TRUE);
                return b0Var;
            case 16:
                kotlin.jvm.internal.m.f((w2.x) obj, "it");
                b1Var.setValue(Boolean.TRUE);
                return b0Var;
            case 17:
                b1Var.setValue(new v3.f(((v3.f) obj).f53489a));
                return b0Var;
            case 18:
                b1Var.setValue(Boolean.TRUE);
                return b0Var;
            case 19:
                b1Var.setValue(Boolean.TRUE);
                return b0Var;
            case 20:
                Float f5 = (Float) obj;
                f5.getClass();
                ((fz.c) b1Var.getValue()).invoke(f5);
                return b0Var;
            case 21:
                Float f11 = (Float) obj;
                f11.getClass();
                return Float.valueOf(((Number) ((fz.c) b1Var.getValue()).invoke(f11)).floatValue());
            case 22:
                a0.y AnimatedContent = (a0.y) obj;
                kotlin.jvm.internal.m.f(AnimatedContent, "$this$AnimatedContent");
                if (((Boolean) b1Var.getValue()).booleanValue()) {
                    a0.l1 l1VarO = a0.f1.o(b0.e.r(LogSeverity.NOTICE_VALUE, 0, null, 6), new b0.k2(29));
                    a0.m1 m1VarS = a0.f1.s(b0.e.r(LogSeverity.NOTICE_VALUE, 0, null, 6), new a0.e1(new fr.n2(7), 2));
                    int i13 = a0.o.f152b;
                    return new a0.p0(l1VarO, m1VarS);
                }
                a0.l1 l1VarO2 = a0.f1.o(b0.e.r(LogSeverity.NOTICE_VALUE, 0, null, 6), new fr.n2(8));
                a0.m1 m1VarS2 = a0.f1.s(b0.e.r(LogSeverity.NOTICE_VALUE, 0, null, 6), new a0.e1(new b0.k2(29), 2));
                int i14 = a0.o.f152b;
                return new a0.p0(l1VarO2, m1VarS2);
            case 23:
                j3.u0 it7 = (j3.u0) obj;
                kotlin.jvm.internal.m.f(it7, "it");
                b1Var.setValue(it7);
                return b0Var;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                Integer num = (Integer) obj;
                num.intValue();
                b1Var.setValue(num);
                return b0Var;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                Integer num2 = (Integer) obj;
                num2.intValue();
                b1Var.setValue(num2);
                return b0Var;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                ((Boolean) obj).getClass();
                b1Var.setValue(Boolean.valueOf(!((Boolean) b1Var.getValue()).booleanValue()));
                return b0Var;
            case 27:
                String input = (String) obj;
                kotlin.jvm.internal.m.f(input, "input");
                b1Var.setValue(oz.q.g1(200, input));
                return b0Var;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                String it8 = (String) obj;
                kotlin.jvm.internal.m.f(it8, "it");
                b1Var.setValue(it8);
                return b0Var;
            default:
                rt.r it9 = (rt.r) obj;
                kotlin.jvm.internal.m.f(it9, "it");
                b1Var.setValue(new mt.b(it9.f50318a, it9.f50319b));
                return b0Var;
        }
    }
}
