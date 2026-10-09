package io.grpc.okhttp.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.security.AccessController;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.Provider;
import java.security.Security;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f34535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f34536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f34537d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f34538a;

    static {
        Object obj;
        Provider provider;
        Provider provider2;
        k kVar;
        j jVar;
        Logger logger = Logger.getLogger(k.class.getName());
        f34535b = logger;
        f34536c = new String[]{"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};
        Provider[] providers = Security.getProviders();
        int length = providers.length;
        int i11 = 0;
        loop0: while (true) {
            obj = null;
            if (i11 >= length) {
                logger.log(Level.WARNING, "Unable to find Conscrypt");
                provider = null;
                break;
            }
            Provider provider3 = providers[i11];
            for (String str : f34536c) {
                if (str.equals(provider3.getClass().getName())) {
                    logger.log(Level.FINE, "Found registered provider {0}", str);
                    provider = provider3;
                    break loop0;
                }
            }
            i11++;
        }
        if (provider != null) {
            int i12 = 14;
            xq.c cVar = new xq.c(obj, "setUseSessionTickets", new Class[]{Boolean.TYPE}, i12);
            xq.c cVar2 = new xq.c(obj, "setHostname", new Class[]{String.class}, i12);
            xq.c cVar3 = new xq.c(byte[].class, "getAlpnSelectedProtocol", new Class[0], i12);
            xq.c cVar4 = new xq.c(obj, "setAlpnProtocols", new Class[]{byte[].class}, i12);
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                cls.getMethod("tagSocket", Socket.class);
                cls.getMethod("untagSocket", Socket.class);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
            }
            if (provider.getName().equals("GmsCore_OpenSSL") || provider.getName().equals("Conscrypt") || provider.getName().equals("Ssl_Guard")) {
                jVar = j.ALPN_AND_NPN;
            } else {
                try {
                    k.class.getClassLoader().loadClass("android.net.Network");
                    jVar = j.ALPN_AND_NPN;
                } catch (ClassNotFoundException e8) {
                    logger.log(Level.FINE, "Can't find class", (Throwable) e8);
                    try {
                        k.class.getClassLoader().loadClass("android.app.ActivityOptions");
                        jVar = j.NPN;
                    } catch (ClassNotFoundException e10) {
                        logger.log(Level.FINE, "Can't find class", (Throwable) e10);
                        jVar = j.NONE;
                    }
                }
            }
            kVar = new g(cVar, cVar2, cVar3, cVar4, provider, jVar);
        } else {
            try {
                Provider provider4 = SSLContext.getDefault().getProvider();
                try {
                    try {
                        SSLContext sSLContext = SSLContext.getInstance("TLS", provider4);
                        sSLContext.init(null, null, null);
                        ((Method) AccessController.doPrivileged(new f(0))).invoke(sSLContext.createSSLEngine(), null);
                        kVar = new h(provider4, (Method) AccessController.doPrivileged(new f(1)), (Method) AccessController.doPrivileged(new f(2)));
                    } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                        provider2 = provider4;
                        kVar = new k(provider2);
                    }
                } catch (IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException unused3) {
                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                    try {
                        kVar = new g(cls2.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider4);
                    } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                        provider2 = provider4;
                        kVar = new k(provider2);
                    }
                }
            } catch (NoSuchAlgorithmException e11) {
                throw new RuntimeException(e11);
            }
        }
        f34537d = kVar;
    }

    public k(Provider provider) {
        this.f34538a = provider;
    }

    public static byte[] b(List list) {
        m00.i iVar = new m00.i();
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            l lVar = (l) list.get(i11);
            if (lVar != l.HTTP_1_0) {
                iVar.J(lVar.toString().length());
                iVar.Y(lVar.toString());
            }
        }
        return iVar.x(iVar.f40718b);
    }

    public String d(SSLSocket sSLSocket) {
        return null;
    }

    public j e() {
        return j.NONE;
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void c(SSLSocket sSLSocket, String str, List list) {
    }
}
