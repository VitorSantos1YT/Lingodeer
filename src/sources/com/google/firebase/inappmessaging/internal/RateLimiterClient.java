package com.google.firebase.inappmessaging.internal;

import com.google.firebase.inappmessaging.internal.time.Clock;
import com.google.protobuf.Parser;
import fr.p3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class RateLimiterClient {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final RateLimitProto.RateLimit f20061d = RateLimitProto.RateLimit.G();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProtoStorageClient f20062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clock f20063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public uw.h f20064c = fx.e.f28235a;

    public RateLimiterClient(ProtoStorageClient protoStorageClient, Clock clock) {
        this.f20062a = protoStorageClient;
        this.f20063b = clock;
    }

    public final uw.h a() {
        uw.h hVar = this.f20064c;
        Parser parserJ = RateLimitProto.RateLimit.J();
        ProtoStorageClient protoStorageClient = this.f20062a;
        protoStorageClient.getClass();
        fx.l lVar = new fx.l(new t(protoStorageClient, parserJ, 1));
        w wVar = new w(this, 0);
        p3 p3Var = ax.d.f3263d;
        return new fx.s(hVar.d(new fx.s(lVar, wVar, p3Var)), p3Var, new w(this, 1));
    }

    public final RateLimitProto.Counter b() {
        RateLimitProto.Counter.Builder builderL = RateLimitProto.Counter.L();
        builderL.n();
        RateLimitProto.Counter.F((RateLimitProto.Counter) builderL.f21266b, 0L);
        long jA = this.f20063b.a();
        builderL.n();
        RateLimitProto.Counter.H((RateLimitProto.Counter) builderL.f21266b, jA);
        return (RateLimitProto.Counter) builderL.l();
    }
}
