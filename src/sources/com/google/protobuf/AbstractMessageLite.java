package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessageLite.Builder;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractMessageLite<MessageType extends AbstractMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> implements MessageLite {
    protected int memoizedHashCode = 0;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface InternalOneOfEnum {
    }

    public static void b(Iterable iterable, List list) {
        Charset charset = Internal.f21282a;
        iterable.getClass();
        if (iterable instanceof LazyStringList) {
            List listQ = ((LazyStringList) iterable).q();
            LazyStringList lazyStringList = (LazyStringList) list;
            int size = list.size();
            for (Object obj : listQ) {
                if (obj == null) {
                    String str = "Element at index " + (lazyStringList.size() - size) + " is null.";
                    for (int size2 = lazyStringList.size() - 1; size2 >= size; size2--) {
                        lazyStringList.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof ByteString) {
                    lazyStringList.F((ByteString) obj);
                } else {
                    lazyStringList.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof PrimitiveNonBoxingCollection) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size3 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list.size() - size3) + " is null.";
                for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                    list.remove(size4);
                }
                throw new NullPointerException(str2);
            }
            list.add(obj2);
        }
    }

    public int e() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.MessageLite
    public final ByteString g() {
        try {
            int iK = ((GeneratedMessageLite) this).k(null);
            ByteString byteString = ByteString.f21158b;
            ByteString.CodedBuilder codedBuilder = new ByteString.CodedBuilder(iK);
            CodedOutputStream codedOutputStream = codedBuilder.f21166a;
            ((GeneratedMessageLite) this).d(codedOutputStream);
            if (codedOutputStream.c0() == 0) {
                return new ByteString.LiteralByteString(codedBuilder.f21167b);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e8) {
            throw new RuntimeException(l("ByteString"), e8);
        }
    }

    public int k(Schema schema) {
        int iE = e();
        if (iE != -1) {
            return iE;
        }
        int i11 = schema.i(this);
        m(i11);
        return i11;
    }

    public final String l(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public void m(int i11) {
        throw new UnsupportedOperationException();
    }

    public final byte[] n() {
        try {
            int iK = ((GeneratedMessageLite) this).k(null);
            byte[] bArr = new byte[iK];
            Logger logger = CodedOutputStream.f21211b;
            CodedOutputStream.ArrayEncoder arrayEncoder = new CodedOutputStream.ArrayEncoder(bArr, 0, iK);
            ((GeneratedMessageLite) this).d(arrayEncoder);
            if (arrayEncoder.c0() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e8) {
            throw new RuntimeException(l("byte array"), e8);
        }
    }

    public final void o(OutputStream outputStream) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) this;
        int iK = generatedMessageLite.k(null);
        Logger logger = CodedOutputStream.f21211b;
        if (iK > 4096) {
            iK = 4096;
        }
        CodedOutputStream.OutputStreamEncoder outputStreamEncoder = new CodedOutputStream.OutputStreamEncoder(outputStream, iK);
        generatedMessageLite.d(outputStreamEncoder);
        if (outputStreamEncoder.f21216f > 0) {
            outputStreamEncoder.y0();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class Builder<MessageType extends AbstractMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> implements MessageLite.Builder {
        @Override // 
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public abstract GeneratedMessageLite.Builder clone();

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static final class LimitedInputStream extends FilterInputStream {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f21140a;

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int available() {
                return Math.min(super.available(), this.f21140a);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read() throws IOException {
                if (this.f21140a <= 0) {
                    return -1;
                }
                int i11 = super.read();
                if (i11 >= 0) {
                    this.f21140a--;
                }
                return i11;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final long skip(long j11) {
                int iSkip = (int) super.skip(Math.min(j11, this.f21140a));
                if (iSkip >= 0) {
                    this.f21140a -= iSkip;
                }
                return iSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read(byte[] bArr, int i11, int i12) throws IOException {
                int i13 = this.f21140a;
                if (i13 <= 0) {
                    return -1;
                }
                int i14 = super.read(bArr, i11, Math.min(i12, i13));
                if (i14 >= 0) {
                    this.f21140a -= i14;
                }
                return i14;
            }
        }
    }
}
