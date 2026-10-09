package ij;

import au.n0;
import com.lingodeer.data.model.DbFileVersion;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n0 f34424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DbFileVersion f34425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DbFileVersion f34426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f34427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f34428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f34429f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, xy.c cVar) {
        super(cVar);
        this.f34428e = fVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f34427d = obj;
        this.f34429f |= Integer.MIN_VALUE;
        return this.f34428e.a(this);
    }
}
