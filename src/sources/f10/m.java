package f10;

import java.lang.reflect.Method;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f26555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadMode f26556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f26557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f26559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f26560f;

    public m(Method method, Class cls, ThreadMode threadMode, int i11, boolean z11) {
        this.f26555a = method;
        this.f26556b = threadMode;
        this.f26557c = cls;
        this.f26558d = i11;
        this.f26559e = z11;
    }

    public final synchronized void a() {
        if (this.f26560f == null) {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append(this.f26555a.getDeclaringClass().getName());
            sb2.append('#');
            sb2.append(this.f26555a.getName());
            sb2.append('(');
            sb2.append(this.f26557c.getName());
            this.f26560f = sb2.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        a();
        m mVar = (m) obj;
        mVar.a();
        return this.f26560f.equals(mVar.f26560f);
    }

    public final int hashCode() {
        return this.f26555a.hashCode();
    }
}
