package a0;

import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.n implements fz.c {
    public static final c H;
    public static final c K;
    public static final c L;
    public static final c M;
    public static final c N;
    public static final c O;
    public static final c P;
    public static final c Q;
    public static final c R;
    public static final c S;
    public static final c T;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f28b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f29c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f30d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f31e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f32f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final c f33t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34a;

    static {
        int i11 = 1;
        f28b = new c(i11, 0);
        f29c = new c(i11, 1);
        f30d = new c(i11, 2);
        f31e = new c(i11, 3);
        f32f = new c(i11, 4);
        f33t = new c(i11, 5);
        H = new c(i11, 6);
        K = new c(i11, 7);
        L = new c(i11, 8);
        M = new c(i11, 9);
        N = new c(i11, 10);
        O = new c(i11, 11);
        P = new c(i11, 12);
        Q = new c(i11, 13);
        R = new c(i11, 14);
        S = new c(i11, 15);
        T = new c(i11, 16);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i11, int i12) {
        super(i11);
        this.f34a = i12;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f34a) {
            case 0:
                l1 l1VarA = f1.e(b0.e.r(220, 90, null, 4), 2).a(f1.g(b0.e.r(220, 90, null, 4), 0.92f, 4));
                m1 m1VarF = f1.f(b0.e.r(90, 0, null, 6), 2);
                int i11 = o.f152b;
                return new p0(l1VarA, m1VarF);
            case 1:
                return obj;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 3:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return bool2;
            case 4:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return bool3;
            case 5:
                long jB = g2.x.b(((g2.x) obj).f28624a, h2.e.f31482x);
                return new b0.r(g2.x.e(jB), g2.x.i(jB), g2.x.h(jB), g2.x.f(jB));
            case 6:
                return obj;
            case 7:
                long j11 = ((g2.z0) obj).f28633a;
                return new b0.p(g2.z0.b(j11), g2.z0.c(j11));
            case 8:
                b0.p pVar = (b0.p) obj;
                return new g2.z0(g2.f0.j(pVar.f3630a, pVar.f3631b));
            case 9:
                return b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 7);
            case 10:
                long j12 = ((v3.l) obj).f53498a;
                long j13 = 0;
                return new v3.l((j13 & 4294967295L) | (j13 << 32));
            case 11:
                long j14 = ((v3.l) obj).f53498a;
                long j15 = 0;
                return new v3.l((j15 & 4294967295L) | (j15 << 32));
            case 12:
                return Integer.valueOf((-((Number) obj).intValue()) / 2);
            case 13:
                return Integer.valueOf((-((Number) obj).intValue()) / 2);
            case 14:
                return Integer.valueOf((-((Number) obj).intValue()) / 2);
            case 15:
                return Integer.valueOf((-((Number) obj).intValue()) / 2);
            case 16:
                return f1.f80c;
            case 17:
                return new v3.l((((long) 0) << 32) | (((long) ((int) (((v3.l) obj).f53498a & 4294967295L))) & 4294967295L));
            case 18:
                return new v3.l((((long) ((int) (((v3.l) obj).f53498a >> 32))) << 32) | (((long) 0) & 4294967295L));
            case 19:
                return new v3.l((((long) 0) << 32) | (((long) ((int) (((v3.l) obj).f53498a & 4294967295L))) & 4294967295L));
            default:
                return new v3.l((((long) ((int) (((v3.l) obj).f53498a >> 32))) << 32) | (((long) 0) & 4294967295L));
        }
    }
}
