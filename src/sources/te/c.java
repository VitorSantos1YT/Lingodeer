package te;

import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final CopyOnWriteArraySet f52131d = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f52132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f52133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f52134c;

    public c(List list, String str, String str2) {
        this.f52132a = str;
        this.f52133b = str2;
        this.f52134c = list;
    }

    public static final /* synthetic */ CopyOnWriteArraySet a() {
        if (qf.a.b(c.class)) {
            return null;
        }
        try {
            return f52131d;
        } catch (Throwable th2) {
            qf.a.a(c.class, th2);
            return null;
        }
    }

    public final String b() {
        if (qf.a.b(this)) {
            return null;
        }
        try {
            return this.f52132a;
        } catch (Throwable th2) {
            qf.a.a(this, th2);
            return null;
        }
    }
}
