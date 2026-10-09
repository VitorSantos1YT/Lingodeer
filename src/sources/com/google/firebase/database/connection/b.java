package com.google.firebase.database.connection;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.database.logging.LogWrapper;
import com.google.firebase.database.tubesock.WebSocket;
import com.google.firebase.database.tubesock.WebSocketException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PersistentConnectionImpl f19150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f19151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f19152c;

    public /* synthetic */ b(PersistentConnectionImpl persistentConnectionImpl, boolean z11, boolean z12) {
        this.f19150a = persistentConnectionImpl;
        this.f19151b = z11;
        this.f19152c = z12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final PersistentConnectionImpl persistentConnectionImpl = this.f19150a;
        ScheduledExecutorService scheduledExecutorService = persistentConnectionImpl.f19092w;
        LogWrapper logWrapper = persistentConnectionImpl.f19093x;
        PersistentConnectionImpl.ConnectionState connectionState = persistentConnectionImpl.f19078h;
        ConnectionUtils.a(connectionState == PersistentConnectionImpl.ConnectionState.Disconnected, "Not in disconnected state: %s", connectionState);
        persistentConnectionImpl.f19078h = PersistentConnectionImpl.ConnectionState.GettingToken;
        final long j11 = persistentConnectionImpl.A + 1;
        persistentConnectionImpl.A = j11;
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        logWrapper.a("Trying to fetch auth token", null, new Object[0]);
        persistentConnectionImpl.f19090u.a(this.f19151b, new ConnectionTokenProvider.GetTokenCallback() { // from class: com.google.firebase.database.connection.PersistentConnectionImpl.1
            @Override // com.google.firebase.database.connection.ConnectionTokenProvider.GetTokenCallback
            public final void a(String str) {
                taskCompletionSource.setResult(str);
            }

            @Override // com.google.firebase.database.connection.ConnectionTokenProvider.GetTokenCallback
            public final void b(String str) {
                taskCompletionSource.setException(new Exception(str));
            }
        });
        final Task task = taskCompletionSource.getTask();
        final TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        logWrapper.a("Trying to fetch app check token", null, new Object[0]);
        persistentConnectionImpl.f19091v.a(this.f19152c, new ConnectionTokenProvider.GetTokenCallback() { // from class: com.google.firebase.database.connection.PersistentConnectionImpl.2
            @Override // com.google.firebase.database.connection.ConnectionTokenProvider.GetTokenCallback
            public final void a(String str) {
                taskCompletionSource2.setResult(str);
            }

            @Override // com.google.firebase.database.connection.ConnectionTokenProvider.GetTokenCallback
            public final void b(String str) {
                taskCompletionSource2.setException(new Exception(str));
            }
        });
        final Task task2 = taskCompletionSource2.getTask();
        Tasks.whenAll((Task<?>[]) new Task[]{task, task2}).addOnSuccessListener(scheduledExecutorService, new OnSuccessListener() { // from class: com.google.firebase.database.connection.d
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                PersistentConnectionImpl persistentConnectionImpl2 = persistentConnectionImpl;
                LogWrapper logWrapper2 = persistentConnectionImpl2.f19093x;
                if (j11 != persistentConnectionImpl2.A) {
                    logWrapper2.a("Ignoring getToken result, because this was not the latest attempt.", null, new Object[0]);
                    return;
                }
                PersistentConnectionImpl.ConnectionState connectionState2 = persistentConnectionImpl2.f19078h;
                PersistentConnectionImpl.ConnectionState connectionState3 = PersistentConnectionImpl.ConnectionState.GettingToken;
                if (connectionState2 != connectionState3) {
                    if (connectionState2 == PersistentConnectionImpl.ConnectionState.Disconnected) {
                        logWrapper2.a("Not opening connection after token refresh, because connection was set to disconnected", null, new Object[0]);
                        return;
                    }
                    return;
                }
                logWrapper2.a("Successfully fetched token, opening connection", null, new Object[0]);
                String str = (String) task.getResult();
                String str2 = (String) task2.getResult();
                PersistentConnectionImpl.ConnectionState connectionState4 = persistentConnectionImpl2.f19078h;
                ConnectionUtils.a(connectionState4 == connectionState3, "Trying to open network connection while in the wrong state: %s", connectionState4);
                if (str == null) {
                    persistentConnectionImpl2.f19071a.e();
                }
                persistentConnectionImpl2.f19085p = str;
                persistentConnectionImpl2.f19087r = str2;
                persistentConnectionImpl2.f19078h = PersistentConnectionImpl.ConnectionState.Connecting;
                Connection connection = new Connection(persistentConnectionImpl2.f19089t, persistentConnectionImpl2.f19072b, persistentConnectionImpl2.f19073c, persistentConnectionImpl2, persistentConnectionImpl2.f19095z, str2);
                persistentConnectionImpl2.f19077g = connection;
                LogWrapper logWrapper3 = connection.f19060e;
                if (logWrapper3.c()) {
                    logWrapper3.a("Opening a connection", null, new Object[0]);
                }
                final WebsocketConnection websocketConnection = connection.f19057b;
                WebsocketConnection.WSClientTubesock wSClientTubesock = websocketConnection.f19128a;
                WebSocket webSocket = wSClientTubesock.f19140a;
                LogWrapper logWrapper4 = WebsocketConnection.this.f19137j;
                try {
                    webSocket.d();
                } catch (WebSocketException e8) {
                    if (logWrapper4.c()) {
                        logWrapper4.a("Error connecting", e8, new Object[0]);
                    }
                    webSocket.b();
                    try {
                        webSocket.a();
                    } catch (InterruptedException e10) {
                        logWrapper4.b("Interrupted while shutting down websocket threads", e10);
                    }
                }
                websocketConnection.f19135h = websocketConnection.f19136i.schedule(new Runnable() { // from class: com.google.firebase.database.connection.WebsocketConnection.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        WebsocketConnection websocketConnection2 = WebsocketConnection.this;
                        LogWrapper logWrapper5 = websocketConnection2.f19137j;
                        if (websocketConnection2.f19129b || websocketConnection2.f19130c) {
                            return;
                        }
                        if (logWrapper5.c()) {
                            logWrapper5.a("timed out on connect", null, new Object[0]);
                        }
                        websocketConnection2.f19128a.f19140a.b();
                    }
                }, 30000L, TimeUnit.MILLISECONDS);
            }
        }).addOnFailureListener(scheduledExecutorService, new OnFailureListener() { // from class: com.google.firebase.database.connection.e
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                PersistentConnectionImpl persistentConnectionImpl2 = persistentConnectionImpl;
                LogWrapper logWrapper2 = persistentConnectionImpl2.f19093x;
                if (j11 != persistentConnectionImpl2.A) {
                    logWrapper2.a("Ignoring getToken error, because this was not the latest attempt.", null, new Object[0]);
                    return;
                }
                persistentConnectionImpl2.f19078h = PersistentConnectionImpl.ConnectionState.Disconnected;
                logWrapper2.a("Error fetching token: " + exc, null, new Object[0]);
                persistentConnectionImpl2.t();
            }
        });
    }
}
