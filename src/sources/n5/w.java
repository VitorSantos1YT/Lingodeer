package n5;

import java.io.FileInputStream;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends xy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f43415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FileInputStream f43416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f43417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f43418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f43419e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, xy.c cVar) {
        super(cVar);
        this.f43418d = xVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f43417c = obj;
        this.f43419e |= Integer.MIN_VALUE;
        return x.a(this.f43418d, this);
    }
}
