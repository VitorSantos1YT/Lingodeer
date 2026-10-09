package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
final class RawMessageInfo implements MessageInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessageLite f21355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f21357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21358d;

    public RawMessageInfo(MessageLite messageLite, String str, Object[] objArr) {
        this.f21355a = messageLite;
        this.f21356b = str;
        this.f21357c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f21358d = cCharAt;
            return;
        }
        int i11 = cCharAt & 8191;
        int i12 = 13;
        int i13 = 1;
        while (true) {
            int i14 = i13 + 1;
            char cCharAt2 = str.charAt(i13);
            if (cCharAt2 < 55296) {
                this.f21358d = i11 | (cCharAt2 << i12);
                return;
            } else {
                i11 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i13 = i14;
            }
        }
    }

    @Override // com.google.protobuf.MessageInfo
    public final boolean a() {
        return (this.f21358d & 2) == 2;
    }

    @Override // com.google.protobuf.MessageInfo
    public final MessageLite b() {
        return this.f21355a;
    }

    @Override // com.google.protobuf.MessageInfo
    public final ProtoSyntax c() {
        int i11 = this.f21358d;
        if ((i11 & 1) != 0) {
            return ProtoSyntax.PROTO2;
        }
        return (i11 & 4) == 4 ? ProtoSyntax.EDITIONS : ProtoSyntax.PROTO3;
    }
}
