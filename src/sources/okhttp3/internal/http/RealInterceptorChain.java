package okhttp3.internal.http;

import java.util.ArrayList;
import kotlin.jvm.internal.m;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class RealInterceptorChain implements Interceptor.Chain {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RealCall f45345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f45346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Exchange f45348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Request f45349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f45350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f45351g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f45352h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f45353i;

    public RealInterceptorChain(RealCall realCall, ArrayList arrayList, int i11, Exchange exchange, Request request, int i12, int i13, int i14) {
        m.f(request, "request");
        this.f45345a = realCall;
        this.f45346b = arrayList;
        this.f45347c = i11;
        this.f45348d = exchange;
        this.f45349e = request;
        this.f45350f = i12;
        this.f45351g = i13;
        this.f45352h = i14;
    }

    public static RealInterceptorChain b(RealInterceptorChain realInterceptorChain, int i11, Exchange exchange, Request request, int i12) {
        if ((i12 & 1) != 0) {
            i11 = realInterceptorChain.f45347c;
        }
        int i13 = i11;
        if ((i12 & 2) != 0) {
            exchange = realInterceptorChain.f45348d;
        }
        Exchange exchange2 = exchange;
        if ((i12 & 4) != 0) {
            request = realInterceptorChain.f45349e;
        }
        Request request2 = request;
        int i14 = realInterceptorChain.f45350f;
        int i15 = realInterceptorChain.f45351g;
        int i16 = realInterceptorChain.f45352h;
        m.f(request2, "request");
        return new RealInterceptorChain(realInterceptorChain.f45345a, realInterceptorChain.f45346b, i13, exchange2, request2, i14, i15, i16);
    }

    @Override // okhttp3.Interceptor.Chain
    public final Response a(Request request) {
        m.f(request, "request");
        ArrayList arrayList = this.f45346b;
        int size = arrayList.size();
        int i11 = this.f45347c;
        if (i11 >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.f45353i++;
        Exchange exchange = this.f45348d;
        if (exchange != null) {
            if (!exchange.f45253c.b().d(request.f45134a)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i11 - 1) + " must retain the same host and port").toString());
            }
            if (this.f45353i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i11 - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i12 = i11 + 1;
        RealInterceptorChain realInterceptorChainB = b(this, i12, null, request, 58);
        Interceptor interceptor = (Interceptor) arrayList.get(i11);
        Response responseIntercept = interceptor.intercept(realInterceptorChainB);
        if (responseIntercept == null) {
            throw new NullPointerException("interceptor " + interceptor + " returned null");
        }
        if (exchange == null || i12 >= arrayList.size() || realInterceptorChainB.f45353i == 1) {
            return responseIntercept;
        }
        throw new IllegalStateException(("network interceptor " + interceptor + " must call proceed() exactly once").toString());
    }

    @Override // okhttp3.Interceptor.Chain
    public final Request e() {
        return this.f45349e;
    }
}
