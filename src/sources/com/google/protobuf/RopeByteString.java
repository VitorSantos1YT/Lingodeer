package com.google.protobuf;

import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class RopeByteString extends ByteString {
    private static final long serialVersionUID = 1;
    public final int H;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ByteString f21360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ByteString f21361f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f21362t;

    /* JADX INFO: renamed from: com.google.protobuf.RopeByteString$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 extends ByteString.AbstractByteIterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PieceIterator f21363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ByteString.ByteIterator f21364b = a();

        public AnonymousClass1(RopeByteString ropeByteString) {
            this.f21363a = new PieceIterator(ropeByteString);
        }

        public final ByteString.ByteIterator a() {
            PieceIterator pieceIterator = this.f21363a;
            if (pieceIterator.hasNext()) {
                return new ByteString.AnonymousClass1();
            }
            return null;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f21364b != null;
        }

        @Override // com.google.protobuf.ByteString.ByteIterator
        public final byte v() {
            ByteString.ByteIterator byteIterator = this.f21364b;
            if (byteIterator == null) {
                throw new NoSuchElementException();
            }
            byte bV = byteIterator.v();
            if (!this.f21364b.hasNext()) {
                this.f21364b = a();
            }
            return bV;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Balancer {
        private Balancer() {
            new ArrayDeque();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class PieceIterator implements Iterator<ByteString.LeafByteString> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayDeque f21365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ByteString.LeafByteString f21366b;

        public PieceIterator(ByteString byteString) {
            if (!(byteString instanceof RopeByteString)) {
                this.f21365a = null;
                this.f21366b = (ByteString.LeafByteString) byteString;
                return;
            }
            RopeByteString ropeByteString = (RopeByteString) byteString;
            ArrayDeque arrayDeque = new ArrayDeque(ropeByteString.H);
            this.f21365a = arrayDeque;
            arrayDeque.push(ropeByteString);
            ByteString byteString2 = ropeByteString.f21360e;
            while (byteString2 instanceof RopeByteString) {
                RopeByteString ropeByteString2 = (RopeByteString) byteString2;
                this.f21365a.push(ropeByteString2);
                byteString2 = ropeByteString2.f21360e;
            }
            this.f21366b = (ByteString.LeafByteString) byteString2;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ByteString.LeafByteString next() {
            ByteString.LeafByteString leafByteString;
            ByteString.LeafByteString leafByteString2 = this.f21366b;
            if (leafByteString2 == null) {
                throw new NoSuchElementException();
            }
            do {
                ArrayDeque arrayDeque = this.f21365a;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    leafByteString = null;
                    break;
                }
                ByteString byteString = ((RopeByteString) arrayDeque.pop()).f21361f;
                while (byteString instanceof RopeByteString) {
                    RopeByteString ropeByteString = (RopeByteString) byteString;
                    arrayDeque.push(ropeByteString);
                    byteString = ropeByteString.f21360e;
                }
                leafByteString = (ByteString.LeafByteString) byteString;
            } while (leafByteString.size() == 0);
            this.f21366b = leafByteString;
            return leafByteString2;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f21366b != null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public RopeByteString(ByteString byteString, ByteString byteString2) {
        this.f21360e = byteString;
        this.f21361f = byteString2;
        int size = byteString.size();
        this.f21362t = size;
        this.f21359d = byteString2.size() + size;
        this.H = Math.max(byteString.j(), byteString2.j()) + 1;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // com.google.protobuf.ByteString
    public final ByteBuffer b() {
        return ByteBuffer.wrap(t()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.ByteString
    public final byte d(int i11) {
        ByteString.e(i11, this.f21359d);
        return k(i11);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean equals(Object obj) {
        ByteString.LeafByteString next;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int size = byteString.size();
            int i11 = this.f21359d;
            if (i11 == size) {
                if (i11 == 0) {
                    return true;
                }
                int i12 = this.f21160a;
                int i13 = byteString.f21160a;
                if (i12 == 0 || i13 == 0 || i12 == i13) {
                    PieceIterator pieceIterator = new PieceIterator(this);
                    ByteString.LeafByteString next2 = pieceIterator.next();
                    PieceIterator pieceIterator2 = new PieceIterator(byteString);
                    ByteString.LeafByteString next3 = pieceIterator2.next();
                    int i14 = 0;
                    int i15 = 0;
                    int i16 = 0;
                    while (true) {
                        int size2 = next2.size() - i14;
                        int size3 = next3.size() - i15;
                        int iMin = Math.min(size2, size3);
                        if (!(i14 == 0 ? next2.x(next3, i15, iMin) : next3.x(next2, i14, iMin))) {
                            break;
                        }
                        i16 += iMin;
                        if (i16 >= i11) {
                            if (i16 == i11) {
                                return true;
                            }
                            throw new IllegalStateException();
                        }
                        if (iMin == size2) {
                            next = pieceIterator.next();
                            i14 = 0;
                        } else {
                            i14 += iMin;
                        }
                        if (iMin == size3) {
                            next2 = next2;
                            next2 = next;
                            next3 = pieceIterator2.next();
                            i15 = 0;
                        } else {
                            next2 = next2;
                            next2 = next;
                            i15 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.protobuf.ByteString
    public final void h(int i11, byte[] bArr, int i12, int i13) {
        int i14 = i11 + i13;
        ByteString byteString = this.f21360e;
        int i15 = this.f21362t;
        if (i14 <= i15) {
            byteString.h(i11, bArr, i12, i13);
            return;
        }
        ByteString byteString2 = this.f21361f;
        if (i11 >= i15) {
            byteString2.h(i11 - i15, bArr, i12, i13);
            return;
        }
        int i16 = i15 - i11;
        byteString.h(i11, bArr, i12, i16);
        byteString2.h(0, bArr, i12 + i16, i13 - i16);
    }

    @Override // com.google.protobuf.ByteString, java.lang.Iterable
    public final Iterator<Byte> iterator() {
        return new AnonymousClass1(this);
    }

    @Override // com.google.protobuf.ByteString
    public final int j() {
        return this.H;
    }

    @Override // com.google.protobuf.ByteString
    public final byte k(int i11) {
        int i12 = this.f21362t;
        return i11 < i12 ? this.f21360e.k(i11) : this.f21361f.k(i11 - i12);
    }

    @Override // com.google.protobuf.ByteString
    public final boolean l() {
        int iR = this.f21360e.r(0, 0, this.f21362t);
        ByteString byteString = this.f21361f;
        return byteString.r(iR, 0, byteString.size()) == 0;
    }

    @Override // com.google.protobuf.ByteString
    /* JADX INFO: renamed from: m */
    public final ByteString.ByteIterator iterator() {
        return new AnonymousClass1(this);
    }

    @Override // com.google.protobuf.ByteString
    public final CodedInputStream n() {
        ArrayList arrayList = new ArrayList();
        PieceIterator pieceIterator = new PieceIterator(this);
        while (pieceIterator.hasNext()) {
            arrayList.add(pieceIterator.next().b());
        }
        int size = arrayList.size();
        int i11 = 0;
        int iRemaining = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            iRemaining += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                i11 |= 1;
            } else {
                i11 = byteBuffer.isDirect() ? i11 | 2 : i11 | 4;
            }
        }
        if (i11 == 2) {
            return new CodedInputStream.IterableDirectByteBufferDecoder(iRemaining, arrayList);
        }
        IterableByteBufferInputStream iterableByteBufferInputStream = new IterableByteBufferInputStream();
        iterableByteBufferInputStream.f21287a = arrayList.iterator();
        iterableByteBufferInputStream.f21289c = 0;
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList.get(i13);
            i13++;
            iterableByteBufferInputStream.f21289c++;
        }
        iterableByteBufferInputStream.f21290d = -1;
        if (!iterableByteBufferInputStream.a()) {
            iterableByteBufferInputStream.f21288b = Internal.f21284c;
            iterableByteBufferInputStream.f21290d = 0;
            iterableByteBufferInputStream.f21291e = 0;
            iterableByteBufferInputStream.K = 0L;
        }
        return CodedInputStream.f(iterableByteBufferInputStream);
    }

    @Override // com.google.protobuf.ByteString
    public final int o(int i11, int i12, int i13) {
        int i14 = i12 + i13;
        ByteString byteString = this.f21360e;
        int i15 = this.f21362t;
        if (i14 <= i15) {
            return byteString.o(i11, i12, i13);
        }
        ByteString byteString2 = this.f21361f;
        if (i12 >= i15) {
            return byteString2.o(i11, i12 - i15, i13);
        }
        int i16 = i15 - i12;
        return byteString2.o(byteString.o(i11, i12, i16), 0, i13 - i16);
    }

    @Override // com.google.protobuf.ByteString
    public final int r(int i11, int i12, int i13) {
        int i14 = i12 + i13;
        ByteString byteString = this.f21360e;
        int i15 = this.f21362t;
        if (i14 <= i15) {
            return byteString.r(i11, i12, i13);
        }
        ByteString byteString2 = this.f21361f;
        if (i12 >= i15) {
            return byteString2.r(i11, i12 - i15, i13);
        }
        int i16 = i15 - i12;
        return byteString2.r(byteString.r(i11, i12, i16), 0, i13 - i16);
    }

    @Override // com.google.protobuf.ByteString
    public final ByteString s(int i11, int i12) {
        int i13 = this.f21359d;
        int iF = ByteString.f(i11, i12, i13);
        if (iF == 0) {
            return ByteString.f21158b;
        }
        if (iF == i13) {
            return this;
        }
        ByteString byteString = this.f21360e;
        int i14 = this.f21362t;
        if (i12 <= i14) {
            return byteString.s(i11, i12);
        }
        ByteString byteString2 = this.f21361f;
        return i11 >= i14 ? byteString2.s(i11 - i14, i12 - i14) : new RopeByteString(byteString.s(i11, byteString.size()), byteString2.s(0, i12 - i14));
    }

    @Override // com.google.protobuf.ByteString
    public final int size() {
        return this.f21359d;
    }

    @Override // com.google.protobuf.ByteString
    public final String u(Charset charset) {
        return new String(t(), charset);
    }

    @Override // com.google.protobuf.ByteString
    public final void v(ByteOutput byteOutput) {
        this.f21360e.v(byteOutput);
        this.f21361f.v(byteOutput);
    }

    @Override // com.google.protobuf.ByteString
    public final void w(ByteOutput byteOutput) {
        this.f21361f.w(byteOutput);
        this.f21360e.w(byteOutput);
    }

    public Object writeReplace() {
        return new ByteString.LiteralByteString(t());
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public class RopeInputStream extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public PieceIterator f21367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ByteString.LeafByteString f21368b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f21369c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f21370d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f21371e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f21372f;

        public final void a() {
            if (this.f21368b != null) {
                int i11 = this.f21370d;
                int i12 = this.f21369c;
                if (i11 == i12) {
                    this.f21371e += i12;
                    this.f21370d = 0;
                    if (!this.f21367a.hasNext()) {
                        this.f21368b = null;
                        this.f21369c = 0;
                    } else {
                        ByteString.LeafByteString next = this.f21367a.next();
                        this.f21368b = next;
                        this.f21369c = next.size();
                    }
                }
            }
        }

        @Override // java.io.InputStream
        public final int available() {
            throw null;
        }

        public final int b(byte[] bArr, int i11, int i12) {
            int i13 = i12;
            while (i13 > 0) {
                a();
                if (this.f21368b == null) {
                    break;
                }
                int iMin = Math.min(this.f21369c - this.f21370d, i13);
                if (bArr != null) {
                    ByteString.LeafByteString leafByteString = this.f21368b;
                    int i14 = this.f21370d;
                    ByteString.f(i14, i14 + iMin, leafByteString.size());
                    ByteString.f(i11, i11 + iMin, bArr.length);
                    if (iMin > 0) {
                        leafByteString.h(i14, bArr, i11, iMin);
                    }
                    i11 += iMin;
                }
                this.f21370d += iMin;
                i13 -= iMin;
            }
            return i12 - i13;
        }

        @Override // java.io.InputStream
        public final void mark(int i11) {
            this.f21372f = this.f21371e + this.f21370d;
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i11, int i12) {
            bArr.getClass();
            if (i11 < 0 || i12 < 0 || i12 > bArr.length - i11) {
                throw new IndexOutOfBoundsException();
            }
            int iB = b(bArr, i11, i12);
            if (iB != 0) {
                return iB;
            }
            if (i12 > 0) {
                return -1;
            }
            throw null;
        }

        @Override // java.io.InputStream
        public final synchronized void reset() {
            PieceIterator pieceIterator = new PieceIterator(null);
            this.f21367a = pieceIterator;
            ByteString.LeafByteString next = pieceIterator.next();
            this.f21368b = next;
            this.f21369c = next.size();
            this.f21370d = 0;
            this.f21371e = 0;
            b(null, 0, this.f21372f);
        }

        @Override // java.io.InputStream
        public final long skip(long j11) {
            if (j11 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (j11 > 2147483647L) {
                j11 = 2147483647L;
            }
            return b(null, 0, (int) j11);
        }

        @Override // java.io.InputStream
        public final int read() {
            a();
            ByteString.LeafByteString leafByteString = this.f21368b;
            if (leafByteString == null) {
                return -1;
            }
            int i11 = this.f21370d;
            this.f21370d = i11 + 1;
            return leafByteString.d(i11) & 255;
        }
    }
}
