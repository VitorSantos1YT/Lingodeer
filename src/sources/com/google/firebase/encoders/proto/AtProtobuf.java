package com.google.firebase.encoders.proto;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class AtProtobuf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Protobuf.IntEncoding f19644b = Protobuf.IntEncoding.DEFAULT;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ProtobufImpl implements Protobuf {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f19645b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Protobuf.IntEncoding f19646c;

        public ProtobufImpl(int i11, Protobuf.IntEncoding intEncoding) {
            this.f19645b = i11;
            this.f19646c = intEncoding;
        }

        @Override // java.lang.annotation.Annotation
        public final Class annotationType() {
            return Protobuf.class;
        }

        @Override // java.lang.annotation.Annotation
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Protobuf)) {
                return false;
            }
            Protobuf protobuf = (Protobuf) obj;
            return this.f19645b == protobuf.tag() && this.f19646c.equals(protobuf.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public final int hashCode() {
            return (14552422 ^ this.f19645b) + (this.f19646c.hashCode() ^ 2041407134);
        }

        @Override // com.google.firebase.encoders.proto.Protobuf
        public final Protobuf.IntEncoding intEncoding() {
            return this.f19646c;
        }

        @Override // com.google.firebase.encoders.proto.Protobuf
        public final int tag() {
            return this.f19645b;
        }

        @Override // java.lang.annotation.Annotation
        public final String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f19645b + "intEncoding=" + this.f19646c + ')';
        }
    }

    public final Protobuf a() {
        return new ProtobufImpl(this.f19643a, this.f19644b);
    }
}
