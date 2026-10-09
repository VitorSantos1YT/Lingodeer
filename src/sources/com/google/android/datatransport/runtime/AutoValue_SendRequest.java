package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_SendRequest extends SendRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransportContext f7994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Event f7996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Transformer f7997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Encoding f7998e;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends SendRequest.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TransportContext f7999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f8000b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Event f8001c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Transformer f8002d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Encoding f8003e;
    }

    public AutoValue_SendRequest(TransportContext transportContext, String str, Event event, Transformer transformer, Encoding encoding) {
        this.f7994a = transportContext;
        this.f7995b = str;
        this.f7996c = event;
        this.f7997d = transformer;
        this.f7998e = encoding;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public final Encoding a() {
        return this.f7998e;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public final Event b() {
        return this.f7996c;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public final Transformer c() {
        return this.f7997d;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public final TransportContext d() {
        return this.f7994a;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public final String e() {
        return this.f7995b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SendRequest)) {
            return false;
        }
        SendRequest sendRequest = (SendRequest) obj;
        return this.f7994a.equals(sendRequest.d()) && this.f7995b.equals(sendRequest.e()) && this.f7996c.equals(sendRequest.b()) && this.f7997d.equals(sendRequest.c()) && this.f7998e.equals(sendRequest.a());
    }

    public final int hashCode() {
        return ((((((((this.f7994a.hashCode() ^ 1000003) * 1000003) ^ this.f7995b.hashCode()) * 1000003) ^ this.f7996c.hashCode()) * 1000003) ^ this.f7997d.hashCode()) * 1000003) ^ this.f7998e.hashCode();
    }

    public final String toString() {
        return "SendRequest{transportContext=" + this.f7994a + ", transportName=" + this.f7995b + ", event=" + this.f7996c + ", transformer=" + this.f7997d + ", encoding=" + this.f7998e + "}";
    }
}
