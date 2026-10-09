package bt;

import com.lingodeer.data.model.uistate.WordSentenceCharacterType;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l3 implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5662e;

    public /* synthetic */ l3(Object obj, boolean z11, Object obj2, int i11, int i12) {
        this.f5658a = i12;
        this.f5661d = obj;
        this.f5659b = z11;
        this.f5662e = obj2;
        this.f5660c = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5658a) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = l1.t.M(this.f5660c | 1);
                b.o((List) this.f5661d, this.f5659b, (fz.c) this.f5662e, (l1.n) obj, iM);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM2 = l1.t.M(this.f5660c | 1);
                ve.i.f(this.f5659b, (u3.j) this.f5661d, (d1.z0) this.f5662e, (l1.n) obj, iM2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iM3 = l1.t.M(this.f5660c | 1);
                mt.f6.b((WordSentenceCharacterType.SentenceType) this.f5661d, this.f5659b, (z1.r) this.f5662e, (l1.n) obj, iM3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iM4 = l1.t.M(this.f5660c | 1);
                mt.f6.a((WordSentenceCharacterType.CharacterType) this.f5661d, this.f5659b, (z1.r) this.f5662e, (l1.n) obj, iM4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iM5 = l1.t.M(this.f5660c | 1);
                mt.f6.c((WordSentenceCharacterType.WordType) this.f5661d, this.f5659b, (z1.r) this.f5662e, (l1.n) obj, iM5);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iM6 = l1.t.M(this.f5660c | 1);
                tg.v.b((tg.i0) this.f5661d, this.f5659b, (t1.d) this.f5662e, (l1.n) obj, iM6);
                break;
            case 6:
                String str = (String) this.f5661d;
                ((Integer) obj2).getClass();
                ys.a.l(l1.t.M(this.f5660c | 1), (fz.a) this.f5662e, str, (l1.n) obj, this.f5659b);
                break;
            default:
                ((Integer) obj2).intValue();
                int iM7 = l1.t.M(this.f5660c | 1);
                ys.a.m((String) this.f5661d, this.f5659b, (fz.c) this.f5662e, (l1.n) obj, iM7);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ l3(boolean z11, u3.j jVar, d1.z0 z0Var, int i11) {
        this.f5658a = 1;
        this.f5659b = z11;
        this.f5661d = jVar;
        this.f5662e = z0Var;
        this.f5660c = i11;
    }
}
