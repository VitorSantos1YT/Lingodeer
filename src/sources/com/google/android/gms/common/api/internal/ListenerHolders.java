package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class ListenerHolders {
    public ListenerHolders() {
        Collections.newSetFromMap(new WeakHashMap());
    }

    public static ListenerHolder a(Looper looper, Object obj, String str) {
        Preconditions.h(obj, "Listener must not be null");
        Preconditions.h(looper, "Looper must not be null");
        return new ListenerHolder(looper, obj, str);
    }

    public static ListenerHolder.ListenerKey b(Object obj, String str) {
        Preconditions.h(obj, "Listener must not be null");
        Preconditions.e(str, "Listener type must not be empty");
        return new ListenerHolder.ListenerKey(obj, str);
    }
}
