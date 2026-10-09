package jr;

import java.io.IOException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f36702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f36703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f36704d;

    public /* synthetic */ s(int i11, long j11, int i12, Object obj) {
        this.f36701a = i12;
        this.f36704d = obj;
        this.f36702b = i11;
        this.f36703c = j11;
    }

    @Override // fz.a
    public final Object invoke() {
        int i11 = this.f36701a;
        qy.b0 b0Var = qy.b0.f48488a;
        long j11 = this.f36703c;
        int i12 = this.f36702b;
        Object obj = this.f36704d;
        switch (i11) {
            case 0:
                ((fz.e) obj).invoke(Integer.valueOf(i12), Long.valueOf(j11));
                break;
            default:
                Http2Connection http2Connection = (Http2Connection) obj;
                Http2Connection.Companion companion = Http2Connection.f45421c0;
                try {
                    http2Connection.Z.i(i12, j11);
                } catch (IOException e8) {
                    ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                    http2Connection.a(errorCode, errorCode, e8);
                }
                break;
        }
        return b0Var;
    }
}
