package i00;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s extends xy.c {
    public int H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public qy.b f33935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.android.billingclient.api.g f33936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinkedHashMap f33937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f33938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f33939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f33940f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.android.billingclient.api.g f33941t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.android.billingclient.api.g gVar, xy.a aVar) {
        super(aVar);
        this.f33941t = gVar;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        this.f33940f = obj;
        this.H |= Integer.MIN_VALUE;
        return com.android.billingclient.api.g.a(this.f33941t, null, this);
    }
}
