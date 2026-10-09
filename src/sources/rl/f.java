package rl;

import com.lingo.lingoskill.object.PdLesson;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PdLesson f49273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f49274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f49275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f49276d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, xy.c cVar) {
        super(cVar);
        this.f49275c = hVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f49274b = obj;
        this.f49276d |= Integer.MIN_VALUE;
        return this.f49275c.d(null, this);
    }
}
