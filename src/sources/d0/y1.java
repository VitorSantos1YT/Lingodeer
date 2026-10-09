package d0;

import androidx.drawerlayout.widget.ktFt.FpIL;
import com.google.api.Service;
import com.lingo.lingoskill.grkskill.ui.learn.GRKSyllableIntroductionActivity;
import com.lingodeer.data.model.CourseWord;
import dt.k3;
import dt.z4;
import java.util.Map;
import java.util.Set;
import l1.c3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y1 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22843a;

    public /* synthetic */ y1(int i11) {
        this.f22843a = i11;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f22843a;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                g3.z.c((g3.b0) obj, g3.j.f28652d);
                return b0Var;
            case 1:
                return new d2(((Integer) obj).intValue());
            case 2:
                f2.b bVar = (f2.b) obj;
                long j11 = bVar.f26570a;
                return (9223372034707292159L & j11) != 9205357640488583168L ? new b0.p(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (bVar.f26570a & 4294967295L))) : d1.i0.f22922a;
            case 3:
                b0.p pVar = (b0.p) obj;
                return new f2.b((((long) Float.floatToRawIntBits(pVar.f3630a)) << 32) | (((long) Float.floatToRawIntBits(pVar.f3631b)) & 4294967295L));
            case 4:
                m0.t item = (m0.t) obj;
                int i12 = GRKSyllableIntroductionActivity.H;
                kotlin.jvm.internal.m.f(item, "$this$item");
                return new m0.d(ob.f.a(6));
            case 5:
                m0.t item2 = (m0.t) obj;
                int i13 = GRKSyllableIntroductionActivity.H;
                kotlin.jvm.internal.m.f(item2, "$this$item");
                return new m0.d(ob.f.a(6));
            case 6:
                m0.t item3 = (m0.t) obj;
                int i14 = GRKSyllableIntroductionActivity.H;
                kotlin.jvm.internal.m.f(item3, "$this$item");
                return new m0.d(ob.f.a(6));
            case 7:
                return gb.r.I((String) obj).concat(FpIL.BERNmMj);
            case 8:
                return gb.r.I((String) obj);
            case 9:
                return ((Long) obj).longValue() == -1 ? "cd" : "c";
            case 10:
                ((Long) obj).getClass();
                Set set = dr.k.f23560f;
                return "tp";
            case 11:
                ((Long) obj).getClass();
                Set set2 = dr.k.f23560f;
                return "cd";
            case 12:
                Map.Entry entry = (Map.Entry) obj;
                kotlin.jvm.internal.m.f(entry, "<destruct>");
                return ((Number) entry.getKey()).longValue() + ":" + ((Number) entry.getValue()).intValue();
            case 13:
                z4 it = (z4) obj;
                kotlin.jvm.internal.m.f(it, "it");
                return b0Var;
            case 14:
                return Integer.valueOf(((Integer) obj).intValue() / 3);
            case 15:
                z4 it2 = (z4) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                return b0Var;
            case 16:
                g2.t0 graphicsLayer = (g2.t0) obj;
                kotlin.jvm.internal.m.f(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.b(0.6f);
                return b0Var;
            case 17:
                CourseWord it3 = (CourseWord) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                return b0Var;
            case 18:
                f2.c it4 = (f2.c) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                return b0Var;
            case 19:
                ((Integer) obj).getClass();
                c3 c3Var = k3.f23943a;
                return b0Var;
            case 20:
                return new v3.l((((long) ((int) (((v3.l) obj).f53498a >> 32))) << 32) | (((long) 0) & 4294967295L));
            case 21:
                return new v3.l((((long) ((int) (((v3.l) obj).f53498a >> 32))) << 32) | (((long) 0) & 4294967295L));
            case 22:
                return new v3.l((((long) ((int) (((v3.l) obj).f53498a >> 32))) << 32) | (((long) 0) & 4294967295L));
            case 23:
                return new v3.l((((long) ((int) (((v3.l) obj).f53498a >> 32))) << 32) | (((long) 0) & 4294967295L));
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                CourseWord it5 = (CourseWord) obj;
                kotlin.jvm.internal.m.f(it5, "it");
                return it5.getWord();
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                CourseWord it6 = (CourseWord) obj;
                kotlin.jvm.internal.m.f(it6, "it");
                return b0Var;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                CourseWord it7 = (CourseWord) obj;
                kotlin.jvm.internal.m.f(it7, "it");
                return b0Var;
            case 27:
                g3.b0 semantics = (g3.b0) obj;
                kotlin.jvm.internal.m.f(semantics, "$this$semantics");
                return b0Var;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                CourseWord it8 = (CourseWord) obj;
                kotlin.jvm.internal.m.f(it8, "it");
                return Integer.valueOf(it8.getRandomId());
            default:
                z4 it9 = (z4) obj;
                kotlin.jvm.internal.m.f(it9, "it");
                return b0Var;
        }
    }
}
