package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzwp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f12128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzwn f12129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zzwn f12130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12133f;

    public zzwp(int[] iArr) {
        this.f12128a = iArr;
        zzwn zzwnVar = new zzwn(-1, -1);
        this.f12129b = zzwnVar;
        this.f12130c = zzwnVar;
    }

    public final void a() {
        if (this.f12132e == 0) {
            return;
        }
        HashMap map = this.f12130c.f12124d;
        int i11 = this.f12131d;
        int[] iArr = this.f12128a;
        zzwn zzwnVar = (zzwn) map.get(Integer.valueOf(iArr[i11]));
        while (true) {
            int i12 = (zzwnVar.f12122b - zzwnVar.f12121a) + 1;
            int i13 = this.f12132e;
            if (i12 > i13) {
                return;
            }
            int i14 = this.f12131d + i12;
            this.f12131d = i14;
            this.f12130c = zzwnVar;
            int i15 = i13 - i12;
            this.f12132e = i15;
            if (i15 > 0) {
                zzwnVar = (zzwn) zzwnVar.f12124d.get(Integer.valueOf(iArr[i14]));
            }
        }
    }

    public final void b() {
        zzwn zzwnVar = this.f12130c.f12123c;
        if (zzwnVar != null) {
            this.f12130c = zzwnVar;
        } else {
            this.f12130c = this.f12129b;
            int i11 = this.f12132e;
            if (i11 > 0) {
                this.f12132e = i11 - 1;
            }
            if (this.f12133f > 0) {
                this.f12131d++;
            }
        }
        a();
    }

    public final void c(zzwn zzwnVar, StringBuilder sb2) {
        for (zzwn zzwnVar2 : zzwnVar.f12124d.values()) {
            sb2.append("  ");
            sb2.append(zzwnVar);
            sb2.append(" -> ");
            sb2.append(zzwnVar2);
            sb2.append(" [label=\"");
            int i11 = zzwnVar2.f12121a;
            int i12 = zzwnVar2.f12122b + 1;
            int[] iArr = this.f12128a;
            sb2.append(Arrays.toString(Arrays.copyOfRange(iArr, i11, Math.min(iArr.length, i12))));
            sb2.append("\"]\n");
            c(zzwnVar2, sb2);
        }
    }

    public final boolean d(int i11, int i12, int i13, int i14) {
        if (i11 >= 0 && i13 >= 0) {
            int[] iArr = this.f12128a;
            int length = iArr.length;
            int iMin = Math.min(length, i12);
            if (iMin - i11 == Math.min(length, i14) - i13) {
                for (int i15 = i11; i15 <= iMin; i15++) {
                    if (iArr[i15] != iArr[(i13 + i15) - i11]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("digraph {\n");
        c(this.f12129b, sb2);
        sb2.append("}");
        return sb2.toString();
    }
}
