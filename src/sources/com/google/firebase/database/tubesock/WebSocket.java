package com.google.firebase.database.tubesock;

import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import android.util.Base64;
import com.adjust.sdk.Constants;
import com.google.firebase.database.connection.ConnectionContext;
import com.google.firebase.database.logging.LogWrapper;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ep.a;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URI;
import java.net.UnknownHostException;
import java.nio.channels.Channels;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class WebSocket {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final AtomicInteger f19563l = new AtomicInteger(0);
    public static final Charset m = Charset.forName(Constants.ENCODING);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ThreadFactory f19564n = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ThreadInitializer f19565o = new ThreadInitializer() { // from class: com.google.firebase.database.tubesock.WebSocket.1
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile State f19566a = State.NONE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Socket f19567b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WebSocketEventHandler f19568c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final URI f19569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f19570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WebSocketReceiver f19571f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final WebSocketWriter f19572g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final WebSocketHandshake f19573h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LogWrapper f19574i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f19575j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Thread f19576k;

    /* JADX INFO: renamed from: com.google.firebase.database.tubesock.WebSocket$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19578a;

        static {
            int[] iArr = new int[State.values().length];
            f19578a = iArr;
            try {
                iArr[State.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19578a[State.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19578a[State.CONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19578a[State.DISCONNECTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19578a[State.DISCONNECTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class State {
        private static final /* synthetic */ State[] $VALUES;
        public static final State CONNECTED;
        public static final State CONNECTING;
        public static final State DISCONNECTED;
        public static final State DISCONNECTING;
        public static final State NONE;

        static {
            State state = new State("NONE", 0);
            NONE = state;
            State state2 = new State("CONNECTING", 1);
            CONNECTING = state2;
            State state3 = new State("CONNECTED", 2);
            CONNECTED = state3;
            State state4 = new State("DISCONNECTING", 3);
            DISCONNECTING = state4;
            State state5 = new State("DISCONNECTED", 4);
            DISCONNECTED = state5;
            $VALUES = new State[]{state, state2, state3, state4, state5};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public WebSocket(ConnectionContext connectionContext, URI uri, HashMap map) {
        int iIncrementAndGet = f19563l.incrementAndGet();
        this.f19575j = iIncrementAndGet;
        this.f19576k = f19564n.newThread(new Runnable() { // from class: com.google.firebase.database.tubesock.WebSocket.2
            @Override // java.lang.Runnable
            public final void run() {
                WebSocket webSocket = WebSocket.this;
                AtomicInteger atomicInteger = WebSocket.f19563l;
                try {
                    try {
                        Socket socketE = webSocket.e();
                        synchronized (webSocket) {
                            webSocket.f19567b = socketE;
                            if (webSocket.f19566a == State.DISCONNECTED) {
                                try {
                                    webSocket.f19567b.close();
                                    webSocket.f19567b = null;
                                    webSocket.b();
                                    return;
                                } catch (IOException e8) {
                                    throw new RuntimeException(e8);
                                }
                            }
                            DataInputStream dataInputStream = new DataInputStream(socketE.getInputStream());
                            OutputStream outputStream = socketE.getOutputStream();
                            outputStream.write(webSocket.f19573h.a());
                            byte[] bArr = new byte[1000];
                            ArrayList arrayList = new ArrayList();
                            boolean z11 = false;
                            int i11 = 0;
                            while (!z11) {
                                int i12 = dataInputStream.read();
                                if (i12 == -1) {
                                    throw new WebSocketException("Connection closed before handshake was complete");
                                }
                                byte b3 = (byte) i12;
                                bArr[i11] = b3;
                                int i13 = i11 + 1;
                                if (b3 == 10 && bArr[i11 - 1] == 13) {
                                    String str = new String(bArr, WebSocket.m);
                                    if (str.trim().equals(BuildConfig.VERSION_NAME)) {
                                        z11 = true;
                                    } else {
                                        arrayList.add(str.trim());
                                    }
                                    bArr = new byte[1000];
                                    i11 = 0;
                                } else {
                                    if (i13 == 1000) {
                                        throw new WebSocketException("Unexpected long line in handshake: " + new String(bArr, WebSocket.m));
                                    }
                                    i11 = i13;
                                }
                            }
                            WebSocketHandshake webSocketHandshake = webSocket.f19573h;
                            String str2 = (String) arrayList.get(0);
                            webSocketHandshake.getClass();
                            WebSocketHandshake.c(str2);
                            arrayList.remove(0);
                            HashMap map2 = new HashMap();
                            int size = arrayList.size();
                            int i14 = 0;
                            while (i14 < size) {
                                Object obj = arrayList.get(i14);
                                i14++;
                                String[] strArrSplit = ((String) obj).split(": ", 2);
                                String str3 = strArrSplit[0];
                                Locale locale = Locale.US;
                                map2.put(str3.toLowerCase(locale), strArrSplit[1].toLowerCase(locale));
                            }
                            webSocket.f19573h.getClass();
                            WebSocketHandshake.b(map2);
                            WebSocketWriter webSocketWriter = webSocket.f19572g;
                            webSocketWriter.getClass();
                            webSocketWriter.f19594f = Channels.newChannel(outputStream);
                            webSocket.f19571f.f19583a = dataInputStream;
                            webSocket.f19566a = State.CONNECTED;
                            webSocket.f19572g.f19595g.start();
                            webSocket.f19568c.a();
                            webSocket.f19571f.c();
                            webSocket.b();
                        }
                    } catch (Throwable th2) {
                        webSocket.b();
                        throw th2;
                    }
                } catch (WebSocketException e10) {
                    webSocket.f19568c.d(e10);
                    webSocket.b();
                } catch (Throwable th3) {
                    webSocket.f19568c.d(new WebSocketException("error while connecting: " + th3.getMessage(), th3));
                    webSocket.b();
                }
            }
        });
        this.f19569d = uri;
        this.f19570e = connectionContext.f19067g;
        this.f19574i = new LogWrapper(connectionContext.f19064d, "WebSocket", p.j(iIncrementAndGet, "sk_"));
        WebSocketHandshake webSocketHandshake = new WebSocketHandshake();
        webSocketHandshake.f19580b = null;
        webSocketHandshake.f19579a = uri;
        webSocketHandshake.f19581c = map;
        byte[] bArr = new byte[16];
        for (int i11 = 0; i11 < 16; i11++) {
            bArr[i11] = (byte) ((Math.random() * ((double) 255)) + ((double) 0));
        }
        webSocketHandshake.f19580b = Base64.encodeToString(bArr, 2);
        this.f19573h = webSocketHandshake;
        WebSocketReceiver webSocketReceiver = new WebSocketReceiver();
        webSocketReceiver.f19583a = null;
        webSocketReceiver.f19584b = null;
        webSocketReceiver.f19585c = null;
        webSocketReceiver.f19586d = new byte[112];
        webSocketReceiver.f19588f = false;
        webSocketReceiver.f19584b = this;
        this.f19571f = webSocketReceiver;
        this.f19572g = new WebSocketWriter(this, this.f19575j);
    }

    public final void a() throws InterruptedException {
        WebSocketWriter webSocketWriter = this.f19572g;
        if (webSocketWriter.f19595g.getState() != Thread.State.NEW) {
            webSocketWriter.f19595g.join();
        }
        this.f19576k.join();
    }

    public final synchronized void b() {
        int i11 = AnonymousClass3.f19578a[this.f19566a.ordinal()];
        if (i11 == 1) {
            this.f19566a = State.DISCONNECTED;
            return;
        }
        if (i11 == 2) {
            c();
            return;
        }
        if (i11 != 3) {
            if (i11 != 4) {
                if (i11 != 5) {
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        try {
            this.f19566a = State.DISCONNECTING;
            this.f19572g.f19591c = true;
            this.f19572g.b((byte) 8, new byte[0]);
        } catch (IOException e8) {
            this.f19568c.d(new WebSocketException("Failed to send close frame", e8));
        }
    }

    public final synchronized void c() {
        if (this.f19566a == State.DISCONNECTED) {
            return;
        }
        this.f19571f.f19588f = true;
        this.f19572g.f19591c = true;
        if (this.f19567b != null) {
            try {
                this.f19567b.close();
            } catch (Exception e8) {
                this.f19568c.d(new WebSocketException("Failed to close", e8));
            }
        }
        this.f19566a = State.DISCONNECTED;
        this.f19568c.c();
    }

    public final synchronized void d() {
        if (this.f19566a != State.NONE) {
            this.f19568c.d(new WebSocketException("connect() already called"));
            b();
            return;
        }
        ThreadInitializer threadInitializer = f19565o;
        Thread thread = this.f19576k;
        String str = "TubeSockReader-" + this.f19575j;
        ((AnonymousClass1) threadInitializer).getClass();
        thread.setName(str);
        this.f19566a = State.CONNECTING;
        this.f19576k.start();
    }

    public final Socket e() {
        URI uri = this.f19569d;
        String scheme = uri.getScheme();
        String host = uri.getHost();
        int port = uri.getPort();
        if (scheme != null && scheme.equals("ws")) {
            if (port == -1) {
                port = 80;
            }
            try {
                return new Socket(host, port);
            } catch (UnknownHostException e8) {
                throw new WebSocketException(a.e("unknown host: ", host), e8);
            } catch (IOException e10) {
                throw new WebSocketException("error while creating socket to " + uri, e10);
            }
        }
        if (scheme == null || !scheme.equals("wss")) {
            throw new WebSocketException(a.e("unsupported protocol: ", scheme));
        }
        if (port == -1) {
            port = 443;
        }
        String str = this.f19570e;
        SSLSessionCache sSLSessionCache = null;
        if (str != null) {
            try {
                sSLSessionCache = new SSLSessionCache(new File(str));
            } catch (IOException e11) {
                this.f19574i.a("Failed to initialize SSL session cache", e11, new Object[0]);
            }
        }
        try {
            SSLSocket sSLSocket = (SSLSocket) SSLCertificateSocketFactory.getDefault(60000, sSLSessionCache).createSocket(host, port);
            if (HttpsURLConnection.getDefaultHostnameVerifier().verify(host, sSLSocket.getSession())) {
                return sSLSocket;
            }
            throw new WebSocketException("Error while verifying secure socket to " + uri);
        } catch (UnknownHostException e12) {
            throw new WebSocketException(a.e("unknown host: ", host), e12);
        } catch (IOException e13) {
            throw new WebSocketException("error while creating secure socket to " + uri, e13);
        }
    }

    public final synchronized void f(byte b3, byte[] bArr) {
        if (this.f19566a != State.CONNECTED) {
            this.f19568c.d(new WebSocketException("error while sending data: not connected"));
        } else {
            try {
                this.f19572g.b(b3, bArr);
            } catch (IOException e8) {
                this.f19568c.d(new WebSocketException("Failed to send frame", e8));
                b();
            }
        }
    }
}
