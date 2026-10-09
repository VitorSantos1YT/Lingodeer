package n9;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends xy.c {
    public Collection H;
    public Iterator K;
    public Collection L;
    public Collection M;
    public /* synthetic */ Object N;
    public final /* synthetic */ d0 O;
    public int P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fz.e f43510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d0 f43511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y f43512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Collection f43513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Iterator f43514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d2 f43515f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int[] f43516t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, xy.c cVar) {
        super(cVar);
        this.O = d0Var;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.N = obj;
        this.P |= Integer.MIN_VALUE;
        return this.O.a(null, this);
    }
}
