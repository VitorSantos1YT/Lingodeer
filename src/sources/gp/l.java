package gp;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f29423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f29424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1.b f29425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29426d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(b1.b bVar, vy.d dVar) {
        super(dVar);
        this.f29425c = bVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f29424b = obj;
        this.f29426d |= Integer.MIN_VALUE;
        return this.f29425c.a(null, this);
    }
}
