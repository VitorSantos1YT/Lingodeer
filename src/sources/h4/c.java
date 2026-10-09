package h4;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f31561a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f31562b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f31563c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap f31564d;

    public static float g(Number number) {
        return number instanceof Float ? ((Float) number).floatValue() : Float.parseFloat(number.toString());
    }

    public abstract void a(HashMap map);

    public abstract c b();

    public c c(c cVar) {
        this.f31561a = cVar.f31561a;
        this.f31562b = cVar.f31562b;
        this.f31563c = cVar.f31563c;
        this.f31564d = cVar.f31564d;
        return this;
    }

    public abstract void d(HashSet hashSet);

    public abstract void e(Context context, AttributeSet attributeSet);

    public void f(HashMap map) {
    }
}
