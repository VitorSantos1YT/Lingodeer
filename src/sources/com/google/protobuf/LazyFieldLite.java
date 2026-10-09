package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class LazyFieldLite {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile MessageLite f21296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile ByteString f21297b;

    static {
        ExtensionRegistryLite.a();
    }

    public final MessageLite a(MessageLite messageLite) {
        if (this.f21296a == null) {
            synchronized (this) {
                if (this.f21296a == null) {
                    try {
                        this.f21296a = messageLite;
                        this.f21297b = ByteString.f21158b;
                    } catch (InvalidProtocolBufferException unused) {
                        this.f21296a = messageLite;
                        this.f21297b = ByteString.f21158b;
                    }
                }
            }
        }
        return this.f21296a;
    }

    public final ByteString b() {
        if (this.f21297b != null) {
            return this.f21297b;
        }
        synchronized (this) {
            try {
                if (this.f21297b != null) {
                    return this.f21297b;
                }
                if (this.f21296a == null) {
                    this.f21297b = ByteString.f21158b;
                } else {
                    this.f21297b = this.f21296a.g();
                }
                return this.f21297b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyFieldLite)) {
            return false;
        }
        LazyFieldLite lazyFieldLite = (LazyFieldLite) obj;
        MessageLite messageLite = this.f21296a;
        MessageLite messageLite2 = lazyFieldLite.f21296a;
        if (messageLite == null && messageLite2 == null) {
            return b().equals(lazyFieldLite.b());
        }
        if (messageLite == null || messageLite2 == null) {
            return messageLite != null ? messageLite.equals(lazyFieldLite.a(messageLite.f())) : a(messageLite2.f()).equals(messageLite2);
        }
        return messageLite.equals(messageLite2);
    }

    public int hashCode() {
        return 1;
    }
}
