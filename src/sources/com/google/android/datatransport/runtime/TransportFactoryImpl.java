package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportFactory;
import java.util.Set;
import nf.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class TransportFactoryImpl implements TransportFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f8024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransportContext f8025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransportRuntime f8026c;

    public TransportFactoryImpl(Set set, TransportContext transportContext, TransportRuntime transportRuntime) {
        this.f8024a = set;
        this.f8025b = transportContext;
        this.f8026c = transportRuntime;
    }

    @Override // com.google.android.datatransport.TransportFactory
    public final Transport a(f fVar) {
        return b("FIREBASE_INAPPMESSAGING", new Encoding("proto"), fVar);
    }

    @Override // com.google.android.datatransport.TransportFactory
    public final Transport b(String str, Encoding encoding, Transformer transformer) {
        Set set = this.f8024a;
        if (set.contains(encoding)) {
            return new TransportImpl(this.f8025b, str, encoding, transformer, this.f8026c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", encoding, set));
    }
}
