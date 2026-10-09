package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.ProtoEnum;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class LogEventDropped {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f8081c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Reason f8083b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f8084a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Reason f8085b = Reason.REASON_UNKNOWN;
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public enum Reason implements ProtoEnum {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);

        private final int number_;

        Reason(int i11) {
            this.number_ = i11;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public final int d() {
            return this.number_;
        }
    }

    static {
        new Builder();
    }

    public LogEventDropped(long j11, Reason reason) {
        this.f8082a = j11;
        this.f8083b = reason;
    }
}
