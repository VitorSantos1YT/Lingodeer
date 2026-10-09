package l1;

import rt.sf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fz.c f39498b;

    public /* synthetic */ x0(fz.c cVar, int i11) {
        this.f39497a = i11;
        this.f39498b = cVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        long j11;
        switch (this.f39497a) {
            case 0:
                return this.f39498b.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
            case 1:
                x1.j jVar = (x1.j) obj;
                synchronized (x1.l.f55691c) {
                    j11 = x1.l.f55693e;
                    x1.l.f55693e = ((long) 1) + j11;
                }
                return new x1.e(j11, jVar, this.f39498b);
            default:
                sf lesson = (sf) obj;
                kotlin.jvm.internal.m.f(lesson, "lesson");
                this.f39498b.invoke(lesson);
                return qy.b0.f48488a;
        }
    }
}
