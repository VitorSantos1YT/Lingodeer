package ty;

import java.util.Comparator;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f52663b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f52664c = new a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52665a;

    public /* synthetic */ a(int i11) {
        this.f52665a = i11;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f52665a) {
            case 0:
                Comparable a3 = (Comparable) obj;
                Comparable b3 = (Comparable) obj2;
                m.f(a3, "a");
                m.f(b3, "b");
                return a3.compareTo(b3);
            default:
                Comparable a11 = (Comparable) obj;
                Comparable b11 = (Comparable) obj2;
                m.f(a11, "a");
                m.f(b11, "b");
                return b11.compareTo(a11);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f52665a) {
            case 0:
                return f52664c;
            default:
                return f52663b;
        }
    }
}
