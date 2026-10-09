package fr;

import com.google.api.Service;
import com.lingo.lingoskill.malskill.ui.learn.MALSyllableIntroductionActivity;
import com.lingodeer.data.model.Bookmark;
import com.lingodeer.data.model.BookmarkFolder;
import com.lingodeer.data.model.SerializablePhonemeLevelTimingResult;
import com.lingodeer.data.model.SerializableSyllableLevelTimingResult;
import com.lingodeer.database.model.DauMetricsEntity;
import com.yalantis.ucrop.view.CropImageView;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n2 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27723a;

    public /* synthetic */ n2(int i11) {
        this.f27723a = i11;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f27723a;
        int i12 = 6;
        int i13 = 23;
        int i14 = 29;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                return Boolean.valueOf(((Bookmark) obj).getFolderId() != null);
            case 1:
                return ((BookmarkFolder) obj).getId();
            case 2:
                DauMetricsEntity it = (DauMetricsEntity) obj;
                kotlin.jvm.internal.m.f(it, "it");
                return it.getId();
            case 3:
                DauMetricsEntity it2 = (DauMetricsEntity) obj;
                kotlin.jvm.internal.m.f(it2, "it");
                return nv.p.k(it2.getFinishLessonType(), it2.getId(), ":");
            case 4:
                vt.a1 record = (vt.a1) obj;
                kotlin.jvm.internal.m.f(record, "record");
                String str = record.f54175a;
                float f5 = record.f54176b;
                int i15 = record.f54177c;
                int i16 = record.f54178d;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(":");
                sb2.append(f5);
                sb2.append(":");
                sb2.append(i15);
                return defpackage.e.g(i16, ":", sb2);
            case 5:
                d2.e drawWithCache = (d2.e) obj;
                kotlin.jvm.internal.m.f(drawWithCache, "$this$drawWithCache");
                return drawWithCache.a(new n2(i12));
            case 6:
                i2.d onDrawBehind = (i2.d) obj;
                kotlin.jvm.internal.m.f(onDrawBehind, "$this$onDrawBehind");
                float fE0 = onDrawBehind.e0(7);
                float fE1 = onDrawBehind.e0(8);
                float fE2 = onDrawBehind.e0(4);
                g2.k kVarA = g2.o.a();
                kVarA.g(CropImageView.DEFAULT_ASPECT_RATIO, fE0);
                kVarA.i(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, fE0, CropImageView.DEFAULT_ASPECT_RATIO);
                kVarA.f(Float.intBitsToFloat((int) (onDrawBehind.d() >> 32)) - fE0, CropImageView.DEFAULT_ASPECT_RATIO);
                kVarA.i(Float.intBitsToFloat((int) (onDrawBehind.d() >> 32)), CropImageView.DEFAULT_ASPECT_RATIO, Float.intBitsToFloat((int) (onDrawBehind.d() >> 32)), fE0);
                kVarA.f(Float.intBitsToFloat((int) (onDrawBehind.d() >> 32)), (Float.intBitsToFloat((int) (onDrawBehind.d() & 4294967295L)) - fE2) - fE0);
                kVarA.i(Float.intBitsToFloat((int) (onDrawBehind.d() >> 32)), Float.intBitsToFloat((int) (onDrawBehind.d() & 4294967295L)) - fE2, Float.intBitsToFloat((int) (onDrawBehind.d() >> 32)) - fE0, Float.intBitsToFloat((int) (onDrawBehind.d() & 4294967295L)) - fE2);
                float f11 = 2;
                float f12 = fE1 / f11;
                kVarA.f((Float.intBitsToFloat((int) (onDrawBehind.d() >> 32)) / f11) + f12, Float.intBitsToFloat((int) (onDrawBehind.d() & 4294967295L)) - fE2);
                kVarA.f(Float.intBitsToFloat((int) (onDrawBehind.d() >> 32)) / f11, Float.intBitsToFloat((int) (onDrawBehind.d() & 4294967295L)));
                kVarA.f((Float.intBitsToFloat((int) (onDrawBehind.d() >> 32)) / f11) - f12, Float.intBitsToFloat((int) (onDrawBehind.d() & 4294967295L)) - fE2);
                kVarA.f(fE0, Float.intBitsToFloat((int) (onDrawBehind.d() & 4294967295L)) - fE2);
                kVarA.i(CropImageView.DEFAULT_ASPECT_RATIO, Float.intBitsToFloat((int) (onDrawBehind.d() & 4294967295L)) - fE2, CropImageView.DEFAULT_ASPECT_RATIO, (Float.intBitsToFloat((int) (onDrawBehind.d() & 4294967295L)) - fE2) - fE0);
                kVarA.d();
                i2.d.o0(onDrawBehind, kVarA, g2.f0.e(4294958780L), CropImageView.DEFAULT_ASPECT_RATIO, null, 60);
                i2.d.o0(onDrawBehind, kVarA, g2.f0.e(4294937625L), CropImageView.DEFAULT_ASPECT_RATIO, new i2.h(onDrawBehind.e0(1), CropImageView.DEFAULT_ASPECT_RATIO, 0, 0, null, 30), 52);
                return b0Var;
            case 7:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 8:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 9:
                a0.y AnimatedContent = (a0.y) obj;
                kotlin.jvm.internal.m.f(AnimatedContent, "$this$AnimatedContent");
                a0.l1 l1VarA = a0.f1.r(new n2(12), 1).a(a0.f1.e(null, 3));
                a0.m1 m1VarA = a0.f1.w(new b0.k2(i14), 1).a(a0.f1.f(null, 3));
                int i17 = a0.o.f152b;
                return new a0.p0(l1VarA, m1VarA);
            case 10:
                a0.y AnimatedContent2 = (a0.y) obj;
                kotlin.jvm.internal.m.f(AnimatedContent2, "$this$AnimatedContent");
                a0.l1 l1VarA2 = a0.f1.r(new n2(11), 1).a(a0.f1.e(null, 3));
                a0.m1 m1VarA2 = a0.f1.w(new b0.k2(i14), 1).a(a0.f1.f(null, 3));
                int i18 = a0.o.f152b;
                return new a0.p0(l1VarA2, m1VarA2);
            case 11:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 12:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 13:
                a0.y AnimatedContent3 = (a0.y) obj;
                kotlin.jvm.internal.m.f(AnimatedContent3, "$this$AnimatedContent");
                a0.l1 l1VarA3 = a0.f1.r(new b0.k2(i14), 1).a(a0.f1.e(null, 3));
                a0.m1 m1VarA3 = a0.f1.w(new n2(15), 1).a(a0.f1.f(null, 3));
                int i19 = a0.o.f152b;
                return new a0.p0(l1VarA3, m1VarA3);
            case 14:
                g2.t0 graphicsLayer = (g2.t0) obj;
                kotlin.jvm.internal.m.f(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.b(0.2f);
                return b0Var;
            case 15:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 16:
                return Integer.valueOf(((Integer) obj).intValue() / 2);
            case 17:
                return Integer.valueOf(((Integer) obj).intValue() / 2);
            case 18:
                List argSerializers = (List) obj;
                kotlin.jvm.internal.m.f(argSerializers, "argSerializers");
                return new ha.p((c00.a) ry.m.q0(argSerializers));
            case 19:
                g2.t0 graphicsLayer2 = (g2.t0) obj;
                kotlin.jvm.internal.m.f(graphicsLayer2, "$this$graphicsLayer");
                graphicsLayer2.b(0.8f);
                return b0Var;
            case 20:
                return new v3.j((((long) 0) << 32) | (((long) ((int) (((v3.l) obj).f53498a & 4294967295L))) & 4294967295L));
            case 21:
                return new v3.j((((long) 0) << 32) | (((long) ((int) (((v3.l) obj).f53498a & 4294967295L))) & 4294967295L));
            case 22:
                i2.d LinearProgressIndicator = (i2.d) obj;
                kotlin.jvm.internal.m.f(LinearProgressIndicator, "$this$LinearProgressIndicator");
                return b0Var;
            case 23:
                return Integer.valueOf(-((Integer) obj).intValue());
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                a0.y AnimatedContent4 = (a0.y) obj;
                kotlin.jvm.internal.m.f(AnimatedContent4, "$this$AnimatedContent");
                a0.l1 l1VarA4 = a0.f1.q(b0.e.r(220, 90, null, 4), new n2(i13)).a(a0.f1.g(b0.e.r(220, 90, null, 4), 0.92f, 4));
                a0.m1 m1VarV = a0.f1.v(b0.e.r(90, 0, null, 6), new b0.k2(i14));
                int i21 = a0.o.f152b;
                return new a0.p0(l1VarA4, m1VarV);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return ((SerializablePhonemeLevelTimingResult) obj).getPhoneme();
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return ((SerializableSyllableLevelTimingResult) obj).getSyllable();
            case 27:
                e00.a buildSerialDescriptor = (e00.a) obj;
                kotlin.jvm.internal.m.f(buildSerialDescriptor, "$this$buildSerialDescriptor");
                e00.a.a(buildSerialDescriptor, "JsonPrimitive", new h00.p(new fk.a(22)));
                e00.a.a(buildSerialDescriptor, "JsonNull", new h00.p(new fk.a(i13)));
                e00.a.a(buildSerialDescriptor, "JsonLiteral", new h00.p(new fk.a(24)));
                e00.a.a(buildSerialDescriptor, "JsonObject", new h00.p(new fk.a(25)));
                e00.a.a(buildSerialDescriptor, "JsonArray", new h00.p(new fk.a(26)));
                return b0Var;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                Map.Entry entry = (Map.Entry) obj;
                kotlin.jvm.internal.m.f(entry, "<destruct>");
                String str2 = (String) entry.getKey();
                h00.m mVar = (h00.m) entry.getValue();
                StringBuilder sb3 = new StringBuilder();
                i00.z.a(sb3, str2);
                sb3.append(':');
                sb3.append(mVar);
                return sb3.toString();
            default:
                m0.t item = (m0.t) obj;
                int i22 = MALSyllableIntroductionActivity.Q;
                kotlin.jvm.internal.m.f(item, "$this$item");
                return new m0.d(ob.f.a(5));
        }
    }
}
