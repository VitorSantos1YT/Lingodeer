package bt;

import com.lingodeer.data.model.CourseWord;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rz.b0 f5779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jt.u f5780c;

    public /* synthetic */ o0(rz.b0 b0Var, jt.u uVar, int i11) {
        this.f5778a = i11;
        this.f5779b = b0Var;
        this.f5780c = uVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        CourseWord option = (CourseWord) obj;
        switch (this.f5778a) {
            case 0:
                kotlin.jvm.internal.m.f(option, "option");
                rz.e0.B(this.f5779b, null, null, new x0(this.f5780c, option, null, 1), 3);
                break;
            default:
                kotlin.jvm.internal.m.f(option, "stem");
                rz.e0.B(this.f5779b, null, null, new x0(this.f5780c, option, null, 0), 3);
                break;
        }
        return qy.b0.f48488a;
    }
}
