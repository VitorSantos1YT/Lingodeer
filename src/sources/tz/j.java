package tz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f52685a = new p(-1, null, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f52686b = wz.b.l(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f52687c = wz.b.l(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final com.android.billingclient.api.a f52688d = new com.android.billingclient.api.a("BUFFERED", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final com.android.billingclient.api.a f52689e = new com.android.billingclient.api.a("SHOULD_BUFFER", 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final com.android.billingclient.api.a f52690f = new com.android.billingclient.api.a("S_RESUMING_BY_RCV", 2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final com.android.billingclient.api.a f52691g = new com.android.billingclient.api.a("RESUMING_BY_EB", 2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.android.billingclient.api.a f52692h = new com.android.billingclient.api.a("POISONED", 2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final com.android.billingclient.api.a f52693i = new com.android.billingclient.api.a("DONE_RCV", 2);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final com.android.billingclient.api.a f52694j = new com.android.billingclient.api.a("INTERRUPTED_SEND", 2);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final com.android.billingclient.api.a f52695k = new com.android.billingclient.api.a("INTERRUPTED_RCV", 2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final com.android.billingclient.api.a f52696l = new com.android.billingclient.api.a("CHANNEL_CLOSED", 2);
    public static final com.android.billingclient.api.a m = new com.android.billingclient.api.a("SUSPEND", 2);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final com.android.billingclient.api.a f52697n = new com.android.billingclient.api.a("SUSPEND_NO_WAITER", 2);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final com.android.billingclient.api.a f52698o = new com.android.billingclient.api.a("FAILED", 2);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final com.android.billingclient.api.a f52699p = new com.android.billingclient.api.a("NO_RECEIVE_RESULT", 2);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final com.android.billingclient.api.a f52700q = new com.android.billingclient.api.a("CLOSE_HANDLER_CLOSED", 2);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final com.android.billingclient.api.a f52701r = new com.android.billingclient.api.a("CLOSE_HANDLER_INVOKED", 2);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final com.android.billingclient.api.a f52702s = new com.android.billingclient.api.a("NO_CLOSE_CAUSE", 2);

    public static final boolean a(rz.l lVar, Object obj, fz.f fVar) {
        com.android.billingclient.api.a aVarH = lVar.h(obj, fVar);
        if (aVarH == null) {
            return false;
        }
        lVar.l(aVarH);
        return true;
    }
}
