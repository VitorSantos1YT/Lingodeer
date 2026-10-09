package mw;

import com.adjust.sdk.Constants;
import com.google.common.base.Supplier;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c4 implements lw.m1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f42379d = Logger.getLogger(c4.class.getName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n3 f42380e = new n3(16);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i1 f42381f = new i1(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Supplier f42382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n3 f42383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f42384c;

    public c4() {
        String str = System.getenv("GRPC_PROXY_EXP");
        i1 i1Var = f42381f;
        i1Var.getClass();
        this.f42382a = i1Var;
        n3 n3Var = f42380e;
        n3Var.getClass();
        this.f42383b = n3Var;
        if (str == null) {
            this.f42384c = null;
            return;
        }
        String[] strArrSplit = str.split(":", 2);
        int i11 = strArrSplit.length > 1 ? Integer.parseInt(strArrSplit[1]) : 80;
        f42379d.warning("Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
        this.f42384c = new InetSocketAddress(strArrSplit[0], i11);
    }

    @Override // lw.m1
    public final lw.l1 a(InetSocketAddress inetSocketAddress) {
        URL url;
        lw.z zVar;
        if (inetSocketAddress != null) {
            InetSocketAddress inetSocketAddress2 = this.f42384c;
            if (inetSocketAddress2 != null) {
                return new lw.z(inetSocketAddress2, inetSocketAddress, null, null);
            }
            Logger logger = f42379d;
            try {
                try {
                    URI uri = new URI(Constants.SCHEME, null, k1.d(inetSocketAddress), inetSocketAddress.getPort(), null, null, null);
                    ProxySelector proxySelector = (ProxySelector) this.f42382a.get();
                    if (proxySelector == null) {
                        logger.log(Level.FINE, "proxy selector is null, so continuing without proxy lookup");
                        return null;
                    }
                    List<Proxy> listSelect = proxySelector.select(uri);
                    if (listSelect.size() > 1) {
                        logger.warning("More than 1 proxy detected, gRPC will select the first one");
                    }
                    Proxy proxy = listSelect.get(0);
                    if (proxy.type() != Proxy.Type.DIRECT) {
                        InetSocketAddress inetSocketAddress3 = (InetSocketAddress) proxy.address();
                        String strD = k1.d(inetSocketAddress3);
                        InetAddress address = inetSocketAddress3.getAddress();
                        int port = inetSocketAddress3.getPort();
                        this.f42383b.getClass();
                        try {
                            url = new URL(Constants.SCHEME, strD, port, BuildConfig.VERSION_NAME);
                        } catch (MalformedURLException unused) {
                            logger.log(Level.WARNING, "failed to create URL for Authenticator: {0} {1}", new Object[]{Constants.SCHEME, strD});
                            url = null;
                        }
                        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(strD, address, port, Constants.SCHEME, BuildConfig.VERSION_NAME, null, url, Authenticator.RequestorType.PROXY);
                        if (inetSocketAddress3.isUnresolved()) {
                            inetSocketAddress3 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress3.getHostName()), inetSocketAddress3.getPort());
                        }
                        int i11 = lw.z.f40488e;
                        if (passwordAuthenticationRequestPasswordAuthentication == null) {
                            zVar = new lw.z(inetSocketAddress3, inetSocketAddress, null, null);
                        } else {
                            zVar = new lw.z(inetSocketAddress3, inetSocketAddress, passwordAuthenticationRequestPasswordAuthentication.getUserName(), passwordAuthenticationRequestPasswordAuthentication.getPassword() != null ? new String(passwordAuthenticationRequestPasswordAuthentication.getPassword()) : null);
                        }
                        return zVar;
                    }
                } catch (URISyntaxException e8) {
                    logger.log(Level.WARNING, "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e8);
                    return null;
                }
            } catch (Throwable th2) {
                logger.log(Level.WARNING, "Failed to get host for proxy lookup, proceeding without proxy", th2);
                return null;
            }
        }
        return null;
    }
}
