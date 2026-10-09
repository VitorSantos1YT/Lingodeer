package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import na.a;
import na.b;
import v5.j;
import v5.k;
import v5.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // na.b
    public final Object create(Context context) {
        Object objB;
        r rVar = new r(new ae.b(context));
        rVar.f53518a = 1;
        if (j.f53525k == null) {
            synchronized (j.f53524j) {
                try {
                    if (j.f53525k == null) {
                        j.f53525k = new j(rVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        a aVarC = a.c(context);
        aVarC.getClass();
        synchronized (a.f43747e) {
            try {
                objB = aVarC.f43748a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = aVarC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        Lifecycle lifecycle = ((LifecycleOwner) objB).getLifecycle();
        lifecycle.addObserver(new k(this, lifecycle));
        return Boolean.TRUE;
    }

    @Override // na.b
    public final List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
