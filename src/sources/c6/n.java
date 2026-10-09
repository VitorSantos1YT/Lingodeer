package c6;

import l1.t;
import qy.b0;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6638f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(a aVar, String str, l lVar, int i11, int i12, int i13) {
        super(2);
        this.f6633a = 0;
        this.f6636d = aVar;
        this.f6637e = str;
        this.f6638f = lVar;
        this.f6634b = i11;
        this.f6635c = i13;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6633a) {
            case 0:
                ((Number) obj2).intValue();
                a aVar = (a) this.f6636d;
                String str = (String) this.f6637e;
                l lVar = (l) this.f6638f;
                vc.a.a(aVar, str, lVar, this.f6634b, (l1.n) obj, 49, this.f6635c);
                break;
            case 1:
                ((Number) obj2).intValue();
                y3.h.b((fz.c) this.f6636d, (r) this.f6637e, (fz.c) this.f6638f, (l1.n) obj, t.M(this.f6634b | 1), this.f6635c);
                break;
            default:
                ((Number) obj2).intValue();
                androidx.compose.ui.window.a.a((fz.a) this.f6636d, (z3.r) this.f6637e, (t1.d) this.f6638f, (l1.n) obj, t.M(this.f6634b | 1), this.f6635c);
                break;
        }
        return b0.f48488a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(qy.e eVar, Object obj, qy.e eVar2, int i11, int i12, int i13) {
        super(2);
        this.f6633a = i13;
        this.f6636d = eVar;
        this.f6637e = obj;
        this.f6638f = eVar2;
        this.f6634b = i11;
        this.f6635c = i12;
    }
}
