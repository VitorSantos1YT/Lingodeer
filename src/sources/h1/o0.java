package h1;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends kotlin.jvm.internal.n implements fz.c {
    public static final o0 H;
    public static final o0 K;
    public static final o0 L;
    public static final o0 M;
    public static final o0 N;
    public static final o0 O;
    public static final o0 P;
    public static final o0 Q;
    public static final o0 R;
    public static final o0 S;
    public static final o0 T;
    public static final o0 U;
    public static final o0 V;
    public static final o0 W;
    public static final o0 X;
    public static final o0 Y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o0 f30765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o0 f30766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o0 f30767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o0 f30768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o0 f30769f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final o0 f30770t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30771a;

    static {
        int i11 = 1;
        f30765b = new o0(i11, 0);
        f30766c = new o0(i11, 1);
        f30767d = new o0(i11, 2);
        f30768e = new o0(i11, 3);
        f30769f = new o0(i11, 4);
        f30770t = new o0(i11, 5);
        H = new o0(i11, 6);
        K = new o0(i11, 7);
        L = new o0(i11, 8);
        M = new o0(i11, 9);
        N = new o0(i11, 10);
        O = new o0(i11, 11);
        P = new o0(i11, 12);
        Q = new o0(i11, 13);
        R = new o0(i11, 14);
        S = new o0(i11, 15);
        T = new o0(i11, 16);
        U = new o0(i11, 17);
        V = new o0(i11, 18);
        W = new o0(i11, 19);
        X = new o0(i11, 20);
        Y = new o0(i11, 21);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(int i11, int i12) {
        super(i11);
        this.f30771a = i12;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f30771a;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                g3.z.d((g3.b0) obj, 0);
                return b0Var;
            case 1:
                g3.z.d((g3.b0) obj, 1);
                return b0Var;
            case 2:
                mz.j[] jVarArr = g3.z.f28737a;
                g3.a0 a0Var = g3.x.f28721l;
                mz.j jVar = g3.z.f28737a[5];
                ((g3.b0) obj).b(a0Var, Boolean.TRUE);
                return b0Var;
            case 3:
                return b0Var;
            case 4:
                return b0Var;
            case 5:
                return b0Var;
            case 6:
                mz.j[] jVarArr2 = g3.z.f28737a;
                g3.a0 a0Var2 = g3.x.f28721l;
                mz.j jVar2 = g3.z.f28737a[5];
                ((g3.b0) obj).b(a0Var2, Boolean.TRUE);
                return b0Var;
            case 7:
                g3.l lVar = new g3.l(t1.f31092f, t1.f31093t);
                mz.j[] jVarArr3 = g3.z.f28737a;
                g3.a0 a0Var3 = g3.x.f28730v;
                mz.j jVar3 = g3.z.f28737a[13];
                ((g3.b0) obj).b(a0Var3, lVar);
                return b0Var;
            case 8:
                g3.z.d((g3.b0) obj, 0);
                return b0Var;
            case 9:
                g3.z.f((g3.b0) obj);
                return b0Var;
            case 10:
                return Boolean.TRUE;
            case 11:
                mz.j[] jVarArr4 = g3.z.f28737a;
                ((g3.b0) obj).b(g3.x.f28732x, b0Var);
                return b0Var;
            case 12:
                return b0Var;
            case 13:
                return b0Var;
            case 14:
                return b0Var;
            case 15:
                mz.j[] jVarArr5 = g3.z.f28737a;
                g3.a0 a0Var4 = g3.x.f28721l;
                mz.j jVar4 = g3.z.f28737a[5];
                ((g3.b0) obj).b(a0Var4, Boolean.TRUE);
                return b0Var;
            case 16:
                return b0Var;
            case 17:
                mz.j[] jVarArr6 = g3.z.f28737a;
                ((g3.b0) obj).b(g3.x.f28714e, b0Var);
                return b0Var;
            case 18:
                return b0Var;
            case 19:
                g3.z.f((g3.b0) obj);
                return b0Var;
            case 20:
                List list = (List) obj;
                Object obj2 = list.get(0);
                kotlin.jvm.internal.m.d(obj2, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj2).intValue();
                Object obj3 = list.get(1);
                kotlin.jvm.internal.m.d(obj3, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue2 = ((Integer) obj3).intValue();
                Object obj4 = list.get(2);
                kotlin.jvm.internal.m.d(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                return new zb(iIntValue, iIntValue2, ((Boolean) obj4).booleanValue());
            default:
                List list2 = (List) obj;
                return new cc(((Number) list2.get(0)).floatValue(), ((Number) list2.get(1)).floatValue(), ((Number) list2.get(2)).floatValue());
        }
    }
}
