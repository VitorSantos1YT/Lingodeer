package fk;

import android.os.Bundle;
import b7.e0;
import cf.x;
import com.google.api.Service;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import e00.g;
import e00.m;
import g00.a1;
import g00.m0;
import h00.b0;
import h00.u;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.z;
import l1.c3;
import ns.o;
import ot.h;
import ot.j;
import ot.l;
import ot.p;
import ot.s;
import oz.q;
import ry.n;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27333a;

    public /* synthetic */ a(int i11) {
        this.f27333a = i11;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = 0;
        switch (this.f27333a) {
            case 0:
                Bundle bundle = new Bundle();
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                if (x.n().esMFSwitch == 0) {
                    bundle.putString("type", "male");
                } else {
                    bundle.putString("type", "female");
                }
                return bundle;
            case 1:
                CourseWord courseWord = ft.a.f28034b;
                CourseWord courseWord2 = ft.a.f28035c;
                CourseWord courseWord3 = ft.a.f28036d;
                CourseWord courseWord4 = ft.a.f28037e;
                return new CourseSentence(1L, "I am from Korea", "1;2;3;4", BuildConfig.VERSION_NAME, "我来自韩国", BuildConfig.VERSION_NAME, null, null, null, false, false, false, o.L(courseWord, courseWord2, courseWord3, courseWord4), c.a.G(3, o.L(courseWord, courseWord2, courseWord3, courseWord4)), null, null, null, null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, 0, 8376256, null);
            case 2:
                CourseSentence courseSentenceA = ft.a.a();
                CourseWord courseWord5 = ft.a.f28034b;
                CourseWord courseWord6 = ft.a.f28035c;
                CourseWord courseWord7 = ft.a.f28036d;
                CourseWord courseWord8 = ft.a.f28038f;
                CourseSentence courseSentence = new CourseSentence(2L, "I am from China", "1;2;3;5", BuildConfig.VERSION_NAME, "我来自中国", BuildConfig.VERSION_NAME, null, null, null, false, false, false, o.L(courseWord5, courseWord6, courseWord7, courseWord8), c.a.G(3, o.L(courseWord5, courseWord6, courseWord7, courseWord8)), null, null, null, null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, 0, 8376256, null);
                CourseWord courseWord9 = ft.a.f28039g;
                CourseSentence courseSentence2 = new CourseSentence(3L, "I am from USA", "1;2;3;6", BuildConfig.VERSION_NAME, "我来自美国", BuildConfig.VERSION_NAME, null, null, null, false, false, false, o.L(courseWord5, courseWord6, courseWord7, courseWord9), c.a.G(3, o.L(courseWord5, courseWord6, courseWord7, courseWord9)), null, null, null, null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, 0, 8376256, null);
                CourseWord courseWord10 = ft.a.f28040h;
                return o.L(courseSentenceA, courseSentence, courseSentence2, new CourseSentence(4L, "I am from Japan", "1;2;3;7", BuildConfig.VERSION_NAME, "我来自日本", BuildConfig.VERSION_NAME, null, null, null, false, false, false, o.L(courseWord5, courseWord6, courseWord7, courseWord10), c.a.G(3, o.L(courseWord5, courseWord6, courseWord7, courseWord10)), null, null, null, null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, 0, 8376256, null));
            case 3:
                return new h(ft.a.a(), 1L, (List) ft.a.f28043k.getValue());
            case 4:
                return new j(ft.a.a(), o.L(ft.a.f28034b, ft.a.f28035c, ft.a.f28036d, ft.a.f28037e, ft.a.f28040h));
            case 5:
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < 4; i12++) {
                    arrayList.addAll(o.L(ft.a.f28034b, ft.a.f28036d, ft.a.f28037e, ft.a.f28040h));
                }
                CourseSentence courseSentenceA2 = ft.a.a();
                ArrayList arrayList2 = new ArrayList(n.W(arrayList, 10));
                int size = arrayList.size();
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    arrayList2.add(CourseWord.copy$default((CourseWord) obj, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, UUID.randomUUID().hashCode(), -1, 31, null));
                }
                return new p(courseSentenceA2, arrayList2, o.K(ft.a.f28035c));
            case 6:
                CourseSentence courseSentenceA3 = ft.a.a();
                CourseWord courseWord11 = ft.a.f28037e;
                return new l(courseSentenceA3, o.K(courseWord11), c.a.G(3, o.L(ft.a.f28034b, ft.a.f28035c, ft.a.f28036d, ft.a.f28041i)), o.L(courseWord11, ft.a.f28038f, ft.a.f28039g, ft.a.f28040h));
            case 7:
                CourseSentence courseSentenceA4 = ft.a.a();
                CourseWord courseWord12 = ft.a.f28034b;
                CourseWord courseWord13 = ft.a.f28035c;
                CourseWord courseWord14 = ft.a.f28036d;
                CourseWord courseWord15 = ft.a.f28037e;
                return new ot.n(courseSentenceA4, o.S(o.L(courseWord12, courseWord13, courseWord14, courseWord15, ft.a.f28038f, ft.a.f28039g, ft.a.f28040h)), o.K(o.L(courseWord12, courseWord13, courseWord14, courseWord15)));
            case 8:
                return new s(ft.a.a(), 1L, (List) ft.a.f28043k.getValue());
            case 9:
                CourseSentence courseSentenceA5 = ft.a.a();
                CourseWord courseWord16 = ft.a.f28034b;
                CourseWord courseWord17 = ft.a.f28041i;
                return new ot.c(courseSentenceA5, c.a.G(3, o.L(courseWord16, courseWord17, ft.a.f28036d, courseWord17)), o.L(ft.a.f28035c, ft.a.f28037e, ft.a.f28038f, ft.a.f28039g));
            case 10:
                return xt.b.b();
            case 11:
                return xt.b.e();
            case 12:
                return xt.b.e();
            case 13:
                m mVar = m.f24703f;
                g[] gVarArr = new g[0];
                if (q.K0("kotlin.Unit")) {
                    throw new IllegalArgumentException("Blank serial names are prohibited");
                }
                if (mVar.equals(m.f24700c)) {
                    throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                }
                e00.a aVar = new e00.a("kotlin.Unit");
                return new e00.h("kotlin.Unit", mVar, aVar.f24663b.size(), ry.l.k0(gVarArr), aVar);
            case 14:
                c3 c3Var = g1.j.f28525a;
                return g1.c.f28515a;
            case 15:
                kotlin.jvm.internal.m.c(LingoSkillApplication.f21665b);
                return new di.a(i11);
            case 16:
                return e0.e("type", "play_stroke_video");
            case 17:
                return e0.e("type", "write_stroke_shadow");
            case 18:
                return e0.e("type", "write_stroke_freestyle");
            case 19:
                return (wt.q) ((c20.b) vc.a.m().f519c).f6515d.a(null, null, z.a(wt.q.class));
            case 20:
                return com.bumptech.glide.d.G("splash");
            case 21:
                return com.bumptech.glide.d.G("splash");
            case 22:
                return h00.e0.f29921b;
            case 23:
                return h00.x.f29948b;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return u.f29946b;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return b0.f29914b;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return h00.g.f29926b;
            case 27:
                return new g00.d(m0.f28434a, 0);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return e0.e("type", "fluent");
            default:
                return e0.e("source", "listen_and_learn");
        }
    }

    public /* synthetic */ a(a1 a1Var) {
        this.f27333a = 13;
    }
}
