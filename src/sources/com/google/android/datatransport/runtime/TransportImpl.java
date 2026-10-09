package com.google.android.datatransport.runtime;

import c3.a;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.scheduling.Scheduler;
import defpackage.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class TransportImpl<T> implements Transport<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransportContext f8027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Encoding f8029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Transformer f8030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TransportRuntime f8031e;

    public TransportImpl(TransportContext transportContext, String str, Encoding encoding, Transformer transformer, TransportRuntime transportRuntime) {
        this.f8027a = transportContext;
        this.f8028b = str;
        this.f8029c = encoding;
        this.f8030d = transformer;
        this.f8031e = transportRuntime;
    }

    @Override // com.google.android.datatransport.Transport
    public final void a(Event event) {
        b(event, new a(10));
    }

    @Override // com.google.android.datatransport.Transport
    public final void b(Event event, TransportScheduleCallback transportScheduleCallback) {
        AutoValue_SendRequest.Builder builder = new AutoValue_SendRequest.Builder();
        TransportContext transportContext = this.f8027a;
        if (transportContext == null) {
            throw new NullPointerException("Null transportContext");
        }
        builder.f7999a = transportContext;
        builder.f8001c = event;
        builder.f8000b = this.f8028b;
        Transformer transformer = this.f8030d;
        if (transformer == null) {
            throw new NullPointerException("Null transformer");
        }
        builder.f8002d = transformer;
        builder.f8003e = this.f8029c;
        Encoding encoding = builder.f8003e;
        String strM = com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME;
        if (encoding == null) {
            strM = e.m(com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME, " encoding");
        }
        if (!strM.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strM));
        }
        AutoValue_SendRequest autoValue_SendRequest = new AutoValue_SendRequest(builder.f7999a, builder.f8000b, builder.f8001c, builder.f8002d, builder.f8003e);
        TransportRuntime transportRuntime = this.f8031e;
        Scheduler scheduler = transportRuntime.f8035c;
        Event event2 = autoValue_SendRequest.f7996c;
        TransportContext transportContextE = autoValue_SendRequest.f7994a.e(event2.d());
        AutoValue_EventInternal.Builder builder2 = (AutoValue_EventInternal.Builder) EventInternal.a();
        builder2.f7987d = Long.valueOf(transportRuntime.f8033a.a());
        builder2.f7988e = Long.valueOf(transportRuntime.f8034b.a());
        builder2.k(autoValue_SendRequest.f7995b);
        builder2.f7986c = new EncodedPayload(autoValue_SendRequest.f7998e, (byte[]) autoValue_SendRequest.f7997d.apply(event2.c()));
        builder2.f7985b = event2.a();
        if (event2.e() != null && event2.e().a() != null) {
            builder2.f7990g = event2.e().a();
        }
        if (event2.b() != null) {
            event2.b().getClass();
        }
        scheduler.a(transportContextE, builder2.b(), transportScheduleCallback);
    }
}
