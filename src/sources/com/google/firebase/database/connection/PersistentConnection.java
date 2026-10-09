package com.google.firebase.database.connection;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public interface PersistentConnection {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface Delegate {
        void a(ArrayList arrayList, Object obj, boolean z11, Long l9);

        void b();

        void c(HashMap map);

        void d();

        void e();

        void f(ArrayList arrayList, ArrayList arrayList2, Long l9);
    }
}
