package lb;

import android.os.Build;
import fb.w;
import j9.r;
import kb.g;
import kotlin.jvm.internal.m;
import ob.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f39872c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(r tracker, int i11) {
        super(tracker);
        this.f39871b = i11;
        switch (i11) {
            case 2:
                m.f(tracker, "tracker");
                super(tracker);
                this.f39872c = 7;
                break;
            case 3:
                m.f(tracker, "tracker");
                super(tracker);
                this.f39872c = 7;
                break;
            case 4:
                m.f(tracker, "tracker");
                super(tracker);
                this.f39872c = 9;
                break;
            default:
                m.f(tracker, "tracker");
                this.f39872c = 6;
                break;
        }
    }

    @Override // lb.d
    public final boolean c(p workSpec) {
        switch (this.f39871b) {
            case 0:
                m.f(workSpec, "workSpec");
                return workSpec.f44857j.f27067c;
            case 1:
                m.f(workSpec, "workSpec");
                return workSpec.f44857j.f27069e;
            case 2:
                m.f(workSpec, "workSpec");
                return workSpec.f44857j.f27065a == w.CONNECTED;
            case 3:
                m.f(workSpec, "workSpec");
                w wVar = workSpec.f44857j.f27065a;
                return wVar == w.UNMETERED || (Build.VERSION.SDK_INT >= 30 && wVar == w.TEMPORARILY_UNMETERED);
            default:
                m.f(workSpec, "workSpec");
                return workSpec.f44857j.f27070f;
        }
    }

    @Override // lb.b
    public final int d() {
        switch (this.f39871b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return this.f39872c;
    }

    @Override // lb.b
    public final boolean e(Object obj) {
        boolean zBooleanValue;
        switch (this.f39871b) {
            case 0:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 2:
                g value = (g) obj;
                m.f(value, "value");
                boolean z11 = value.f38037a;
                return Build.VERSION.SDK_INT < 26 ? !z11 : !(z11 && value.f38038b);
            case 3:
                g value2 = (g) obj;
                m.f(value2, "value");
                return !value2.f38037a || value2.f38039c;
            default:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !zBooleanValue;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(mb.a tracker) {
        super(tracker);
        this.f39871b = 1;
        m.f(tracker, "tracker");
        this.f39872c = 5;
    }
}
