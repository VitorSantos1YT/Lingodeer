package c1;

import j3.t;
import j3.y0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static b f6413h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v3.m f6414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0 f6415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v3.d f6416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n3.h f6417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y0 f6418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f6419f = Float.NaN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f6420g = Float.NaN;

    public b(v3.m mVar, y0 y0Var, v3.d dVar, n3.h hVar) {
        this.f6414a = mVar;
        this.f6415b = y0Var;
        this.f6416c = dVar;
        this.f6417d = hVar;
        this.f6418e = t.j(y0Var, mVar);
    }

    public final long a(int i11, long j11) {
        int i12;
        float f5 = this.f6420g;
        float f11 = this.f6419f;
        if (Float.isNaN(f5) || Float.isNaN(f11)) {
            String str = c.f6421a;
            long jB = v3.b.b(0, 0, 15);
            y0 y0Var = this.f6418e;
            v3.d dVar = this.f6416c;
            float fB = t.a(str, y0Var, jB, dVar, this.f6417d, 1, 96).b();
            float fB2 = t.a(c.f6422b, this.f6418e, v3.b.b(0, 0, 15), dVar, this.f6417d, 2, 96).b() - fB;
            this.f6420g = fB;
            this.f6419f = fB2;
            f11 = fB2;
            f5 = fB;
        }
        if (i11 != 1) {
            int iRound = Math.round((f11 * (i11 - 1)) + f5);
            i12 = iRound >= 0 ? iRound : 0;
            int iG = v3.a.g(j11);
            if (i12 > iG) {
                i12 = iG;
            }
        } else {
            i12 = v3.a.i(j11);
        }
        return v3.b.a(v3.a.j(j11), v3.a.h(j11), i12, v3.a.g(j11));
    }
}
