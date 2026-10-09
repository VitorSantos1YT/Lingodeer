package com.google.android.datatransport.cct.internal;

import com.google.firebase.encoders.annotations.Encodable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@Encodable
public abstract class BatchedLogRequest {
    public static BatchedLogRequest a(ArrayList arrayList) {
        return new AutoValue_BatchedLogRequest(arrayList);
    }

    public abstract List b();
}
