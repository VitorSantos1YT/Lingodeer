package com.google.common.hash;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class Funnels {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ByteArrayFunnel implements Funnel<byte[]> {
        private static final /* synthetic */ ByteArrayFunnel[] $VALUES;
        public static final ByteArrayFunnel INSTANCE;

        static {
            ByteArrayFunnel byteArrayFunnel = new ByteArrayFunnel("INSTANCE", 0);
            INSTANCE = byteArrayFunnel;
            $VALUES = new ByteArrayFunnel[]{byteArrayFunnel};
        }

        public static ByteArrayFunnel valueOf(String str) {
            return (ByteArrayFunnel) Enum.valueOf(ByteArrayFunnel.class, str);
        }

        public static ByteArrayFunnel[] values() {
            return (ByteArrayFunnel[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Funnels.byteArrayFunnel()";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class IntegerFunnel implements Funnel<Integer> {
        private static final /* synthetic */ IntegerFunnel[] $VALUES;
        public static final IntegerFunnel INSTANCE;

        static {
            IntegerFunnel integerFunnel = new IntegerFunnel("INSTANCE", 0);
            INSTANCE = integerFunnel;
            $VALUES = new IntegerFunnel[]{integerFunnel};
        }

        public static IntegerFunnel valueOf(String str) {
            return (IntegerFunnel) Enum.valueOf(IntegerFunnel.class, str);
        }

        public static IntegerFunnel[] values() {
            return (IntegerFunnel[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Funnels.integerFunnel()";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class LongFunnel implements Funnel<Long> {
        private static final /* synthetic */ LongFunnel[] $VALUES;
        public static final LongFunnel INSTANCE;

        static {
            LongFunnel longFunnel = new LongFunnel("INSTANCE", 0);
            INSTANCE = longFunnel;
            $VALUES = new LongFunnel[]{longFunnel};
        }

        public static LongFunnel valueOf(String str) {
            return (LongFunnel) Enum.valueOf(LongFunnel.class, str);
        }

        public static LongFunnel[] values() {
            return (LongFunnel[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Funnels.longFunnel()";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SequentialFunnel<E> implements Funnel<Iterable<? extends E>>, Serializable {
        public final boolean equals(Object obj) {
            if (obj instanceof SequentialFunnel) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            SequentialFunnel.class.hashCode();
            throw null;
        }

        public final String toString() {
            return "Funnels.sequentialFunnel(null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SinkAsStream extends OutputStream {
        public final String toString() {
            return "Funnels.asOutputStream(null)";
        }

        @Override // java.io.OutputStream
        public final void write(int i11) {
            throw null;
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) {
            throw null;
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i11, int i12) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class StringCharsetFunnel implements Funnel<CharSequence>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Charset f17361a;

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static class SerializedForm implements Serializable {
            private static final long serialVersionUID = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f17362a;

            public SerializedForm(Charset charset) {
                this.f17362a = charset.name();
            }

            private Object readResolve() {
                return new StringCharsetFunnel(Charset.forName(this.f17362a));
            }
        }

        public StringCharsetFunnel(Charset charset) {
            charset.getClass();
            this.f17361a = charset;
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use SerializedForm");
        }

        public final boolean equals(Object obj) {
            if (obj instanceof StringCharsetFunnel) {
                return this.f17361a.equals(((StringCharsetFunnel) obj).f17361a);
            }
            return false;
        }

        public final int hashCode() {
            return StringCharsetFunnel.class.hashCode() ^ this.f17361a.hashCode();
        }

        public final String toString() {
            return "Funnels.stringFunnel(" + this.f17361a.name() + ")";
        }

        public Object writeReplace() {
            return new SerializedForm(this.f17361a);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class UnencodedCharsFunnel implements Funnel<CharSequence> {
        private static final /* synthetic */ UnencodedCharsFunnel[] $VALUES;
        public static final UnencodedCharsFunnel INSTANCE;

        static {
            UnencodedCharsFunnel unencodedCharsFunnel = new UnencodedCharsFunnel("INSTANCE", 0);
            INSTANCE = unencodedCharsFunnel;
            $VALUES = new UnencodedCharsFunnel[]{unencodedCharsFunnel};
        }

        public static UnencodedCharsFunnel valueOf(String str) {
            return (UnencodedCharsFunnel) Enum.valueOf(UnencodedCharsFunnel.class, str);
        }

        public static UnencodedCharsFunnel[] values() {
            return (UnencodedCharsFunnel[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Funnels.unencodedCharsFunnel()";
        }
    }

    private Funnels() {
    }
}
