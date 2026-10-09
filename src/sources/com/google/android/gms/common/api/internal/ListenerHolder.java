package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.HandlerExecutor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ListenerHolder<L> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HandlerExecutor f8740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile ListenerKey f8741b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ListenerKey<L> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f8742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f8743b;

        public ListenerKey(Object obj, String str) {
            this.f8742a = obj;
            this.f8743b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListenerKey)) {
                return false;
            }
            ListenerKey listenerKey = (ListenerKey) obj;
            return this.f8742a == listenerKey.f8742a && this.f8743b.equals(listenerKey.f8743b);
        }

        public final int hashCode() {
            return this.f8743b.hashCode() + (System.identityHashCode(this.f8742a) * 31);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface Notifier<L> {
        void a(Object obj);
    }

    public ListenerHolder(Looper looper, Object obj, String str) {
        this.f8740a = new HandlerExecutor(looper);
        Preconditions.h(obj, "Listener must not be null");
        Preconditions.d(str);
        this.f8741b = new ListenerKey(obj, str);
    }

    public final void a(final Notifier notifier) {
        this.f8740a.execute(new Runnable() { // from class: com.google.android.gms.common.api.internal.zabw
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                ListenerHolder listenerHolder = this.f8799a;
                ListenerHolder.Notifier notifier2 = notifier;
                ListenerHolder.ListenerKey listenerKey = listenerHolder.f8741b;
                if (listenerKey == null) {
                    return;
                }
                notifier2.a(listenerKey.f8742a);
            }
        });
    }
}
