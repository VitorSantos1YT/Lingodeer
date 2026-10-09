package dt;

import com.lingodeer.data.model.CourseWord;
import java.util.List;
import rt.p8;
import rt.r8;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l4 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f23986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f23988d;

    public /* synthetic */ l4(List list, r8 r8Var, boolean z11) {
        this.f23985a = 1;
        this.f23987c = list;
        this.f23988d = r8Var;
        this.f23986b = z11;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f23985a) {
            case 0:
                fz.c cVar = (fz.c) this.f23987c;
                CourseWord courseWord = (CourseWord) this.f23988d;
                if (this.f23986b) {
                    cVar.invoke(courseWord);
                }
                return qy.b0.f48488a;
            case 1:
                return new a20.a(2, ry.l.l0(new Object[]{(List) this.f23987c, (r8) this.f23988d, Boolean.valueOf(this.f23986b)}));
            case 2:
                fz.c cVar2 = (fz.c) this.f23987c;
                p8 p8Var = (p8) this.f23988d;
                if (this.f23986b) {
                    cVar2.invoke(p8Var);
                }
                return qy.b0.f48488a;
            case 3:
                fz.c cVar3 = (fz.c) this.f23987c;
                fz.a aVar = (fz.a) this.f23988d;
                if (this.f23986b) {
                    aVar.invoke();
                } else {
                    cVar3.invoke("offline_learning");
                }
                return qy.b0.f48488a;
            default:
                fz.a aVar2 = (fz.a) this.f23987c;
                l1.b1 b1Var = (l1.b1) this.f23988d;
                if (this.f23986b) {
                    aVar2.invoke();
                } else {
                    b1Var.setValue(Boolean.TRUE);
                }
                return qy.b0.f48488a;
        }
    }

    public /* synthetic */ l4(boolean z11, qy.e eVar, Object obj, int i11) {
        this.f23985a = i11;
        this.f23986b = z11;
        this.f23987c = eVar;
        this.f23988d = obj;
    }
}
