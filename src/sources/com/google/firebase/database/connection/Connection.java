package com.google.firebase.database.connection;

import com.google.firebase.database.logging.LogWrapper;
import com.google.firebase.iid.QyE.SemtNwfPgIhi;
import java.util.HashMap;
import java.util.Map;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class Connection implements WebsocketConnection.Delegate {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static long f19055f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HostInfo f19056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WebsocketConnection f19057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Delegate f19058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public State f19059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LogWrapper f19060e;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface Delegate {
        void a(String str);

        void b(String str);

        void c(long j11, String str);

        void d(Map map);

        void e(DisconnectReason disconnectReason);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class DisconnectReason {
        private static final /* synthetic */ DisconnectReason[] $VALUES;
        public static final DisconnectReason OTHER;
        public static final DisconnectReason SERVER_RESET;

        static {
            DisconnectReason disconnectReason = new DisconnectReason("SERVER_RESET", 0);
            SERVER_RESET = disconnectReason;
            DisconnectReason disconnectReason2 = new DisconnectReason("OTHER", 1);
            OTHER = disconnectReason2;
            $VALUES = new DisconnectReason[]{disconnectReason, disconnectReason2};
        }

        public static DisconnectReason valueOf(String str) {
            return (DisconnectReason) Enum.valueOf(DisconnectReason.class, str);
        }

        public static DisconnectReason[] values() {
            return (DisconnectReason[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class State {
        private static final /* synthetic */ State[] $VALUES;
        public static final State REALTIME_CONNECTED;
        public static final State REALTIME_CONNECTING;
        public static final State REALTIME_DISCONNECTED;

        static {
            State state = new State("REALTIME_CONNECTING", 0);
            REALTIME_CONNECTING = state;
            State state2 = new State("REALTIME_CONNECTED", 1);
            REALTIME_CONNECTED = state2;
            State state3 = new State("REALTIME_DISCONNECTED", 2);
            REALTIME_DISCONNECTED = state3;
            $VALUES = new State[]{state, state2, state3};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public Connection(ConnectionContext connectionContext, HostInfo hostInfo, String str, Delegate delegate, String str2, String str3) {
        long j11 = f19055f;
        f19055f = 1 + j11;
        this.f19056a = hostInfo;
        this.f19058c = delegate;
        this.f19060e = new LogWrapper(connectionContext.f19064d, "Connection", defpackage.e.h(j11, "conn_"));
        this.f19059d = State.REALTIME_CONNECTING;
        this.f19057b = new WebsocketConnection(connectionContext, hostInfo, str, str3, this, str2);
    }

    public final void a() {
        b(DisconnectReason.OTHER);
    }

    public final void b(DisconnectReason disconnectReason) {
        State state = this.f19059d;
        State state2 = State.REALTIME_DISCONNECTED;
        if (state != state2) {
            LogWrapper logWrapper = this.f19060e;
            if (logWrapper.c()) {
                logWrapper.a("closing realtime connection", null, new Object[0]);
            }
            this.f19059d = state2;
            WebsocketConnection websocketConnection = this.f19057b;
            if (websocketConnection != null) {
                websocketConnection.c();
                this.f19057b = null;
            }
            this.f19058c.e(disconnectReason);
        }
    }

    public final void d(Map map) {
        long jLongValue = ((Long) map.get("ts")).longValue();
        String str = (String) map.get("h");
        Delegate delegate = this.f19058c;
        delegate.a(str);
        String str2 = (String) map.get("s");
        if (this.f19059d == State.REALTIME_CONNECTING) {
            this.f19057b.getClass();
            LogWrapper logWrapper = this.f19060e;
            if (logWrapper.c()) {
                logWrapper.a("realtime connection established", null, new Object[0]);
            }
            this.f19059d = State.REALTIME_CONNECTED;
            delegate.c(jLongValue, str2);
        }
    }

    public final void e(HashMap map) {
        LogWrapper logWrapper = this.f19060e;
        try {
            String str = (String) map.get("t");
            if (str == null) {
                if (logWrapper.c()) {
                    logWrapper.a("Failed to parse server message: missing message type:" + map.toString(), null, new Object[0]);
                }
                a();
                return;
            }
            if (str.equals("d")) {
                Map map2 = (Map) map.get("d");
                if (logWrapper.c()) {
                    logWrapper.a("received data message: " + map2.toString(), null, new Object[0]);
                }
                this.f19058c.d(map2);
                return;
            }
            if (str.equals("c")) {
                c((Map) map.get("d"));
            } else if (logWrapper.c()) {
                logWrapper.a("Ignoring unknown server message type: ".concat(str), null, new Object[0]);
            }
        } catch (ClassCastException e8) {
            if (logWrapper.c()) {
                logWrapper.a("Failed to parse server message: " + e8.toString(), null, new Object[0]);
            }
            a();
        }
    }

    public final void f(String str) {
        LogWrapper logWrapper = this.f19060e;
        if (logWrapper.c()) {
            logWrapper.a(p.u(new StringBuilder("Got a reset; killing connection to "), this.f19056a.f19068a, "; Updating internalHost to ", str), null, new Object[0]);
        }
        this.f19058c.a(str);
        b(DisconnectReason.SERVER_RESET);
    }

    public final void c(Map map) {
        LogWrapper logWrapper = this.f19060e;
        if (logWrapper.c()) {
            logWrapper.a("Got control message: " + map.toString(), null, new Object[0]);
        }
        try {
            String str = (String) map.get("t");
            if (str == null) {
                if (logWrapper.c()) {
                    logWrapper.a("Got invalid control message: " + map.toString(), null, new Object[0]);
                }
                a();
                return;
            }
            if (str.equals("s")) {
                String str2 = (String) map.get("d");
                if (logWrapper.c()) {
                    logWrapper.a("Connection shutdown command received. Shutting down...", null, new Object[0]);
                }
                this.f19058c.b(str2);
                a();
                return;
            }
            if (str.equals("r")) {
                f((String) map.get("d"));
            } else if (str.equals(SemtNwfPgIhi.wBmajvMwPnP)) {
                d((Map) map.get("d"));
            } else if (logWrapper.c()) {
                logWrapper.a("Ignoring unknown control message: ".concat(str), null, new Object[0]);
            }
        } catch (ClassCastException e8) {
            if (logWrapper.c()) {
                logWrapper.a("Failed to parse control message: " + e8.toString(), null, new Object[0]);
            }
            a();
        }
    }
}
