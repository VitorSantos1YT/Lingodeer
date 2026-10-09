package dt;

import java.io.IOException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k2 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f23941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23942c;

    public /* synthetic */ k2(Object obj, long j11, int i11) {
        this.f23940a = i11;
        this.f23942c = obj;
        this.f23941b = j11;
    }

    @Override // fz.a
    public final Object invoke() {
        boolean z11;
        switch (this.f23940a) {
            case 0:
                a1 a1Var = (a1) this.f23942c;
                a1Var.f23633c.invoke("course_w", Long.valueOf(this.f23941b), Long.valueOf(a1Var.f23632b));
                return qy.b0.f48488a;
            case 1:
                Http2Connection http2Connection = (Http2Connection) this.f23942c;
                long j11 = this.f23941b;
                Http2Connection.Companion companion = Http2Connection.f45421c0;
                synchronized (http2Connection) {
                    long j12 = http2Connection.O;
                    long j13 = http2Connection.N;
                    if (j12 < j13) {
                        z11 = true;
                    } else {
                        http2Connection.N = j13 + 1;
                        z11 = false;
                    }
                }
                if (!z11) {
                    try {
                        http2Connection.Z.f(1, 0, false);
                    } catch (IOException e8) {
                        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                        http2Connection.a(errorCode, errorCode, e8);
                    }
                    break;
                } else {
                    ErrorCode errorCode2 = ErrorCode.PROTOCOL_ERROR;
                    http2Connection.a(errorCode2, errorCode2, null);
                    j11 = -1;
                }
                return Long.valueOf(j11);
            case 2:
                qp.a aVar = (qp.a) this.f23942c;
                long j14 = this.f23941b;
                return aVar.i() + ";" + j14 + ";0";
            case 3:
                qp.x3 x3Var = (qp.x3) this.f23942c;
                long j15 = this.f23941b;
                return x3Var.i() + ";" + j15 + ";2";
            case 4:
                qp.a4 a4Var = (qp.a4) this.f23942c;
                long j16 = this.f23941b;
                return a4Var.i() + ";" + j16 + ";3";
            case 5:
                qp.n4 n4Var = (qp.n4) this.f23942c;
                long j17 = this.f23941b;
                return n4Var.i() + ";" + j17 + ";6";
            default:
                return ((g2.u0) ((g2.t) this.f23942c)).b(this.f23941b);
        }
    }
}
