package com.google.firebase.messaging;

import android.content.Context;
import android.os.Bundle;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class TopicsSubscriber {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f20540i = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f20541j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Metadata f20543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GmsRpc f20544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f20545d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f20547f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TopicsStore f20549h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y.e f20546e = new y.e(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f20548g = false;

    public TopicsSubscriber(FirebaseMessaging firebaseMessaging, Metadata metadata, TopicsStore topicsStore, GmsRpc gmsRpc, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f20545d = firebaseMessaging;
        this.f20543b = metadata;
        this.f20549h = topicsStore;
        this.f20544c = gmsRpc;
        this.f20542a = context;
        this.f20547f = scheduledThreadPoolExecutor;
    }

    public static void a(Task task) throws IOException {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e8) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e8);
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e10);
            }
            throw ((RuntimeException) cause);
        }
    }

    public final void b(String str) throws IOException {
        String strA = this.f20545d.a();
        GmsRpc gmsRpc = this.f20544c;
        gmsRpc.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(gmsRpc.a(gmsRpc.c(strA, "/topics/" + str, bundle)));
    }

    public final void c(String str) throws IOException {
        String strA = this.f20545d.a();
        GmsRpc gmsRpc = this.f20544c;
        gmsRpc.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString(RequestParameters.SUBRESOURCE_DELETE, "1");
        a(gmsRpc.a(gmsRpc.c(strA, "/topics/" + str, bundle)));
    }

    public final synchronized void d(boolean z11) {
        this.f20548g = z11;
    }

    public final boolean e() throws IOException {
        TopicOperation topicOperationA;
        while (true) {
            synchronized (this) {
                try {
                    topicOperationA = this.f20549h.a();
                    if (topicOperationA == null) {
                        return true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            try {
                String str = topicOperationA.f20535b;
                String str2 = topicOperationA.f20534a;
                int iHashCode = str.hashCode();
                if (iHashCode != 83) {
                    if (iHashCode == 85 && str.equals("U")) {
                        c(str2);
                    }
                } else if (str.equals("S")) {
                    b(str2);
                }
                TopicsStore topicsStore = this.f20549h;
                synchronized (topicsStore) {
                    try {
                        SharedPreferencesQueue sharedPreferencesQueue = topicsStore.f20538a;
                        String str3 = topicOperationA.f20536c;
                        synchronized (sharedPreferencesQueue.f20519d) {
                            try {
                                if (sharedPreferencesQueue.f20519d.remove(str3)) {
                                    sharedPreferencesQueue.f20520e.execute(new n(sharedPreferencesQueue, 0));
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                synchronized (this.f20546e) {
                    try {
                        String str4 = topicOperationA.f20536c;
                        if (this.f20546e.containsKey(str4)) {
                            ArrayDeque arrayDeque = (ArrayDeque) this.f20546e.get(str4);
                            TaskCompletionSource taskCompletionSource = (TaskCompletionSource) arrayDeque.poll();
                            if (taskCompletionSource != null) {
                                taskCompletionSource.setResult(null);
                            }
                            if (arrayDeque.isEmpty()) {
                                this.f20546e.remove(str4);
                            }
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
            } catch (IOException e8) {
                if ("SERVICE_NOT_AVAILABLE".equals(e8.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e8.getMessage()) || "TOO_MANY_SUBSCRIBERS".equals(e8.getMessage())) {
                    e8.getMessage();
                    return false;
                }
                if (e8.getMessage() == null) {
                    return false;
                }
                throw e8;
            }
        }
    }

    public final void f(long j11) {
        this.f20547f.schedule(new TopicsSyncTask(this, this.f20542a, this.f20543b, Math.min(Math.max(30L, 2 * j11), f20540i)), j11, TimeUnit.SECONDS);
        d(true);
    }
}
