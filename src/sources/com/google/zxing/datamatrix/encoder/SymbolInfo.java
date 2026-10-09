package com.google.zxing.datamatrix.encoder;

import com.google.zxing.Dimension;
import com.lingodeer.data.model.AchievementLevelType;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class SymbolInfo {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final SymbolInfo[] f21521i = {new SymbolInfo(false, 3, 5, 8, 8, 1, 3, 5), new SymbolInfo(false, 5, 7, 10, 10, 1, 5, 7), new SymbolInfo(true, 5, 7, 16, 6, 1, 5, 7), new SymbolInfo(false, 8, 10, 12, 12, 1, 8, 10), new SymbolInfo(true, 10, 11, 14, 6, 2, 10, 11), new SymbolInfo(false, 12, 12, 14, 14, 1, 12, 12), new SymbolInfo(true, 16, 14, 24, 10, 1, 16, 14), new SymbolInfo(false, 18, 14, 16, 16, 1, 18, 14), new SymbolInfo(false, 22, 18, 18, 18, 1, 22, 18), new SymbolInfo(true, 22, 18, 16, 10, 2, 22, 18), new SymbolInfo(false, 30, 20, 20, 20, 1, 30, 20), new SymbolInfo(true, 32, 24, 16, 14, 2, 32, 24), new SymbolInfo(false, 36, 24, 22, 22, 1, 36, 24), new SymbolInfo(false, 44, 28, 24, 24, 1, 44, 28), new SymbolInfo(true, 49, 28, 22, 14, 2, 49, 28), new SymbolInfo(false, 62, 36, 14, 14, 4, 62, 36), new SymbolInfo(false, 86, 42, 16, 16, 4, 86, 42), new SymbolInfo(false, 114, 48, 18, 18, 4, 114, 48), new SymbolInfo(false, 144, 56, 20, 20, 4, 144, 56), new SymbolInfo(false, 174, 68, 22, 22, 4, 174, 68), new SymbolInfo(false, 204, 84, 24, 24, 4, 102, 42), new SymbolInfo(false, 280, 112, 14, 14, 16, 140, 56), new SymbolInfo(false, 368, 144, 16, 16, 16, 92, 36), new SymbolInfo(false, 456, 192, 18, 18, 16, 114, 48), new SymbolInfo(false, 576, 224, 20, 20, 16, 144, 56), new SymbolInfo(false, 696, 272, 22, 22, 16, 174, 68), new SymbolInfo(false, 816, 336, 24, 24, 16, 136, 56), new SymbolInfo(false, 1050, 408, 18, 18, 36, AchievementLevelType.KNOWLEDGE_POINT_LV_4, 68), new SymbolInfo(false, 1304, 496, 20, 20, 36, 163, 62), new DataMatrixSymbolInfo144()};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f21527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f21528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f21529h;

    public SymbolInfo(boolean z11, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.f21522a = z11;
        this.f21523b = i11;
        this.f21524c = i12;
        this.f21525d = i13;
        this.f21526e = i14;
        this.f21527f = i15;
        this.f21528g = i16;
        this.f21529h = i17;
    }

    public static SymbolInfo f(int i11, SymbolShapeHint symbolShapeHint, Dimension dimension, Dimension dimension2) {
        for (SymbolInfo symbolInfo : f21521i) {
            if (!(symbolShapeHint == SymbolShapeHint.FORCE_SQUARE && symbolInfo.f21522a) && ((symbolShapeHint != SymbolShapeHint.FORCE_RECTANGLE || symbolInfo.f21522a) && ((dimension == null || (symbolInfo.d() >= 0 && (symbolInfo.e() * symbolInfo.f21526e) + (symbolInfo.e() << 1) >= 0)) && ((dimension2 == null || (symbolInfo.d() <= 0 && (symbolInfo.e() * symbolInfo.f21526e) + (symbolInfo.e() << 1) <= 0)) && i11 <= symbolInfo.f21523b)))) {
                return symbolInfo;
            }
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i11)));
    }

    public int a(int i11) {
        return this.f21528g;
    }

    public final int b() {
        int i11 = this.f21527f;
        int i12 = 1;
        if (i11 != 1) {
            i12 = 2;
            if (i11 != 2 && i11 != 4) {
                if (i11 == 16) {
                    return 4;
                }
                if (i11 == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i12;
    }

    public int c() {
        return this.f21523b / this.f21528g;
    }

    public final int d() {
        return (b() * this.f21525d) + (b() << 1);
    }

    public final int e() {
        int i11 = this.f21527f;
        if (i11 == 1 || i11 == 2) {
            return 1;
        }
        if (i11 == 4) {
            return 2;
        }
        if (i11 == 16) {
            return 4;
        }
        if (i11 == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f21522a ? "Rectangular Symbol:" : "Square Symbol:");
        sb2.append(" data region ");
        int i11 = this.f21525d;
        sb2.append(i11);
        sb2.append('x');
        int i12 = this.f21526e;
        sb2.append(i12);
        sb2.append(", symbol size ");
        sb2.append(d());
        sb2.append('x');
        sb2.append((e() * i12) + (e() << 1));
        sb2.append(", symbol data size ");
        sb2.append(b() * i11);
        sb2.append('x');
        sb2.append(e() * i12);
        sb2.append(", codewords ");
        sb2.append(this.f21523b);
        sb2.append('+');
        sb2.append(this.f21524c);
        return sb2.toString();
    }
}
