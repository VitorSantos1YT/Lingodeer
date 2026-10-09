package com.google.zxing.qrcode.decoder;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public enum Mode {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);

    private final int bits;
    private final int[] characterCountBitsForVersions;

    Mode(int[] iArr, int i11) {
        this.characterCountBitsForVersions = iArr;
        this.bits = i11;
    }

    public final int a() {
        return this.bits;
    }

    public final int b(Version version) {
        char c11;
        int i11 = version.f21587a;
        if (i11 <= 9) {
            c11 = 0;
        } else {
            c11 = i11 <= 26 ? (char) 1 : (char) 2;
        }
        return this.characterCountBitsForVersions[c11];
    }
}
