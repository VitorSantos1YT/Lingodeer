package com.google.firebase.database.connection;

import com.google.firebase.database.connection.util.RetryHelper;
import com.google.firebase.database.logging.LogWrapper;
import com.google.firebase.database.logging.Logger;
import com.google.firebase.database.util.GAuthToken;
import com.google.firebase.database.util.JsonMapper;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fa.EQx.nuRcCS;
import hh.p0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import nv.p;
import okhttp3.internal.platform.ZjS.OYAvlbfUyD;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class PersistentConnectionImpl implements Connection.Delegate, PersistentConnection {
    public static long G;
    public long E;
    public boolean F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PersistentConnection.Delegate f19071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HostInfo f19072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f19073c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f19076f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Connection f19077g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashMap f19081k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f19082l;
    public final HashMap m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ConcurrentHashMap f19083n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final HashMap f19084o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f19085p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f19086q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f19087r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f19088s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ConnectionContext f19089t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final com.google.firebase.database.core.a f19090u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final com.google.firebase.database.core.a f19091v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ScheduledExecutorService f19092w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final LogWrapper f19093x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final RetryHelper f19094y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f19095z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f19074d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f19075e = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ConnectionState f19078h = ConnectionState.Disconnected;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f19079i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f19080j = 0;
    public long A = 0;
    public int B = 0;
    public int C = 0;
    public ScheduledFuture D = null;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface ConnectionRequestCallback {
        void a(Map map);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ConnectionState {
        private static final /* synthetic */ ConnectionState[] $VALUES;
        public static final ConnectionState Authenticating;
        public static final ConnectionState Connected;
        public static final ConnectionState Connecting;
        public static final ConnectionState Disconnected;
        public static final ConnectionState GettingToken;

        static {
            ConnectionState connectionState = new ConnectionState("Disconnected", 0);
            Disconnected = connectionState;
            ConnectionState connectionState2 = new ConnectionState("GettingToken", 1);
            GettingToken = connectionState2;
            ConnectionState connectionState3 = new ConnectionState("Connecting", 2);
            Connecting = connectionState3;
            ConnectionState connectionState4 = new ConnectionState("Authenticating", 3);
            Authenticating = connectionState4;
            ConnectionState connectionState5 = new ConnectionState("Connected", 4);
            Connected = connectionState5;
            $VALUES = new ConnectionState[]{connectionState, connectionState2, connectionState3, connectionState4, connectionState5};
        }

        public static ConnectionState valueOf(String str) {
            return (ConnectionState) Enum.valueOf(ConnectionState.class, str);
        }

        public static ConnectionState[] values() {
            return (ConnectionState[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class OutstandingDisconnect {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class OutstandingGet {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f19113a;
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class OutstandingListen {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RequestResultCallback f19114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final QuerySpec f19115b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ListenHashProvider f19116c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Long f19117d;

        public OutstandingListen(RequestResultCallback requestResultCallback, QuerySpec querySpec, Long l9, ListenHashProvider listenHashProvider) {
            this.f19114a = requestResultCallback;
            this.f19115b = querySpec;
            this.f19116c = listenHashProvider;
            this.f19117d = l9;
        }

        public final String toString() {
            return this.f19115b.toString() + " (Tag: " + this.f19117d + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class OutstandingPut {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f19118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public HashMap f19119b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public RequestResultCallback f19120c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f19121d;
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class QuerySpec {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f19122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashMap f19123b;

        public QuerySpec(ArrayList arrayList, HashMap map) {
            this.f19122a = arrayList;
            this.f19123b = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuerySpec)) {
                return false;
            }
            QuerySpec querySpec = (QuerySpec) obj;
            if (this.f19122a.equals(querySpec.f19122a)) {
                return this.f19123b.equals(querySpec.f19123b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f19123b.hashCode() + (this.f19122a.hashCode() * 31);
        }

        public final String toString() {
            return ConnectionUtils.b(this.f19122a) + " (params: " + this.f19123b + ")";
        }
    }

    public PersistentConnectionImpl(ConnectionContext connectionContext, HostInfo hostInfo, PersistentConnection.Delegate delegate) {
        this.f19071a = delegate;
        this.f19089t = connectionContext;
        ScheduledExecutorService scheduledExecutorService = connectionContext.f19061a;
        this.f19092w = scheduledExecutorService;
        this.f19090u = connectionContext.f19062b;
        this.f19091v = connectionContext.f19063c;
        this.f19072b = hostInfo;
        this.f19084o = new HashMap();
        this.f19081k = new HashMap();
        this.m = new HashMap();
        this.f19083n = new ConcurrentHashMap();
        this.f19082l = new ArrayList();
        Logger logger = connectionContext.f19064d;
        this.f19094y = new RetryHelper(scheduledExecutorService, new RetryHelper.Builder(scheduledExecutorService, logger).f19172b, 0.7d);
        long j11 = G;
        G = 1 + j11;
        this.f19093x = new LogWrapper(logger, "PersistentConnection", defpackage.e.h(j11, "pc_"));
        this.f19095z = null;
        g();
    }

    @Override // com.google.firebase.database.connection.Connection.Delegate
    public final void a(String str) {
        this.f19073c = str;
    }

    @Override // com.google.firebase.database.connection.Connection.Delegate
    public final void b(String str) {
        boolean zEquals = str.equals("Invalid appcheck token");
        LogWrapper logWrapper = this.f19093x;
        if (zEquals) {
            int i11 = this.C;
            if (i11 < 3) {
                this.C = i11 + 1;
                logWrapper.e("Detected invalid AppCheck token. Reconnecting (" + (3 - ((long) this.C)) + " attempts remaining)");
                return;
            }
        }
        logWrapper.e("Firebase Database connection was forcefully killed by the server. Will not attempt reconnect. Reason: ".concat(str));
        h("server_kill");
    }

    @Override // com.google.firebase.database.connection.Connection.Delegate
    public final void d(Map map) {
        if (map.containsKey("r")) {
            ConnectionRequestCallback connectionRequestCallback = (ConnectionRequestCallback) this.f19081k.remove(Long.valueOf(((Integer) map.get("r")).intValue()));
            if (connectionRequestCallback != null) {
                connectionRequestCallback.a((Map) map.get("b"));
                return;
            }
            return;
        }
        if (map.containsKey("error")) {
            return;
        }
        boolean zContainsKey = map.containsKey("a");
        int i11 = 0;
        LogWrapper logWrapper = this.f19093x;
        if (!zContainsKey) {
            if (logWrapper.c()) {
                logWrapper.a("Ignoring unknown message: " + map, null, new Object[0]);
                return;
            }
            return;
        }
        String str = (String) map.get("a");
        Map map2 = (Map) map.get("b");
        if (logWrapper.c()) {
            logWrapper.a("handleServerMessage: " + str + " " + map2, null, new Object[0]);
        }
        boolean zEquals = str.equals("d");
        PersistentConnection.Delegate delegate = this.f19071a;
        if (zEquals || str.equals("m")) {
            boolean zEquals2 = str.equals("m");
            String str2 = (String) map2.get("p");
            Object obj = map2.get("d");
            Object obj2 = map2.get("t");
            Long lValueOf = obj2 instanceof Integer ? Long.valueOf(((Integer) obj2).intValue()) : obj2 instanceof Long ? (Long) obj2 : null;
            if (!zEquals2 || !(obj instanceof Map) || ((Map) obj).size() != 0) {
                delegate.a(ConnectionUtils.c(str2), obj, zEquals2, lValueOf);
                return;
            } else {
                if (logWrapper.c()) {
                    logWrapper.a(ep.a.e("ignoring empty merge for path ", str2), null, new Object[0]);
                    return;
                }
                return;
            }
        }
        if (str.equals("rm")) {
            String str3 = (String) map2.get("p");
            ArrayList arrayListC = ConnectionUtils.c(str3);
            Object obj3 = map2.get("d");
            Object obj4 = map2.get("t");
            Long lValueOf2 = obj4 instanceof Integer ? Long.valueOf(((Integer) obj4).intValue()) : obj4 instanceof Long ? (Long) obj4 : null;
            ArrayList arrayList = new ArrayList();
            for (Map map3 : (List) obj3) {
                String str4 = (String) map3.get("s");
                String str5 = (String) map3.get("e");
                arrayList.add(new RangeMerge(map3.get("m"), str4 != null ? ConnectionUtils.c(str4) : null, str5 != null ? ConnectionUtils.c(str5) : null));
            }
            if (!arrayList.isEmpty()) {
                delegate.f(arrayListC, arrayList, lValueOf2);
                return;
            } else {
                if (logWrapper.c()) {
                    logWrapper.a("Ignoring empty range merge for path ".concat(str3), null, new Object[0]);
                    return;
                }
                return;
            }
        }
        if (!str.equals("c")) {
            if (str.equals("ac")) {
                logWrapper.a(ep.a.h("Auth token revoked: ", (String) map2.get("s"), " (", (String) map2.get("d"), ")"), null, new Object[0]);
                this.f19085p = null;
                this.f19086q = true;
                delegate.e();
                this.f19077g.a();
                return;
            }
            if (str.equals("apc")) {
                logWrapper.a(ep.a.h("App check token revoked: ", (String) map2.get("s"), " (", (String) map2.get("d"), ")"), null, new Object[0]);
                this.f19087r = null;
                this.f19088s = true;
                return;
            } else if (str.equals("sd")) {
                logWrapper.f19506a.a(Logger.Level.INFO, logWrapper.f19507b, logWrapper.d((String) map2.get("msg"), new Object[0]), System.currentTimeMillis());
                return;
            } else {
                if (logWrapper.c()) {
                    logWrapper.a("Unrecognized action from server: ".concat(str), null, new Object[0]);
                    return;
                }
                return;
            }
        }
        ArrayList arrayListC2 = ConnectionUtils.c((String) map2.get("p"));
        if (logWrapper.c()) {
            logWrapper.a("removing all listens at path " + arrayListC2, null, new Object[0]);
        }
        ArrayList arrayList2 = new ArrayList();
        HashMap map4 = this.f19084o;
        for (Map.Entry entry : map4.entrySet()) {
            QuerySpec querySpec = (QuerySpec) entry.getKey();
            OutstandingListen outstandingListen = (OutstandingListen) entry.getValue();
            if (querySpec.f19122a.equals(arrayListC2)) {
                arrayList2.add(outstandingListen);
            }
        }
        int size = arrayList2.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj5 = arrayList2.get(i12);
            i12++;
            map4.remove(((OutstandingListen) obj5).f19115b);
        }
        g();
        int size2 = arrayList2.size();
        while (i11 < size2) {
            Object obj6 = arrayList2.get(i11);
            i11++;
            ((OutstandingListen) obj6).f19114a.a("permission_denied", null);
        }
    }

    @Override // com.google.firebase.database.connection.Connection.Delegate
    public final void e(Connection.DisconnectReason disconnectReason) {
        LogWrapper logWrapper = this.f19093x;
        boolean z11 = false;
        if (logWrapper.c()) {
            logWrapper.a("Got on disconnect due to " + disconnectReason.name(), null, new Object[0]);
        }
        this.f19078h = ConnectionState.Disconnected;
        this.f19077g = null;
        this.F = false;
        this.f19081k.clear();
        ArrayList arrayList = new ArrayList();
        Iterator it = this.m.entrySet().iterator();
        while (it.hasNext()) {
            OutstandingPut outstandingPut = (OutstandingPut) ((Map.Entry) it.next()).getValue();
            if (outstandingPut.f19119b.containsKey("h") && outstandingPut.f19121d) {
                arrayList.add(outstandingPut);
                it.remove();
            }
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((OutstandingPut) obj).f19120c.a("disconnected", null);
        }
        if (this.f19074d.size() == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j11 = this.f19076f;
            long j12 = jCurrentTimeMillis - j11;
            if (j11 > 0 && j12 > 30000) {
                z11 = true;
            }
            if (disconnectReason == Connection.DisconnectReason.SERVER_RESET || z11) {
                RetryHelper retryHelper = this.f19094y;
                retryHelper.f19168j = true;
                retryHelper.f19167i = 0L;
            }
            t();
        }
        this.f19076f = 0L;
        this.f19071a.d();
    }

    public final boolean f() {
        ConnectionState connectionState = this.f19078h;
        return connectionState == ConnectionState.Authenticating || connectionState == ConnectionState.Connected;
    }

    public final void g() {
        if (!i()) {
            if (this.f19074d.contains("connection_idle")) {
                ConnectionUtils.a(!i(), BuildConfig.VERSION_NAME, new Object[0]);
                n("connection_idle");
                return;
            }
            return;
        }
        ScheduledFuture scheduledFuture = this.D;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.D = this.f19092w.schedule(new Runnable() { // from class: com.google.firebase.database.connection.PersistentConnectionImpl.9
            @Override // java.lang.Runnable
            public final void run() {
                PersistentConnectionImpl persistentConnectionImpl = PersistentConnectionImpl.this;
                persistentConnectionImpl.D = null;
                persistentConnectionImpl.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (!persistentConnectionImpl.i() || jCurrentTimeMillis <= persistentConnectionImpl.E + 60000) {
                    persistentConnectionImpl.g();
                } else {
                    persistentConnectionImpl.h("connection_idle");
                }
            }
        }, 60000L, TimeUnit.MILLISECONDS);
    }

    public final void h(String str) {
        LogWrapper logWrapper = this.f19093x;
        if (logWrapper.c()) {
            logWrapper.a("Connection interrupted for: ".concat(str), null, new Object[0]);
        }
        this.f19074d.add(str);
        Connection connection = this.f19077g;
        RetryHelper retryHelper = this.f19094y;
        if (connection != null) {
            connection.a();
            this.f19077g = null;
        } else {
            LogWrapper logWrapper2 = retryHelper.f19160b;
            if (retryHelper.f19166h != null) {
                logWrapper2.a("Cancelling existing retry attempt", null, new Object[0]);
                retryHelper.f19166h.cancel(false);
                retryHelper.f19166h = null;
            } else {
                logWrapper2.a("No existing retry attempt to cancel", null, new Object[0]);
            }
            retryHelper.f19167i = 0L;
            this.f19078h = ConnectionState.Disconnected;
        }
        retryHelper.f19168j = true;
        retryHelper.f19167i = 0L;
    }

    public final boolean i() {
        return this.f19084o.isEmpty() && this.f19083n.isEmpty() && this.f19081k.isEmpty() && !this.F && this.m.isEmpty();
    }

    public final void j(ArrayList arrayList, HashMap map, ListenHashProvider listenHashProvider, Long l9, RequestResultCallback requestResultCallback) {
        QuerySpec querySpec = new QuerySpec(arrayList, map);
        LogWrapper logWrapper = this.f19093x;
        if (logWrapper.c()) {
            logWrapper.a("Listening on " + querySpec, null, new Object[0]);
        }
        HashMap map2 = this.f19084o;
        ConnectionUtils.a(!map2.containsKey(querySpec), "listen() called twice for same QuerySpec.", new Object[0]);
        if (logWrapper.c()) {
            logWrapper.a("Adding listen query: " + querySpec, null, new Object[0]);
        }
        OutstandingListen outstandingListen = new OutstandingListen(requestResultCallback, querySpec, l9, listenHashProvider);
        map2.put(querySpec, outstandingListen);
        if (f()) {
            q(outstandingListen);
        }
        g();
    }

    public final void k(String str, ArrayList arrayList, Object obj, String str2, RequestResultCallback requestResultCallback) {
        HashMap map = new HashMap();
        map.put("p", ConnectionUtils.b(arrayList));
        map.put("d", obj);
        if (str2 != null) {
            map.put("h", str2);
        }
        long j11 = this.f19079i;
        this.f19079i = 1 + j11;
        Long lValueOf = Long.valueOf(j11);
        OutstandingPut outstandingPut = new OutstandingPut();
        outstandingPut.f19118a = str;
        outstandingPut.f19119b = map;
        outstandingPut.f19120c = requestResultCallback;
        this.m.put(lValueOf, outstandingPut);
        if (this.f19078h == ConnectionState.Connected) {
            r(j11);
        }
        this.E = System.currentTimeMillis();
        g();
    }

    public final OutstandingListen l(QuerySpec querySpec) {
        LogWrapper logWrapper = this.f19093x;
        if (logWrapper.c()) {
            logWrapper.a("removing query " + querySpec, null, new Object[0]);
        }
        HashMap map = this.f19084o;
        if (map.containsKey(querySpec)) {
            OutstandingListen outstandingListen = (OutstandingListen) map.get(querySpec);
            map.remove(querySpec);
            g();
            return outstandingListen;
        }
        if (logWrapper.c()) {
            logWrapper.a("Trying to remove listener for QuerySpec " + querySpec + " but no listener exists.", null, new Object[0]);
        }
        return null;
    }

    public final void m() {
        ConnectionState connectionState = this.f19078h;
        ConnectionUtils.a(connectionState == ConnectionState.Connected, "Should be connected if we're restoring state, but we are: %s", connectionState);
        LogWrapper logWrapper = this.f19093x;
        if (logWrapper.c()) {
            logWrapper.a("Restoring outstanding listens", null, new Object[0]);
        }
        for (OutstandingListen outstandingListen : this.f19084o.values()) {
            if (logWrapper.c()) {
                logWrapper.a("Restoring listen " + outstandingListen.f19115b, null, new Object[0]);
            }
            q(outstandingListen);
        }
        if (logWrapper.c()) {
            logWrapper.a("Restoring writes.", null, new Object[0]);
        }
        ArrayList arrayList = new ArrayList(this.m.keySet());
        Collections.sort(arrayList);
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            r(((Long) obj).longValue());
        }
        ArrayList arrayList2 = this.f19082l;
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList2.get(i12);
            i12++;
            ((OutstandingDisconnect) obj2).getClass();
            HashMap map = new HashMap();
            map.put("p", ConnectionUtils.b(null));
            final RequestResultCallback requestResultCallback = null;
            map.put("d", null);
            s(null, false, map, new ConnectionRequestCallback() { // from class: com.google.firebase.database.connection.PersistentConnectionImpl.3
                @Override // com.google.firebase.database.connection.PersistentConnectionImpl.ConnectionRequestCallback
                public final void a(Map map2) {
                    String str;
                    String str2 = (String) map2.get("s");
                    if (str2.equals("ok")) {
                        str2 = null;
                        str = null;
                    } else {
                        str = (String) map2.get("d");
                    }
                    RequestResultCallback requestResultCallback2 = requestResultCallback;
                    if (requestResultCallback2 != null) {
                        requestResultCallback2.a(str2, str);
                    }
                }
            });
        }
        arrayList2.clear();
        if (logWrapper.c()) {
            logWrapper.a("Restoring reads.", null, new Object[0]);
        }
        ConcurrentHashMap concurrentHashMap = this.f19083n;
        ArrayList arrayList3 = new ArrayList(concurrentHashMap.keySet());
        Collections.sort(arrayList3);
        int size3 = arrayList3.size();
        int i13 = 0;
        while (i13 < size3) {
            Object obj3 = arrayList3.get(i13);
            i13++;
            final Long l9 = (Long) obj3;
            ConnectionUtils.a(this.f19078h == ConnectionState.Connected, "sendGet called when we can't send gets", new Object[0]);
            final OutstandingGet outstandingGet = (OutstandingGet) concurrentHashMap.get(l9);
            if (!outstandingGet.f19113a) {
                outstandingGet.f19113a = true;
            } else if (logWrapper.c()) {
                logWrapper.a("get" + l9 + " cancelled, ignoring.", null, new Object[0]);
            }
            s("g", false, null, new ConnectionRequestCallback() { // from class: com.google.firebase.database.connection.PersistentConnectionImpl.6
                @Override // com.google.firebase.database.connection.PersistentConnectionImpl.ConnectionRequestCallback
                public final void a(Map map2) {
                    PersistentConnectionImpl persistentConnectionImpl = PersistentConnectionImpl.this;
                    LogWrapper logWrapper2 = persistentConnectionImpl.f19093x;
                    ConcurrentHashMap concurrentHashMap2 = persistentConnectionImpl.f19083n;
                    Long l11 = l9;
                    if (((OutstandingGet) concurrentHashMap2.get(l11)) == outstandingGet) {
                        concurrentHashMap2.remove(l11);
                        throw null;
                    }
                    if (logWrapper2.c()) {
                        logWrapper2.a("Ignoring on complete for get " + l11 + " because it was removed already.", null, new Object[0]);
                    }
                }
            });
        }
    }

    public final void n(String str) {
        LogWrapper logWrapper = this.f19093x;
        if (logWrapper.c()) {
            logWrapper.a("Connection no longer interrupted for: ".concat(str), null, new Object[0]);
        }
        HashSet hashSet = this.f19074d;
        hashSet.remove(str);
        if (hashSet.size() == 0 && this.f19078h == ConnectionState.Disconnected) {
            t();
        }
    }

    public final void o(final boolean z11) {
        if (this.f19087r == null) {
            m();
            return;
        }
        ConnectionUtils.a(f(), "Must be connected to send auth, but was: %s", this.f19078h);
        LogWrapper logWrapper = this.f19093x;
        if (logWrapper.c()) {
            logWrapper.a("Sending app check.", null, new Object[0]);
        }
        ConnectionRequestCallback connectionRequestCallback = new ConnectionRequestCallback() { // from class: com.google.firebase.database.connection.a
            @Override // com.google.firebase.database.connection.PersistentConnectionImpl.ConnectionRequestCallback
            public final void a(Map map) {
                String str = (String) map.get("s");
                boolean zEquals = str.equals("ok");
                PersistentConnectionImpl persistentConnectionImpl = this.f19148a;
                if (zEquals) {
                    persistentConnectionImpl.C = 0;
                } else {
                    persistentConnectionImpl.f19087r = null;
                    persistentConnectionImpl.f19088s = true;
                    persistentConnectionImpl.f19093x.a(ep.a.h("App check failed: ", str, " (", (String) map.get("d"), ")"), null, new Object[0]);
                }
                if (z11) {
                    persistentConnectionImpl.m();
                }
            }
        };
        HashMap map = new HashMap();
        ConnectionUtils.a(this.f19087r != null, "App check token must be set!", new Object[0]);
        map.put("token", this.f19087r);
        s("appcheck", true, map, connectionRequestCallback);
    }

    public final void p(final boolean z11) {
        ConnectionUtils.a(f(), "Must be connected to send auth, but was: %s", this.f19078h);
        LogWrapper logWrapper = this.f19093x;
        GAuthToken gAuthToken = null;
        if (logWrapper.c()) {
            logWrapper.a("Sending auth.", null, new Object[0]);
        }
        ConnectionRequestCallback connectionRequestCallback = new ConnectionRequestCallback() { // from class: com.google.firebase.database.connection.PersistentConnectionImpl.4
            @Override // com.google.firebase.database.connection.PersistentConnectionImpl.ConnectionRequestCallback
            public final void a(Map map) {
                PersistentConnectionImpl persistentConnectionImpl = PersistentConnectionImpl.this;
                LogWrapper logWrapper2 = persistentConnectionImpl.f19093x;
                String str = (String) map.get("s");
                if (str.equals("ok")) {
                    persistentConnectionImpl.f19078h = ConnectionState.Connected;
                    persistentConnectionImpl.B = 0;
                    persistentConnectionImpl.o(z11);
                    return;
                }
                persistentConnectionImpl.f19085p = null;
                persistentConnectionImpl.f19086q = true;
                persistentConnectionImpl.f19071a.e();
                logWrapper2.a(ep.a.h("Authentication failed: ", str, " (", (String) map.get("d"), ")"), null, new Object[0]);
                persistentConnectionImpl.f19077g.a();
                if (str.equals("invalid_token")) {
                    int i11 = persistentConnectionImpl.B + 1;
                    persistentConnectionImpl.B = i11;
                    if (i11 >= 3) {
                        RetryHelper retryHelper = persistentConnectionImpl.f19094y;
                        retryHelper.f19167i = retryHelper.f19162d;
                        logWrapper2.e("Provided authentication credentials are invalid. This usually indicates your FirebaseApp instance was not initialized correctly. Make sure your google-services.json file has the correct firebase_url and api_key. You can re-download google-services.json from https://console.firebase.google.com/.");
                    }
                }
            }
        };
        HashMap map = new HashMap();
        String str = this.f19085p;
        if (str.startsWith("gauth|")) {
            try {
                HashMap mapA = JsonMapper.a(str.substring(6));
                gAuthToken = new GAuthToken((String) mapA.get("token"), (Map) mapA.get("auth"));
            } catch (IOException e8) {
                throw new RuntimeException("Failed to parse gauth token", e8);
            }
        }
        if (gAuthToken == null) {
            map.put("cred", this.f19085p);
            s("auth", true, map, connectionRequestCallback);
            return;
        }
        map.put("cred", gAuthToken.f19597a);
        Map map2 = gAuthToken.f19598b;
        if (map2 != null) {
            map.put("authvar", map2);
        }
        s("gauth", true, map, connectionRequestCallback);
    }

    public final void q(final OutstandingListen outstandingListen) {
        HashMap map = new HashMap();
        map.put("p", ConnectionUtils.b(outstandingListen.f19115b.f19122a));
        Long l9 = outstandingListen.f19117d;
        if (l9 != null) {
            map.put("q", outstandingListen.f19115b.f19123b);
            map.put("t", l9);
        }
        ListenHashProvider listenHashProvider = outstandingListen.f19116c;
        map.put("h", listenHashProvider.d());
        if (listenHashProvider.c()) {
            CompoundHash compoundHashB = listenHashProvider.b();
            ArrayList arrayList = new ArrayList();
            Iterator it = Collections.unmodifiableList(compoundHashB.f19053a).iterator();
            while (it.hasNext()) {
                arrayList.add(ConnectionUtils.b((List) it.next()));
            }
            HashMap map2 = new HashMap();
            map2.put("hs", Collections.unmodifiableList(compoundHashB.f19054b));
            map2.put("ps", arrayList);
            map.put("ch", map2);
        }
        s("q", false, map, new ConnectionRequestCallback() { // from class: com.google.firebase.database.connection.PersistentConnectionImpl.7
            @Override // com.google.firebase.database.connection.PersistentConnectionImpl.ConnectionRequestCallback
            public final void a(Map map3) {
                String str = (String) map3.get("s");
                boolean zEquals = str.equals("ok");
                PersistentConnectionImpl persistentConnectionImpl = PersistentConnectionImpl.this;
                OutstandingListen outstandingListen2 = outstandingListen;
                if (zEquals) {
                    Map map4 = (Map) map3.get("d");
                    if (map4.containsKey("w")) {
                        List list = (List) map4.get("w");
                        QuerySpec querySpec = outstandingListen2.f19115b;
                        if (list.contains("no_index")) {
                            String str2 = "\".indexOn\": \"" + querySpec.f19123b.get("i") + '\"';
                            LogWrapper logWrapper = persistentConnectionImpl.f19093x;
                            StringBuilder sbQ = p0.q("Using an unspecified index. Your data will be downloaded and filtered on the client. Consider adding '", str2, "' at ");
                            sbQ.append(ConnectionUtils.b(querySpec.f19122a));
                            sbQ.append(" to your security and Firebase Database rules for better performance");
                            logWrapper.e(sbQ.toString());
                        }
                    }
                }
                HashMap map5 = persistentConnectionImpl.f19084o;
                QuerySpec querySpec2 = outstandingListen2.f19115b;
                RequestResultCallback requestResultCallback = outstandingListen2.f19114a;
                if (((OutstandingListen) map5.get(querySpec2)) == outstandingListen2) {
                    if (str.equals("ok")) {
                        requestResultCallback.a(null, null);
                    } else {
                        persistentConnectionImpl.l(outstandingListen2.f19115b);
                        requestResultCallback.a(str, (String) map3.get("d"));
                    }
                }
            }
        });
    }

    public final void r(final long j11) {
        ConnectionUtils.a(this.f19078h == ConnectionState.Connected, "sendPut called when we can't send writes (we're disconnected or writes are paused).", new Object[0]);
        final OutstandingPut outstandingPut = (OutstandingPut) this.m.get(Long.valueOf(j11));
        final RequestResultCallback requestResultCallback = outstandingPut.f19120c;
        final String str = outstandingPut.f19118a;
        outstandingPut.f19121d = true;
        s(str, false, outstandingPut.f19119b, new ConnectionRequestCallback() { // from class: com.google.firebase.database.connection.PersistentConnectionImpl.5
            @Override // com.google.firebase.database.connection.PersistentConnectionImpl.ConnectionRequestCallback
            public final void a(Map map) {
                PersistentConnectionImpl persistentConnectionImpl = PersistentConnectionImpl.this;
                HashMap map2 = persistentConnectionImpl.m;
                LogWrapper logWrapper = persistentConnectionImpl.f19093x;
                if (logWrapper.c()) {
                    logWrapper.a(str + " response: " + map, null, new Object[0]);
                }
                long j12 = j11;
                if (((OutstandingPut) map2.get(Long.valueOf(j12))) == outstandingPut) {
                    map2.remove(Long.valueOf(j12));
                    RequestResultCallback requestResultCallback2 = requestResultCallback;
                    if (requestResultCallback2 != null) {
                        String str2 = (String) map.get("s");
                        if (str2.equals("ok")) {
                            requestResultCallback2.a(null, null);
                        } else {
                            requestResultCallback2.a(str2, (String) map.get("d"));
                        }
                    }
                } else if (logWrapper.c()) {
                    logWrapper.a(p.m(j12, "Ignoring on complete for put ", " because it was removed already."), null, new Object[0]);
                }
                persistentConnectionImpl.g();
            }
        });
    }

    public final void s(String str, boolean z11, Map map, ConnectionRequestCallback connectionRequestCallback) {
        String[] strArr;
        long j11 = this.f19080j;
        this.f19080j = 1 + j11;
        HashMap map2 = new HashMap();
        map2.put("r", Long.valueOf(j11));
        map2.put("a", str);
        map2.put("b", map);
        Connection connection = this.f19077g;
        connection.getClass();
        HashMap map3 = new HashMap();
        map3.put("t", "d");
        map3.put("d", map2);
        LogWrapper logWrapper = connection.f19060e;
        if (connection.f19059d != Connection.State.REALTIME_CONNECTED) {
            logWrapper.a("Tried to send on an unconnected connection", null, new Object[0]);
        } else {
            if (z11) {
                logWrapper.a("Sending data (contents hidden)", null, new Object[0]);
            } else {
                logWrapper.a("Sending data: %s", null, map3);
            }
            WebsocketConnection websocketConnection = connection.f19057b;
            websocketConnection.e();
            try {
                String strB = JsonMapper.b(map3);
                if (strB.length() <= 16384) {
                    strArr = new String[]{strB};
                } else {
                    ArrayList arrayList = new ArrayList();
                    int i11 = 0;
                    while (i11 < strB.length()) {
                        int i12 = i11 + 16384;
                        arrayList.add(strB.substring(i11, Math.min(i12, strB.length())));
                        i11 = i12;
                    }
                    strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                }
                if (strArr.length > 1) {
                    websocketConnection.f19128a.e(BuildConfig.VERSION_NAME + strArr.length);
                }
                for (String str2 : strArr) {
                    websocketConnection.f19128a.e(str2);
                }
            } catch (IOException e8) {
                websocketConnection.f19137j.b("Failed to serialize message: " + map3.toString(), e8);
                websocketConnection.f19130c = true;
                WebsocketConnection.Delegate delegate = websocketConnection.f19133f;
                boolean z12 = websocketConnection.f19129b;
                Connection connection2 = (Connection) delegate;
                LogWrapper logWrapper2 = connection2.f19060e;
                connection2.f19057b = null;
                if (z12 || connection2.f19059d != Connection.State.REALTIME_CONNECTING) {
                    if (logWrapper2.c()) {
                        logWrapper2.a("Realtime connection lost", null, new Object[0]);
                    }
                } else if (logWrapper2.c()) {
                    logWrapper2.a("Realtime connection failed", null, new Object[0]);
                }
                connection2.a();
            }
        }
        this.f19081k.put(Long.valueOf(j11), connectionRequestCallback);
    }

    public final void t() {
        if (this.f19074d.size() == 0) {
            ConnectionState connectionState = this.f19078h;
            ConnectionUtils.a(connectionState == ConnectionState.Disconnected, "Not in disconnected state: %s", connectionState);
            boolean z11 = this.f19086q;
            boolean z12 = this.f19088s;
            this.f19093x.a("Scheduling connection attempt", null, new Object[0]);
            this.f19086q = false;
            this.f19088s = false;
            this.f19094y.a(new b(this, z11, z12));
        }
    }

    public final void u(ArrayList arrayList, HashMap map) {
        QuerySpec querySpec = new QuerySpec(arrayList, map);
        LogWrapper logWrapper = this.f19093x;
        if (logWrapper.c()) {
            logWrapper.a("unlistening on " + querySpec, null, new Object[0]);
        }
        OutstandingListen outstandingListenL = l(querySpec);
        if (outstandingListenL != null) {
            QuerySpec querySpec2 = outstandingListenL.f19115b;
            if (f()) {
                HashMap map2 = new HashMap();
                map2.put("p", ConnectionUtils.b(querySpec2.f19122a));
                Long l9 = outstandingListenL.f19117d;
                if (l9 != null) {
                    map2.put("q", querySpec2.f19123b);
                    map2.put("t", l9);
                }
                s("n", false, map2, null);
            }
        }
        g();
    }

    @Override // com.google.firebase.database.connection.Connection.Delegate
    public final void c(long j11, String str) {
        LogWrapper logWrapper = this.f19093x;
        if (logWrapper.c()) {
            logWrapper.a("onReady", null, new Object[0]);
        }
        this.f19076f = System.currentTimeMillis();
        if (logWrapper.c()) {
            logWrapper.a(OYAvlbfUyD.mLmxzGbR, null, new Object[0]);
        }
        long jCurrentTimeMillis = j11 - System.currentTimeMillis();
        HashMap map = new HashMap();
        map.put("serverTimeOffset", Long.valueOf(jCurrentTimeMillis));
        PersistentConnection.Delegate delegate = this.f19071a;
        delegate.c(map);
        if (this.f19075e) {
            HashMap map2 = new HashMap();
            this.f19089t.getClass();
            map2.put("sdk.android." + "22.0.1".replace('.', '-'), 1);
            if (logWrapper.c()) {
                logWrapper.a("Sending first connection stats", null, new Object[0]);
            }
            if (!map2.isEmpty()) {
                HashMap map3 = new HashMap();
                map3.put("c", map2);
                s(nuRcCS.QsyXN, false, map3, new ConnectionRequestCallback() { // from class: com.google.firebase.database.connection.PersistentConnectionImpl.8
                    @Override // com.google.firebase.database.connection.PersistentConnectionImpl.ConnectionRequestCallback
                    public final void a(Map map4) {
                        String str2 = (String) map4.get("s");
                        if (str2.equals("ok")) {
                            return;
                        }
                        String str3 = (String) map4.get("d");
                        PersistentConnectionImpl persistentConnectionImpl = PersistentConnectionImpl.this;
                        if (persistentConnectionImpl.f19093x.c()) {
                            persistentConnectionImpl.f19093x.a(ep.a.h("Failed to send stats: ", str2, " (message: ", str3, ")"), null, new Object[0]);
                        }
                    }
                });
            } else if (logWrapper.c()) {
                logWrapper.a("Not sending stats because stats are empty", null, new Object[0]);
            }
        }
        if (logWrapper.c()) {
            logWrapper.a("calling restore tokens", null, new Object[0]);
        }
        ConnectionState connectionState = this.f19078h;
        ConnectionUtils.a(connectionState == ConnectionState.Connecting, "Wanted to restore tokens, but was in wrong state: %s", connectionState);
        if (this.f19085p != null) {
            if (logWrapper.c()) {
                logWrapper.a("Restoring auth.", null, new Object[0]);
            }
            this.f19078h = ConnectionState.Authenticating;
            p(true);
        } else {
            if (logWrapper.c()) {
                logWrapper.a("Not restoring auth because auth token is null.", null, new Object[0]);
            }
            this.f19078h = ConnectionState.Connected;
            o(true);
        }
        this.f19075e = false;
        this.f19095z = str;
        delegate.b();
    }
}
