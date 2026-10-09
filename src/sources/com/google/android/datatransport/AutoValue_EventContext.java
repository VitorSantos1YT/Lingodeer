package com.google.android.datatransport;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_EventContext extends EventContext {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends EventContext.Builder {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof EventContext) && Arrays.equals((byte[]) null, (byte[]) null) && Arrays.equals((byte[]) null, (byte[]) null);
    }

    public final int hashCode() {
        return Arrays.hashCode((byte[]) null) ^ (((1000003 * 1000003) ^ Arrays.hashCode((byte[]) null)) * 1000003);
    }

    public final String toString() {
        return "EventContext{pseudonymousId=null, experimentIdsClear=" + Arrays.toString((byte[]) null) + ", experimentIdsEncrypted=" + Arrays.toString((byte[]) null) + "}";
    }
}
