package z2;

import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.api.Service;
import com.google.firebase.iid.QyE.SemtNwfPgIhi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends kotlin.jvm.internal.n implements fz.a {
    public static final h0 H;
    public static final h0 K;
    public static final h0 L;
    public static final h0 M;
    public static final h0 N;
    public static final h0 O;
    public static final h0 P;
    public static final h0 Q;
    public static final h0 R;
    public static final h0 S;
    public static final h0 T;
    public static final h0 U;
    public static final h0 V;
    public static final h0 W;
    public static final h0 X;
    public static final h0 Y;
    public static final h0 Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final h0 f58569a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h0 f58570b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final h0 f58571b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h0 f58572c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final h0 f58573c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h0 f58574d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final h0 f58575d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h0 f58576e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final h0 f58577e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h0 f58578f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final h0 f58579f0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final h0 f58580t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58581a;

    static {
        int i11 = 0;
        f58570b = new h0(i11, 0);
        f58572c = new h0(i11, 1);
        f58574d = new h0(i11, 2);
        f58576e = new h0(i11, 3);
        f58578f = new h0(i11, 4);
        f58580t = new h0(i11, 5);
        H = new h0(i11, 6);
        K = new h0(i11, 7);
        L = new h0(i11, 8);
        M = new h0(i11, 9);
        N = new h0(i11, 10);
        O = new h0(i11, 11);
        P = new h0(i11, 12);
        Q = new h0(i11, 13);
        R = new h0(i11, 14);
        S = new h0(i11, 15);
        T = new h0(i11, 16);
        U = new h0(i11, 17);
        V = new h0(i11, 18);
        W = new h0(i11, 19);
        X = new h0(i11, 20);
        Y = new h0(i11, 21);
        Z = new h0(i11, 22);
        f58569a0 = new h0(i11, 23);
        f58571b0 = new h0(i11, 24);
        f58573c0 = new h0(i11, 25);
        f58575d0 = new h0(i11, 26);
        f58577e0 = new h0(i11, 27);
        f58579f0 = new h0(i11, 28);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(int i11, int i12) {
        super(i11);
        this.f58581a = i12;
    }

    @Override // fz.a
    public final Object invoke() {
        Choreographer choreographer;
        vy.d dVar = null;
        switch (this.f58581a) {
            case 0:
                AndroidCompositionLocals_androidKt.b("LocalConfiguration");
                throw null;
            case 1:
                AndroidCompositionLocals_androidKt.b("LocalContext");
                throw null;
            case 2:
                AndroidCompositionLocals_androidKt.b("LocalImageVectorCache");
                throw null;
            case 3:
                AndroidCompositionLocals_androidKt.b("LocalResourceIdCache");
                throw null;
            case 4:
                AndroidCompositionLocals_androidKt.b("LocalView");
                throw null;
            case 5:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    yz.f fVar = rz.o0.f50940a;
                    choreographer = (Choreographer) rz.e0.F(wz.m.f55536a, new jp.t0(2, 9, dVar));
                }
                p0 p0Var = new p0(choreographer, md.a.h(Looper.getMainLooper()));
                return p0Var.plus(p0Var.L);
            case 6:
            case 7:
                return null;
            case 8:
                g1.b("LocalAutofillManager");
                throw null;
            case 9:
                g1.b(SemtNwfPgIhi.NHfWUgWuflOJww);
                throw null;
            case 10:
                g1.b("LocalClipboard");
                throw null;
            case 11:
                g1.b("LocalClipboardManager");
                throw null;
            case 12:
                return Boolean.TRUE;
            case 13:
                g1.b("LocalDensity");
                throw null;
            case 14:
                g1.b("LocalFocusManager");
                throw null;
            case 15:
                g1.b("LocalFontFamilyResolver");
                throw null;
            case 16:
                g1.b("LocalFontLoader");
                throw null;
            case 17:
                g1.b("LocalGraphicsContext");
                throw null;
            case 18:
                g1.b("LocalHapticFeedback");
                throw null;
            case 19:
                g1.b("LocalInputManager");
                throw null;
            case 20:
                g1.b("LocalLayoutDirection");
                throw null;
            case 21:
                return null;
            case 22:
                return Boolean.FALSE;
            case 23:
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return null;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                g1.b("LocalTextToolbar");
                throw null;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                g1.b("LocalUriHandler");
                throw null;
            case 27:
                g1.b("LocalViewConfiguration");
                throw null;
            default:
                g1.b("LocalWindowInfo");
                throw null;
        }
    }
}
