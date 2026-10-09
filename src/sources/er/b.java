package er;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f25744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f25745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f25747d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f25744a == bVar.f25744a && this.f25745b == bVar.f25745b && this.f25746c == bVar.f25746c && kotlin.jvm.internal.m.a(this.f25747d, bVar.f25747d);
    }

    public final int hashCode() {
        return this.f25747d.hashCode() + defpackage.e.e(defpackage.e.e(Boolean.hashCode(this.f25744a) * 31, 31, this.f25745b), 31, this.f25746c);
    }

    public final String toString() {
        return "SystemSettingsStatus(hasNotificationPermission=" + this.f25744a + ", hasExactAlarmPermission=" + this.f25745b + ", isBatteryOptimizationDisabled=" + this.f25746c + ", manufacturerOptimizationAdvice=" + this.f25747d + ")";
    }
}
