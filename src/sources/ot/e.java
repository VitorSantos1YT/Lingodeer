package ot;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt.i0 f45793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vt.n0 f45794b;

    public e(vt.i0 courseRepository, vt.n0 envRepository, int i11) {
        switch (i11) {
            case 1:
                kotlin.jvm.internal.m.f(courseRepository, "courseRepository");
                kotlin.jvm.internal.m.f(envRepository, "envRepository");
                this.f45793a = courseRepository;
                this.f45794b = envRepository;
                break;
            default:
                kotlin.jvm.internal.m.f(courseRepository, "courseRepository");
                kotlin.jvm.internal.m.f(envRepository, "envRepository");
                this.f45793a = courseRepository;
                this.f45794b = envRepository;
                break;
        }
    }

    public uz.i a(long j11) {
        bh.t tVar = (bh.t) this.f45793a;
        tVar.getClass();
        bh.r rVar = new bh.r(new gp.r(new bh.c(j11, tVar, (vy.d) null, 8)), this, 13);
        yz.f fVar = rz.o0.f50940a;
        return uz.x0.w(rVar, yz.e.f58387a);
    }

    public uz.i b(long j11, ht.r wordSpellType) {
        kotlin.jvm.internal.m.f(wordSpellType, "wordSpellType");
        bh.t tVar = (bh.t) this.f45793a;
        tVar.getClass();
        no.g gVar = new no.g(new gp.r(new bh.c(j11, tVar, (vy.d) null, 10)), this, wordSpellType, 1);
        yz.f fVar = rz.o0.f50940a;
        return uz.x0.w(gVar, yz.e.f58387a);
    }
}
