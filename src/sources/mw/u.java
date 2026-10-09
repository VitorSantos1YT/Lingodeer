package mw;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f42709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f42710c;

    public /* synthetic */ u(Object obj, long j11, int i11) {
        this.f42708a = i11;
        this.f42710c = obj;
        this.f42709b = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f42708a) {
            case 0:
                l2.f fVar = new l2.f(1);
                v vVar = (v) this.f42710c;
                vVar.f42739l.k(fVar);
                long j11 = this.f42709b;
                long jAbs = Math.abs(j11);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                long nanos = jAbs / timeUnit.toNanos(1L);
                long jAbs2 = Math.abs(j11) % timeUnit.toNanos(1L);
                StringBuilder sb2 = new StringBuilder("deadline exceeded after ");
                if (j11 < 0) {
                    sb2.append('-');
                }
                sb2.append(nanos);
                Locale locale = Locale.US;
                sb2.append(String.format(locale, ".%09d", Long.valueOf(jAbs2)));
                sb2.append("s. ");
                Long l9 = (Long) vVar.f42738k.a(lw.j.f40401a);
                sb2.append(String.format(locale, "Name resolution delay %.9f seconds. ", Double.valueOf(l9 == null ? 0.0d : l9.longValue() / v.f42730t)));
                sb2.append(fVar);
                vVar.f42739l.p(lw.q1.f40437h.b(sb2.toString()));
                break;
            default:
                ((n20.c) this.f42710c).request(this.f42709b);
                break;
        }
    }
}
