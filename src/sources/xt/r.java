package xt;

import a0.f1;
import a0.l1;
import a0.m1;
import a0.p0;
import a0.y;
import app.rive.runtime.kotlin.RiveAnimationView;
import b0.k2;
import com.google.api.Service;
import com.lingodeer.data.model.CourseQuestionPreference;
import com.lingodeer.data.model.CourseQuestionPreferenceContext;
import com.yalantis.ucrop.view.CropImageView;
import j9.e0;
import j9.z;
import java.util.Map;
import qy.b0;
import vt.a1;
import vt.t0;
import ys.p2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56319a;

    public /* synthetic */ r(int i11) {
        this.f56319a = i11;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f56319a;
        b0 b0Var = b0.f48488a;
        switch (i11) {
            case 0:
                a1 record = (a1) obj;
                kotlin.jvm.internal.m.f(record, "record");
                String str = record.f54175a;
                float f5 = record.f54176b;
                int i12 = record.f54177c;
                int i13 = record.f54178d;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(":");
                sb2.append(f5);
                sb2.append(":");
                sb2.append(i12);
                return defpackage.e.g(i13, ":", sb2);
            case 1:
                qy.l it = (qy.l) obj;
                kotlin.jvm.internal.m.f(it, "it");
                return it.f48495a + ":" + it.f48496b;
            case 2:
                t0 record2 = (t0) obj;
                kotlin.jvm.internal.m.f(record2, "record");
                return record2.f54287a + ":" + ry.m.y0(record2.f54288b, "_", null, null, null, 62) + ":" + record2.f54289c;
            case 3:
                Map.Entry entry = (Map.Entry) obj;
                kotlin.jvm.internal.m.f(entry, "<destruct>");
                return ep.a.D((String) entry.getKey(), ":", (String) entry.getValue());
            case 4:
                i2.d LinearProgressIndicator = (i2.d) obj;
                kotlin.jvm.internal.m.f(LinearProgressIndicator, "$this$LinearProgressIndicator");
                return b0Var;
            case 5:
                g2.t0 graphicsLayer = (g2.t0) obj;
                kotlin.jvm.internal.m.f(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.b(CropImageView.DEFAULT_ASPECT_RATIO);
                return b0Var;
            case 6:
                g2.t0 graphicsLayer2 = (g2.t0) obj;
                kotlin.jvm.internal.m.f(graphicsLayer2, "$this$graphicsLayer");
                graphicsLayer2.b(CropImageView.DEFAULT_ASPECT_RATIO);
                return b0Var;
            case 7:
                g2.t0 graphicsLayer3 = (g2.t0) obj;
                kotlin.jvm.internal.m.f(graphicsLayer3, "$this$graphicsLayer");
                graphicsLayer3.b(0.5f);
                return b0Var;
            case 8:
                g2.t0 graphicsLayer4 = (g2.t0) obj;
                kotlin.jvm.internal.m.f(graphicsLayer4, "$this$graphicsLayer");
                graphicsLayer4.b(0.5f);
                return b0Var;
            case 9:
                return new v3.l((((long) ((int) (((v3.l) obj).f53498a >> 32))) << 32) | (((long) 0) & 4294967295L));
            case 10:
                return new v3.l((((long) ((int) (((v3.l) obj).f53498a >> 32))) << 32) | (((long) 0) & 4294967295L));
            case 11:
                return new v3.j((((long) 0) << 32) | (((long) ((int) (((v3.l) obj).f53498a & 4294967295L))) & 4294967295L));
            case 12:
                return new v3.j((((long) 0) << 32) | (((long) ((int) (((v3.l) obj).f53498a & 4294967295L))) & 4294967295L));
            case 13:
                kotlin.jvm.internal.m.f((lc.d) obj, "it");
                return b0Var;
            case 14:
                kotlin.jvm.internal.m.f((lc.d) obj, "it");
                return b0Var;
            case 15:
                kotlin.jvm.internal.m.f((lc.d) obj, "it");
                return b0Var;
            case 16:
                kotlin.jvm.internal.m.f((lc.d) obj, "it");
                return b0Var;
            case 17:
                kotlin.jvm.internal.m.f((String) obj, "it");
                return b0Var;
            case 18:
                kotlin.jvm.internal.m.f((CourseQuestionPreference) obj, "it");
                return b0Var;
            case 19:
                kotlin.jvm.internal.m.f((CourseQuestionPreferenceContext) obj, "it");
                return b0Var;
            case 20:
                kotlin.jvm.internal.m.f((CourseQuestionPreference) obj, "it");
                return b0Var;
            case 21:
                kotlin.jvm.internal.m.f((CourseQuestionPreferenceContext) obj, "it");
                return b0Var;
            case 22:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 23:
                y AnimatedContent = (y) obj;
                kotlin.jvm.internal.m.f(AnimatedContent, "$this$AnimatedContent");
                l1 l1VarP = f1.p(new k2(29), 1);
                m1 m1VarU = f1.u(new r(22), 1);
                int i14 = a0.o.f152b;
                return new p0(l1VarP, m1VarU);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                kotlin.jvm.internal.m.f((RiveAnimationView) obj, "it");
                return b0Var;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return Integer.valueOf(((Integer) obj).intValue() / 2);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return Integer.valueOf(((Integer) obj).intValue() / 2);
            case 27:
                z navigate = (z) obj;
                kotlin.jvm.internal.m.f(navigate, "$this$navigate");
                navigate.a("course_test", new r(28));
                navigate.f36278b = true;
                return b0Var;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                e0 popUpTo = (e0) obj;
                kotlin.jvm.internal.m.f(popUpTo, "$this$popUpTo");
                popUpTo.f36194a = true;
                return b0Var;
            default:
                ((Boolean) obj).getClass();
                float f11 = p2.f58208a;
                return b0Var;
        }
    }
}
