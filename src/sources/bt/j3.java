package bt;

import com.lingodeer.data.model.CourseSentence;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j3 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rz.b0 f5570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jt.j0 f5571c;

    public /* synthetic */ j3(rz.b0 b0Var, jt.j0 j0Var, int i11) {
        this.f5569a = i11;
        this.f5570b = b0Var;
        this.f5571c = j0Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        CourseSentence it = (CourseSentence) obj;
        switch (this.f5569a) {
            case 0:
                kotlin.jvm.internal.m.f(it, "it");
                rz.e0.B(this.f5570b, null, null, new m3(this.f5571c, it, null, 0), 3);
                break;
            default:
                kotlin.jvm.internal.m.f(it, "it");
                rz.e0.B(this.f5570b, null, null, new m3(this.f5571c, it, null, 1), 3);
                break;
        }
        return qy.b0.f48488a;
    }
}
