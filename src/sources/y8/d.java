package y8;

import android.graphics.Color;
import com.google.common.primitives.Ints;
import defpackage.e;
import su.Mbl.tcppUUQxZjFdy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f57453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f57454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f57455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f57456f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f57457g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f57458h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f57459i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f57460j;

    public d(String str, int i11, Integer num, Integer num2, float f5, boolean z11, boolean z12, boolean z13, boolean z14, int i12) {
        this.f57451a = str;
        this.f57452b = i11;
        this.f57453c = num;
        this.f57454d = num2;
        this.f57455e = f5;
        this.f57456f = z11;
        this.f57457g = z12;
        this.f57458h = z13;
        this.f57459i = z14;
        this.f57460j = i12;
    }

    public static boolean b(String str) {
        try {
            int i11 = Integer.parseInt(str);
            return i11 == 1 || i11 == -1;
        } catch (NumberFormatException e8) {
            b7.a.C("Failed to parse boolean value: '" + str + "'", e8);
            return false;
        }
    }

    public static Integer c(String str) {
        try {
            long j11 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            b7.a.d(j11 <= 4294967295L);
            return Integer.valueOf(Color.argb(Ints.b(((j11 >> 24) & 255) ^ 255), Ints.b(j11 & 255), Ints.b((j11 >> 8) & 255), Ints.b((j11 >> 16) & 255)));
        } catch (IllegalArgumentException e8) {
            b7.a.C("Failed to parse color expression: '" + str + "'", e8);
            return null;
        }
    }

    public static int a(String str) {
        try {
            int i11 = Integer.parseInt(str.trim());
            switch (i11) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return i11;
                default:
                    e.B(tcppUUQxZjFdy.bDJ, str);
                    return -1;
            }
        } catch (NumberFormatException unused) {
        }
    }
}
