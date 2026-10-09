package i7;

import android.os.Handler;
import android.os.Message;
import b7.f0;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements Handler.Callback {
    public boolean H;
    public boolean K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t7.g f34251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hd.d f34252b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j7.c f34256f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f34257t;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TreeMap f34255e = new TreeMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f34254d = f0.m(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h8.b f34253c = new h8.b(1);

    public o(j7.c cVar, hd.d dVar, t7.g gVar) {
        this.f34256f = cVar;
        this.f34252b = dVar;
        this.f34251a = gVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (!this.K) {
            if (message.what != 1) {
                return false;
            }
            m mVar = (m) message.obj;
            long j11 = mVar.f34244a;
            long j12 = mVar.f34245b;
            Long lValueOf = Long.valueOf(j12);
            TreeMap treeMap = this.f34255e;
            Long l9 = (Long) treeMap.get(lValueOf);
            if (l9 == null) {
                treeMap.put(Long.valueOf(j12), Long.valueOf(j11));
                return true;
            }
            if (l9.longValue() > j11) {
                treeMap.put(Long.valueOf(j12), Long.valueOf(j11));
            }
        }
        return true;
    }
}
