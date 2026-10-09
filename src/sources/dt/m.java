package dt;

import com.lingodeer.data.model.uistate.WordSentenceCharacterType;
import mt.l5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f23990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f23992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f23993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f23994f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f23995t;

    public /* synthetic */ m(int i11, WordSentenceCharacterType wordSentenceCharacterType, rt.x4 x4Var, long j11, boolean z11, int i12) {
        this.f23989a = 2;
        this.f23994f = i11;
        this.f23991c = wordSentenceCharacterType;
        this.f23993e = x4Var;
        this.f23992d = j11;
        this.f23990b = z11;
        this.f23995t = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f23989a) {
            case 0:
                ((Integer) obj2).getClass();
                a0.a(this.f23990b, (z1.r) this.f23991c, this.f23992d, (fz.a) this.f23993e, (l1.n) obj, l1.t.M(this.f23994f | 1), this.f23995t);
                break;
            case 1:
                ((Integer) obj2).getClass();
                a0.b(this.f23990b, (z1.r) this.f23991c, this.f23992d, (fz.a) this.f23993e, (l1.n) obj, l1.t.M(this.f23994f | 1), this.f23995t);
                break;
            default:
                ((Integer) obj2).intValue();
                l5.b(this.f23994f, (WordSentenceCharacterType) this.f23991c, (rt.x4) this.f23993e, this.f23992d, this.f23990b, (l1.n) obj, l1.t.M(this.f23995t | 1));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ m(boolean z11, z1.r rVar, long j11, fz.a aVar, int i11, int i12, int i13) {
        this.f23989a = i13;
        this.f23990b = z11;
        this.f23991c = rVar;
        this.f23992d = j11;
        this.f23993e = aVar;
        this.f23994f = i11;
        this.f23995t = i12;
    }
}
