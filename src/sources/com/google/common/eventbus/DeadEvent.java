package com.google.common.eventbus;

import com.google.common.base.MoreObjects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public class DeadEvent {
    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(null, "source");
        toStringHelperB.c(null, "event");
        return toStringHelperB.toString();
    }
}
