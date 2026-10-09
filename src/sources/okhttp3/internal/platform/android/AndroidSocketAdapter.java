package okhttp3.internal.platform.android;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.m;
import okhttp3.internal.platform.AndroidPlatform;
import okhttp3.internal.platform.Platform;
import oz.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class AndroidSocketAdapter implements SocketAdapter {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Companion f45539e = new Companion(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AndroidSocketAdapter$Companion$factory$1 f45540f = new AndroidSocketAdapter$Companion$factory$1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f45541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f45542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f45543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f45544d;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(int i11) {
            this();
        }

        private Companion() {
        }
    }

    public AndroidSocketAdapter(Class cls) throws NoSuchMethodException {
        this.f45541a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        m.e(declaredMethod, "getDeclaredMethod(...)");
        this.f45542b = declaredMethod;
        cls.getMethod("setHostname", String.class);
        this.f45543c = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f45544d = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean a() {
        AndroidPlatform.f45520f.getClass();
        return AndroidPlatform.f45521g;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean b(SSLSocket sSLSocket) {
        return this.f45541a.isInstance(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final String c(SSLSocket sSLSocket) {
        if (this.f45541a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.f45543c.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, a.f46133a);
                }
            } catch (IllegalAccessException e8) {
                throw new AssertionError(e8);
            } catch (InvocationTargetException e10) {
                Throwable cause = e10.getCause();
                if (!(cause instanceof NullPointerException) || !m.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e10);
                }
            }
        }
        return null;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        m.f(protocols, "protocols");
        if (this.f45541a.isInstance(sSLSocket)) {
            try {
                this.f45542b.invoke(sSLSocket, Boolean.TRUE);
                Method method = this.f45544d;
                Platform.f45527a.getClass();
                method.invoke(sSLSocket, Platform.Companion.b(protocols));
            } catch (IllegalAccessException e8) {
                throw new AssertionError(e8);
            } catch (InvocationTargetException e10) {
                throw new AssertionError(e10);
            }
        }
    }
}
