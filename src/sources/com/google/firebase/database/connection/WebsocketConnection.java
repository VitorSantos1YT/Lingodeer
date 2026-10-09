package com.google.firebase.database.connection;

import b7.e0;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.google.firebase.database.connection.util.StringListReader;
import com.google.firebase.database.logging.LogWrapper;
import com.google.firebase.database.tubesock.WebSocket;
import com.google.firebase.database.tubesock.WebSocketEventHandler;
import com.google.firebase.database.tubesock.WebSocketException;
import com.google.firebase.database.tubesock.WebSocketMessage;
import com.google.firebase.database.util.JsonMapper;
import java.io.EOFException;
import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class WebsocketConnection {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static long f19127k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WSClientTubesock f19128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19129b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19130c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f19131d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public StringListReader f19132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Delegate f19133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ScheduledFuture f19134g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ScheduledFuture f19135h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ScheduledExecutorService f19136i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LogWrapper f19137j;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface Delegate {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface WSClient {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class WSClientTubesock implements WSClient, WebSocketEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WebSocket f19140a;

        public WSClientTubesock(WebSocket webSocket) {
            this.f19140a = webSocket;
            webSocket.f19568c = this;
        }

        @Override // com.google.firebase.database.tubesock.WebSocketEventHandler
        public final void a() {
            WebsocketConnection.this.f19136i.execute(new Runnable() { // from class: com.google.firebase.database.connection.WebsocketConnection.WSClientTubesock.1
                @Override // java.lang.Runnable
                public final void run() {
                    WSClientTubesock wSClientTubesock = WSClientTubesock.this;
                    WebsocketConnection.this.f19135h.cancel(false);
                    WebsocketConnection websocketConnection = WebsocketConnection.this;
                    websocketConnection.f19129b = true;
                    if (websocketConnection.f19137j.c()) {
                        WebsocketConnection.this.f19137j.a("websocket opened", null, new Object[0]);
                    }
                    WebsocketConnection.this.e();
                }
            });
        }

        @Override // com.google.firebase.database.tubesock.WebSocketEventHandler
        public final void b(WebSocketMessage webSocketMessage) {
            final String str = webSocketMessage.f19582a;
            WebsocketConnection websocketConnection = WebsocketConnection.this;
            LogWrapper logWrapper = websocketConnection.f19137j;
            if (logWrapper.c()) {
                logWrapper.a(ep.a.e("ws message: ", str), null, new Object[0]);
            }
            websocketConnection.f19136i.execute(new Runnable() { // from class: com.google.firebase.database.connection.WebsocketConnection.WSClientTubesock.2
                @Override // java.lang.Runnable
                public final void run() {
                    WebsocketConnection websocketConnection2 = WebsocketConnection.this;
                    if (websocketConnection2.f19130c) {
                        return;
                    }
                    websocketConnection2.e();
                    StringListReader stringListReader = websocketConnection2.f19132e;
                    String str2 = str;
                    if (stringListReader != null) {
                        websocketConnection2.b(str2);
                        return;
                    }
                    if (str2.length() <= 6) {
                        try {
                            int i11 = Integer.parseInt(str2);
                            if (i11 > 0) {
                                websocketConnection2.d(i11);
                            }
                            str2 = null;
                        } catch (NumberFormatException unused) {
                            websocketConnection2.d(1);
                        }
                    } else {
                        websocketConnection2.d(1);
                    }
                    if (str2 != null) {
                        websocketConnection2.b(str2);
                    }
                }
            });
        }

        @Override // com.google.firebase.database.tubesock.WebSocketEventHandler
        public final void c() {
            WebsocketConnection.this.f19136i.execute(new Runnable() { // from class: com.google.firebase.database.connection.WebsocketConnection.WSClientTubesock.3
                @Override // java.lang.Runnable
                public final void run() {
                    WSClientTubesock wSClientTubesock = WSClientTubesock.this;
                    if (WebsocketConnection.this.f19137j.c()) {
                        WebsocketConnection.this.f19137j.a("closed", null, new Object[0]);
                    }
                    WebsocketConnection.a(WebsocketConnection.this);
                }
            });
        }

        @Override // com.google.firebase.database.tubesock.WebSocketEventHandler
        public final void d(final WebSocketException webSocketException) {
            WebsocketConnection.this.f19136i.execute(new Runnable() { // from class: com.google.firebase.database.connection.WebsocketConnection.WSClientTubesock.4
                @Override // java.lang.Runnable
                public final void run() {
                    WebSocketException webSocketException2 = webSocketException;
                    Throwable cause = webSocketException2.getCause();
                    WSClientTubesock wSClientTubesock = WSClientTubesock.this;
                    if (cause == null || !(webSocketException2.getCause() instanceof EOFException)) {
                        WebsocketConnection.this.f19137j.a("WebSocket error.", webSocketException2, new Object[0]);
                    } else {
                        WebsocketConnection.this.f19137j.a("WebSocket reached EOF.", null, new Object[0]);
                    }
                    WebsocketConnection.a(WebsocketConnection.this);
                }
            });
        }

        public final void e(String str) {
            WebSocket webSocket = this.f19140a;
            synchronized (webSocket) {
                webSocket.f((byte) 1, str.getBytes(WebSocket.m));
            }
        }
    }

    public WebsocketConnection(ConnectionContext connectionContext, HostInfo hostInfo, String str, String str2, Delegate delegate, String str3) {
        this.f19136i = connectionContext.f19061a;
        this.f19133f = delegate;
        long j11 = f19127k;
        f19127k = 1 + j11;
        this.f19137j = new LogWrapper(connectionContext.f19064d, "WebSocket", defpackage.e.h(j11, "ws_"));
        str = str == null ? hostInfo.f19068a : str;
        boolean z11 = hostInfo.f19070c;
        StringBuilder sbQ = e0.q(z11 ? "wss" : "ws", "://", str, "/.ws?ns=", hostInfo.f19069b);
        sbQ.append("&v=5");
        String string = sbQ.toString();
        URI uriCreate = URI.create(str3 != null ? ep.a.D(string, "&ls=", str3) : string);
        HashMap map = new HashMap();
        map.put(HttpHeaders.USER_AGENT, connectionContext.f19065e);
        map.put("X-Firebase-GMPID", connectionContext.f19066f);
        map.put("X-Firebase-AppCheck", str2);
        this.f19128a = new WSClientTubesock(new WebSocket(connectionContext, uriCreate, map));
    }

    public static void a(WebsocketConnection websocketConnection) {
        LogWrapper logWrapper = websocketConnection.f19137j;
        if (!websocketConnection.f19130c) {
            if (logWrapper.c()) {
                logWrapper.a("closing itself", null, new Object[0]);
            }
            websocketConnection.f19130c = true;
            Delegate delegate = websocketConnection.f19133f;
            boolean z11 = websocketConnection.f19129b;
            Connection connection = (Connection) delegate;
            LogWrapper logWrapper2 = connection.f19060e;
            connection.f19057b = null;
            if (z11 || connection.f19059d != Connection.State.REALTIME_CONNECTING) {
                if (logWrapper2.c()) {
                    logWrapper2.a("Realtime connection lost", null, new Object[0]);
                }
            } else if (logWrapper2.c()) {
                logWrapper2.a("Realtime connection failed", null, new Object[0]);
            }
            connection.a();
        }
        websocketConnection.f19128a = null;
        ScheduledFuture scheduledFuture = websocketConnection.f19134g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public final void b(String str) {
        Delegate delegate = this.f19133f;
        LogWrapper logWrapper = this.f19137j;
        StringListReader stringListReader = this.f19132e;
        if (stringListReader.f19179t) {
            throw new IllegalStateException("Trying to add string after reading");
        }
        if (str.length() > 0) {
            stringListReader.f19173a.add(str);
        }
        long j11 = this.f19131d - 1;
        this.f19131d = j11;
        if (j11 == 0) {
            try {
                StringListReader stringListReader2 = this.f19132e;
                if (stringListReader2.f19179t) {
                    throw new IllegalStateException("Trying to freeze frozen StringListReader");
                }
                stringListReader2.f19179t = true;
                HashMap mapA = JsonMapper.a(stringListReader2.toString());
                this.f19132e = null;
                if (logWrapper.c()) {
                    logWrapper.a("handleIncomingFrame complete frame: " + mapA, null, new Object[0]);
                }
                ((Connection) delegate).e(mapA);
            } catch (IOException e8) {
                logWrapper.b("Error parsing frame: " + this.f19132e.toString(), e8);
                c();
                this.f19130c = true;
                boolean z11 = this.f19129b;
                Connection connection = (Connection) delegate;
                LogWrapper logWrapper2 = connection.f19060e;
                connection.f19057b = null;
                if (z11 || connection.f19059d != Connection.State.REALTIME_CONNECTING) {
                    if (logWrapper2.c()) {
                        logWrapper2.a("Realtime connection lost", null, new Object[0]);
                    }
                } else if (logWrapper2.c()) {
                    logWrapper2.a("Realtime connection failed", null, new Object[0]);
                }
                connection.a();
            } catch (ClassCastException e10) {
                logWrapper.b("Error parsing frame (cast error): " + this.f19132e.toString(), e10);
                c();
                this.f19130c = true;
                boolean z12 = this.f19129b;
                Connection connection2 = (Connection) delegate;
                LogWrapper logWrapper3 = connection2.f19060e;
                connection2.f19057b = null;
                if (z12 || connection2.f19059d != Connection.State.REALTIME_CONNECTING) {
                    if (logWrapper3.c()) {
                        logWrapper3.a("Realtime connection lost", null, new Object[0]);
                    }
                } else if (logWrapper3.c()) {
                    logWrapper3.a("Realtime connection failed", null, new Object[0]);
                }
                connection2.a();
            }
        }
    }

    public final void c() {
        LogWrapper logWrapper = this.f19137j;
        if (logWrapper.c()) {
            logWrapper.a("websocket is being closed", null, new Object[0]);
        }
        this.f19130c = true;
        this.f19128a.f19140a.b();
        ScheduledFuture scheduledFuture = this.f19135h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledFuture scheduledFuture2 = this.f19134g;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
        }
    }

    public final void d(int i11) {
        this.f19131d = i11;
        this.f19132e = new StringListReader();
        LogWrapper logWrapper = this.f19137j;
        if (logWrapper.c()) {
            logWrapper.a("HandleNewFrameCount: " + this.f19131d, null, new Object[0]);
        }
    }

    public final void e() {
        if (this.f19130c) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f19134g;
        LogWrapper logWrapper = this.f19137j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            if (logWrapper.c()) {
                logWrapper.a("Reset keepAlive. Remaining: " + this.f19134g.getDelay(TimeUnit.MILLISECONDS), null, new Object[0]);
            }
        } else if (logWrapper.c()) {
            logWrapper.a("Reset keepAlive", null, new Object[0]);
        }
        this.f19134g = this.f19136i.schedule(new Runnable() { // from class: com.google.firebase.database.connection.WebsocketConnection.2
            @Override // java.lang.Runnable
            public final void run() {
                WebsocketConnection websocketConnection = WebsocketConnection.this;
                WSClientTubesock wSClientTubesock = websocketConnection.f19128a;
                if (wSClientTubesock != null) {
                    wSClientTubesock.e("0");
                    websocketConnection.e();
                }
            }
        }, 45000L, TimeUnit.MILLISECONDS);
    }
}
