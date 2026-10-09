package com.google.zxing.datamatrix.encoder;

import com.google.zxing.Dimension;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class EncoderContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SymbolShapeHint f21509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Dimension f21510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Dimension f21511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final StringBuilder f21512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SymbolInfo f21515h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f21516i;

    public EncoderContext(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb2 = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i11 = 0; i11 < length; i11++) {
            char c11 = (char) (bytes[i11] & 255);
            if (c11 == '?' && str.charAt(i11) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb2.append(c11);
        }
        this.f21508a = sb2.toString();
        this.f21509b = SymbolShapeHint.FORCE_NONE;
        this.f21512e = new StringBuilder(str.length());
        this.f21514g = -1;
    }

    public final char a() {
        return this.f21508a.charAt(this.f21513f);
    }

    public final boolean b() {
        return this.f21513f < this.f21508a.length() - this.f21516i;
    }

    public final void c(int i11) {
        SymbolInfo symbolInfo = this.f21515h;
        if (symbolInfo == null || i11 > symbolInfo.f21523b) {
            this.f21515h = SymbolInfo.f(i11, this.f21509b, this.f21510c, this.f21511d);
        }
    }

    public final void d(char c11) {
        this.f21512e.append(c11);
    }
}
