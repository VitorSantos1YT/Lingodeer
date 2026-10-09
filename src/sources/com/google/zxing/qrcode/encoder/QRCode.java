package com.google.zxing.qrcode.encoder;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.decoder.Version;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class QRCode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Mode f21605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ErrorCorrectionLevel f21606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Version f21607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21608d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ByteMatrix f21609e;

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append("<<\n mode: ");
        sb2.append(this.f21605a);
        sb2.append("\n ecLevel: ");
        sb2.append(this.f21606b);
        sb2.append("\n version: ");
        sb2.append(this.f21607c);
        sb2.append("\n maskPattern: ");
        sb2.append(this.f21608d);
        if (this.f21609e == null) {
            sb2.append("\n matrix: null\n");
        } else {
            sb2.append("\n matrix:\n");
            sb2.append(this.f21609e);
        }
        sb2.append(">>\n");
        return sb2.toString();
    }
}
