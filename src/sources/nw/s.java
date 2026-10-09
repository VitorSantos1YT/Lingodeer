package nw;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s extends t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final xq.c f44262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final xq.c f44263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final xq.c f44264f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final xq.c f44265g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final xq.c f44266h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final xq.c f44267i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Method f44268j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Method f44269k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Method f44270l;
    public static final Method m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Method f44271n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Method f44272o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Constructor f44273p;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Logger logger = t.f44274b;
        Class cls = Boolean.TYPE;
        Constructor<?> constructor = null;
        int i11 = 14;
        f44262d = new xq.c(constructor, "setUseSessionTickets", new Class[]{cls}, i11);
        f44263e = new xq.c(constructor, "setHostname", new Class[]{String.class}, i11);
        Class<byte[]> cls2 = byte[].class;
        f44264f = new xq.c(cls2, "getAlpnSelectedProtocol", new Class[0], i11);
        f44265g = new xq.c(constructor, "setAlpnProtocols", new Class[]{byte[].class}, i11);
        f44266h = new xq.c(cls2, "getNpnSelectedProtocol", new Class[0], i11);
        f44267i = new xq.c(constructor, "setNpnProtocols", new Class[]{byte[].class}, i11);
        try {
            method = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
            try {
                method2 = SSLParameters.class.getMethod("getApplicationProtocols", null);
                try {
                    method3 = SSLSocket.class.getMethod("getApplicationProtocol", null);
                    try {
                        Class<?> cls3 = Class.forName("android.net.ssl.SSLSockets");
                        method4 = cls3.getMethod("isSupportedSocket", SSLSocket.class);
                        try {
                            method5 = cls3.getMethod("setUseSessionTickets", SSLSocket.class, cls);
                        } catch (ClassNotFoundException e8) {
                            e = e8;
                            logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                            method5 = null;
                        } catch (NoSuchMethodException e10) {
                            e = e10;
                            logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                            method5 = null;
                        }
                    } catch (ClassNotFoundException e11) {
                        e = e11;
                        method4 = null;
                    } catch (NoSuchMethodException e12) {
                        e = e12;
                        method4 = null;
                    }
                } catch (ClassNotFoundException e13) {
                    e = e13;
                    method3 = null;
                    method4 = method3;
                    logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                    method5 = null;
                    f44270l = method;
                    m = method2;
                    f44271n = method3;
                    f44268j = method4;
                    f44269k = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    try {
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    } catch (ClassNotFoundException e14) {
                        e = e14;
                        logger.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
                    } catch (NoSuchMethodException e15) {
                        e = e15;
                        logger.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
                    }
                    f44272o = method6;
                    f44273p = constructor;
                } catch (NoSuchMethodException e16) {
                    e = e16;
                    method3 = null;
                    method4 = method3;
                    logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                    method5 = null;
                    f44270l = method;
                    m = method2;
                    f44271n = method3;
                    f44268j = method4;
                    f44269k = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    f44272o = method6;
                    f44273p = constructor;
                }
            } catch (ClassNotFoundException e17) {
                e = e17;
                method2 = null;
                method3 = method2;
                method4 = method3;
                logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                f44270l = method;
                m = method2;
                f44271n = method3;
                f44268j = method4;
                f44269k = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                f44272o = method6;
                f44273p = constructor;
            } catch (NoSuchMethodException e18) {
                e = e18;
                method2 = null;
                method3 = method2;
                method4 = method3;
                logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                f44270l = method;
                m = method2;
                f44271n = method3;
                f44268j = method4;
                f44269k = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                f44272o = method6;
                f44273p = constructor;
            }
        } catch (ClassNotFoundException e19) {
            e = e19;
            method = null;
            method2 = null;
        } catch (NoSuchMethodException e21) {
            e = e21;
            method = null;
            method2 = null;
        }
        f44270l = method;
        m = method2;
        f44271n = method3;
        f44268j = method4;
        f44269k = method5;
        try {
            method6 = SSLParameters.class.getMethod("setServerNames", List.class);
            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
        } catch (ClassNotFoundException e22) {
            e = e22;
            method6 = null;
        } catch (NoSuchMethodException e23) {
            e = e23;
            method6 = null;
        }
        f44272o = method6;
        f44273p = constructor;
    }

    @Override // nw.t
    public final void a(SSLSocket sSLSocket, String str, List list) {
        Constructor constructor;
        Method method;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((io.grpc.okhttp.internal.l) it.next()).toString());
        }
        boolean z11 = false;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        if (str != null) {
            try {
                try {
                    if (t.c(str)) {
                        Method method2 = f44268j;
                        if (method2 == null || !((Boolean) method2.invoke(null, sSLSocket)).booleanValue()) {
                            f44262d.J(sSLSocket, Boolean.TRUE);
                        } else {
                            f44269k.invoke(null, sSLSocket, Boolean.TRUE);
                        }
                        Method method3 = f44272o;
                        if (method3 == null || (constructor = f44273p) == null) {
                            f44263e.J(sSLSocket, str);
                        } else {
                            method3.invoke(sSLParameters, Collections.singletonList(constructor.newInstance(str)));
                        }
                    }
                } catch (InvocationTargetException e8) {
                    throw new RuntimeException(e8);
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException(e11);
            }
        }
        Method method4 = f44271n;
        if (method4 != null) {
            try {
                method4.invoke(sSLSocket, null);
                f44270l.invoke(sSLParameters, strArr);
                z11 = true;
            } catch (InvocationTargetException e12) {
                if (!(e12.getTargetException() instanceof UnsupportedOperationException)) {
                    throw e12;
                }
                t.f44274b.log(Level.FINER, "setApplicationProtocol unsupported, will try old methods");
            }
        }
        sSLSocket.setSSLParameters(sSLParameters);
        if (z11 && (method = m) != null && Arrays.equals(strArr, (String[]) method.invoke(sSLSocket.getSSLParameters(), null))) {
            return;
        }
        Object[] objArr = {io.grpc.okhttp.internal.k.b(list)};
        io.grpc.okhttp.internal.k kVar = this.f44276a;
        if (kVar.e() == io.grpc.okhttp.internal.j.ALPN_AND_NPN) {
            f44265g.K(sSLSocket, objArr);
        }
        if (kVar.e() == io.grpc.okhttp.internal.j.NONE) {
            throw new RuntimeException("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
        }
        f44267i.K(sSLSocket, objArr);
    }

    @Override // nw.t
    public final String b(SSLSocket sSLSocket) {
        Logger logger = t.f44274b;
        Method method = f44271n;
        if (method != null) {
            try {
                return (String) method.invoke(sSLSocket, null);
            } catch (IllegalAccessException e8) {
                throw new RuntimeException(e8);
            } catch (InvocationTargetException e10) {
                if (!(e10.getTargetException() instanceof UnsupportedOperationException)) {
                    throw new RuntimeException(e10);
                }
                logger.log(Level.FINER, "Socket unsupported for getApplicationProtocol, will try old methods");
            }
        }
        io.grpc.okhttp.internal.k kVar = this.f44276a;
        if (kVar.e() == io.grpc.okhttp.internal.j.ALPN_AND_NPN) {
            try {
                byte[] bArr = (byte[]) f44264f.K(sSLSocket, new Object[0]);
                if (bArr != null) {
                    return new String(bArr, io.grpc.okhttp.internal.n.f34540b);
                }
            } catch (Exception e11) {
                logger.log(Level.FINE, "Failed calling getAlpnSelectedProtocol()", (Throwable) e11);
            }
        }
        if (kVar.e() != io.grpc.okhttp.internal.j.NONE) {
            try {
                byte[] bArr2 = (byte[]) f44266h.K(sSLSocket, new Object[0]);
                if (bArr2 != null) {
                    return new String(bArr2, io.grpc.okhttp.internal.n.f34540b);
                }
            } catch (Exception e12) {
                logger.log(Level.FINE, "Failed calling getNpnSelectedProtocol()", (Throwable) e12);
            }
        }
        return null;
    }

    @Override // nw.t
    public final String d(SSLSocket sSLSocket, String str, List list) {
        String strB = b(sSLSocket);
        return strB == null ? super.d(sSLSocket, str, list) : strB;
    }
}
