package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@Immutable
@ElementTypesAreNonnullByDefault
final class MessageDigestHashFunction extends AbstractHashFunction implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessageDigest f17371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17374d;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class MessageDigestHasher extends AbstractByteHasher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MessageDigest f17375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17376b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f17377c;

        public MessageDigestHasher(MessageDigest messageDigest, int i11) {
            this.f17375a = messageDigest;
            this.f17376b = i11;
        }

        @Override // com.google.common.hash.Hasher
        public final HashCode c() {
            Preconditions.p("Cannot re-use a Hasher after calling hash() on it", !this.f17377c);
            this.f17377c = true;
            MessageDigest messageDigest = this.f17375a;
            int digestLength = messageDigest.getDigestLength();
            int i11 = this.f17376b;
            if (i11 == digestLength) {
                byte[] bArrDigest = messageDigest.digest();
                char[] cArr = HashCode.f17363a;
                return new HashCode.BytesHashCode(bArrDigest);
            }
            byte[] bArrCopyOf = Arrays.copyOf(messageDigest.digest(), i11);
            char[] cArr2 = HashCode.f17363a;
            return new HashCode.BytesHashCode(bArrCopyOf);
        }

        @Override // com.google.common.hash.AbstractByteHasher
        public final void e(byte b3) {
            Preconditions.p("Cannot re-use a Hasher after calling hash() on it", !this.f17377c);
            this.f17375a.update(b3);
        }

        @Override // com.google.common.hash.AbstractByteHasher
        public final void g(byte[] bArr, int i11) {
            Preconditions.p("Cannot re-use a Hasher after calling hash() on it", !this.f17377c);
            this.f17375a.update(bArr, 0, i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f17378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f17380c;

        public SerializedForm(String str, int i11, String str2) {
            this.f17378a = str;
            this.f17379b = i11;
            this.f17380c = str2;
        }

        private Object readResolve() {
            return new MessageDigestHashFunction(this.f17378a, this.f17379b, this.f17380c);
        }
    }

    public MessageDigestHashFunction(String str, String str2) {
        boolean z11;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            this.f17371a = messageDigest;
            this.f17372b = messageDigest.getDigestLength();
            this.f17374d = str2;
            try {
                messageDigest.clone();
                z11 = true;
            } catch (CloneNotSupportedException unused) {
                z11 = false;
            }
            this.f17373c = z11;
        } catch (NoSuchAlgorithmException e8) {
            throw new AssertionError(e8);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.hash.HashFunction
    public final Hasher a() {
        boolean z11 = this.f17373c;
        int i11 = this.f17372b;
        MessageDigest messageDigest = this.f17371a;
        if (z11) {
            try {
                return new MessageDigestHasher((MessageDigest) messageDigest.clone(), i11);
            } catch (CloneNotSupportedException unused) {
            }
        }
        try {
            return new MessageDigestHasher(MessageDigest.getInstance(messageDigest.getAlgorithm()), i11);
        } catch (NoSuchAlgorithmException e8) {
            throw new AssertionError(e8);
        }
    }

    public final String toString() {
        return this.f17374d;
    }

    public Object writeReplace() {
        return new SerializedForm(this.f17371a.getAlgorithm(), this.f17372b, this.f17374d);
    }

    public MessageDigestHashFunction(String str, int i11, String str2) {
        str2.getClass();
        this.f17374d = str2;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            this.f17371a = messageDigest;
            int digestLength = messageDigest.getDigestLength();
            boolean z11 = false;
            Preconditions.c(i11, i11 >= 4 && i11 <= digestLength, digestLength, "bytes (%s) must be >= 4 and < %s");
            this.f17372b = i11;
            try {
                messageDigest.clone();
                z11 = true;
            } catch (CloneNotSupportedException unused) {
            }
            this.f17373c = z11;
        } catch (NoSuchAlgorithmException e8) {
            throw new AssertionError(e8);
        }
    }
}
