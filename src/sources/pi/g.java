package pi;

import android.graphics.Matrix;
import com.airbnb.lottie.LottieAnimationView;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;
import kd.k;
import wc.y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46943a;

    public /* synthetic */ g(int i11) {
        this.f46943a = i11;
    }

    @Override // wc.y
    public final void onResult(Object obj) {
        Throwable th2 = (Throwable) obj;
        switch (this.f46943a) {
            case 0:
                th2.printStackTrace();
                return;
            case 1:
                th2.printStackTrace();
                return;
            case 2:
                th2.printStackTrace();
                return;
            case 3:
                th2.printStackTrace();
                return;
            default:
                g gVar = LottieAnimationView.P;
                Matrix matrix = k.f38124a;
                if (!(th2 instanceof SocketException) && !(th2 instanceof ClosedChannelException) && !(th2 instanceof InterruptedIOException) && !(th2 instanceof ProtocolException) && !(th2 instanceof SSLException) && !(th2 instanceof UnknownHostException) && !(th2 instanceof UnknownServiceException)) {
                    throw new IllegalStateException("Unable to parse composition", th2);
                }
                kd.d.c("Unable to load composition.", th2);
                return;
        }
    }
}
