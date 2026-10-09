package dd;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f23373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f23374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f23375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f23376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f23377e;

    public e(ArrayList arrayList, char c11, double d5, String str, String str2) {
        this.f23373a = arrayList;
        this.f23374b = c11;
        this.f23375c = d5;
        this.f23376d = str;
        this.f23377e = str2;
    }

    public static int a(String str, String str2, char c11) {
        return str2.hashCode() + defpackage.e.d(c11 * 31, 31, str);
    }

    public final int hashCode() {
        return a(this.f23377e, this.f23376d, this.f23374b);
    }
}
