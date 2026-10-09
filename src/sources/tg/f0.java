package tg;

import app.rive.runtime.kotlin.core.Alignment;
import app.rive.runtime.kotlin.core.Fit;
import com.lingodeer.data.model.uistate.CommonUiState;
import xu.a1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f0 implements fz.e {
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52271a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f52272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f52273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f52274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.c f52275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f52276f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f52277t;

    public /* synthetic */ f0(String str, String str2, boolean z11, int i11, int i12, CommonUiState commonUiState, fz.c cVar, int i13) {
        this.K = str;
        this.H = str2;
        this.f52274d = z11;
        this.f52273c = i11;
        this.f52276f = i12;
        this.f52272b = commonUiState;
        this.f52275e = cVar;
        this.f52277t = i13;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f52271a) {
            case 0:
                ((Integer) obj2).getClass();
                h0.b((i0) this.H, (String) this.K, (z1.r) this.f52272b, this.f52275e, this.f52273c, this.f52274d, this.f52276f, (l1.n) obj, l1.t.M(this.f52277t | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                tv.g.a((z1.r) this.f52272b, this.f52273c, (Alignment) this.H, (Fit) this.K, this.f52274d, this.f52275e, (l1.n) obj, l1.t.M(this.f52276f | 1), this.f52277t);
                break;
            default:
                ((Integer) obj2).intValue();
                a1.a((String) this.K, (String) this.H, this.f52274d, this.f52273c, this.f52276f, (CommonUiState) this.f52272b, this.f52275e, (l1.n) obj, l1.t.M(this.f52277t | 1));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ f0(i0 i0Var, String str, z1.r rVar, fz.c cVar, int i11, boolean z11, int i12, int i13) {
        this.H = i0Var;
        this.K = str;
        this.f52272b = rVar;
        this.f52275e = cVar;
        this.f52273c = i11;
        this.f52274d = z11;
        this.f52276f = i12;
        this.f52277t = i13;
    }

    public /* synthetic */ f0(z1.r rVar, int i11, Alignment alignment, Fit fit, boolean z11, fz.c cVar, int i12, int i13) {
        this.f52272b = rVar;
        this.f52273c = i11;
        this.H = alignment;
        this.K = fit;
        this.f52274d = z11;
        this.f52275e = cVar;
        this.f52276f = i12;
        this.f52277t = i13;
    }
}
