package mt;

import android.graphics.DashPathEffect;
import app.rive.runtime.kotlin.RiveAnimationView;
import com.google.api.Service;
import com.lingodeer.course.stroke_order_view_new.old.HwView;
import com.lingodeer.data.model.AchievementLevel;
import com.yalantis.ucrop.view.CropImageView;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f41742b;

    public /* synthetic */ p(int i11, l1.b1 b1Var) {
        this.f41741a = i11;
        this.f41742b = b1Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f41741a;
        long j11 = 4294967295L;
        qy.b0 b0Var = qy.b0.f48488a;
        l1.b1 b1Var = this.f41742b;
        switch (i11) {
            case 0:
                rt.r it = (rt.r) obj;
                kotlin.jvm.internal.m.f(it, "it");
                b1Var.setValue(it);
                break;
            case 1:
                String it2 = (String) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                b1Var.setValue(it2);
                break;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                b1Var.setValue(bool);
                break;
            case 3:
                q2 it3 = (q2) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                b1Var.setValue(it3);
                break;
            case 4:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                b1Var.setValue(bool2);
                break;
            case 5:
                Float f5 = (Float) obj;
                f5.floatValue();
                b1Var.setValue(f5);
                break;
            case 6:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                b1Var.setValue(bool3);
                break;
            case 7:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                b1Var.setValue(bool4);
                break;
            case 8:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                b1Var.setValue(bool5);
                break;
            case 9:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                b1Var.setValue(bool6);
                break;
            case 10:
                Boolean bool7 = (Boolean) obj;
                bool7.booleanValue();
                b1Var.setValue(bool7);
                break;
            case 11:
                b1Var.setValue(Integer.valueOf((int) (((v3.l) obj).f53498a & 4294967295L)));
                break;
            case 12:
                b1Var.setValue(Integer.valueOf(Math.max(((Number) b1Var.getValue()).intValue(), (int) (((v3.l) obj).f53498a & 4294967295L))));
                break;
            case 13:
                Boolean bool8 = (Boolean) obj;
                bool8.booleanValue();
                b1Var.setValue(bool8);
                break;
            case 14:
                Boolean bool9 = (Boolean) obj;
                bool9.booleanValue();
                b1Var.setValue(bool9);
                break;
            case 15:
                rt.k6 content = (rt.k6) obj;
                kotlin.jvm.internal.m.f(content, "content");
                b1Var.setValue(content);
                break;
            case 16:
                i2.d Canvas = (i2.d) obj;
                kotlin.jvm.internal.m.f(Canvas, "$this$Canvas");
                i2.d.p0(Canvas, fr.p3.A(ve.i.t((AchievementLevel) b1Var.getValue())), 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, 126);
                break;
            case 17:
                HwView it4 = (HwView) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                if (((HwView) b1Var.getValue()) == null) {
                    b1Var.setValue(it4);
                }
                break;
            case 18:
                c1.k kVar = (c1.k) obj;
                b1Var.setValue(kVar.f6475c ? kVar.f6474b : kVar.f6473a);
                break;
            case 19:
                List list = (List) obj;
                if (b1Var != null) {
                    b1Var.setValue(list);
                }
                break;
            case 20:
                ((fz.c) b1Var.getValue()).invoke((f2.b) obj);
                break;
            case 21:
                RiveAnimationView it5 = (RiveAnimationView) obj;
                kotlin.jvm.internal.m.f(it5, "it");
                if (((RiveAnimationView) b1Var.getValue()) == null) {
                    b1Var.setValue(it5);
                }
                break;
            case 22:
                qy.l pair = (qy.l) obj;
                kotlin.jvm.internal.m.f(pair, "pair");
                b1Var.setValue(pair);
                break;
            case 23:
                i2.d drawBehind = (i2.d) obj;
                kotlin.jvm.internal.m.f(drawBehind, "$this$drawBehind");
                for (us.a aVar : (List) b1Var.getValue()) {
                    long j12 = aVar.f53074d;
                    float f11 = aVar.f53072b;
                    long j13 = j11;
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(aVar.f53071a)) << 32) | (((long) Float.floatToRawIntBits(f11)) & j13);
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(aVar.f53073c)) << 32) | (((long) Float.floatToRawIntBits(f11)) & j13);
                    float f12 = 2;
                    drawBehind.f0(j12, jFloatToRawIntBits, jFloatToRawIntBits2, (480 & 8) != 0 ? 0.0f : drawBehind.e0(f12), (480 & 16) != 0 ? 0 : 1, (480 & 32) != 0 ? null : new g2.l(new DashPathEffect(new float[]{drawBehind.e0(f12), drawBehind.e0(3)}, CropImageView.DEFAULT_ASPECT_RATIO)), 3);
                    j11 = j13;
                }
                break;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                w2.x it6 = (w2.x) obj;
                kotlin.jvm.internal.m.f(it6, "it");
                b1Var.setValue(Float.valueOf(Float.intBitsToFloat((int) (it6.x(0L) & 4294967295L))));
                break;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                b1Var.setValue(new qy.l(null, new v3.j(0L)));
                break;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                String ch2 = (String) obj;
                kotlin.jvm.internal.m.f(ch2, "ch");
                Set setE1 = ry.m.e1((Set) b1Var.getValue());
                if (setE1.contains(ch2)) {
                    setE1.remove(ch2);
                } else {
                    setE1.add(ch2);
                }
                b1Var.setValue(setE1);
                break;
            case 27:
                b1Var.setValue((w2.x) obj);
                break;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                b1Var.setValue((w2.x) obj);
                break;
            default:
                w2.x it7 = (w2.x) obj;
                kotlin.jvm.internal.m.f(it7, "it");
                long jC = it7.c(0L);
                b1Var.setValue(new v3.j((((long) ((int) Float.intBitsToFloat((int) (jC >> 32)))) << 32) | (((long) ((int) Float.intBitsToFloat((int) (jC & 4294967295L)))) & 4294967295L)));
                break;
        }
        return b0Var;
    }
}
