package com.google.android.datatransport;

import nf.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public interface TransportFactory {
    Transport a(f fVar);

    Transport b(String str, Encoding encoding, Transformer transformer);
}
