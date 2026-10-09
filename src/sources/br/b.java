package br;

import android.os.Process;
import android.view.View;
import androidx.datastore.core.CorruptionException;
import com.google.api.Service;
import com.google.firebase.datastorage.JavaDataStorage;
import com.google.firebase.sessions.FirebaseSessionsComponent;
import com.google.firebase.sessions.settings.SessionConfigsSerializer;
import com.lingo.course.ui.CourseTipsActivity;
import com.lingodeer.data.model.CourseWord;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import g00.d1;
import g2.t0;
import y2.k0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4998a;

    public /* synthetic */ b(int i11) {
        this.f4998a = i11;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f4998a;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                wb.f it = (wb.f) obj;
                kotlin.jvm.internal.m.f(it, "it");
                return b0Var;
            case 1:
                ej.l it2 = (ej.l) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                return b0Var;
            case 2:
                hp.d it3 = (hp.d) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                return b0Var;
            case 3:
                ((Integer) obj).getClass();
                return b0Var;
            case 4:
                return Integer.valueOf(((Integer) obj).intValue() / 2);
            case 5:
                CourseWord it4 = (CourseWord) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                return it4.getZhuYin();
            case 6:
                CourseWord it5 = (CourseWord) obj;
                kotlin.jvm.internal.m.f(it5, "it");
                return it5.getWord();
            case 7:
                CourseWord it6 = (CourseWord) obj;
                kotlin.jvm.internal.m.f(it6, "it");
                return it6.getWord();
            case 8:
                CourseWord it7 = (CourseWord) obj;
                kotlin.jvm.internal.m.f(it7, "it");
                return it7.getZhuYin();
            case 9:
                CourseWord it8 = (CourseWord) obj;
                kotlin.jvm.internal.m.f(it8, "it");
                return oz.x.q0(it8.getWord(), "_", BuildConfig.VERSION_NAME);
            case 10:
                k0 onDrawWithContent = (k0) obj;
                kotlin.jvm.internal.m.f(onDrawWithContent, "$this$onDrawWithContent");
                onDrawWithContent.a();
                return b0Var;
            case 11:
                i2.d Canvas = (i2.d) obj;
                kotlin.jvm.internal.m.f(Canvas, "$this$Canvas");
                i2.d.j(Canvas, g2.f0.e(4294540155L), CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, 0, 126);
                float f5 = 1;
                float f11 = 2;
                Canvas.f0(g2.x.f28618e, (((long) Float.floatToRawIntBits(Canvas.e0(f5))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.d() & 4294967295L)) / f11)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.d() >> 32)) - Canvas.e0(f5))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.d() & 4294967295L)) / f11)) & 4294967295L), (480 & 8) != 0 ? 0.0f : Canvas.e0(f5), (480 & 16) != 0 ? 0 : 0, (480 & 32) != 0 ? null : null, 3);
                return b0Var;
            case 12:
                CourseWord it9 = (CourseWord) obj;
                kotlin.jvm.internal.m.f(it9, "it");
                return b0Var;
            case 13:
                CourseWord it10 = (CourseWord) obj;
                kotlin.jvm.internal.m.f(it10, "it");
                return b0Var;
            case 14:
                t0 graphicsLayer = (t0) obj;
                kotlin.jvm.internal.m.f(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.b(CropImageView.DEFAULT_ASPECT_RATIO);
                return b0Var;
            case 15:
                String it11 = (String) obj;
                kotlin.jvm.internal.m.f(it11, "it");
                return it11;
            case 16:
                String it12 = (String) obj;
                kotlin.jvm.internal.m.f(it12, "it");
                return it12;
            case 17:
                CourseWord it13 = (CourseWord) obj;
                kotlin.jvm.internal.m.f(it13, "it");
                return b0Var;
            case 18:
                CourseWord it14 = (CourseWord) obj;
                kotlin.jvm.internal.m.f(it14, "it");
                return it14.getWord();
            case 19:
                return new v3.l((((long) ((int) (((v3.l) obj).f53498a >> 32))) << 32) | (((long) 0) & 4294967295L));
            case 20:
                return new v3.l((((long) ((int) (((v3.l) obj).f53498a >> 32))) << 32) | (((long) 0) & 4294967295L));
            case 21:
                ht.l it15 = (ht.l) obj;
                kotlin.jvm.internal.m.f(it15, "it");
                return b0Var;
            case 22:
                mz.c it16 = (mz.c) obj;
                kotlin.jvm.internal.m.f(it16, "it");
                c00.a aVarL = ob.f.L(it16);
                if (aVarL != null) {
                    return aVarL;
                }
                if (d1.i(it16)) {
                    return new c00.c(it16);
                }
                return null;
            case 23:
                mz.c it17 = (mz.c) obj;
                kotlin.jvm.internal.m.f(it17, "it");
                c00.a aVarL2 = ob.f.L(it17);
                if (aVarL2 == null) {
                    aVarL2 = d1.i(it17) ? new c00.c(it17) : null;
                }
                if (aVarL2 != null) {
                    return qx.b.s(aVarL2);
                }
                return null;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                ((Long) obj).getClass();
                int i12 = CourseTipsActivity.K;
                return b0Var;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                View it18 = (View) obj;
                kotlin.jvm.internal.m.f(it18, "it");
                return b0Var;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                View it19 = (View) obj;
                kotlin.jvm.internal.m.f(it19, "it");
                return b0Var;
            case 27:
                ((Boolean) obj).getClass();
                return b0Var;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                CorruptionException ex2 = (CorruptionException) obj;
                mz.j[] jVarArr = JavaDataStorage.f19599d;
                kotlin.jvm.internal.m.f(ex2, "ex");
                kotlin.jvm.internal.z.a(JavaDataStorage.class).g();
                Process.myPid();
                return new r5.b(true);
            default:
                CorruptionException ex3 = (CorruptionException) obj;
                FirebaseSessionsComponent.MainModule.Companion companion = FirebaseSessionsComponent.MainModule.Companion.f20892a;
                kotlin.jvm.internal.m.f(ex3, "ex");
                SessionConfigsSerializer.f21090a.getClass();
                return SessionConfigsSerializer.f21091b;
        }
    }

    public /* synthetic */ b(JavaDataStorage javaDataStorage) {
        this.f4998a = 28;
    }
}
