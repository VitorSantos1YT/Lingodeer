package com.google.android.datatransport.runtime;

import android.util.Log;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.runtime.logging.Logging;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ForcedSender {
    private ForcedSender() {
    }

    public static void a(Transport transport, Priority priority) {
        if (transport instanceof TransportImpl) {
            TransportRuntime.a().f8036d.a(((TransportImpl) transport).f8027a.e(priority), 1);
        } else if (Log.isLoggable(Logging.b("ForcedSender"), 5)) {
            String.format("Expected instance of `TransportImpl`, got `%s`.", transport);
        }
    }
}
