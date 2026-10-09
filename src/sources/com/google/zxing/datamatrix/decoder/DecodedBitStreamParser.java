package com.google.zxing.datamatrix.decoder;

import com.google.android.gms.measurement.zfxB.ypOOxsaJG;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class DecodedBitStreamParser {

    /* JADX INFO: renamed from: com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21500a;

        static {
            int[] iArr = new int[Mode.values().length];
            f21500a = iArr;
            try {
                iArr[Mode.C40_ENCODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21500a[Mode.TEXT_ENCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21500a[Mode.ANSIX12_ENCODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21500a[Mode.EDIFACT_ENCODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21500a[Mode.BASE256_ENCODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Mode {
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode ANSIX12_ENCODE;
        public static final Mode ASCII_ENCODE;
        public static final Mode BASE256_ENCODE;
        public static final Mode C40_ENCODE;
        public static final Mode EDIFACT_ENCODE;
        public static final Mode PAD_ENCODE;
        public static final Mode TEXT_ENCODE;

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }

        static {
            Mode mode = new Mode("PAD_ENCODE", 0);
            PAD_ENCODE = mode;
            Mode mode2 = new Mode(ypOOxsaJG.HOrGAOk, 1);
            ASCII_ENCODE = mode2;
            Mode mode3 = new Mode("C40_ENCODE", 2);
            C40_ENCODE = mode3;
            Mode mode4 = new Mode("TEXT_ENCODE", 3);
            TEXT_ENCODE = mode4;
            Mode mode5 = new Mode("ANSIX12_ENCODE", 4);
            ANSIX12_ENCODE = mode5;
            Mode mode6 = new Mode("EDIFACT_ENCODE", 5);
            EDIFACT_ENCODE = mode6;
            Mode mode7 = new Mode("BASE256_ENCODE", 6);
            BASE256_ENCODE = mode7;
            $VALUES = new Mode[]{mode, mode2, mode3, mode4, mode5, mode6, mode7};
        }
    }

    private DecodedBitStreamParser() {
    }
}
