package okhttp3.internal.connection;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.m;
import m00.b;
import m00.h0;
import m00.i;
import m00.i0;
import m00.q;
import m00.r;
import okhttp3.EventListener;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealResponseBody;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class Exchange {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RealCall f45251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EventListener f45252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExchangeFinder f45253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ExchangeCodec f45254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f45255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f45256f;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class RequestBodySink extends q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f45257b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f45258c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f45259d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f45260e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Exchange f45261f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestBodySink(Exchange exchange, h0 delegate, long j11) {
            super(delegate);
            m.f(delegate, "delegate");
            this.f45261f = exchange;
            this.f45257b = j11;
        }

        @Override // m00.q, m00.h0
        public final void K0(i source, long j11) throws IOException {
            m.f(source, "source");
            if (this.f45260e) {
                throw new IllegalStateException("closed");
            }
            long j12 = this.f45257b;
            if (j12 != -1 && this.f45259d + j11 > j12) {
                StringBuilder sbJ = c.j(j12, "expected ", " bytes but received ");
                sbJ.append(this.f45259d + j11);
                throw new ProtocolException(sbJ.toString());
            }
            try {
                super.K0(source, j11);
                this.f45259d += j11;
            } catch (IOException e8) {
                throw a(e8);
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final IOException a(IOException iOException) {
            if (this.f45258c) {
                return iOException;
            }
            this.f45258c = true;
            long j11 = this.f45259d;
            Exchange exchange = this.f45261f;
            EventListener eventListener = exchange.f45252b;
            RealCall realCall = exchange.f45251a;
            if (iOException != null) {
                exchange.e(iOException);
            }
            if (iOException != null) {
                eventListener.r(realCall, iOException);
            } else {
                eventListener.p(realCall, j11);
            }
            return realCall.g(exchange, true, false, iOException);
        }

        @Override // m00.q, m00.h0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f45260e) {
                return;
            }
            this.f45260e = true;
            long j11 = this.f45257b;
            if (j11 != -1 && this.f45259d != j11) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
            } catch (IOException e8) {
                throw a(e8);
            }
        }

        @Override // m00.q, m00.h0, java.io.Flushable
        public final void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e8) {
                throw a(e8);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public final class ResponseBodySource extends r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f45262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f45263b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f45264c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f45265d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f45266e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Exchange f45267f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResponseBodySource(Exchange exchange, i0 delegate, long j11) {
            super(delegate);
            m.f(delegate, "delegate");
            this.f45267f = exchange;
            this.f45262a = j11;
            this.f45264c = true;
            if (j11 == 0) {
                a(null);
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final IOException a(IOException iOException) {
            if (this.f45265d) {
                return iOException;
            }
            this.f45265d = true;
            Exchange exchange = this.f45267f;
            if (iOException == null && this.f45264c) {
                this.f45264c = false;
                exchange.f45252b.v(exchange.f45251a);
            }
            long j11 = this.f45263b;
            EventListener eventListener = exchange.f45252b;
            RealCall realCall = exchange.f45251a;
            if (iOException != null) {
                exchange.e(iOException);
            }
            if (iOException != null) {
                eventListener.w(realCall, iOException);
            } else {
                eventListener.u(realCall, j11);
            }
            return realCall.g(exchange, false, true, iOException);
        }

        @Override // m00.r, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f45266e) {
                return;
            }
            this.f45266e = true;
            try {
                super.close();
            } catch (IOException e8) {
                throw a(e8);
            }
        }

        @Override // m00.r, m00.i0
        public final long read(i sink, long j11) throws IOException {
            m.f(sink, "sink");
            if (this.f45266e) {
                throw new IllegalStateException("closed");
            }
            try {
                long j12 = delegate().read(sink, j11);
                boolean z11 = this.f45264c;
                Exchange exchange = this.f45267f;
                if (z11) {
                    this.f45264c = false;
                    exchange.f45252b.v(exchange.f45251a);
                }
                if (j12 == -1) {
                    a(null);
                    return -1L;
                }
                long j13 = this.f45263b + j12;
                long j14 = this.f45262a;
                if (j14 == -1 || j13 <= j14) {
                    this.f45263b = j13;
                    if (exchange.f45254d.c()) {
                        a(null);
                    }
                    return j12;
                }
                throw new ProtocolException("expected " + j14 + " bytes but received " + j13);
            } catch (IOException e8) {
                throw a(e8);
            }
        }
    }

    public Exchange(RealCall realCall, EventListener eventListener, ExchangeFinder finder, ExchangeCodec exchangeCodec) {
        m.f(eventListener, "eventListener");
        m.f(finder, "finder");
        this.f45251a = realCall;
        this.f45252b = eventListener;
        this.f45253c = finder;
        this.f45254d = exchangeCodec;
    }

    public final h0 a(Request request, boolean z11) {
        m.f(request, "request");
        this.f45255e = z11;
        RequestBody requestBody = request.f45137d;
        m.c(requestBody);
        long jContentLength = requestBody.contentLength();
        this.f45252b.q(this.f45251a);
        return new RequestBodySink(this, this.f45254d.i(request, jContentLength), jContentLength);
    }

    public final RealConnection b() {
        ExchangeCodec.Carrier carrierH = this.f45254d.h();
        RealConnection realConnection = carrierH instanceof RealConnection ? (RealConnection) carrierH : null;
        if (realConnection != null) {
            return realConnection;
        }
        throw new IllegalStateException("no connection for CONNECT tunnels");
    }

    public final RealResponseBody c(Response response) throws IOException {
        ExchangeCodec exchangeCodec = this.f45254d;
        try {
            String strB = response.f45163f.b(HttpHeaders.CONTENT_TYPE);
            if (strB == null) {
                strB = null;
            }
            long jG = exchangeCodec.g(response);
            return new RealResponseBody(strB, jG, b.c(new ResponseBodySource(this, exchangeCodec.d(response), jG)));
        } catch (IOException e8) {
            this.f45252b.w(this.f45251a, e8);
            e(e8);
            throw e8;
        }
    }

    public final Response.Builder d(boolean z11) throws IOException {
        try {
            Response.Builder builderE = this.f45254d.e(z11);
            if (builderE == null) {
                return builderE;
            }
            builderE.m = this;
            return builderE;
        } catch (IOException e8) {
            this.f45252b.w(this.f45251a, e8);
            e(e8);
            throw e8;
        }
    }

    public final void e(IOException iOException) {
        this.f45256f = true;
        this.f45254d.h().a(this.f45251a, iOException);
    }
}
