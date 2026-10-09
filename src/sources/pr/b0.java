package pr;

import com.lingodeer.data.model.uistate.DayStreakUiState;
import java.util.List;
import xu.a1;
import zu.k2;
import zu.y0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b0 implements fz.e {
    public final /* synthetic */ Object H;
    public final /* synthetic */ qy.e K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47002a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f47003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f47004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f47005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f47006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f47007f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f47008t;

    public /* synthetic */ b0(g2.t tVar, int i11, String str, List list, String str2, String str3, fz.e eVar, int i12) {
        this.f47005d = tVar;
        this.f47003b = i11;
        this.f47006e = str;
        this.H = list;
        this.f47007f = str2;
        this.f47008t = str3;
        this.K = eVar;
        this.f47004c = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f47002a) {
            case 0:
                ((Integer) obj2).intValue();
                f0.r((g2.t) this.f47005d, this.f47003b, (String) this.f47006e, (List) this.H, (String) this.f47007f, (String) this.f47008t, (fz.e) this.K, (l1.n) obj, l1.t.M(this.f47004c | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                a1.h((r0.e) this.f47005d, this.f47003b, (k2) this.f47006e, (DayStreakUiState) this.f47007f, (y0) this.f47008t, (z1.r) this.H, (fz.c) this.K, (l1.n) obj, l1.t.M(this.f47004c | 1));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ b0(r0.e eVar, int i11, k2 k2Var, DayStreakUiState dayStreakUiState, y0 y0Var, z1.r rVar, fz.c cVar, int i12) {
        this.f47005d = eVar;
        this.f47003b = i11;
        this.f47006e = k2Var;
        this.f47007f = dayStreakUiState;
        this.f47008t = y0Var;
        this.H = rVar;
        this.K = cVar;
        this.f47004c = i12;
    }
}
