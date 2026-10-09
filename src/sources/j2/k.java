package j2;

import android.media.ImageReader;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageReader f35642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f35643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f35644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f35645d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(d dVar, xy.c cVar) {
        super(cVar);
        this.f35644c = dVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f35643b = obj;
        this.f35645d |= Integer.MIN_VALUE;
        return this.f35644c.a(null, this);
    }
}
