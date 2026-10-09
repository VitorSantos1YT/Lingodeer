package m6;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f40931a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(long j11) {
        super(1);
        this.f40931a = j11;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        Long l9 = (Long) obj;
        if (l9 == null) {
            throw new IllegalStateException("Start the timer with startTimer before calling addTime");
        }
        int i11 = pz.a.f47220d;
        long j11 = this.f40931a;
        if (j11 <= 0) {
            throw new IllegalArgumentException("Cannot call addTime with a negative duration");
        }
        return Long.valueOf(pz.a.e(j11) + l9.longValue());
    }
}
