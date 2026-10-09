package com.google.firebase.messaging.reporting;

import com.google.firebase.encoders.proto.ProtoEnum;
import com.tbruyelle.rxpermissions3.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class MessagingClientEvent {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f20604n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MessageType f20608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SDKPlatform f20609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f20610f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f20611g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f20612h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f20613i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f20614j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Event f20615k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f20616l;
    public final String m;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f20617a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f20618b = BuildConfig.VERSION_NAME;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f20619c = BuildConfig.VERSION_NAME;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public MessageType f20620d = MessageType.UNKNOWN;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public SDKPlatform f20621e = SDKPlatform.UNKNOWN_OS;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f20622f = BuildConfig.VERSION_NAME;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f20623g = BuildConfig.VERSION_NAME;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f20624h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f20625i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f20626j = BuildConfig.VERSION_NAME;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Event f20627k = Event.UNKNOWN_EVENT;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f20628l = BuildConfig.VERSION_NAME;
        public String m = BuildConfig.VERSION_NAME;

        public final MessagingClientEvent a() {
            return new MessagingClientEvent(this.f20617a, this.f20618b, this.f20619c, this.f20620d, this.f20621e, this.f20622f, this.f20623g, this.f20624h, this.f20625i, this.f20626j, this.f20627k, this.f20628l, this.m);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public enum Event implements ProtoEnum {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);

        private final int number_;

        Event(int i11) {
            this.number_ = i11;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public final int d() {
            return this.number_;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public enum MessageType implements ProtoEnum {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);

        private final int number_;

        MessageType(int i11) {
            this.number_ = i11;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public final int d() {
            return this.number_;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public enum SDKPlatform implements ProtoEnum {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);

        private final int number_;

        SDKPlatform(int i11) {
            this.number_ = i11;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public final int d() {
            return this.number_;
        }
    }

    static {
        new Builder().a();
    }

    public MessagingClientEvent(long j11, String str, String str2, MessageType messageType, SDKPlatform sDKPlatform, String str3, String str4, int i11, int i12, String str5, Event event, String str6, String str7) {
        this.f20605a = j11;
        this.f20606b = str;
        this.f20607c = str2;
        this.f20608d = messageType;
        this.f20609e = sDKPlatform;
        this.f20610f = str3;
        this.f20611g = str4;
        this.f20612h = i11;
        this.f20613i = i12;
        this.f20614j = str5;
        this.f20615k = event;
        this.f20616l = str6;
        this.m = str7;
    }
}
