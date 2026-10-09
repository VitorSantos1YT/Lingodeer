package com.google.firebase.inappmessaging.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w implements yw.b, yw.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RateLimiterClient f20272b;

    public /* synthetic */ w(RateLimiterClient rateLimiterClient, int i11) {
        this.f20271a = i11;
        this.f20272b = rateLimiterClient;
    }

    @Override // yw.b
    public void accept(Object obj) {
        int i11 = this.f20271a;
        RateLimiterClient rateLimiterClient = this.f20272b;
        switch (i11) {
            case 0:
                RateLimitProto.RateLimit rateLimit = RateLimiterClient.f20061d;
                rateLimiterClient.f20064c = uw.h.a((RateLimitProto.RateLimit) obj);
                break;
            default:
                rateLimiterClient.f20064c = fx.e.f28235a;
                break;
        }
    }

    @Override // yw.c
    public Object apply(Object obj) {
        RateLimitProto.RateLimit rateLimit = (RateLimitProto.RateLimit) obj;
        RateLimiterClient rateLimiterClient = this.f20272b;
        ProtoStorageClient protoStorageClient = rateLimiterClient.f20062a;
        protoStorageClient.getClass();
        return new dx.d(new t(protoStorageClient, rateLimit, 0), 1).a(new f(10, rateLimiterClient, rateLimit));
    }
}
