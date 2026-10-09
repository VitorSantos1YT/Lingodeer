package z3;

import androidx.compose.ui.window.PopupLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f58742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f58743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f58744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f58745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f58746f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final c f58747t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58748a;

    static {
        int i11 = 1;
        f58742b = new c(i11, 0);
        f58743c = new c(i11, 1);
        f58744d = new c(i11, 2);
        f58745e = new c(i11, 3);
        f58746f = new c(i11, 4);
        f58747t = new c(i11, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i11, int i12) {
        super(i11);
        this.f58748a = i12;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f58748a;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                mz.j[] jVarArr = g3.z.f28737a;
                ((g3.b0) obj).b(g3.x.f28732x, b0Var);
                break;
            case 1:
                ((Number) obj).longValue();
                break;
            case 2:
                break;
            case 3:
                mz.j[] jVarArr2 = g3.z.f28737a;
                ((g3.b0) obj).b(g3.x.f28731w, b0Var);
                break;
            case 4:
                break;
            default:
                PopupLayout popupLayout = (PopupLayout) obj;
                if (popupLayout.isAttachedToWindow()) {
                    popupLayout.o();
                }
                break;
        }
        return b0Var;
    }
}
