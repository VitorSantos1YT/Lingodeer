package n5;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Serializable f43266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f43267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f43268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43269d;

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43268c = obj;
        this.f43269d |= Integer.MIN_VALUE;
        return hz.b.g(null, null, this);
    }
}
