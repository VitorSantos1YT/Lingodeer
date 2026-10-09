package lw;

import com.google.internal.firebase.inappmessaging.v1.sdkserving.FetchEligibleCampaignsRequest;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f40373a = new a("io.grpc.Grpc.TRANSPORT_ATTR_REMOTE_ADDR");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f40374b = new a("io.grpc.Grpc.TRANSPORT_ATTR_LOCAL_ADDR");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f40375c = new a("io.grpc.Grpc.TRANSPORT_ATTR_SSL_SESSION");

    public abstract void a(String str, Throwable th2);

    public abstract y b(k0 k0Var);

    public abstract f c();

    public abstract ScheduledExecutorService d();

    public abstract String e();

    public abstract t1 f();

    public abstract void g();

    public abstract void h(e eVar, String str);

    public abstract void i(e eVar, String str, Object... objArr);

    public abstract void j();

    public abstract void k();

    public abstract void l();

    public abstract void m(FetchEligibleCampaignsRequest fetchEligibleCampaignsRequest);

    public abstract void n();

    public abstract void o(y yVar);

    public abstract void p(y yVar, c1 c1Var);

    public abstract void q(n nVar, o0 o0Var);
}
