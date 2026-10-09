package mt;

import java.io.IOException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i0 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f41537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f41538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f41539d;

    public /* synthetic */ i0(int i11, int i12, fz.a aVar) {
        this.f41536a = 1;
        this.f41537b = i11;
        this.f41538c = i12;
        this.f41539d = aVar;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f41536a) {
            case 0:
                fz.c cVar = (fz.c) this.f41539d;
                int i11 = this.f41537b + 1;
                int i12 = this.f41538c;
                if (i11 > i12) {
                    i11 = i12;
                }
                cVar.invoke(Integer.valueOf(i11));
                break;
            case 1:
                fz.a aVar = (fz.a) this.f41539d;
                if (this.f41537b + this.f41538c > 0) {
                    aVar.invoke();
                }
                break;
            default:
                Http2Connection http2Connection = (Http2Connection) this.f41539d;
                try {
                    http2Connection.Z.f(this.f41537b, this.f41538c, true);
                } catch (IOException e8) {
                    ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                    http2Connection.a(errorCode, errorCode, e8);
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ i0(Object obj, int i11, int i12, int i13) {
        this.f41536a = i13;
        this.f41539d = obj;
        this.f41537b = i11;
        this.f41538c = i12;
    }
}
