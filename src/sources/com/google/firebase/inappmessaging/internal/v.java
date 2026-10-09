package com.google.firebase.inappmessaging.internal;

import com.google.firebase.inappmessaging.model.RateLimit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v implements yw.c, yw.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RateLimiterClient f20269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RateLimit f20270c;

    public /* synthetic */ v(RateLimiterClient rateLimiterClient, RateLimit rateLimit, int i11) {
        this.f20268a = i11;
        this.f20269b = rateLimiterClient;
        this.f20270c = rateLimit;
    }

    @Override // yw.c
    public Object apply(Object obj) {
        int i11 = this.f20268a;
        RateLimit rateLimit = this.f20270c;
        RateLimiterClient rateLimiterClient = this.f20269b;
        RateLimitProto.RateLimit rateLimit2 = (RateLimitProto.RateLimit) obj;
        switch (i11) {
            case 0:
                RateLimitProto.RateLimit rateLimit3 = RateLimiterClient.f20061d;
                rateLimiterClient.getClass();
                RateLimitProto.Counter counterH = rateLimit2.H(rateLimit.c(), rateLimiterClient.b());
                ax.d.a(counterH, "item is null");
                return new dx.b(3, new hx.d(new hx.d(new hx.d(new hx.i(counterH), new v(rateLimiterClient, rateLimit, 1), 0), new hx.i(rateLimiterClient.b()), 2), new f(9, rateLimit2, rateLimit), 1), new w(rateLimiterClient, 2));
            default:
                RateLimitProto.RateLimit rateLimit4 = RateLimiterClient.f20061d;
                rateLimiterClient.getClass();
                return rateLimit2.H(rateLimit.c(), rateLimiterClient.b());
        }
    }

    @Override // yw.d
    public boolean test(Object obj) {
        int i11 = this.f20268a;
        RateLimit rateLimit = this.f20270c;
        RateLimiterClient rateLimiterClient = this.f20269b;
        RateLimitProto.Counter counter = (RateLimitProto.Counter) obj;
        switch (i11) {
            case 1:
                RateLimitProto.RateLimit rateLimit2 = RateLimiterClient.f20061d;
                return !(rateLimiterClient.f20063b.a() - counter.J() > rateLimit.d());
            default:
                RateLimitProto.RateLimit rateLimit3 = RateLimiterClient.f20061d;
                return rateLimiterClient.f20063b.a() - counter.J() > rateLimit.d() || counter.K() < rateLimit.b();
        }
    }
}
