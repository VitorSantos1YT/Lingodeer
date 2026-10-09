package jr;

import com.lingodeer.data.model.RecordingStatus;
import kr.a1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d0 implements fz.e {
    public final /* synthetic */ qy.e H;
    public final /* synthetic */ qy.e K;
    public final /* synthetic */ qy.e L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f36595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f36596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f36597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz.a f36598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f36599f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ qy.e f36600t;

    public /* synthetic */ d0(a1 a1Var, boolean z11, boolean z12, fz.a aVar, z1.r rVar, fz.c cVar, fz.c cVar2, fz.c cVar3, fz.c cVar4, int i11, int i12) {
        this.f36594a = i12;
        this.f36595b = a1Var;
        this.f36596c = z11;
        this.f36597d = z12;
        this.f36598e = aVar;
        this.f36599f = rVar;
        this.f36600t = cVar;
        this.H = cVar2;
        this.K = cVar3;
        this.L = cVar4;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f36594a) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = l1.t.M(1);
                a.s((a1) this.f36595b, this.f36596c, this.f36597d, this.f36598e, (z1.r) this.f36599f, (fz.c) this.f36600t, (fz.c) this.H, (fz.c) this.K, (fz.c) this.L, (l1.n) obj, iM);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM2 = l1.t.M(1);
                a.s((a1) this.f36595b, this.f36596c, this.f36597d, this.f36598e, (z1.r) this.f36599f, (fz.c) this.f36600t, (fz.c) this.H, (fz.c) this.K, (fz.c) this.L, (l1.n) obj, iM2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM3 = l1.t.M(1);
                et.q.a(this.f36596c, this.f36597d, (RecordingStatus) this.f36595b, this.f36598e, (fz.a) this.f36599f, (fz.a) this.f36600t, (fz.a) this.H, (fz.a) this.K, (fz.a) this.L, (l1.n) obj, iM3);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ d0(boolean z11, boolean z12, RecordingStatus recordingStatus, fz.a aVar, fz.a aVar2, fz.a aVar3, fz.a aVar4, fz.a aVar5, fz.a aVar6, int i11) {
        this.f36594a = 2;
        this.f36596c = z11;
        this.f36597d = z12;
        this.f36595b = recordingStatus;
        this.f36598e = aVar;
        this.f36599f = aVar2;
        this.f36600t = aVar3;
        this.H = aVar4;
        this.K = aVar5;
        this.L = aVar6;
    }
}
