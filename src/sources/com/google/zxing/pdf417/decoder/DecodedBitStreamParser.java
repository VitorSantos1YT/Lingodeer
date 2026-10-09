package com.google.zxing.pdf417.decoder;

import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class DecodedBitStreamParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BigInteger[] f21556a;

    /* JADX INFO: renamed from: com.google.zxing.pdf417.decoder.DecodedBitStreamParser$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21557a;

        static {
            int[] iArr = new int[Mode.values().length];
            f21557a = iArr;
            try {
                iArr[Mode.ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21557a[Mode.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21557a[Mode.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21557a[Mode.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21557a[Mode.ALPHA_SHIFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21557a[Mode.PUNCT_SHIFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Mode {
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode ALPHA;
        public static final Mode ALPHA_SHIFT;
        public static final Mode LOWER;
        public static final Mode MIXED;
        public static final Mode PUNCT;
        public static final Mode PUNCT_SHIFT;

        static {
            Mode mode = new Mode("ALPHA", 0);
            ALPHA = mode;
            Mode mode2 = new Mode("LOWER", 1);
            LOWER = mode2;
            Mode mode3 = new Mode("MIXED", 2);
            MIXED = mode3;
            Mode mode4 = new Mode("PUNCT", 3);
            PUNCT = mode4;
            Mode mode5 = new Mode("ALPHA_SHIFT", 4);
            ALPHA_SHIFT = mode5;
            Mode mode6 = new Mode("PUNCT_SHIFT", 5);
            PUNCT_SHIFT = mode6;
            $VALUES = new Mode[]{mode, mode2, mode3, mode4, mode5, mode6};
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    static {
        ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();
        "0123456789&\r\t,:#-.$/+%*=^".toCharArray();
        BigInteger[] bigIntegerArr = new BigInteger[16];
        f21556a = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = bigIntegerValueOf;
        int i11 = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = f21556a;
            if (i11 >= bigIntegerArr2.length) {
                return;
            }
            bigIntegerArr2[i11] = bigIntegerArr2[i11 - 1].multiply(bigIntegerValueOf);
            i11++;
        }
    }

    private DecodedBitStreamParser() {
    }
}
