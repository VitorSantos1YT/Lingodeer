package com.google.common.hash;

import com.google.android.gms.internal.stats.RC.ualZoVVCQs;
import com.google.errorprone.annotations.Immutable;
import i0.pKy.shrCcjmOhAmRC;
import java.util.Arrays;
import java.util.zip.Adler32;
import java.util.zip.CRC32;
import java.util.zip.Checksum;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class Hashing {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f17367a = (int) System.currentTimeMillis();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    @Immutable
    public static abstract class ChecksumType implements ImmutableSupplier<Checksum> {
        private static final /* synthetic */ ChecksumType[] $VALUES;
        public static final ChecksumType ADLER_32;
        public static final ChecksumType CRC_32;
        public final HashFunction hashFunction;

        /* JADX INFO: renamed from: com.google.common.hash.Hashing$ChecksumType$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public final enum AnonymousClass1 extends ChecksumType {
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return new CRC32();
            }
        }

        /* JADX INFO: renamed from: com.google.common.hash.Hashing$ChecksumType$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public final enum AnonymousClass2 extends ChecksumType {
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return new Adler32();
            }
        }

        public ChecksumType(String str, int i11, String str2) {
            super(str, i11);
            this.hashFunction = new ChecksumHashFunction(this, str2);
        }

        public static ChecksumType valueOf(String str) {
            return (ChecksumType) Enum.valueOf(ChecksumType.class, str);
        }

        public static ChecksumType[] values() {
            return (ChecksumType[]) $VALUES.clone();
        }

        static {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1("CRC_32", 0, "Hashing.crc32()");
            CRC_32 = anonymousClass1;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(ualZoVVCQs.oLVSDrgesYHBFN, 1, "Hashing.adler32()");
            ADLER_32 = anonymousClass2;
            $VALUES = new ChecksumType[]{anonymousClass1, anonymousClass2};
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class ConcatenatedHashFunction extends AbstractCompositeHashFunction {
        public final boolean equals(Object obj) {
            if (obj instanceof ConcatenatedHashFunction) {
                return Arrays.equals((Object[]) null, (Object[]) null);
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode((Object[]) null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class LinearCongruentialGenerator {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Md5Holder {
        private Md5Holder() {
        }

        static {
            new MessageDigestHashFunction(shrCcjmOhAmRC.OzzWlGWiGBx, "Hashing.md5()");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Sha1Holder {
        static {
            new MessageDigestHashFunction("SHA-1", "Hashing.sha1()");
        }

        private Sha1Holder() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Sha256Holder {
        static {
            new MessageDigestHashFunction("SHA-256", "Hashing.sha256()");
        }

        private Sha256Holder() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Sha384Holder {
        static {
            new MessageDigestHashFunction("SHA-384", "Hashing.sha384()");
        }

        private Sha384Holder() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Sha512Holder {
        static {
            new MessageDigestHashFunction("SHA-512", "Hashing.sha512()");
        }

        private Sha512Holder() {
        }
    }

    private Hashing() {
    }

    public static HashFunction a() {
        return Murmur3_128HashFunction.f17381b;
    }
}
