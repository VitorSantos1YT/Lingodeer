package y9;

import java.io.Serializable;
import kotlin.jvm.internal.y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends xy.c {
    public /* synthetic */ Object H;
    public final /* synthetic */ e K;
    public int L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f57466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Serializable f57467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j f57468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y f57469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public vy.i f57470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public y f57471f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f57472t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, xy.c cVar) {
        super(cVar);
        this.K = eVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.L |= Integer.MIN_VALUE;
        return this.K.K(false, null, this);
    }
}
