package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.m;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Http2Connection f45504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f45505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f45506d;

    public /* synthetic */ b(Http2Connection http2Connection, int i11, Object obj, int i12) {
        this.f45503a = i12;
        this.f45504b = http2Connection;
        this.f45505c = i11;
        this.f45506d = obj;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f45503a) {
            case 0:
                Http2Connection http2Connection = this.f45504b;
                int i11 = this.f45505c;
                ((PushObserver.Companion.PushObserverCancel) http2Connection.M).getClass();
                try {
                    http2Connection.Z.h(i11, ErrorCode.CANCEL);
                    synchronized (http2Connection) {
                        http2Connection.f45426b0.remove(Integer.valueOf(i11));
                    }
                } catch (IOException unused) {
                }
                return b0.f48488a;
            case 1:
                Http2Connection http2Connection2 = this.f45504b;
                int i12 = this.f45505c;
                ((PushObserver.Companion.PushObserverCancel) http2Connection2.M).getClass();
                try {
                    http2Connection2.Z.h(i12, ErrorCode.CANCEL);
                    synchronized (http2Connection2) {
                        http2Connection2.f45426b0.remove(Integer.valueOf(i12));
                    }
                } catch (IOException unused2) {
                }
                return b0.f48488a;
            default:
                Http2Connection http2Connection3 = this.f45504b;
                int i13 = this.f45505c;
                ErrorCode statusCode = (ErrorCode) this.f45506d;
                Http2Connection.Companion companion = Http2Connection.f45421c0;
                try {
                    m.f(statusCode, "statusCode");
                    http2Connection3.Z.h(i13, statusCode);
                    break;
                } catch (IOException e8) {
                    ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                    http2Connection3.a(errorCode, errorCode, e8);
                }
                return b0.f48488a;
        }
    }

    public /* synthetic */ b(Http2Connection http2Connection, int i11, List list, boolean z11) {
        this.f45503a = 1;
        this.f45504b = http2Connection;
        this.f45505c = i11;
        this.f45506d = list;
    }
}
