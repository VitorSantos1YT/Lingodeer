package bt;

import com.lingodeer.course.stroke_order_view_new.old.HwView;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.SyllableWriteCharacter;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e4 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5351e;

    public /* synthetic */ e4(int i11, Object obj, Object obj2, Object obj3, boolean z11) {
        this.f5347a = i11;
        this.f5348b = z11;
        this.f5349c = obj;
        this.f5350d = obj2;
        this.f5351e = obj3;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f5347a) {
            case 0:
                return Boolean.valueOf(!this.f5348b && ((Boolean) ((l1.b3) this.f5349c).getValue()).booleanValue() && ((l1.h1) ((l1.a1) this.f5350d)).l() > 2 && ((l1.h1) ((l1.a1) this.f5351e)).l() < 2);
            case 1:
                CourseSentence courseSentence = (CourseSentence) this.f5349c;
                CourseSentence courseSentence2 = (CourseSentence) this.f5350d;
                fz.e eVar = (fz.e) this.f5351e;
                if (!this.f5348b) {
                    courseSentence = courseSentence2;
                }
                String string = courseSentence.getAudioUri().toString();
                kotlin.jvm.internal.m.e(string, "toString(...)");
                eVar.invoke(string, new ht.h(courseSentence.getVisemedMap()));
                return qy.b0.f48488a;
            case 2:
                fz.c cVar = (fz.c) this.f5349c;
                kr.a1 a1Var = (kr.a1) this.f5350d;
                fz.a aVar = (fz.a) this.f5351e;
                if (this.f5348b) {
                    cVar.invoke(a1Var);
                } else {
                    aVar.invoke();
                }
                return qy.b0.f48488a;
            case 3:
                fz.c cVar2 = (fz.c) this.f5349c;
                rt.k6 k6Var = (rt.k6) this.f5350d;
                fz.c cVar3 = (fz.c) this.f5351e;
                if (this.f5348b) {
                    cVar2.invoke(k6Var);
                } else {
                    cVar3.invoke(k6Var.f49973d);
                }
                return qy.b0.f48488a;
            default:
                SyllableWriteCharacter syllableWriteCharacter = (SyllableWriteCharacter) this.f5349c;
                l1.b1 b1Var = (l1.b1) this.f5350d;
                fz.c cVar4 = (fz.c) this.f5351e;
                HwView hwView = (HwView) b1Var.getValue();
                if (hwView != null) {
                    String charPath = syllableWriteCharacter.getCharPath();
                    List<String> partStrings = syllableWriteCharacter.getPartStrings();
                    List<String> polygonStrings = syllableWriteCharacter.getPolygonStrings();
                    syllableWriteCharacter.getCharacterId();
                    hwView.e(charPath, partStrings, polygonStrings);
                }
                if (this.f5348b) {
                    HwView hwView2 = (HwView) b1Var.getValue();
                    if (hwView2 != null) {
                        hwView2.g();
                    }
                    HwView hwView3 = (HwView) b1Var.getValue();
                    if (hwView3 != null) {
                        hwView3.setTimeGap(100);
                    }
                    HwView hwView4 = (HwView) b1Var.getValue();
                    if (hwView4 != null) {
                        hwView4.setAnimListener(new app.rive.runtime.kotlin.a(cVar4));
                    }
                    HwView hwView5 = (HwView) b1Var.getValue();
                    if (hwView5 != null) {
                        hwView5.f();
                    }
                }
                return qy.b0.f48488a;
        }
    }

    public /* synthetic */ e4(SyllableWriteCharacter syllableWriteCharacter, boolean z11, l1.b1 b1Var, fz.c cVar) {
        this.f5347a = 4;
        this.f5349c = syllableWriteCharacter;
        this.f5348b = z11;
        this.f5350d = b1Var;
        this.f5351e = cVar;
    }
}
