package o6;

import c6.l;
import fb.g0;
import kotlin.jvm.internal.n;
import l1.t;
import qy.b0;
import w2.a0;
import w2.p1;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends n implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44724a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f44725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f44726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f44727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f44728e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, l lVar, g gVar, int i11, int i12) {
        super(2);
        this.f44726c = str;
        this.f44727d = lVar;
        this.f44728e = gVar;
        this.f44725b = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f44724a) {
            case 0:
                ((Number) obj2).intValue();
                g0.d((String) this.f44726c, (l) this.f44727d, (g) this.f44728e, this.f44725b, (l1.n) obj, 1);
                break;
            default:
                ((Number) obj2).intValue();
                a0.a((p1) this.f44726c, (r) this.f44727d, (fz.e) this.f44728e, (l1.n) obj, t.M(this.f44725b | 1));
                break;
        }
        return b0.f48488a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p1 p1Var, r rVar, fz.e eVar, int i11) {
        super(2);
        this.f44726c = p1Var;
        this.f44727d = rVar;
        this.f44728e = eVar;
        this.f44725b = i11;
    }
}
