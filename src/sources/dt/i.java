package dt;

import com.lingodeer.data.model.uistate.WordSentenceCharacterType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23865a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f23866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f23869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f23870f;

    public /* synthetic */ i(int i11, int i12, fz.a aVar, z1.r rVar, boolean z11) {
        this.f23867c = rVar;
        this.f23866b = z11;
        this.f23870f = aVar;
        this.f23868d = i11;
        this.f23869e = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f23865a) {
            case 0:
                z1.r rVar = (z1.r) this.f23867c;
                ((Integer) obj2).getClass();
                a0.j(l1.t.M(this.f23868d | 1), this.f23869e, (fz.a) this.f23870f, (l1.n) obj, rVar, this.f23866b);
                break;
            case 1:
                ((Integer) obj2).getClass();
                mt.b1.c((WordSentenceCharacterType) this.f23870f, this.f23866b, (z1.r) this.f23867c, (l1.n) obj, l1.t.M(this.f23868d | 1), this.f23869e);
                break;
            case 2:
                ((Integer) obj2).intValue();
                mt.y3.x(this.f23868d, (String) this.f23867c, this.f23866b, (fz.c) this.f23870f, (l1.n) obj, l1.t.M(this.f23869e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                xu.q1.d(this.f23868d, (String) this.f23870f, this.f23866b, (z1.r) this.f23867c, (l1.n) obj, l1.t.M(this.f23869e | 1));
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ i(int i11, String str, boolean z11, fz.c cVar, int i12) {
        this.f23868d = i11;
        this.f23867c = str;
        this.f23866b = z11;
        this.f23870f = cVar;
        this.f23869e = i12;
    }

    public /* synthetic */ i(int i11, String str, boolean z11, z1.r rVar, int i12) {
        this.f23868d = i11;
        this.f23870f = str;
        this.f23866b = z11;
        this.f23867c = rVar;
        this.f23869e = i12;
    }

    public /* synthetic */ i(WordSentenceCharacterType wordSentenceCharacterType, boolean z11, z1.r rVar, int i11, int i12) {
        this.f23870f = wordSentenceCharacterType;
        this.f23866b = z11;
        this.f23867c = rVar;
        this.f23868d = i11;
        this.f23869e = i12;
    }
}
