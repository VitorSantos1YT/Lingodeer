package h1;

import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 extends kotlin.jvm.internal.n implements fz.a {
    public static final t1 H;
    public static final t1 K;
    public static final t1 L;
    public static final t1 M;
    public static final t1 N;
    public static final t1 O;
    public static final t1 P;
    public static final t1 Q;
    public static final t1 R;
    public static final t1 S;
    public static final t1 T;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t1 f31088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t1 f31089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t1 f31090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t1 f31091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t1 f31092f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final t1 f31093t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31094a;

    static {
        int i11 = 0;
        f31088b = new t1(i11, 0);
        f31089c = new t1(i11, 1);
        f31090d = new t1(i11, 2);
        f31091e = new t1(i11, 3);
        f31092f = new t1(i11, 4);
        f31093t = new t1(i11, 5);
        H = new t1(i11, 6);
        K = new t1(i11, 7);
        L = new t1(i11, 8);
        M = new t1(i11, 9);
        N = new t1(i11, 10);
        O = new t1(i11, 11);
        P = new t1(i11, 12);
        Q = new t1(i11, 13);
        R = new t1(i11, 14);
        S = new t1(i11, 15);
        T = new t1(i11, 16);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t1(int i11, int i12) {
        super(i11);
        this.f31094a = i12;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f31094a) {
            case 0:
                return v1.e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15);
            case 1:
                return Boolean.TRUE;
            case 2:
                return new g2.x(g2.x.f28615b);
            case 3:
                return l1.t.B(BuildConfig.VERSION_NAME);
            case 4:
                return Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO);
            case 5:
                return Float.valueOf(CropImageView.DEFAULT_ASPECT_RATIO);
            case 6:
                return Boolean.TRUE;
            case 7:
                return new v3.f(48);
            case 8:
                return Boolean.FALSE;
            case 9:
                return UUID.randomUUID();
            case 10:
                return new j7();
            case 11:
                return Boolean.FALSE;
            case 12:
                return new w7();
            case 13:
                return new v3.f(0);
            case 14:
                return k1.t0.f37765a;
            case 15:
                return Boolean.TRUE;
            case 16:
                return new dc(k1.s0.f37753d, k1.s0.f37754e, k1.s0.f37755f, k1.s0.f37756g, k1.s0.f37757h, k1.s0.f37758i, k1.s0.m, k1.s0.f37762n, k1.s0.f37763o, k1.s0.f37750a, k1.s0.f37751b, k1.s0.f37752c, k1.s0.f37759j, k1.s0.f37760k, k1.s0.f37761l);
            default:
                return new cc(-3.4028235E38f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
        }
    }
}
