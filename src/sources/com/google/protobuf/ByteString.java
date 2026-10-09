package com.google.protobuf;

import defpackage.e;
import ep.a;
import hh.p0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.logging.Logger;
import nv.p;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
public abstract class ByteString implements Iterable<Byte>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ByteString f21158b = new LiteralByteString(Internal.f21283b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ByteArrayCopier f21159c;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21160a = 0;

    /* JADX INFO: renamed from: com.google.protobuf.ByteString$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 extends AbstractByteIterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f21161a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f21162b;

        public AnonymousClass1() {
            this.f21162b = ByteString.this.size();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f21161a < this.f21162b;
        }

        @Override // com.google.protobuf.ByteString.ByteIterator
        public final byte v() {
            int i11 = this.f21161a;
            if (i11 >= this.f21162b) {
                throw new NoSuchElementException();
            }
            this.f21161a = i11 + 1;
            return ByteString.this.k(i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class AbstractByteIterator implements ByteIterator {
        @Override // java.util.Iterator
        public final Byte next() {
            return Byte.valueOf(v());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ArraysByteArrayCopier implements ByteArrayCopier {
        private ArraysByteArrayCopier() {
        }

        @Override // com.google.protobuf.ByteString.ByteArrayCopier
        public final byte[] a(byte[] bArr, int i11, int i12) {
            return Arrays.copyOfRange(bArr, i11, i12 + i11);
        }

        public /* synthetic */ ArraysByteArrayCopier(int i11) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class BoundedByteString extends LiteralByteString {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f21164e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f21165f;

        public BoundedByteString(byte[] bArr, int i11, int i12) {
            super(bArr);
            ByteString.f(i11, i11 + i12, bArr.length);
            this.f21164e = i11;
            this.f21165f = i12;
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        public final byte d(int i11) {
            ByteString.e(i11, this.f21165f);
            return this.f21168d[this.f21164e + i11];
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        public final void h(int i11, byte[] bArr, int i12, int i13) {
            System.arraycopy(this.f21168d, this.f21164e + i11, bArr, i12, i13);
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString.LeafByteString, com.google.protobuf.ByteString
        public final byte k(int i11) {
            return this.f21168d[this.f21164e + i11];
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString, com.google.protobuf.ByteString
        public final int size() {
            return this.f21165f;
        }

        public Object writeReplace() {
            return new LiteralByteString(t());
        }

        @Override // com.google.protobuf.ByteString.LiteralByteString
        public final int z() {
            return this.f21164e;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface ByteArrayCopier {
        byte[] a(byte[] bArr, int i11, int i12);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface ByteIterator extends Iterator<Byte> {
        byte v();
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CodedBuilder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CodedOutputStream f21166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f21167b;

        public CodedBuilder(int i11) {
            byte[] bArr = new byte[i11];
            this.f21167b = bArr;
            Logger logger = CodedOutputStream.f21211b;
            this.f21166a = new CodedOutputStream.ArrayEncoder(bArr, 0, i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class LeafByteString extends ByteString {
        private static final long serialVersionUID = 1;

        @Override // com.google.protobuf.ByteString, java.lang.Iterable
        public final Iterator<Byte> iterator() {
            return new AnonymousClass1();
        }

        @Override // com.google.protobuf.ByteString
        public final int j() {
            return 0;
        }

        @Override // com.google.protobuf.ByteString
        public byte k(int i11) {
            return d(i11);
        }

        @Override // com.google.protobuf.ByteString
        public final void w(ByteOutput byteOutput) {
            v(byteOutput);
        }

        public abstract boolean x(ByteString byteString, int i11, int i12);
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class LiteralByteString extends LeafByteString {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f21168d;

        public LiteralByteString(byte[] bArr) {
            bArr.getClass();
            this.f21168d = bArr;
        }

        @Override // com.google.protobuf.ByteString
        public final ByteBuffer b() {
            return ByteBuffer.wrap(this.f21168d, z(), size()).asReadOnlyBuffer();
        }

        @Override // com.google.protobuf.ByteString
        public byte d(int i11) {
            return this.f21168d[i11];
        }

        @Override // com.google.protobuf.ByteString
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteString) || size() != ((ByteString) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof LiteralByteString)) {
                return obj.equals(this);
            }
            LiteralByteString literalByteString = (LiteralByteString) obj;
            int i11 = this.f21160a;
            int i12 = literalByteString.f21160a;
            if (i11 == 0 || i12 == 0 || i11 == i12) {
                return x(literalByteString, 0, size());
            }
            return false;
        }

        @Override // com.google.protobuf.ByteString
        public void h(int i11, byte[] bArr, int i12, int i13) {
            System.arraycopy(this.f21168d, i11, bArr, i12, i13);
        }

        @Override // com.google.protobuf.ByteString.LeafByteString, com.google.protobuf.ByteString
        public byte k(int i11) {
            return this.f21168d[i11];
        }

        @Override // com.google.protobuf.ByteString
        public final boolean l() {
            int iZ = z();
            return Utf8.f21424a.e(this.f21168d, iZ, size() + iZ);
        }

        @Override // com.google.protobuf.ByteString
        public final CodedInputStream n() {
            return CodedInputStream.g(this.f21168d, z(), size(), true);
        }

        @Override // com.google.protobuf.ByteString
        public final int o(int i11, int i12, int i13) {
            int iZ = z() + i12;
            Charset charset = Internal.f21282a;
            for (int i14 = iZ; i14 < iZ + i13; i14++) {
                i11 = (i11 * 31) + this.f21168d[i14];
            }
            return i11;
        }

        @Override // com.google.protobuf.ByteString
        public final int r(int i11, int i12, int i13) {
            int iZ = z() + i12;
            return Utf8.f21424a.g(i11, this.f21168d, iZ, i13 + iZ);
        }

        @Override // com.google.protobuf.ByteString
        public final ByteString s(int i11, int i12) {
            int iF = ByteString.f(i11, i12, size());
            if (iF == 0) {
                return ByteString.f21158b;
            }
            return new BoundedByteString(this.f21168d, z() + i11, iF);
        }

        @Override // com.google.protobuf.ByteString
        public int size() {
            return this.f21168d.length;
        }

        @Override // com.google.protobuf.ByteString
        public final String u(Charset charset) {
            return new String(this.f21168d, z(), size(), charset);
        }

        @Override // com.google.protobuf.ByteString
        public final void v(ByteOutput byteOutput) {
            byteOutput.R(this.f21168d, z(), size());
        }

        @Override // com.google.protobuf.ByteString.LeafByteString
        public final boolean x(ByteString byteString, int i11, int i12) {
            if (i12 > byteString.size()) {
                throw new IllegalArgumentException("Length too large: " + i12 + size());
            }
            int i13 = i11 + i12;
            if (i13 > byteString.size()) {
                StringBuilder sbK = c.k("Ran off end of other: ", i11, ", ", i12, ", ");
                sbK.append(byteString.size());
                throw new IllegalArgumentException(sbK.toString());
            }
            if (!(byteString instanceof LiteralByteString)) {
                return byteString.s(i11, i13).equals(s(0, i12));
            }
            LiteralByteString literalByteString = (LiteralByteString) byteString;
            byte[] bArr = literalByteString.f21168d;
            int iZ = z() + i12;
            int iZ2 = z();
            int iZ3 = literalByteString.z() + i11;
            while (iZ2 < iZ) {
                if (this.f21168d[iZ2] != bArr[iZ3]) {
                    return false;
                }
                iZ2++;
                iZ3++;
            }
            return true;
        }

        public int z() {
            return 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SystemByteArrayCopier implements ByteArrayCopier {
        private SystemByteArrayCopier() {
        }

        @Override // com.google.protobuf.ByteString.ByteArrayCopier
        public final byte[] a(byte[] bArr, int i11, int i12) {
            byte[] bArr2 = new byte[i12];
            System.arraycopy(bArr, i11, bArr2, 0, i12);
            return bArr2;
        }

        public /* synthetic */ SystemByteArrayCopier(int i11) {
            this();
        }
    }

    static {
        int i11 = 0;
        f21159c = Android.a() ? new SystemByteArrayCopier(i11) : new ArraysByteArrayCopier(i11);
        new Comparator<ByteString>() { // from class: com.google.protobuf.ByteString.2
            @Override // java.util.Comparator
            public final int compare(ByteString byteString, ByteString byteString2) {
                ByteString byteString3 = byteString;
                ByteString byteString4 = byteString2;
                ByteIterator it = byteString3.iterator();
                ByteIterator it2 = byteString4.iterator();
                while (it.hasNext() && it2.hasNext()) {
                    int iCompareTo = Integer.valueOf(it.v() & 255).compareTo(Integer.valueOf(it2.v() & 255));
                    if (iCompareTo != 0) {
                        return iCompareTo;
                    }
                }
                return Integer.valueOf(byteString3.size()).compareTo(Integer.valueOf(byteString4.size()));
            }
        };
    }

    public static void e(int i11, int i12) {
        if (((i12 - (i11 + 1)) | i11) < 0) {
            if (i11 >= 0) {
                throw new ArrayIndexOutOfBoundsException(p.p("Index > length: ", i11, i12, ", "));
            }
            throw new ArrayIndexOutOfBoundsException(p.j(i11, "Index < 0: "));
        }
    }

    public static int f(int i11, int i12, int i13) {
        int i14 = i12 - i11;
        if ((i11 | i12 | i14 | (i13 - i12)) >= 0) {
            return i14;
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException(p0.h(i11, "Beginning index: ", " < 0"));
        }
        if (i12 < i11) {
            throw new IndexOutOfBoundsException(p.p("Beginning index larger than ending index: ", i11, i12, ", "));
        }
        throw new IndexOutOfBoundsException(p.p("End index: ", i12, i13, " >= "));
    }

    public static ByteString g(byte[] bArr, int i11, int i12) {
        f(i11, i11 + i12, bArr.length);
        return new LiteralByteString(f21159c.a(bArr, i11, i12));
    }

    public abstract ByteBuffer b();

    public abstract byte d(int i11);

    public abstract boolean equals(Object obj);

    public abstract void h(int i11, byte[] bArr, int i12, int i13);

    public final int hashCode() {
        int iO = this.f21160a;
        if (iO == 0) {
            int size = size();
            iO = o(size, 0, size);
            if (iO == 0) {
                iO = 1;
            }
            this.f21160a = iO;
        }
        return iO;
    }

    public abstract int j();

    public abstract byte k(int i11);

    public abstract boolean l();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public ByteIterator iterator() {
        return new AnonymousClass1();
    }

    public abstract CodedInputStream n();

    public abstract int o(int i11, int i12, int i13);

    public abstract int r(int i11, int i12, int i13);

    public abstract ByteString s(int i11, int i12);

    public abstract int size();

    public final byte[] t() {
        int size = size();
        if (size == 0) {
            return Internal.f21283b;
        }
        byte[] bArr = new byte[size];
        h(0, bArr, 0, size);
        return bArr;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return a.k(e.q(size(), "<ByteString@", hexString, " size=", " contents=\""), size() <= 50 ? TextFormatEscaper.a(this) : a.k(new StringBuilder(), TextFormatEscaper.a(s(0, 47)), "..."), "\">");
    }

    public abstract String u(Charset charset);

    public abstract void v(ByteOutput byteOutput);

    public abstract void w(ByteOutput byteOutput);

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Output extends OutputStream {
        public final String toString() {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            synchronized (this) {
            }
            return String.format("<ByteString.Output@%s size=%d>", hexString, 0);
        }

        @Override // java.io.OutputStream
        public final synchronized void write(int i11) {
            throw null;
        }

        @Override // java.io.OutputStream
        public final synchronized void write(byte[] bArr, int i11, int i12) {
            throw null;
        }
    }
}
